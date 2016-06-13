package services.apis;

import models.apis.custom.ApiDoc;
import models.apis.custom.ApiListInfo;
import models.apis.moudle.InfoVersions;
import org.junit.Test;

import java.util.List;

import static play.libs.Json.toJson;

/**
 * Created by apple on 16/5/22.
 */
public class ApiDocImplMongoTest {
    ApiDocImplMongo apiDocImplMongo = new ApiDocImplMongo();

    @Test
    public void insertApiDoc() throws Exception {
//        ApiDoc apiDoc = new ApiDoc();
//        apiDocImplMongo.insertApiDoc(apiDoc);
    }

    @Test
    public void selectApiDocAll() throws Exception {
        List<ApiDoc> apiDocList1 = apiDocImplMongo.selectApiDocAll();
        System.out.println("selectApiDocAll()   :\n"+toJson(apiDocList1));

    }

    @Test
    public void selectApiDocByTitle() throws Exception {
        List<ApiDoc> apiDocList1 = apiDocImplMongo.selectApiDocByTitle("Uber API");
        List<ApiDoc> apiDocList2 = apiDocImplMongo.selectApiDocByTitle("Swagger Petstore (Simple)");
        List<ApiDoc> apiDocList3 = apiDocImplMongo.selectApiDocByTitle("Swagger Petstore");
        List<ApiDoc> apiDocList4 = apiDocImplMongo.selectApiDocByTitle("conti-edge");
        List<ApiDoc> apiDocList5 = apiDocImplMongo.selectApiDocByTitle("xxoo");
        System.out.println("selectApiDocByTitle()   :\n"+toJson(apiDocList1));

    }

    @Test
    public void selectApiDocByVersion() throws Exception {

        List<ApiDoc> apiDocList = apiDocImplMongo.selectApiDocByVersion("1.2-SNAPSHOT");
        List<ApiDoc> apiDocList1 = apiDocImplMongo.selectApiDocByVersion("1.0.0");
        System.out.println("selectApiDocByVersion()   :\n"+toJson(apiDocList1));

    }

    @Test
    public void selectApiDocByTitleAndVersion() throws Exception {
        ApiDoc apiDoc = apiDocImplMongo.selectApiDocByTitleAndVersion("Swagger Petstore (Simple)","1.0.0");
        System.out.println("selectApiDocByTitleAndVersion()   :\n"+toJson(apiDoc));

    }

    @Test
    public void selectInfosAll() throws Exception {

        List<InfoVersions> infoVersionsList = apiDocImplMongo.selectInfosAll();

        System.out.println("selectApiDocByTitle()   :\n"+toJson(infoVersionsList));
    }

    @Test
    public void selectApiDocOne() throws Exception {
        ApiDoc apiDoc = apiDocImplMongo.selectApiDocOne();
        System.out.println("selectApiDocOne()   :\n"+toJson(apiDoc));
    }

    @Test
    public void selectApisAll() throws Exception {
        List<ApiListInfo>  apiListInfoList = apiDocImplMongo.selectApisAll();
        System.out.println("selectApisAll()   :\n"+toJson(apiListInfoList));

    }

    @Test
    public void selectApisByTitleAndVersion() throws Exception {
        List<ApiListInfo>  apiListInfoList = apiDocImplMongo.selectApisByTitleAndVersion("Swagger Petstore (Simple)","1.0.0");
        System.out.println("selectApisByTitleAndVersion()   :\n"+toJson(apiListInfoList));

    }

    @Test
    public void selectApisByVersion() throws Exception {
        List<ApiListInfo>  apiListInfoList = apiDocImplMongo.selectApisByVersion("1.0.0");
        System.out.println("selectApiDocByTitle()   :\n"+toJson(apiListInfoList));

    }

    @Test
    public void selectApisByTitle() throws Exception {
        List<ApiListInfo>  apiListInfoList = apiDocImplMongo.selectApisByTitle("conti-edge");
        System.out.println("selectApisByTitle()   :\n"+toJson(apiListInfoList));

    }

    @Test
    public void removeApiDoc() throws Exception {

    }

    @Test
    public void updateApiDoc() throws Exception {

    }

    @Test
    public void verifyData() throws Exception {

    }

    @Test
    public void apiDocToApiListInfo() throws Exception {

    }
}