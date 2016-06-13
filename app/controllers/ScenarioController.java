package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import models.apis.custom.*;
import models.apis.moudle.ScenarioDocSimplify;
import models.apis.moudle.ScenarioTagName;
import models.apis.swagger.HttpMethod;
import models.apis.swagger.Operation;
import models.apis.swagger.Path;
import models.apis.swagger.parameters.Parameter;
import models.commons.ResultData;
import models.users.UserInfo;
import play.mvc.Controller;
import play.mvc.Result;
import services.UtilServices;
import services.apis.ApiDocDao;
import services.apis.ApiDocImplMongo;
import services.scenarios.ScenarioDao;
import services.scenarios.ScenarioImplMongo;
import services.utils.swagger.core.util.Json;
import services.utils.verify.check.CheckRuleImpl;
import services.utils.verify.request.SendHttpRequest;
import views.html.commons.LoginPage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static play.libs.Json.toJson;

/**
 * Created by apple on 16/5/23.
 */
public class ScenarioController extends Controller {
    final static ScenarioDao scenarioDao = new ScenarioImplMongo();

    public Result getScenariosByEmailOne() {
        String user = session("UserInfo");
        if (null == user) {
//            return ok(LoginPage.render());
            return ok(services.utils.swagger.core.util.Json.pretty(ResultData.getErrorInstance("请先进行登录", "getScenariosByEmailOne")));
        }
        UserInfo userInfo = UtilController.getSessionUserInfo(user);
        ScenarioDoc scenarioDoc = scenarioDao.selectScenarioDocByEmail(userInfo.getEmailUser()).get(0);
        return ok(services.utils.swagger.core.util.Json.pretty(ResultData.getSuccessInstance(scenarioDoc, "getScenariosByEmailOne")));
    }

    public Result getScenariosByScenarioId(String scenarioId){
        ScenarioDoc scenarioDoc = scenarioDao.selectScenarioDocByScenarioId(scenarioId);
        return ok(services.utils.swagger.core.util.Json.pretty(ResultData.getSuccessInstance(scenarioDoc, "getScenariosByEmailOne")));
    }

    public Result getScenariosByEmail() {
        String user = session("UserInfo");
        if (null == user) {
//            return ok(LoginPage.render());
            return ok(services.utils.swagger.core.util.Json.pretty(ResultData.getErrorInstance("请先进行登录", "getScenariosByEmail")));

        }
        UserInfo userInfo = UtilController.getSessionUserInfo(user);
        List<ScenarioDoc> scenarioDocList = scenarioDao.selectScenarioDocByEmail(userInfo.getEmailUser());
        return ok(services.utils.swagger.core.util.Json.pretty(ResultData.getSuccessInstance(scenarioDocList, "getScenariosByEmail")));
    }

    public Result getScenariosByEmailAndTagName(String email, String tagName) {
        List<ScenarioDoc> scenarioDocList = scenarioDao.selectScenarioDocByEmailAndTagName(email, tagName);
        return ok(services.utils.swagger.core.util.Json.pretty(ResultData.getSuccessInstance(scenarioDocList, "getScenariosByEmailAndTagName")));
    }

    public Result getScenariosByEmailAndTitle(String email, String scenarioName) {
        List<ScenarioDoc> scenarioDocList = scenarioDao.selectScenarioDocByEmailAndScenarioName(email, scenarioName);
        return ok(services.utils.swagger.core.util.Json.pretty(ResultData.getSuccessInstance(scenarioDocList, "getScenariosByEmailAndTitle")));
    }

    public Result getScenariosByEmailTagNameAndTitle(String email, String tagName, String scenarioName) {
        ScenarioDoc scenarioDoc = scenarioDao.selectScenarioDocByEmailTagNameAndScenarioName(email, tagName, scenarioName);
        return ok(services.utils.swagger.core.util.Json.pretty(ResultData.getSuccessInstance(scenarioDoc, "getScenariosByEmailTagNameAndTitle")));
    }

    public Result addScenario() {
        String user = session("UserInfo");
        if (null == user) {
//            return ok(LoginPage.render());
            return ok(services.utils.swagger.core.util.Json.pretty(ResultData.getErrorInstance("请先进行登录", "addScenario")));

        }
        UserInfo userInfo = UtilController.getSessionUserInfo(user);
        JsonNode scenarioNode = request().body().asJson();
        String tagName = scenarioNode.get("tagName").toString().replace("\"","");
        String scenarioName = scenarioNode.get("scenarioName").toString().replace("\"","");
        String title = scenarioNode.get("title").toString().replace("\"","");
        String version = scenarioNode.get("version").toString().replace("\"","");


        Boolean result = scenarioDao.createScenarioDocWithEmailTagNameAndScenarioName(userInfo.getEmailUser(), tagName, scenarioName,title,version);

        return ok(services.utils.swagger.core.util.Json.pretty(ResultData.getSuccessInstance(result, "addScenario")));
    }

    public Result getScenarioInfosByEmail() {
        String user = session("UserInfo");
        if (null == user) {
//            return ok(LoginPage.render());
            return ok(services.utils.swagger.core.util.Json.pretty(ResultData.getErrorInstance("请先进行登录", "getScenarioInfosByEmail")));

        }
        UserInfo userInfo = UtilController.getSessionUserInfo(user);
        List<ScenarioTagName> scenarioTagNameList = scenarioDao.selectTagNameAndScenarioNamesByEmail(userInfo.getEmailUser());
        return ok(services.utils.swagger.core.util.Json.pretty(ResultData.getSuccessInstance(scenarioTagNameList, "getScenarioInfosByEmail")));
    }

    public Result getScenarioDocSimplifysByEmail() {
        String user = session("UserInfo");
        if (null == user) {
//            return ok(LoginPage.render());
            return ok(services.utils.swagger.core.util.Json.pretty(ResultData.getErrorInstance("请先进行登录", "getScenarioDocSimplifysByEmail")));

        }
        UserInfo userInfo = UtilController.getSessionUserInfo(user);
        List<ScenarioDocSimplify> scenarioDocSimplifyList = scenarioDao.selectScenarioDocSimplifyByEmail(userInfo.getEmailUser());
        return ok(services.utils.swagger.core.util.Json.pretty(ResultData.getSuccessInstance(scenarioDocSimplifyList, "getScenarioDocSimplifysByEmail")));
    }

    public Result getApisByScenarioId(String scenarioId) {
        Map<String, List<ApiListInfo>> map = new HashMap<>();

        ScenarioDoc scenarioDoc = scenarioDao.selectScenarioDocByScenarioId(scenarioId);

        if (!scenarioDoc.equals(new ScenarioDoc())) {
            Map<String, ScenarioApiInfo> dependsOn = scenarioDoc.getDependsOn();

            List<ApiListInfo> apiListInfo_in = new ArrayList<>();

            List<ApiListInfo> apiListInfoScenarioDoc = scenarioDao.selectApisByScenarioId(scenarioId);

            for (Map.Entry<String, ScenarioApiInfo> dependsOnMap : dependsOn.entrySet()) {

                for (int k = 0; k < apiListInfoScenarioDoc.size(); k++) {
                    if (UtilServices.compareApiListInfoAndScenarioApi(dependsOnMap.getValue(), apiListInfoScenarioDoc.get(k))) {
                        apiListInfo_in.add(apiListInfoScenarioDoc.get(k));
                    }
                }
            }

            map.put("in", apiListInfo_in);
        }

        ApiDocDao apiDocDao = new ApiDocImplMongo();

        List<ApiListInfo> apiListInfoList_out = apiDocDao.selectApisByTitleAndVersion(scenarioDoc.getSwagger().getInfo().getTitle(),scenarioDoc.getSwagger().getInfo().getVersion());

        map.put("out", apiListInfoList_out);

        return ok(services.utils.swagger.core.util.Json.pretty(ResultData.getSuccessInstance(map, "getApisByScenarioId")));
    }

    public Result updateScenario(String scenarioId) {

        JsonNode scenarioApiListInfosNode = request().body().asJson();

        List<ApiListInfo> apiListInfos = new ArrayList<>();

        List<Object> apiList = new ArrayList<>();
        try {
            apiList = Json.mapper().readValue(scenarioApiListInfosNode.get("apiListInfos").toString(), List.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < apiList.size(); i++) {
            try {
                ApiListInfo apiListInfo = Json.mapper().readValue(toJson(apiList.get(i)).toString(), ApiListInfo.class);
                apiListInfos.add(apiListInfo);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        ScenarioDoc scenarioDoc = scenarioDao.selectScenarioDocByScenarioId(scenarioId);

        Map<String, ScenarioApiInfo> dependsOnOld = new HashMap<>();

        if(scenarioDoc.getDependsOn() != null){
            dependsOnOld = scenarioDoc.getDependsOn();
        }

        Map<String, ScenarioApiInfo> dependsOnNew = new HashMap<>();

        Map<String, Path> pathsOld = new HashMap<>();

        if(scenarioDoc.getSwagger().getPaths() != null){
            pathsOld = scenarioDoc.getSwagger().getPaths();
        }


        Map<String, Path> pathsNew = new HashMap<>();

        if (apiListInfos.size() > 0) {
            for (int j = 0; j < apiListInfos.size(); j++) {
                Boolean flag = true;
                ScenarioApiInfo scenarioApiInfo = new ScenarioApiInfo();
                for (Map.Entry<String, ScenarioApiInfo> dependsOn : dependsOnOld.entrySet()) {
                    if (UtilServices.compareApiListInfoAndScenarioApi(dependsOn.getValue(), apiListInfos.get(j))) {
                        scenarioApiInfo = dependsOn.getValue();
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    scenarioApiInfo.setVersion(apiListInfos.get(j).getVersion());
                    scenarioApiInfo.setHost(apiListInfos.get(j).getHost());
                    scenarioApiInfo.setHttpMethod(apiListInfos.get(j).getHttpMethod());
                    scenarioApiInfo.setTitle(apiListInfos.get(j).getTitle());
                    scenarioApiInfo.setBasePath(apiListInfos.get(j).getBasePath());
                    scenarioApiInfo.setPathUrl(apiListInfos.get(j).getUrlPath());
                    scenarioApiInfo.setChecks(new ArrayList<>());

                    List<Parameter> parameters = apiListInfos.get(j).getOperation().getParameters();
                    List<FieldValue> fieldValues = new ArrayList<>();
                    for (int l = 0; l < parameters.size(); l++) {
                        FieldValue fieldValue = new FieldValue();
                        fieldValue.setName(parameters.get(l).getName());
                        fieldValue.setIn(parameters.get(l).getIn());
                        fieldValue.setValue("");
                        fieldValues.add(fieldValue);
                    }

                    scenarioApiInfo.setFieldValues(fieldValues);
                    Map<String, String> map = new HashMap<>();
                    scenarioApiInfo.setHeaders(map);

                }
                dependsOnNew.put(j+"", scenarioApiInfo);

                String pathNew = apiListInfos.get(j).getUrlPath();
                Operation operationNew = apiListInfos.get(j).getOperation();
                HttpMethod httpMethodNew = apiListInfos.get(j).getHttpMethod();
                Path path = new Path();

                if (pathsNew.containsKey(pathNew)) {
                    path = pathsNew.get(pathNew);
                }

                if (pathsOld.containsKey(pathNew)) {

                    Map<HttpMethod, Operation> operationMapOld = pathsOld.get(pathNew).getOperationMap();

                    if (operationMapOld.containsKey(httpMethodNew)) {

                        path = path.set(httpMethodNew.toString().toLowerCase(), operationMapOld.get(httpMethodNew));

                    } else {
                        path = path.set(httpMethodNew.toString().toLowerCase(), operationNew);
                    }

                } else {
                    path = path.set(httpMethodNew.toString().toLowerCase(), operationNew);
                }
                pathsNew.put(pathNew, path);
            }
        }
        scenarioDoc.getSwagger().setPaths(pathsNew);
        scenarioDoc.setDependsOn(dependsOnNew);
        Boolean flag = scenarioDao.upateScenarioDoc(scenarioDoc);
        return ok(services.utils.swagger.core.util.Json.pretty(ResultData.getSuccessInstance(flag, "updateScenario")));
    }


    public Result updateScenarioByDependsOn(String scenarioId) {
        JsonNode scenarioApiListInfosNode = request().body().asJson();
        List<Check> checks = new ArrayList<>();
        List<FieldValue> fieldValues = new ArrayList<>();
        List<Object> checksObject = new ArrayList<>();
        List<Object> fieldValuesObject = new ArrayList<>();
        Map<String, String> headers = new HashMap<>();

        String orderNum_js = scenarioApiListInfosNode.get("orderNum").toString().replace("\"", "");
        String scheme = scenarioApiListInfosNode.get("scheme").toString().replace("\"", "");
        String host = scenarioApiListInfosNode.get("host").toString().replace("\"", "");
        String urlPath = scenarioApiListInfosNode.get("urlPath").toString().replace("\"", "");

        try {
            headers = Json.mapper().readValue(scenarioApiListInfosNode.get("headers").toString(), Map.class);
            checksObject = Json.mapper().readValue(scenarioApiListInfosNode.get("checks").toString(), List.class);
            fieldValuesObject = Json.mapper().readValue(scenarioApiListInfosNode.get("params").toString(), List.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < checksObject.size(); i++) {
            try {
                Check check = Json.mapper().readValue(toJson(checksObject.get(i)).toString(), Check.class);
                if(!checks.contains(check)){
                    checks.add(check);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < fieldValuesObject.size(); i++) {
            try {
                FieldValue fieldValue = Json.mapper().readValue(toJson(fieldValuesObject.get(i)).toString(), FieldValue.class);
                fieldValues.add(fieldValue);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        ScenarioDoc scenarioDoc = scenarioDao.selectScenarioDocByScenarioId(scenarioId);
        scenarioDoc.getDependsOn().get(orderNum_js).setChecks(checks);
        scenarioDoc.getDependsOn().get(orderNum_js).setHeaders(headers);
        scenarioDoc.getDependsOn().get(orderNum_js).setFieldValues(fieldValues);
        scenarioDoc.getDependsOn().get(orderNum_js).setHost(host);
        scenarioDoc.getDependsOn().get(orderNum_js).setScheme(scheme);
        scenarioDoc.getDependsOn().get(orderNum_js).setPathUrl(urlPath.replace(scenarioDoc.getDependsOn().get(orderNum_js).getBasePath(), ""));

        scenarioDao.upateScenarioDoc(scenarioDoc);

        Map<String, ScenarioApiInfo> dependsOn = scenarioDoc.getDependsOn();
        Map<Integer, ScenarioApiInfo> dependsOnResult = new HashMap<>();

        Map<String,String> saveParams = new HashMap<>();

        for (int i = 0; i <= Integer.parseInt(orderNum_js); i++) {
            ScenarioApiInfo scenarioApiInfo = scenarioDoc.getDependsOn().get(i + "");

            List<FieldValue> fieldValueList = scenarioApiInfo.getFieldValues();

            for(int m=0;m<fieldValueList.size();m++){
                if(saveParams.containsKey(fieldValueList.get(m).getValue())){
                    fieldValueList.get(m).setValue(saveParams.get(fieldValueList.get(m).getValue()));
                }
            }
            scenarioApiInfo.setFieldValues(fieldValueList);

            SendHttpRequest sendHttpRequest = new SendHttpRequest(scenarioApiInfo);

            sendHttpRequest.sendHttpRequest();

            scenarioApiInfo.setResponse(sendHttpRequest.getResponse().asString());

            for(int k=0;k<scenarioApiInfo.getChecks().size();k++){
                CheckRuleImpl checkRule = new CheckRuleImpl(scenarioApiInfo.getChecks().get(k));
                checkRule.getResult(sendHttpRequest.getResponse().asString());
                if(checkRule.getCheck().getCheckMethod().equals(CheckMethod.Save)){
                    saveParams.put(checkRule.getCheck().getTargetField(),checkRule.getCheck().getExpect());
                }

            }
            dependsOn.put(i+"", scenarioApiInfo);
            dependsOnResult.put(i,scenarioApiInfo);
        }
        scenarioDoc.setDependsOn(dependsOn);

        return ok(services.utils.swagger.core.util.Json.pretty(ResultData.getSuccessInstance(dependsOnResult, "updateScenarioByDependsOnAndSendRequest")));
    }


    public Result sendRequestByScenarioId(String scenarioId) {

        ScenarioDoc scenarioDoc = scenarioDao.selectScenarioDocByScenarioId(scenarioId);
        Map<String,String> saveParams = new HashMap<>();
        Map<String, ScenarioApiInfo> dependsOn = scenarioDoc.getDependsOn();


        for (Map.Entry<String, ScenarioApiInfo> dependOn : scenarioDoc.getDependsOn().entrySet()) {
            ScenarioApiInfo scenarioApiInfo = dependOn.getValue();
            ScenarioApiInfo scenarioApiInfo_send = scenarioApiInfo;

            List<Check> checkList = new ArrayList<>();
            List<FieldValue> fieldValueList = scenarioApiInfo.getFieldValues();

            for(int m=0;m<fieldValueList.size();m++){
                if(saveParams.containsKey(fieldValueList.get(m).getValue())){
                    fieldValueList.get(m).setValue(saveParams.get(fieldValueList.get(m).getValue()));
                }
            }
            scenarioApiInfo_send.setFieldValues(fieldValueList);

            SendHttpRequest sendHttpRequest = new SendHttpRequest(scenarioApiInfo_send);

            sendHttpRequest.sendHttpRequest();
            scenarioApiInfo.setResponse(sendHttpRequest.getResponse().asString());

            for(int k=0;k<scenarioApiInfo.getChecks().size();k++){
                CheckRuleImpl checkRule = new CheckRuleImpl(scenarioApiInfo.getChecks().get(k));
                checkRule.getResult(sendHttpRequest.getResponse().asString());
                checkList.add(checkRule.getCheck());

                if(checkRule.getCheck().getCheckMethod().equals(CheckMethod.Save)){
                    saveParams.put(checkRule.getCheck().getTargetField(),checkRule.getCheck().getExpect());
                }

            }
            dependsOn.put(dependOn.getKey(), scenarioApiInfo);
        }
        scenarioDoc.setDependsOn(dependsOn);
        return ok(services.utils.swagger.core.util.Json.pretty(ResultData.getSuccessInstance(scenarioDoc.getDependsOn(), "sendRequestByScenarioId")));
    }

    public Result removeScenarioByscenarioId(String scenarioId) {
        return play.mvc.Results.TODO;
    }
}
