
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/apple/Documents/PRO/ApiIntelligenceRobot/conf/routes
// @DATE:Mon Jun 13 15:30:30 CST 2016

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:14
package controllers {

  // @LINE:72
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:72
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:53
  class ReverseScenarioController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:56
    def getScenariosByEmailOne(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "scenario")
    }
  
    // @LINE:66
    def updateScenarioByDependsOn(scenarioId:String): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "scenario/" + implicitly[PathBindable[String]].unbind("scenarioId", dynamicString(scenarioId)) + "/dependon")
    }
  
    // @LINE:53
    def getScenarioDocSimplifysByEmail(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "simplescenarios")
    }
  
    // @LINE:59
    def getScenariosByEmailAndTitle(email:String, scenarioName:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "scenarios/scenarioName/" + implicitly[PathBindable[String]].unbind("scenarioName", dynamicString(scenarioName)) + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("email", email)))))
    }
  
    // @LINE:61
    def getScenarioInfosByEmail(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "scenarios/infos")
    }
  
    // @LINE:69
    def sendRequestByScenarioId(scenarioId:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "scenario/" + implicitly[PathBindable[String]].unbind("scenarioId", dynamicString(scenarioId)) + "/sendrequest")
    }
  
    // @LINE:58
    def getScenariosByEmailAndTagName(email:String, tagName:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "scenarios/tagName/" + implicitly[PathBindable[String]].unbind("tagName", dynamicString(tagName)) + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("email", email)))))
    }
  
    // @LINE:57
    def getScenariosByEmail(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "scenarios")
    }
  
    // @LINE:65
    def updateScenario(scenarioId:String): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "scenario/" + implicitly[PathBindable[String]].unbind("scenarioId", dynamicString(scenarioId)) + "/apis")
    }
  
    // @LINE:60
    def getScenariosByEmailTagNameAndTitle(email:String, tagName:String, scenarioName:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "scenarios/" + implicitly[PathBindable[String]].unbind("tagName", dynamicString(tagName)) + "/" + implicitly[PathBindable[String]].unbind("scenarioName", dynamicString(scenarioName)) + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("email", email)))))
    }
  
    // @LINE:55
    def getScenariosByScenarioId(scenarioId:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "scenario/" + implicitly[PathBindable[String]].unbind("scenarioId", dynamicString(scenarioId)))
    }
  
    // @LINE:63
    def addScenario(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "scenario")
    }
  
    // @LINE:68
    def removeScenarioByscenarioId(scenarioId:String): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "scenario/" + implicitly[PathBindable[String]].unbind("scenarioId", dynamicString(scenarioId)))
    }
  
    // @LINE:54
    def getApisByScenarioId(scenarioId:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "scenario/" + implicitly[PathBindable[String]].unbind("scenarioId", dynamicString(scenarioId)) + "/apis")
    }
  
  }

  // @LINE:31
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:33
    def userRegister(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "user")
    }
  
    // @LINE:34
    def userRemove(): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "user")
    }
  
    // @LINE:32
    def userUpdate(): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "user")
    }
  
    // @LINE:31
    def userLogin(email:String, pwd:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "user/" + implicitly[PathBindable[String]].unbind("email", dynamicString(email)) + "/" + implicitly[PathBindable[String]].unbind("pwd", dynamicString(pwd)))
    }
  
    // @LINE:35
    def userSignout(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "userloginout")
    }
  
  }

  // @LINE:14
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def apiDocPage2(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "apiDocPage2")
    }
  
    // @LINE:16
    def registerPage(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "registerPage")
    }
  
    // @LINE:14
    def loginPage(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
    // @LINE:22
    def apiDesignPage(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "apiDesignPage")
    }
  
    // @LINE:24
    def scenarioViewPage(scenarioId:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "scenarioViewPage/" + implicitly[PathBindable[String]].unbind("scenarioId", dynamicString(scenarioId)))
    }
  
    // @LINE:19
    def apiDocPage(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "apiDocPage")
    }
  
    // @LINE:26
    def scenariosPage(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "scenariosPage")
    }
  
    // @LINE:27
    def apiEditPage(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "apiEditPage")
    }
  
  }

  // @LINE:37
  class ReverseApiDocController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:45
    def removeApiDocByApiId(apiId:String): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "apiDoc/" + implicitly[PathBindable[String]].unbind("apiId", dynamicString(apiId)))
    }
  
    // @LINE:47
    def getApisByTitle(title:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "apis/title/" + implicitly[PathBindable[String]].unbind("title", dynamicString(title)))
    }
  
    // @LINE:44
    def addApiDoc(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "apiDoc")
    }
  
    // @LINE:48
    def getApisByVersion(version:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "apis/version/" + implicitly[PathBindable[String]].unbind("version", dynamicString(version)))
    }
  
    // @LINE:42
    def getApiDocInfos(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "apiDoc/infos")
    }
  
    // @LINE:38
    def getApiDocByTitleAndVersion(title:String, version:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "apiDoc/" + implicitly[PathBindable[String]].unbind("title", dynamicString(title)) + "/" + implicitly[PathBindable[String]].unbind("version", dynamicString(version)))
    }
  
    // @LINE:37
    def getApiDoc(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "apiDoc")
    }
  
    // @LINE:46
    def getApis(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "apis")
    }
  
    // @LINE:49
    def getApisByTitleAndVersion(title:String, version:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "apis/" + implicitly[PathBindable[String]].unbind("title", dynamicString(title)) + "/" + implicitly[PathBindable[String]].unbind("version", dynamicString(version)))
    }
  
    // @LINE:43
    def updateApiDoc(): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "apiDoc")
    }
  
    // @LINE:40
    def getApiDocsByTitle(title:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "apiDocs/title/" + implicitly[PathBindable[String]].unbind("title", dynamicString(title)))
    }
  
    // @LINE:39
    def getApiDocs(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "apiDocs")
    }
  
    // @LINE:41
    def getApiDocsByVersion(version:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "apiDocs/version/" + implicitly[PathBindable[String]].unbind("version", dynamicString(version)))
    }
  
  }


}
