package services.users;

import models.users.UserInfo;

import java.util.List;

/**
 * Created by apple on 16/4/17.
 */
public interface UserDao {

    List<UserInfo> selectUserInfoAll();

    UserInfo selectByEmailAndPwd(String email, String password);

    Boolean insertByUserInfo(UserInfo userInfo);

    Boolean deleteByUserInfo(UserInfo userInfo);

    Boolean updateByUserInfo(UserInfo userInfo);

    UserInfo selectByEmail(String email);
}
