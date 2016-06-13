
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/apple/Documents/PRO/ApiIntelligenceRobot/conf/routes
// @DATE:Mon Jun 13 15:30:30 CST 2016

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseScenarioController ScenarioController = new controllers.ReverseScenarioController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseUserController UserController = new controllers.ReverseUserController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApiDocController ApiDocController = new controllers.ReverseApiDocController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseScenarioController ScenarioController = new controllers.javascript.ReverseScenarioController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseUserController UserController = new controllers.javascript.ReverseUserController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApiDocController ApiDocController = new controllers.javascript.ReverseApiDocController(RoutesPrefix.byNamePrefix());
  }

}
