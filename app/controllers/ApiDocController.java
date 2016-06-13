package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.sun.org.apache.xpath.internal.operations.Bool;
import models.apis.custom.ApiDoc;
import models.apis.custom.ApiListInfo;
import models.apis.moudle.InfoVersions;
import models.apis.swagger.Swagger;
import models.commons.ResultData;
import org.json.JSONObject;
import play.mvc.Controller;
import play.mvc.Result;
import services.apis.ApiDocDao;
import services.apis.ApiDocImplMongo;
import services.utils.swagger.core.util.Json;
import services.utils.swagger.parser.SwaggerParser;

import java.util.List;

import static play.libs.Json.toJson;

/**
 * Created by apple on 16/5/23.
 */
public class ApiDocController extends Controller {

    final static ApiDocDao apiDocDao = new ApiDocImplMongo();

    public Result getApiDocInfos() {
        List<InfoVersions> infoVersionsList = apiDocDao.selectInfosAll();
        return ok(services.utils.swagger.core.util.Json.pretty(ResultData.getSuccessInstance(infoVersionsList, "")));
//        return ok(toJson(infoVersionsList));

    }

    public Result getApiDoc() {

        ApiDoc apiDoc = apiDocDao.selectApiDocOne();

//        return ok(toJson(ResultData.getSuccessInstance(apiDoc, "")));
        return ok(services.utils.swagger.core.util.Json.pretty((apiDoc.getSwagger())));

    }

    public Result getApiDocByTitleAndVersion(String title, String version) {

        ApiDoc apiDoc = apiDocDao.selectApiDocByTitleAndVersion(title, version);

        return ok(services.utils.swagger.core.util.Json.pretty((apiDoc.getSwagger())));

    }

    public Result getApiDocs() {
        List<ApiDoc> apiDocs = apiDocDao.selectApiDocAll();
        return ok(services.utils.swagger.core.util.Json.pretty(ResultData.getSuccessInstance(apiDocs, "")));
    }

    public Result getApiDocsByTitle(String title) {
        List<ApiDoc> apiDocs = apiDocDao.selectApiDocByTitle(title);
        return ok(services.utils.swagger.core.util.Json.pretty(ResultData.getSuccessInstance(apiDocs, "")));
    }

    public Result getApiDocsByVersion(String version) {

        List<ApiDoc> apiDocs = apiDocDao.selectApiDocByTitle(version);
        return ok(services.utils.swagger.core.util.Json.pretty(ResultData.getSuccessInstance(apiDocs, "")));
    }

    public Result getApis() {
        List<ApiListInfo> apiListInfoList = apiDocDao.selectApisAll();
        return ok(services.utils.swagger.core.util.Json.pretty(ResultData.getSuccessInstance(apiListInfoList, "")));
    }

    public Result getApisByTitle(String title) {
        List<ApiListInfo> apiListInfoList = apiDocDao.selectApisByTitle(title);
        return ok(services.utils.swagger.core.util.Json.pretty(ResultData.getSuccessInstance(apiListInfoList, "")));
    }

    public Result getApisByVersion(String version) {
        List<ApiListInfo> apiListInfoList = apiDocDao.selectApisByVersion(version);
        return ok(services.utils.swagger.core.util.Json.pretty(ResultData.getSuccessInstance(apiListInfoList, "")));
    }

    public Result getApisByTitleAndVersion(String title, String version) {
        List<ApiListInfo> apiListInfoList = apiDocDao.selectApisByTitleAndVersion(title, version);
        return ok(services.utils.swagger.core.util.Json.pretty(ResultData.getSuccessInstance(apiListInfoList, "")));
    }

    public Result updateApiDoc() {
        return play.mvc.Results.TODO;
    }

    public Result addApiDoc() {
        JsonNode scenarioNode = request().body().asJson();
        Boolean flag = apiDocDao.insertApiDoc(scenarioNode);

        return ok(services.utils.swagger.core.util.Json.pretty(ResultData.getSuccessInstance(flag, "")));
    }

    public Result removeApiDocByApiId(String apiId) {
        return play.mvc.Results.TODO;
    }
}
