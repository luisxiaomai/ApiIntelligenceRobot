package services.scenarios;

import models.apis.custom.ApiListInfo;
import models.apis.custom.ScenarioDoc;
import models.apis.moudle.ScenarioDocSimplify;
import models.apis.moudle.ScenarioTagName;

import java.util.List;

/**
 * Created by apple on 16/5/17.
 */
public interface ScenarioDao {

    Boolean createScenarioDocWithEmailTagNameAndScenarioName(String email, String tagName, String scenarioName,String title,String version);

    List<ScenarioDoc> selectScenarioDocByEmail(String email);

    List<ScenarioDoc> selectScenarioDocByEmailAndTagName(String email, String tagName);

    List<ScenarioDoc> selectScenarioDocByEmailAndScenarioName(String email, String scenarioName);

    ScenarioDoc selectScenarioDocByEmailTagNameAndScenarioName(String email, String tagName, String scenarioName);

    ScenarioDoc selectScenarioDocByScenarioId(String idScenario);

    Boolean upateScenarioDoc(ScenarioDoc scenarioDoc);

    List<ScenarioTagName> selectTagNameAndScenarioNamesByEmail(String email);

    List<ApiListInfo> selectApisByScenarioId(String scenarioId);

    List<ScenarioDocSimplify> selectScenarioDocSimplifyByEmail(String email);

}
