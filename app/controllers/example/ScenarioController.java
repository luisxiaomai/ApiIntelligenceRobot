//package controllers;
//
//import com.alibaba.fastjson.JSON;
//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.databind.node.ObjectNode;
//import com.mongodb.WriteResult;
//import models.apis.moudle.ScenarioTagName;
//import models.commons.ResultData;
//import models.users.UserInfo;
//import play.libs.Json;
//import play.mvc.Controller;
//import play.mvc.Result;
//import services.apis.impl.ApiDocImplMongo;
//import services.scenarios.ScenarioDao;
//import services.scenarios.ScenarioImplMongo;
//import views.html.commons.LoginPage;
//import views.html.scenarios.add.Scenarios;
//import views.html.scenarios.view.ScenarioView;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//import static play.libs.Json.toJson;
//
///**
// * Created by apple on 16/5/18.
// */
//public class ScenarioController extends Controller {
//
//    final ScenarioImplMongo scenarioImplMongo= new ScenarioImplMongo();
//
//    public Result addScenario() {
//        JsonNode json = request().body().asJson();
//
//        if (json == null) {
//            return badRequest("empty json"); // PROBLEM: THE JSON IS ALWAYS NULL
//        }
//
//        String user = session("UserInfo");
//        if (null == user) {
//            return ok(LoginPage.render());
//        }
//
//        UserInfo userInfo = UtilController.getSessionUserInfo(user);
//
//        String tagName = json.get("tagName").toString().replace("\"","");
//
//        String scenarioName = json.get("scenarioName").toString().replace("\"","");
//
//        ScenarioDoc scenarioDoc = scenarioImplMongo.addScenarioTagName(userInfo.get_id(),new String(tagName),new String(scenarioName));
//
//        if(scenarioDoc.equals(new ScenarioDoc())){
//
//            return ok(toJson(ResultData.getErrorInstance(new ScenarioDoc(),"该分类场景名已存在")));
//
//        }else{
//            return ok(toJson(ResultData.getSuccessInstance(scenarioDoc,"")));
//        }
//
//    }
//
//    public Result updateScenarioApis(String scenarioDocId) {
//
//        JsonNode json = request().body().asJson();
//
//        if (json == null) {
//            return badRequest("empty json"); // PROBLEM: THE JSON IS ALWAYS NULL
//        }
//
//        List<ScenarioApi> scenarioApis = new ArrayList<>();
//        com.alibaba.fastjson.JSONArray jsonArray = JSON.parseArray(json.get("apis").toString());
//        for(int i=0;i<jsonArray.size();i++){
//            try {
//                ScenarioApi scenarioApi = Json.mapper().readValue(jsonArray.get(i).toString(),ScenarioApi.class);
//                scenarioApi.setOrderNum(i+1);
//                scenarioApis.add(scenarioApi);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//        }
//
//        ScenarioDao scenarioDao = new ScenarioImplMongo();
//
//        ScenarioDoc scenarioDoc = scenarioDao.selectScenarioDocByScenarioId(scenarioDocId);
//
//        scenarioDoc.setScenarioApis(scenarioApis);
//
//        WriteResult writeResult = scenarioDao.upateScenario(scenarioDoc);
//
//        if(writeResult.isUpdateOfExisting()){
//
//            return ok(toJson(ResultData.getSuccessInstance(scenarioDoc,"")));
//
//        }else{
//
//            return ok(toJson(ResultData.getErrorInstance(writeResult,"")));
//        }
//    }
//
//    public Result renderScenarioView() {
//        String user = session("UserInfo");
//        if (null == user) {
//            return ok(LoginPage.render());
//        }
//
//        UserInfo userInfo = UtilController.getSessionUserInfo(user);
//
//        List<ScenarioTagName> scenarioTagNameList = scenarioImplMongo.selectTagScenarioNames(userInfo.get_id());
//
//        ScenarioDoc scenarioDoc = scenarioImplMongo.selectScenarioByUserId(userInfo.get_id()).get(0);
//
//        return ok(ScenarioView.render(userInfo,scenarioTagNameList,scenarioDoc));
//
//    }
//
//    public Result renderScenarios() {
//        String user = session("UserInfo");
//        if (null == user) {
//            return ok(LoginPage.render());
//        }
//
//        UserInfo userInfo = UtilController.getSessionUserInfo(user);
//
//        List<ScenarioTagName> scenarioTagNameList = scenarioImplMongo.selectTagScenarioNames(userInfo.get_id());
//
//        return ok(Scenarios.render(userInfo,scenarioTagNameList));
//
//    }
//
//    public Result renderScenarioViewByTagScenarioName(String tagName,String scenarioName) {
//        String user = session("UserInfo");
//        if (null == user) {
//            return ok(LoginPage.render());
//        }
//
//        UserInfo userInfo = UtilController.getSessionUserInfo(user);
//
//        List<ScenarioTagName> scenarioTagNameList = scenarioImplMongo.selectTagScenarioNames(userInfo.get_id());
//
//        ScenarioDoc scenarioDoc = scenarioImplMongo.selectScenarioByUserIdTagScenarioName(userInfo.get_id(),tagName,scenarioName);
//
//        return ok(ScenarioView.render(userInfo,scenarioTagNameList,scenarioDoc));
//
//    }
//
//    public Result selectScenarioApisOutIn(String scenarioId){
//        String user = session("UserInfo");
//        if (null == user) {
//            return ok(LoginPage.render());
//        }
//        UserInfo userInfo = new UserInfo();
//
//        try {
//            userInfo = Json.mapper().readValue(user, UserInfo.class);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//        ScenarioDao scenarioDao = new ScenarioImplMongo();
//        ScenarioDoc scenarioDoc = scenarioDao.selectScenarioDocByScenarioId(scenarioId);
//
//        List<ScenarioApi> scenarioApisDocList = scenarioDoc.getScenarioApis();
//
//        ApiDocImplMongo apiDocImplMongo = new ApiDocImplMongo();
//
//        List<ScenarioApi> scenarioApiAllList = apiDocImplMongo.selectScenarioApisAll();
//
//        List<ScenarioApi> scenarioApis_in = new ArrayList<>();
//        List<ScenarioApi> scenarioApis_out = new ArrayList<>();
//
//        Boolean flag = false;
//
//        for (int n = 0; n < scenarioApiAllList.size(); n++) {
//            for (int i = 0; i < scenarioApisDocList.size(); i++) {
//                flag = false;
//                if (scenarioApiAllList.get(n).equals(scenarioApisDocList.get(i))) {
//                    scenarioApis_in.add(scenarioApisDocList.get(i));
//                    flag = true;
//                    break;
//                }
//            }
//            if (flag) {
//                continue;
//            }
//            scenarioApis_out.add(scenarioApiAllList.get(n));
//
//
//        }
//
//        ObjectNode result = Json.newObject();
//        result.put("in", toJson(scenarioApis_in));
//        result.put("out", toJson(scenarioApis_out));
//
//        return ok(result);
//    }
//}
