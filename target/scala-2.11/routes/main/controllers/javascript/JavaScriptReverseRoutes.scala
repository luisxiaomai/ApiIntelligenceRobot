
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/apple/Documents/PRO/ApiIntelligenceRobot/conf/routes
// @DATE:Mon Jun 13 15:30:30 CST 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:14
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:72
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:72
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:53
  class ReverseScenarioController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:56
    def getScenariosByEmailOne: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ScenarioController.getScenariosByEmailOne",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "scenario"})
        }
      """
    )
  
    // @LINE:66
    def updateScenarioByDependsOn: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ScenarioController.updateScenarioByDependsOn",
      """
        function(scenarioId0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "scenario/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("scenarioId", encodeURIComponent(scenarioId0)) + "/dependon"})
        }
      """
    )
  
    // @LINE:53
    def getScenarioDocSimplifysByEmail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ScenarioController.getScenarioDocSimplifysByEmail",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "simplescenarios"})
        }
      """
    )
  
    // @LINE:59
    def getScenariosByEmailAndTitle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ScenarioController.getScenariosByEmailAndTitle",
      """
        function(email0,scenarioName1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "scenarios/scenarioName/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("scenarioName", encodeURIComponent(scenarioName1)) + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email0)])})
        }
      """
    )
  
    // @LINE:61
    def getScenarioInfosByEmail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ScenarioController.getScenarioInfosByEmail",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "scenarios/infos"})
        }
      """
    )
  
    // @LINE:69
    def sendRequestByScenarioId: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ScenarioController.sendRequestByScenarioId",
      """
        function(scenarioId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "scenario/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("scenarioId", encodeURIComponent(scenarioId0)) + "/sendrequest"})
        }
      """
    )
  
    // @LINE:58
    def getScenariosByEmailAndTagName: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ScenarioController.getScenariosByEmailAndTagName",
      """
        function(email0,tagName1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "scenarios/tagName/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("tagName", encodeURIComponent(tagName1)) + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email0)])})
        }
      """
    )
  
    // @LINE:57
    def getScenariosByEmail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ScenarioController.getScenariosByEmail",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "scenarios"})
        }
      """
    )
  
    // @LINE:65
    def updateScenario: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ScenarioController.updateScenario",
      """
        function(scenarioId0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "scenario/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("scenarioId", encodeURIComponent(scenarioId0)) + "/apis"})
        }
      """
    )
  
    // @LINE:60
    def getScenariosByEmailTagNameAndTitle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ScenarioController.getScenariosByEmailTagNameAndTitle",
      """
        function(email0,tagName1,scenarioName2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "scenarios/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("tagName", encodeURIComponent(tagName1)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("scenarioName", encodeURIComponent(scenarioName2)) + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email0)])})
        }
      """
    )
  
    // @LINE:55
    def getScenariosByScenarioId: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ScenarioController.getScenariosByScenarioId",
      """
        function(scenarioId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "scenario/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("scenarioId", encodeURIComponent(scenarioId0))})
        }
      """
    )
  
    // @LINE:63
    def addScenario: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ScenarioController.addScenario",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "scenario"})
        }
      """
    )
  
    // @LINE:68
    def removeScenarioByscenarioId: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ScenarioController.removeScenarioByscenarioId",
      """
        function(scenarioId0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "scenario/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("scenarioId", encodeURIComponent(scenarioId0))})
        }
      """
    )
  
    // @LINE:54
    def getApisByScenarioId: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ScenarioController.getApisByScenarioId",
      """
        function(scenarioId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "scenario/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("scenarioId", encodeURIComponent(scenarioId0)) + "/apis"})
        }
      """
    )
  
  }

  // @LINE:31
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:33
    def userRegister: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.userRegister",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user"})
        }
      """
    )
  
    // @LINE:34
    def userRemove: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.userRemove",
      """
        function() {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "user"})
        }
      """
    )
  
    // @LINE:32
    def userUpdate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.userUpdate",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "user"})
        }
      """
    )
  
    // @LINE:31
    def userLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.userLogin",
      """
        function(email0,pwd1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email0)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("pwd", encodeURIComponent(pwd1))})
        }
      """
    )
  
    // @LINE:35
    def userSignout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.userSignout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userloginout"})
        }
      """
    )
  
  }

  // @LINE:14
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def apiDocPage2: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.apiDocPage2",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "apiDocPage2"})
        }
      """
    )
  
    // @LINE:16
    def registerPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.registerPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "registerPage"})
        }
      """
    )
  
    // @LINE:14
    def loginPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.loginPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:22
    def apiDesignPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.apiDesignPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "apiDesignPage"})
        }
      """
    )
  
    // @LINE:24
    def scenarioViewPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.scenarioViewPage",
      """
        function(scenarioId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "scenarioViewPage/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("scenarioId", encodeURIComponent(scenarioId0))})
        }
      """
    )
  
    // @LINE:19
    def apiDocPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.apiDocPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "apiDocPage"})
        }
      """
    )
  
    // @LINE:26
    def scenariosPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.scenariosPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "scenariosPage"})
        }
      """
    )
  
    // @LINE:27
    def apiEditPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.apiEditPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "apiEditPage"})
        }
      """
    )
  
  }

  // @LINE:37
  class ReverseApiDocController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:45
    def removeApiDocByApiId: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApiDocController.removeApiDocByApiId",
      """
        function(apiId0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "apiDoc/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("apiId", encodeURIComponent(apiId0))})
        }
      """
    )
  
    // @LINE:47
    def getApisByTitle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApiDocController.getApisByTitle",
      """
        function(title0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "apis/title/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("title", encodeURIComponent(title0))})
        }
      """
    )
  
    // @LINE:44
    def addApiDoc: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApiDocController.addApiDoc",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "apiDoc"})
        }
      """
    )
  
    // @LINE:48
    def getApisByVersion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApiDocController.getApisByVersion",
      """
        function(version0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "apis/version/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("version", encodeURIComponent(version0))})
        }
      """
    )
  
    // @LINE:42
    def getApiDocInfos: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApiDocController.getApiDocInfos",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "apiDoc/infos"})
        }
      """
    )
  
    // @LINE:38
    def getApiDocByTitleAndVersion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApiDocController.getApiDocByTitleAndVersion",
      """
        function(title0,version1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "apiDoc/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("title", encodeURIComponent(title0)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("version", encodeURIComponent(version1))})
        }
      """
    )
  
    // @LINE:37
    def getApiDoc: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApiDocController.getApiDoc",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "apiDoc"})
        }
      """
    )
  
    // @LINE:46
    def getApis: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApiDocController.getApis",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "apis"})
        }
      """
    )
  
    // @LINE:49
    def getApisByTitleAndVersion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApiDocController.getApisByTitleAndVersion",
      """
        function(title0,version1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "apis/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("title", encodeURIComponent(title0)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("version", encodeURIComponent(version1))})
        }
      """
    )
  
    // @LINE:43
    def updateApiDoc: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApiDocController.updateApiDoc",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "apiDoc"})
        }
      """
    )
  
    // @LINE:40
    def getApiDocsByTitle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApiDocController.getApiDocsByTitle",
      """
        function(title0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "apiDocs/title/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("title", encodeURIComponent(title0))})
        }
      """
    )
  
    // @LINE:39
    def getApiDocs: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApiDocController.getApiDocs",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "apiDocs"})
        }
      """
    )
  
    // @LINE:41
    def getApiDocsByVersion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApiDocController.getApiDocsByVersion",
      """
        function(version0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "apiDocs/version/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("version", encodeURIComponent(version0))})
        }
      """
    )
  
  }


}
