package services.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import models.users.UserInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.cglib.beans.BeanMap;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.esotericsoftware.reflectasm.MethodAccess;

/**
 * Created by apple on 16/5/15.
 */
public class MongoDBDocument {


    public static ConcurrentMap<String, BeanMap> beanMapCache = new ConcurrentHashMap<String, BeanMap>();

    //JSONObject就是个Map，它实现了Map接口
    public static Map<String, ?> toMap(Object object) {
        JSONObject jsonObject = (JSONObject)JSON.toJSON(object);
        return jsonObject;
    }

    //去掉null
    public static Map<String, ?> toMaps(Object object) {
        Map<String, Object> map = new HashMap<String, Object>();
        JSONObject jsonObject = (JSONObject) JSON.toJSON(object);
        for (Entry<String, Object> entry : jsonObject.entrySet()) {
            if (entry.getValue() != null) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
        return map;
    }

    public static void beanToMap(Object fromBean, Map<String, Object> toMap) {
        //MethodAccess要缓存
        MethodAccess methodAccess = MethodAccess.get(fromBean.getClass());
        String[] methodNames = methodAccess.getMethodNames();
        for (String methodName : methodNames){
            if (methodName.startsWith("get")){
                Object value = methodAccess.invoke(fromBean, methodName, (Object[])null);
                toMap.put(StringUtils.uncapitalize(methodName.substring(3)), value);
            }
        }
    }

    public static BeanMap getBeanMap(Object object) {
        BeanMap beanMap = beanMapCache.get(object.getClass().getName());
        if (beanMap == null) {
            beanMap = BeanMap.create(object);
            beanMapCache.put(object.getClass().getName(), beanMap);
        }
        return beanMap;
    }

    //如果使用BeanMap缓存，这个性能最好。
    public static Map<String, Object> beanToMap(Object object) {

        BeanMap beanMap = getBeanMap(object);
        beanMap.setBean(object);
        @SuppressWarnings("unchecked")
        Map<String, Object> toMap = beanMap;

        for (Entry<String, Object> entry : toMap.entrySet()) {
            if (entry.getValue() != null) {
                toMap.put(entry.getKey(), entry.getValue());
            }
        }
        return toMap;
    }


    public static void main(String[] aa) {
        UserInfo userInfo = new UserInfo();
        userInfo.setCodeUser("code");
        userInfo.setEmailUser("xxxx@pingan.com.cn");
        userInfo.setNameZhUser("xxxxxxx");
        userInfo.setPhoneUser("12222222");
        userInfo.setTelUser("909120970");
        userInfo.setPwdUser("sdassdkaj");

        Map<String, Object> result = new HashMap<String, Object>();
        Map<String, Object> result2 = new HashMap<String, Object>();

        long d2 = System.nanoTime();
        JSONObject jsonObject = (JSONObject)JSON.toJSON(userInfo);
        String json = jsonObject.toJSONString();
        Map<String, Object> jsonMap = JSON.parseObject(json);
        System.out.println(System.nanoTime() - d2);


        long dd = System.nanoTime();
        Map<String, Object> map = (Map<String, Object>)jsonObject;
        result.putAll(map);
        System.out.println(System.nanoTime() - dd);
        long d = System.nanoTime();
        for (Entry<String, Object> entry : jsonObject.entrySet()) {
            if (entry.getValue() != null) {
                result2.put(entry.getKey(), entry.getValue());
            }
        }
        System.out.println(System.nanoTime() - d);

        Map<String, Object> toMap = new HashMap<String, Object>();
        beanToMap(userInfo, toMap);

        Map<String, Object> toMap2 = beanToMap(userInfo);

        System.out.println(toMap2);
    }

}
