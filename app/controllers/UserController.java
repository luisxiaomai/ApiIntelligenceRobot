package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import models.commons.ResultData;
import models.users.UserInfo;
import play.mvc.Controller;
import play.mvc.Result;
import services.users.UserDao;
import services.users.UserImplMongo;
import services.utils.swagger.core.util.Json;
import views.html.commons.LoginPage;


import java.io.IOException;

import static play.libs.Json.toJson;

/**
 * Created by apple on 16/5/23.
 */
public class UserController extends Controller{

    public Result userLogin(String email,String pwd){
        UserDao userDao = new UserImplMongo();
        UserInfo userInfo = userDao.selectByEmailAndPwd(email,pwd);
        if(userInfo.equals(new UserInfo())){
            return ok(toJson(ResultData.getErrorInstance("","用户名或密码错误")));
        }else{
            session("UserInfo", toJson(userInfo).toString());
            return ok(toJson(ResultData.getSuccessInstance("","登录成功")));
        }
    }

    public Result userRegister(){
        JsonNode userNode = request().body().asJson();
        UserInfo userInfo = new UserInfo();
        try {
            userInfo = Json.mapper().readValue(userNode.toString(),UserInfo.class);
        } catch (IOException e) {
            e.printStackTrace();
            return ok(toJson(ResultData.getErrorInstance(e.getStackTrace(),"数据录入有误")));
        }
        UserDao userDao = new UserImplMongo();
        Boolean addFlag = userDao.insertByUserInfo(userInfo);
        if(addFlag){
            UserInfo userInfo2 = userDao.selectByEmailAndPwd(userInfo.getEmailUser(),userInfo.getPwdUser());
            session("UserInfo", toJson(userInfo2).toString());
            return ok(toJson(ResultData.getSuccessInstance("","注册成功")));
        }else{
            return ok(toJson(ResultData.getErrorInstance("","该邮箱已注册")));
        }
    }

    public Result userSignout() {
        session().clear();
        return ok(LoginPage.render());
    }

    public Result userRemove(){
        return null;
    }

    public Result userUpdate(){
        return null;
    }



//    public Result userLogin() {
//        Form<UserInfo> userForm = Form.form(UserInfo.class);
//        UserInfo userInfoForm = userForm.bindFromRequest().get();
//        UserDao userDao = new UserImplMongo();
//        ResultData resultData = userDao.LoginPage(userInfoForm.getEmailUser(), userInfoForm.getPwdUser());
//
//        if (resultData.getResultCode() == 10000) {
//            session("UserInfo", resultData.getResultData().get("data").toString());
////            return ok(LoginPage.render());
//            return redirect("/apiDocs");
////            return ok(ApiDocs.render((UserInfo) resultData.getResultData().get("data")));
//
//        } else {
////            return redirect("/scenarioInfos");
//            return ok(toJson(resultData));
//
//        }
//
//    }
//




    //    public Result userLogin() {
//        Form<UserInfo> userForm = Form.form(UserInfo.class);
//        UserInfo userInfoForm = userForm.bindFromRequest().get();
//        UserDao userDao = new UserImplMongo();
//        ResultData resultData = userDao.LoginPage(userInfoForm.getEmailUser(), userInfoForm.getPwdUser());
//
//        if (resultData.getResultCode() == 10000) {
//            session("UserInfo", resultData.getResultData().get("data").toString());
////            return ok(LoginPage.render());
//            return redirect("/apiDocs");
////            return ok(ApiDocs.render((UserInfo) resultData.getResultData().get("data")));
//
//        } else {
////            return redirect("/scenarioInfos");
//            return ok(toJson(resultData));
//
//        }
//
//    }
//
//    public Result userRegister() {
//        Form<UserInfo> userForm = Form.form(UserInfo.class);
//        UserInfo userInfoForm = userForm.bindFromRequest().get();
//        UserDao userDao = new UserImplMongo();
//
//        ResultData resultData = userDao.RegisterPage(userInfoForm);
//
//
//        if (resultData.getResultCode() == 10000) {
//            session("UserInfo", userInfoForm.toString());
//            return ok(toJson(resultData));
////            return redirect("/scenarioInfos");
//
//
//        } else {
//            return ok(toJson(resultData));
//        }
//    }
//

//
////    public Result userInfos() {
////
////        ObjectNode result = Json.newObject();
////
////        List<UserInfo> userInfoList = new ArrayList<>();
////
////        MongoCursor<UserInfo> userInfo = apis.find().as(UserInfo.class);
////
////        Iterator<UserInfo> iterator = userInfo.iterator();
////
////        while (iterator.hasNext()) {
////            userInfoList.add(iterator.next());
////        }
////        result.put("user", toJson(userInfoList));
////
////        return ok(toJson(result));
////    }
//
}
