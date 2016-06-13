package services.scenarios;

import models.apis.custom.ApiListInfo;
import models.apis.custom.ScenarioDoc;
import models.apis.moudle.ScenarioTagName;
import org.junit.Test;

import java.util.List;
import static play.libs.Json.toJson;

/**
 * Created by apple on 16/5/23.
 */
public class ScenarioImplMongoTest {
    final static ScenarioDao scenarioDao = new ScenarioImplMongo();
    final static String email = "yuyilong936@pingan.com.cn";
    final static String tagName = "TagName";
    final static String scenarioName = "ScenarioName";

    @Test
    public void selectApisByScenarioId() throws Exception {
//5742bb945bec570332d2d870
        List<ApiListInfo> apiListInfos =  scenarioDao.selectApisByScenarioId("57467007a9b1ca02abc6de21");
        System.out.println(services.utils.swagger.core.util.Json.pretty(apiListInfos));

    }

    @Test
    public void createScenarioDocWithEmailTagNameAndScenarioName() throws Exception {
        scenarioDao.createScenarioDocWithEmailTagNameAndScenarioName(email, tagName, scenarioName,"title","version");
        scenarioDao.createScenarioDocWithEmailTagNameAndScenarioName(email, tagName, "scenarioName1","title","version");
        scenarioDao.createScenarioDocWithEmailTagNameAndScenarioName(email, "tagName2", "scenarioName2","title","version");
        scenarioDao.createScenarioDocWithEmailTagNameAndScenarioName(email, "tagName2", "scenarioName3","title","version");

        System.out.println();
    }

    @Test
    public void selectScenarioDocByEmail() throws Exception {
        List<ScenarioDoc> scenarioDocList = scenarioDao.selectScenarioDocByEmail(email);
        System.out.println(toJson(scenarioDocList));
        System.out.println(services.utils.swagger.core.util.Json.pretty(scenarioDocList));


    }

    @Test
    public void selectScenarioDocByEmailTagNameAndScenarioName() throws Exception {
       ScenarioDoc scenarioDoc = scenarioDao.selectScenarioDocByEmailTagNameAndScenarioName(email, tagName, scenarioName);
        System.out.println(toJson(scenarioDoc));
        System.out.println(services.utils.swagger.core.util.Json.pretty(scenarioDoc));

    }

    @Test
    public void selectScenarioDocByEmailAndTagName() throws Exception{
        List<ScenarioDoc> scenarioDocList = scenarioDao.selectScenarioDocByEmailAndTagName(email,tagName);
        System.out.println(toJson(scenarioDocList));
        System.out.println(services.utils.swagger.core.util.Json.pretty(scenarioDocList));

    }

    @Test
    public void selectScenarioDocByEmailAndScenarioName() throws Exception{
        List<ScenarioDoc> scenarioDocList = scenarioDao.selectScenarioDocByEmailAndScenarioName(email,scenarioName);
        System.out.println(toJson(scenarioDocList));
        System.out.println(services.utils.swagger.core.util.Json.pretty(scenarioDocList));

    }

    @Test
    public void selectScenarioDocByScenarioId() throws Exception {
        ScenarioDoc scenarioDoc = scenarioDao.selectScenarioDocByScenarioId("57467007a9b1ca02abc6de21");
        System.out.println(toJson(scenarioDoc));
        System.out.println(services.utils.swagger.core.util.Json.pretty(scenarioDoc));


    }

    @Test
    public void upateScenarioDoc() throws Exception {

    }

    @Test
    public void selectTagNameAndScenarioNamesByEmail() throws Exception {
        List<ScenarioTagName> scenarioTagNames = scenarioDao.selectTagNameAndScenarioNamesByEmail(email);
        System.out.println(toJson(scenarioTagNames));

    }
}