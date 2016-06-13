package services.apis;

import com.fasterxml.jackson.databind.JsonNode;
import com.mongodb.WriteResult;
import models.apis.custom.ApiDoc;
import models.apis.custom.ApiListInfo;
import models.apis.moudle.InfoVersions;
import models.apis.swagger.HttpMethod;
import models.apis.swagger.Operation;
import models.apis.swagger.Path;
import models.apis.swagger.Swagger;
import org.bson.types.ObjectId;
import org.jongo.Aggregate;
import org.jongo.MongoCollection;
import org.jongo.MongoCursor;
import org.json.JSONObject;
import services.UtilServices;
import services.utils.MongoDBDaoImpl;
import services.utils.swagger.core.util.Json;
import services.utils.swagger.parser.SwaggerParser;

import java.io.IOException;
import java.util.*;

import static play.libs.Json.toJson;


/**
 * Created by apple on 16/4/18.
 */
public class ApiDocImplMongo implements ApiDocDao {

    private final MongoDBDaoImpl mongoDBDao = MongoDBDaoImpl.getInstance();

    private final MongoCollection apidocs = mongoDBDao.getCollection("apidata", "apidocs");

    @Override
    public List<ApiDoc> selectApiDocAll() {
        List<ApiDoc> apiDocList = new ArrayList<>();
        MongoCursor<Object> apiDocsMongoCursor = apidocs.find().as(Object.class);
        while (apiDocsMongoCursor.hasNext()) {
            apiDocList.add(UtilServices.verifyData(apiDocsMongoCursor.next()));
        }
        return apiDocList;
    }

    @Override
    public List<ApiDoc> selectApiDocByTitle(String title) {
        List<ApiDoc> apiDocList = new ArrayList<>();
        MongoCursor<Object> apiDocsMongoCursor = apidocs.find("{swagger.info.title:#}", title).as(Object.class);

        while (apiDocsMongoCursor.hasNext()) {
            apiDocList.add(UtilServices.verifyData(apiDocsMongoCursor.next()));
        }
        return apiDocList;
    }

    @Override
    public List<ApiDoc> selectApiDocByVersion(String version) {
        List<ApiDoc> apiDocList = new ArrayList<>();
        MongoCursor<Object> apiDocsMongoCursor = apidocs.find("{swagger.info.version:#}", version).as(Object.class);
        while (apiDocsMongoCursor.hasNext()) {
            apiDocList.add(UtilServices.verifyData(apiDocsMongoCursor.next()));
        }
        return apiDocList;
    }

    @Override
    public ApiDoc selectApiDocByTitleAndVersion(String title, String version) {
        Object apiInfoJson = apidocs.findOne("{swagger.info.title:#,swagger.info.version:#}", title, version).as(Object.class);
        return UtilServices.verifyData(apiInfoJson);
    }

    @Override
    public List<InfoVersions> selectInfosAll() {
        List<InfoVersions> infoList = new ArrayList<>();
        Aggregate.ResultsIterator<InfoVersions> infoVersionsResultsIterator = apidocs.aggregate("{ $group : { _id : '$swagger.info.title' ,versions:{$push:'$swagger.info.version'}} }").as(InfoVersions.class);
        while (infoVersionsResultsIterator.hasNext()) {
            infoList.add(infoVersionsResultsIterator.next());
        }
        return infoList;
    }

    @Override
    public ApiDoc selectApiDocOne() {
        Object apiInfoJson = apidocs.findOne().as(Object.class);
        return UtilServices.verifyData(apiInfoJson);
    }

    @Override
    public List<ApiListInfo> selectApisAll() {
        return UtilServices.apiDocToApiListInfo(this.selectApiDocAll());
    }

    @Override
    public List<ApiListInfo> selectApisByTitleAndVersion(String title, String version) {
        List<ApiDoc> apiDocList = new ArrayList<>();
        apiDocList.add(this.selectApiDocByTitleAndVersion(title, version));
        return UtilServices.apiDocToApiListInfo(apiDocList);
    }

    @Override
    public List<ApiListInfo> selectApisByVersion(String version) {
        return UtilServices.apiDocToApiListInfo(this.selectApiDocByVersion(version));
    }

    @Override
    public List<ApiListInfo> selectApisByTitle(String title) {
        return UtilServices.apiDocToApiListInfo(this.selectApiDocByTitle(title));
    }

    @Override
    public Boolean insertApiDoc(JsonNode apiInfo) {
        ApiDoc apiDoc = new ApiDoc();
        try {
            JsonNode jsonNode = Json.mapper().readTree(toJson(apiInfo).toString().replace("\"$ref\"", "\"@ref\""));
            WriteResult writeResult = apidocs.insert(jsonNode);
            String title = jsonNode.get("swagger").get("info").get("title").toString().replace("\"", "");
            String version = jsonNode.get("swagger").get("info").get("version").toString().replace("\"", "");
            apiDoc = this.selectApiDocByTitleAndVersion(title, version);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (apiDoc.equals(new ApiDoc())) {
            return false;
        } else {
            return true;

        }
    }

    @Override
    public Boolean removeApiDoc(ApiDoc apiInfo) {
        WriteResult writeResult = apidocs.remove(new ObjectId(apiInfo.get_id()));
        return null;
    }

    @Override
    public Boolean updateApiDoc(ApiDoc apiInfo) {
        WriteResult writeResult = apidocs.save(apiInfo);

        return null;
    }


}
