package models.commons;

import models.users.UserInfo;

import java.util.HashMap;
import java.util.Map;

import static play.libs.Json.toJson;

/**
 * Created by apple on 16/5/9.
 */
public class ResultData {
    private int resultCode;
    private Map<String, Object> resultData;
    private String resultMsg;


    public ResultData(){}

    public ResultData(int resultCode,Map<String, Object> resultData,String resultMsg){
        this.resultCode = resultCode;
        this.resultData = resultData;
        this.resultMsg = resultMsg;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public Map<String, Object> getResultData() {
        return resultData;
    }

    public void setResultData(Map<String, Object> resultData) {
        this.resultData = resultData;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }


    public static ResultData getErrorInstance(Object object,String msg){
        ResultData resultData = new ResultData();
        resultData.setResultCode(11000);
        resultData.setResultMsg("操作失败:" + msg);
        Map<String,Object> map = new HashMap<>();
        map.put("data",object);
        resultData.setResultData(map);

        return resultData;
    }

    public static ResultData getSuccessInstance(Object object,String msg){
        ResultData resultData = new ResultData();
        resultData.setResultCode(10000);
        resultData.setResultMsg("操作成功:" + msg);
        Map<String,Object> map = new HashMap<>();
        map.put("data",object);
        resultData.setResultData(map);

        return resultData;
    }

    public static void main(String[] args) {
        ResultData resultData = new ResultData();

        resultData.setResultCode(10000);
        resultData.setResultMsg("操作成功");

        UserInfo userInfo = new UserInfo();
        userInfo.setCodeUser("aaaa");
        userInfo.setEmailUser("ssssss");

        Map<String, Object> map = new HashMap<>();

        map.put("data", userInfo);

        resultData.setResultData(map);

        System.out.println(toJson(resultData));
    }


}
