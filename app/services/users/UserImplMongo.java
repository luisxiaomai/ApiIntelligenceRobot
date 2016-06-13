package services.users;

import models.users.UserInfo;
import org.jongo.MongoCollection;
import org.jongo.MongoCursor;
import services.utils.MongoDBDaoImpl;

import java.util.ArrayList;
import java.util.List;

import static play.libs.Json.toJson;

/**
 * Created by apple on 16/4/17.
 */
public class UserImplMongo implements UserDao {

    private final MongoDBDaoImpl mongoDBDao = MongoDBDaoImpl.getInstance();

    private final MongoCollection mongoCollection = mongoDBDao.getCollection("apidata", "userinfos");

    @Override
    public List<UserInfo> selectUserInfoAll() {
        List<UserInfo> userInfos = new ArrayList<>();
        MongoCursor<UserInfo> userInfoMongoCursor = mongoCollection.find().as(UserInfo.class);
        while (userInfoMongoCursor.hasNext()) {
            userInfos.add(userInfoMongoCursor.next());
        }
        return userInfos;
    }

    @Override
    public UserInfo selectByEmailAndPwd(String email, String password) {
        UserInfo userInfo = new UserInfo();
        UserInfo userInfoDb = mongoCollection.findOne("{emailUser: #,pwdUser: #}", email, password).as(UserInfo.class);
        if (userInfoDb != null) {
            userInfo = userInfoDb;
        }
        return userInfo;
    }

    @Override
    public Boolean insertByUserInfo(UserInfo userInfo) {
        UserInfo userInfoDb = selectByEmail(userInfo.getEmailUser());
        if(!userInfoDb.equals(new UserInfo())){
            System.out.println(toJson(userInfoDb));
            return false;
        }
        else {
            try {
                mongoCollection.insert(userInfo);
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
            return true;
        }
    }

    @Override
    public Boolean deleteByUserInfo(UserInfo userInfo) {
        return null;
    }


    @Override
    public Boolean updateByUserInfo(UserInfo userInfo) {
        return null;
    }

    @Override
    public UserInfo selectByEmail(String email) {
        UserInfo userInfo = new UserInfo();
        UserInfo userInfoDb = mongoCollection.findOne("{emailUser: #}", email).as(UserInfo.class);
        if (userInfoDb != null) {
            userInfo = userInfoDb;
        }
        return userInfo;
    }
}

