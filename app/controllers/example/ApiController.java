//package controllers;
//
//import models.apis.ApiDoc;
//import models.apis.moudle.InfoVersions;
//import models.commons.ResultData;
//import play.mvc.Controller;
//import play.mvc.Result;
//import services.apis.impl.ApiDocImplMongo;
//import views.html.apis.design.ApiDesign;
//import views.html.apis.doc.ApiDocs;
//import views.html.commons.LoginPage;
//
//import java.util.List;
//
//import static play.libs.Json.toJson;
//
//
///**
// * Created by apple on 16/4/11.
// */
//public class ApiController extends Controller {
//
//    final ApiDocImplMongo apiDocImplMongo = new ApiDocImplMongo();
//
//    public Result getListOfScenarioApi(String title,String version) {
//        String user = session("UserInfo");
//        if (null == user) {
//            return ok(LoginPage.render());
//        }
//
//        List<ScenarioApi> scenarioApiList = apiDocImplMongo.selectScenarioApis(title,version);
//
//        return ok(ApiDesign.render(UtilController.getSessionUserInfo(user)));
//    }
//
//    public Result apiDocs(){
//        String user = session("UserInfo");
//        if (null == user) {
//            return ok(LoginPage.render());
//        }
//
//        List<InfoVersions> infoList = apiDocImplMongo.selectAllInfos();
//
//        return ok(ApiDocs.render(UtilController.getSessionUserInfo(user),infoList));
//    }
//
//    public Result apiDocsOne(){
//
//        ResultData resultDataOne = apiDocImplMongo.selectOne();
//
//        return ok(services.utils.swagger.core.util.Json.pretty(((ApiDoc)(resultDataOne.getResultData().get("data"))).getSwagger()));
//    }
//
//    public Result apiDocsInfos(){
//
//        List<InfoVersions> infoLists = apiDocImplMongo.selectAllInfos();
//
//        return ok(toJson(infoLists));
//    }
//
//
//    public Result selectByTitleAndVersion(String title,String version){
//
//        ResultData resultDataTitleAndVersion = apiDocImplMongo.selectByTitleAndVersion(title,version);
//
//        return ok(services.utils.swagger.core.util.Json.pretty(((ApiDoc)(resultDataTitleAndVersion.getResultData().get("data"))).getSwagger()));
//    }
//
//    public Result apiDesignPage() {
//        String user = session("UserInfo");
//        if (null == user) {
//            return ok(LoginPage.render());
//        }
//        return ok(ApiDesign.render(UtilController.getSessionUserInfo(user)));
//    }
//
//
//    public Result selectApis() {
//        List<ScenarioApi> scenarioApiList = apiDocImplMongo.selectScenarioApisAll();
//
//        return ok(toJson(scenarioApiList));
//    }
//
//
//
//
//
////    public Result apiInfos() {
////
////        String user = session("UserInfo");
////        if (null == user) {
////            return ok(LoginPage.render());
////        }
////        ObjectMapper mapper = JacksonFactory.getMapperInstance(false);
////        UserInfo userInfo = new UserInfo();
////
////        try {
////            userInfo = mapper.readValue(user, UserInfo.class);
////
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
////
////        ApiDocImplMongo apiDocImplMongo = new ApiDocImplMongo();
////        return ok(ApiDocs.render(userInfo, apiDocImplMongo.getApiInfos(), apiDocImplMongo.getApiInfos().get(0).getApis().get(0)));
////
////
////    }
////
////    public Result ApiDesign(){
////
////        String user = session("UserInfo");
////        if (null == user) {
////            return ok(LoginPage.render());
////        }
////        ObjectMapper mapper = JacksonFactory.getMapperInstance(false);
////        UserInfo userInfo = new UserInfo();
////
////        try {
////            userInfo = mapper.readValue(user, UserInfo.class);
////
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
////
////        return ok(APIDesign.render(userInfo));
////
////    }
////
////    public Result apiInfosToJson(String idScenario) {
////        String user = session("UserInfo");
////        if (null == user) {
////            return ok(LoginPage.render());
////        }
////        ObjectMapper mapper = JacksonFactory.getMapperInstance(false);
////        UserInfo userInfo = new UserInfo();
////
////        try {
////            userInfo = mapper.readValue(user, UserInfo.class);
////
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
////
////
////        ScenarioDao scenarioDao = new ScenarioImplMongo();
////        ScenarioInfo scenarioInfo = scenarioDao.selectScenarioByScenarioId(new ObjectId(idScenario));
////
////        List<ScenarioApi> scenarioApis = scenarioInfo.getScenarioApis();
////
////        ApiDocImplMongo apiDocImplMongo = new ApiDocImplMongo();
////
////        List<ApiInfo> apiInfos = apiDocImplMongo.getApiInfosAsApiInfo();
////
////        List<ApiInfo> apiInfos_in = new ArrayList<>();
////        List<ApiInfo> apiInfos_out = new ArrayList<>();
////        Boolean flag = false;
////
////        for (int n = 0; n < apiInfos.size(); n++) {
////            for (int i = 0; i < scenarioApis.size(); i++) {
////                flag = false;
////                if (apiInfos.get(n).get_id().equals(scenarioApis.get(i).getIdAPI())) {
////                    apiInfos_in.add(apiInfos.get(n));
////                    flag = true;
////                    break;
////                }
////            }
////            if (flag) {
////                continue;
////            }
////            apiInfos_out.add(apiInfos.get(n));
////
////
////        }
////
////        ObjectNode result = Json.newObject();
////        result.put("in", toJson(apiInfos_in));
////        result.put("out", toJson(apiInfos_out));
////
////        return ok(result);
////
////
////    }
////
////
////    public Result apiInfo(String apiInfoId) {
////
////        String user = session("UserInfo");
////        if (null == user) {
////            return ok(LoginPage.render());
////        }
////        ObjectMapper mapper = JacksonFactory.getMapperInstance(false);
////        UserInfo userInfo = new UserInfo();
////
////        try {
////            userInfo = mapper.readValue(user, UserInfo.class);
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
////
////
////        ApiDocImplMongo apiDocImplMongo = new ApiDocImplMongo();
////        return ok(ApiDocs.render(userInfo, apiDocImplMongo.getApiInfos(), apiDocImplMongo.getApiInfo(new ObjectId(apiInfoId))));
////
////
////    }
//}
