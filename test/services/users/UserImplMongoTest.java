package services.users;

import models.users.UserInfo;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static play.libs.Json.toJson;

/**
 * Created by apple on 16/5/22.
 */
public class UserImplMongoTest {

    static UserImplMongo userImplMongo = new UserImplMongo();

    static UserInfo userInfo = new UserInfo();


    @BeforeClass
    public static void beforeClass() {
        userInfo.setCodeUser("yuyilong936");
        userInfo.setEmailUser("yuyilong936@pingan.com.cn");
        userInfo.setNameZhUser("余益龙");
        userInfo.setPhoneUser("15618971625");
        userInfo.setTelUser("661607");
        userInfo.setPwdUser("88888888");
    }


    @Test
    public void selectUserInfoAll() throws Exception {
        List<UserInfo> userInfoList = userImplMongo.selectUserInfoAll();
        System.out.println(toJson(userInfoList));
    }

    @Test
    public void loginByEmailAndPwd() throws Exception {

        UserInfo userInfo = userImplMongo.selectByEmailAndPwd("yuyilong936@pingan.com.cn", "88888888");
        System.out.println(toJson(userInfo));


    }

    @Test
    public void registerByUserInfo() throws Exception {

        System.out.println(toJson(userImplMongo.insertByUserInfo(userInfo)));

    }

    @Test
    public void deleteByUserInfo() throws Exception {
    }

    @Test
    public void editByUserInfo() throws Exception {

    }

    @Test
    public void selectByEmail() throws Exception {
        UserInfo userInfo = userImplMongo.selectByEmail("yuyilong936@pingan.com.cn");
        System.out.println(toJson(userInfo));


    }
}