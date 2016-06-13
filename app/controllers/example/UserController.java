//package controllers;
//
//import models.commons.ResultData;
//import models.users.UserInfo;
//import play.data.Form;
//import play.mvc.Result;
//import services.users.dao.UserDao;
//import services.users.impl.UserImplMongo;
//import views.html.commons.LoginPage;
//
//import static play.libs.Json.toJson;
//import static play.mvc.Controller.session;
//import static play.mvc.Results.ok;
//import static play.mvc.Results.redirect;
//
///**
// * Created by apple on 16/4/11.
// */
//public class UserController {
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
//    public Result userSignout() {
//        session().clear();
//        return ok(LoginPage.render());
//    }
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
//}
