package services.apis;

import com.fasterxml.jackson.databind.JsonNode;
import models.apis.custom.ApiDoc;
import models.apis.custom.ApiListInfo;
import models.apis.moudle.InfoVersions;

import java.util.List;

/**
 * Created by apple on 16/4/18.
 */
public interface ApiDocDao {

    List<ApiDoc> selectApiDocAll();

    List<ApiDoc> selectApiDocByTitle(String title);

    List<ApiDoc> selectApiDocByVersion(String version);

    ApiDoc selectApiDocByTitleAndVersion(String title, String version);

    List<InfoVersions> selectInfosAll();

    ApiDoc selectApiDocOne();

    Boolean insertApiDoc(JsonNode apiInfo);

    Boolean removeApiDoc(ApiDoc apiInfo);

    Boolean updateApiDoc(ApiDoc apiInfo);

    List<ApiListInfo> selectApisAll();

    List<ApiListInfo> selectApisByTitleAndVersion(String title, String version);

    List<ApiListInfo> selectApisByVersion(String version);

    List<ApiListInfo> selectApisByTitle(String title);

}
