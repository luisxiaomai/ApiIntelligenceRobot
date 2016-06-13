package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.commons.LoginPage;
import views.html.commons.RegisterPage;
import views.html.apis.doc.ApiDocs;
import views.html.apis.doc.ApiDocs2;
import views.html.apis.design.ApiDesign;
import views.html.scenarios.view.ScenarioView;
import views.html.scenarios.add.Scenarios;
import views.html.APIEdit;


/**
 * Created by apple on 16/5/15.
 */
public class HomeController extends Controller {

    public Result apiEditPage() {
        String user = session("UserInfo");
        if (null == user) {
            return ok(LoginPage.render());
        }
        return ok(APIEdit.render(UtilController.getSessionUserInfo(user)));

    }

    public Result loginPage() {
        return ok(LoginPage.render());
    }


    public Result registerPage() {
        return ok(RegisterPage.render());
    }

    public Result apiDocPage2() {
        String user = session("UserInfo");
        if (null == user) {
            return ok(LoginPage.render());
        }
        return ok(ApiDocs.render(UtilController.getSessionUserInfo(user)));
    }

    public Result apiDocPage() {
        String user = session("UserInfo");
        if (null == user) {
            return ok(LoginPage.render());
        }
        return ok(ApiDocs2.render(UtilController.getSessionUserInfo(user)));
    }


    public Result apiDesignPage() {
        String user = session("UserInfo");
        if (null == user) {
            return ok(LoginPage.render());
        }
        return ok(ApiDesign.render(UtilController.getSessionUserInfo(user)));
    }

    public Result scenarioViewPage(String scenarioId) {
        String user = session("UserInfo");
        if (null == user) {
            return ok(LoginPage.render());
        }
        return ok(ScenarioView.render(UtilController.getSessionUserInfo(user)));
    }

    public Result scenariosPage() {
        String user = session("UserInfo");
        if (null == user) {
            return ok(LoginPage.render());
        }
        return ok(Scenarios.render(UtilController.getSessionUserInfo(user)));
    }


}
