package controllers;

import models.users.UserInfo;
import play.libs.Json;

import java.io.IOException;

/**
 * Created by apple on 16/5/18.
 */
public class UtilController {

    public static UserInfo getSessionUserInfo(String user){

        UserInfo userInfo = new UserInfo();

        try {
            userInfo = Json.mapper().readValue(user, UserInfo.class);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return userInfo;
    }
}
