
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/apple/Documents/PRO/ApiIntelligenceRobot/conf/routes
// @DATE:Mon Jun 13 15:30:30 CST 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:14
  HomeController_0: controllers.HomeController,
  // @LINE:31
  UserController_2: controllers.UserController,
  // @LINE:37
  ApiDocController_3: controllers.ApiDocController,
  // @LINE:53
  ScenarioController_1: controllers.ScenarioController,
  // @LINE:72
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:14
    HomeController_0: controllers.HomeController,
    // @LINE:31
    UserController_2: controllers.UserController,
    // @LINE:37
    ApiDocController_3: controllers.ApiDocController,
    // @LINE:53
    ScenarioController_1: controllers.ScenarioController,
    // @LINE:72
    Assets_4: controllers.Assets
  ) = this(errorHandler, HomeController_0, UserController_2, ApiDocController_3, ScenarioController_1, Assets_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, UserController_2, ApiDocController_3, ScenarioController_1, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.loginPage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """registerPage""", """controllers.HomeController.registerPage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """apiDocPage2""", """controllers.HomeController.apiDocPage2"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """apiDocPage""", """controllers.HomeController.apiDocPage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """apiDesignPage""", """controllers.HomeController.apiDesignPage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """scenarioViewPage/""" + "$" + """scenarioId<[^/]+>""", """controllers.HomeController.scenarioViewPage(scenarioId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """scenariosPage""", """controllers.HomeController.scenariosPage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """apiEditPage""", """controllers.HomeController.apiEditPage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/""" + "$" + """email<[^/]+>/""" + "$" + """pwd<[^/]+>""", """controllers.UserController.userLogin(email:String, pwd:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user""", """controllers.UserController.userUpdate"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user""", """controllers.UserController.userRegister"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user""", """controllers.UserController.userRemove"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userloginout""", """controllers.UserController.userSignout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """apiDoc""", """controllers.ApiDocController.getApiDoc()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """apiDoc/""" + "$" + """title<[^/]+>/""" + "$" + """version<[^/]+>""", """controllers.ApiDocController.getApiDocByTitleAndVersion(title:String, version:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """apiDocs""", """controllers.ApiDocController.getApiDocs()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """apiDocs/title/""" + "$" + """title<[^/]+>""", """controllers.ApiDocController.getApiDocsByTitle(title:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """apiDocs/version/""" + "$" + """version<[^/]+>""", """controllers.ApiDocController.getApiDocsByVersion(version:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """apiDoc/infos""", """controllers.ApiDocController.getApiDocInfos"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """apiDoc""", """controllers.ApiDocController.updateApiDoc()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """apiDoc""", """controllers.ApiDocController.addApiDoc()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """apiDoc/""" + "$" + """apiId<[^/]+>""", """controllers.ApiDocController.removeApiDocByApiId(apiId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """apis""", """controllers.ApiDocController.getApis()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """apis/title/""" + "$" + """title<[^/]+>""", """controllers.ApiDocController.getApisByTitle(title:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """apis/version/""" + "$" + """version<[^/]+>""", """controllers.ApiDocController.getApisByVersion(version:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """apis/""" + "$" + """title<[^/]+>/""" + "$" + """version<[^/]+>""", """controllers.ApiDocController.getApisByTitleAndVersion(title:String, version:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """simplescenarios""", """controllers.ScenarioController.getScenarioDocSimplifysByEmail()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """scenario/""" + "$" + """scenarioId<[^/]+>/apis""", """controllers.ScenarioController.getApisByScenarioId(scenarioId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """scenario/""" + "$" + """scenarioId<[^/]+>""", """controllers.ScenarioController.getScenariosByScenarioId(scenarioId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """scenario""", """controllers.ScenarioController.getScenariosByEmailOne()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """scenarios""", """controllers.ScenarioController.getScenariosByEmail()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """scenarios/tagName/""" + "$" + """tagName<[^/]+>""", """controllers.ScenarioController.getScenariosByEmailAndTagName(email:String, tagName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """scenarios/scenarioName/""" + "$" + """scenarioName<[^/]+>""", """controllers.ScenarioController.getScenariosByEmailAndTitle(email:String, scenarioName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """scenarios/""" + "$" + """tagName<[^/]+>/""" + "$" + """scenarioName<[^/]+>""", """controllers.ScenarioController.getScenariosByEmailTagNameAndTitle(email:String, tagName:String, scenarioName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """scenarios/infos""", """controllers.ScenarioController.getScenarioInfosByEmail"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """scenario""", """controllers.ScenarioController.addScenario"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """scenario/""" + "$" + """scenarioId<[^/]+>/apis""", """controllers.ScenarioController.updateScenario(scenarioId:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """scenario/""" + "$" + """scenarioId<[^/]+>/dependon""", """controllers.ScenarioController.updateScenarioByDependsOn(scenarioId:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """scenario/""" + "$" + """scenarioId<[^/]+>""", """controllers.ScenarioController.removeScenarioByscenarioId(scenarioId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """scenario/""" + "$" + """scenarioId<[^/]+>/sendrequest""", """controllers.ScenarioController.sendRequestByScenarioId(scenarioId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:14
  private[this] lazy val controllers_HomeController_loginPage0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_loginPage0_invoker = createInvoker(
    HomeController_0.loginPage,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "loginPage",
      Nil,
      "GET",
      """用户登录页面""",
      this.prefix + """"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_registerPage1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("registerPage")))
  )
  private[this] lazy val controllers_HomeController_registerPage1_invoker = createInvoker(
    HomeController_0.registerPage,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "registerPage",
      Nil,
      "GET",
      """用户注册页面""",
      this.prefix + """registerPage"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_apiDocPage22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("apiDocPage2")))
  )
  private[this] lazy val controllers_HomeController_apiDocPage22_invoker = createInvoker(
    HomeController_0.apiDocPage2,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "apiDocPage2",
      Nil,
      "GET",
      """接口文档页面""",
      this.prefix + """apiDocPage2"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_apiDocPage3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("apiDocPage")))
  )
  private[this] lazy val controllers_HomeController_apiDocPage3_invoker = createInvoker(
    HomeController_0.apiDocPage,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "apiDocPage",
      Nil,
      "GET",
      """""",
      this.prefix + """apiDocPage"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_HomeController_apiDesignPage4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("apiDesignPage")))
  )
  private[this] lazy val controllers_HomeController_apiDesignPage4_invoker = createInvoker(
    HomeController_0.apiDesignPage,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "apiDesignPage",
      Nil,
      "GET",
      """接口设计添加页面""",
      this.prefix + """apiDesignPage"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_HomeController_scenarioViewPage5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("scenarioViewPage/"), DynamicPart("scenarioId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_scenarioViewPage5_invoker = createInvoker(
    HomeController_0.scenarioViewPage(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "scenarioViewPage",
      Seq(classOf[String]),
      "GET",
      """场景添加页面""",
      this.prefix + """scenarioViewPage/""" + "$" + """scenarioId<[^/]+>"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_HomeController_scenariosPage6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("scenariosPage")))
  )
  private[this] lazy val controllers_HomeController_scenariosPage6_invoker = createInvoker(
    HomeController_0.scenariosPage,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "scenariosPage",
      Nil,
      "GET",
      """场景设置页面""",
      this.prefix + """scenariosPage"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_HomeController_apiEditPage7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("apiEditPage")))
  )
  private[this] lazy val controllers_HomeController_apiEditPage7_invoker = createInvoker(
    HomeController_0.apiEditPage,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "apiEditPage",
      Nil,
      "GET",
      """""",
      this.prefix + """apiEditPage"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_UserController_userLogin8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/"), DynamicPart("email", """[^/]+""",true), StaticPart("/"), DynamicPart("pwd", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_userLogin8_invoker = createInvoker(
    UserController_2.userLogin(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "userLogin",
      Seq(classOf[String], classOf[String]),
      "GET",
      """用户操作""",
      this.prefix + """user/""" + "$" + """email<[^/]+>/""" + "$" + """pwd<[^/]+>"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_UserController_userUpdate9_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user")))
  )
  private[this] lazy val controllers_UserController_userUpdate9_invoker = createInvoker(
    UserController_2.userUpdate,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "userUpdate",
      Nil,
      "PUT",
      """""",
      this.prefix + """user"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_UserController_userRegister10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user")))
  )
  private[this] lazy val controllers_UserController_userRegister10_invoker = createInvoker(
    UserController_2.userRegister,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "userRegister",
      Nil,
      "POST",
      """""",
      this.prefix + """user"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_UserController_userRemove11_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user")))
  )
  private[this] lazy val controllers_UserController_userRemove11_invoker = createInvoker(
    UserController_2.userRemove,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "userRemove",
      Nil,
      "DELETE",
      """""",
      this.prefix + """user"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_UserController_userSignout12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userloginout")))
  )
  private[this] lazy val controllers_UserController_userSignout12_invoker = createInvoker(
    UserController_2.userSignout,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "userSignout",
      Nil,
      "GET",
      """""",
      this.prefix + """userloginout"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_ApiDocController_getApiDoc13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("apiDoc")))
  )
  private[this] lazy val controllers_ApiDocController_getApiDoc13_invoker = createInvoker(
    ApiDocController_3.getApiDoc(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiDocController",
      "getApiDoc",
      Nil,
      "GET",
      """接口文档操作""",
      this.prefix + """apiDoc"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_ApiDocController_getApiDocByTitleAndVersion14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("apiDoc/"), DynamicPart("title", """[^/]+""",true), StaticPart("/"), DynamicPart("version", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ApiDocController_getApiDocByTitleAndVersion14_invoker = createInvoker(
    ApiDocController_3.getApiDocByTitleAndVersion(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiDocController",
      "getApiDocByTitleAndVersion",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """apiDoc/""" + "$" + """title<[^/]+>/""" + "$" + """version<[^/]+>"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_ApiDocController_getApiDocs15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("apiDocs")))
  )
  private[this] lazy val controllers_ApiDocController_getApiDocs15_invoker = createInvoker(
    ApiDocController_3.getApiDocs(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiDocController",
      "getApiDocs",
      Nil,
      "GET",
      """""",
      this.prefix + """apiDocs"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_ApiDocController_getApiDocsByTitle16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("apiDocs/title/"), DynamicPart("title", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ApiDocController_getApiDocsByTitle16_invoker = createInvoker(
    ApiDocController_3.getApiDocsByTitle(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiDocController",
      "getApiDocsByTitle",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """apiDocs/title/""" + "$" + """title<[^/]+>"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_ApiDocController_getApiDocsByVersion17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("apiDocs/version/"), DynamicPart("version", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ApiDocController_getApiDocsByVersion17_invoker = createInvoker(
    ApiDocController_3.getApiDocsByVersion(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiDocController",
      "getApiDocsByVersion",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """apiDocs/version/""" + "$" + """version<[^/]+>"""
    )
  )

  // @LINE:42
  private[this] lazy val controllers_ApiDocController_getApiDocInfos18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("apiDoc/infos")))
  )
  private[this] lazy val controllers_ApiDocController_getApiDocInfos18_invoker = createInvoker(
    ApiDocController_3.getApiDocInfos,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiDocController",
      "getApiDocInfos",
      Nil,
      "GET",
      """""",
      this.prefix + """apiDoc/infos"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_ApiDocController_updateApiDoc19_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("apiDoc")))
  )
  private[this] lazy val controllers_ApiDocController_updateApiDoc19_invoker = createInvoker(
    ApiDocController_3.updateApiDoc(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiDocController",
      "updateApiDoc",
      Nil,
      "PUT",
      """""",
      this.prefix + """apiDoc"""
    )
  )

  // @LINE:44
  private[this] lazy val controllers_ApiDocController_addApiDoc20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("apiDoc")))
  )
  private[this] lazy val controllers_ApiDocController_addApiDoc20_invoker = createInvoker(
    ApiDocController_3.addApiDoc(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiDocController",
      "addApiDoc",
      Nil,
      "POST",
      """""",
      this.prefix + """apiDoc"""
    )
  )

  // @LINE:45
  private[this] lazy val controllers_ApiDocController_removeApiDocByApiId21_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("apiDoc/"), DynamicPart("apiId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ApiDocController_removeApiDocByApiId21_invoker = createInvoker(
    ApiDocController_3.removeApiDocByApiId(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiDocController",
      "removeApiDocByApiId",
      Seq(classOf[String]),
      "DELETE",
      """""",
      this.prefix + """apiDoc/""" + "$" + """apiId<[^/]+>"""
    )
  )

  // @LINE:46
  private[this] lazy val controllers_ApiDocController_getApis22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("apis")))
  )
  private[this] lazy val controllers_ApiDocController_getApis22_invoker = createInvoker(
    ApiDocController_3.getApis(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiDocController",
      "getApis",
      Nil,
      "GET",
      """""",
      this.prefix + """apis"""
    )
  )

  // @LINE:47
  private[this] lazy val controllers_ApiDocController_getApisByTitle23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("apis/title/"), DynamicPart("title", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ApiDocController_getApisByTitle23_invoker = createInvoker(
    ApiDocController_3.getApisByTitle(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiDocController",
      "getApisByTitle",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """apis/title/""" + "$" + """title<[^/]+>"""
    )
  )

  // @LINE:48
  private[this] lazy val controllers_ApiDocController_getApisByVersion24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("apis/version/"), DynamicPart("version", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ApiDocController_getApisByVersion24_invoker = createInvoker(
    ApiDocController_3.getApisByVersion(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiDocController",
      "getApisByVersion",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """apis/version/""" + "$" + """version<[^/]+>"""
    )
  )

  // @LINE:49
  private[this] lazy val controllers_ApiDocController_getApisByTitleAndVersion25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("apis/"), DynamicPart("title", """[^/]+""",true), StaticPart("/"), DynamicPart("version", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ApiDocController_getApisByTitleAndVersion25_invoker = createInvoker(
    ApiDocController_3.getApisByTitleAndVersion(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiDocController",
      "getApisByTitleAndVersion",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """apis/""" + "$" + """title<[^/]+>/""" + "$" + """version<[^/]+>"""
    )
  )

  // @LINE:53
  private[this] lazy val controllers_ScenarioController_getScenarioDocSimplifysByEmail26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("simplescenarios")))
  )
  private[this] lazy val controllers_ScenarioController_getScenarioDocSimplifysByEmail26_invoker = createInvoker(
    ScenarioController_1.getScenarioDocSimplifysByEmail(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ScenarioController",
      "getScenarioDocSimplifysByEmail",
      Nil,
      "GET",
      """场景文档操作""",
      this.prefix + """simplescenarios"""
    )
  )

  // @LINE:54
  private[this] lazy val controllers_ScenarioController_getApisByScenarioId27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("scenario/"), DynamicPart("scenarioId", """[^/]+""",true), StaticPart("/apis")))
  )
  private[this] lazy val controllers_ScenarioController_getApisByScenarioId27_invoker = createInvoker(
    ScenarioController_1.getApisByScenarioId(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ScenarioController",
      "getApisByScenarioId",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """scenario/""" + "$" + """scenarioId<[^/]+>/apis"""
    )
  )

  // @LINE:55
  private[this] lazy val controllers_ScenarioController_getScenariosByScenarioId28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("scenario/"), DynamicPart("scenarioId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ScenarioController_getScenariosByScenarioId28_invoker = createInvoker(
    ScenarioController_1.getScenariosByScenarioId(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ScenarioController",
      "getScenariosByScenarioId",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """scenario/""" + "$" + """scenarioId<[^/]+>"""
    )
  )

  // @LINE:56
  private[this] lazy val controllers_ScenarioController_getScenariosByEmailOne29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("scenario")))
  )
  private[this] lazy val controllers_ScenarioController_getScenariosByEmailOne29_invoker = createInvoker(
    ScenarioController_1.getScenariosByEmailOne(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ScenarioController",
      "getScenariosByEmailOne",
      Nil,
      "GET",
      """""",
      this.prefix + """scenario"""
    )
  )

  // @LINE:57
  private[this] lazy val controllers_ScenarioController_getScenariosByEmail30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("scenarios")))
  )
  private[this] lazy val controllers_ScenarioController_getScenariosByEmail30_invoker = createInvoker(
    ScenarioController_1.getScenariosByEmail(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ScenarioController",
      "getScenariosByEmail",
      Nil,
      "GET",
      """""",
      this.prefix + """scenarios"""
    )
  )

  // @LINE:58
  private[this] lazy val controllers_ScenarioController_getScenariosByEmailAndTagName31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("scenarios/tagName/"), DynamicPart("tagName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ScenarioController_getScenariosByEmailAndTagName31_invoker = createInvoker(
    ScenarioController_1.getScenariosByEmailAndTagName(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ScenarioController",
      "getScenariosByEmailAndTagName",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """scenarios/tagName/""" + "$" + """tagName<[^/]+>"""
    )
  )

  // @LINE:59
  private[this] lazy val controllers_ScenarioController_getScenariosByEmailAndTitle32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("scenarios/scenarioName/"), DynamicPart("scenarioName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ScenarioController_getScenariosByEmailAndTitle32_invoker = createInvoker(
    ScenarioController_1.getScenariosByEmailAndTitle(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ScenarioController",
      "getScenariosByEmailAndTitle",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """scenarios/scenarioName/""" + "$" + """scenarioName<[^/]+>"""
    )
  )

  // @LINE:60
  private[this] lazy val controllers_ScenarioController_getScenariosByEmailTagNameAndTitle33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("scenarios/"), DynamicPart("tagName", """[^/]+""",true), StaticPart("/"), DynamicPart("scenarioName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ScenarioController_getScenariosByEmailTagNameAndTitle33_invoker = createInvoker(
    ScenarioController_1.getScenariosByEmailTagNameAndTitle(fakeValue[String], fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ScenarioController",
      "getScenariosByEmailTagNameAndTitle",
      Seq(classOf[String], classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """scenarios/""" + "$" + """tagName<[^/]+>/""" + "$" + """scenarioName<[^/]+>"""
    )
  )

  // @LINE:61
  private[this] lazy val controllers_ScenarioController_getScenarioInfosByEmail34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("scenarios/infos")))
  )
  private[this] lazy val controllers_ScenarioController_getScenarioInfosByEmail34_invoker = createInvoker(
    ScenarioController_1.getScenarioInfosByEmail,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ScenarioController",
      "getScenarioInfosByEmail",
      Nil,
      "GET",
      """""",
      this.prefix + """scenarios/infos"""
    )
  )

  // @LINE:63
  private[this] lazy val controllers_ScenarioController_addScenario35_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("scenario")))
  )
  private[this] lazy val controllers_ScenarioController_addScenario35_invoker = createInvoker(
    ScenarioController_1.addScenario,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ScenarioController",
      "addScenario",
      Nil,
      "POST",
      """""",
      this.prefix + """scenario"""
    )
  )

  // @LINE:65
  private[this] lazy val controllers_ScenarioController_updateScenario36_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("scenario/"), DynamicPart("scenarioId", """[^/]+""",true), StaticPart("/apis")))
  )
  private[this] lazy val controllers_ScenarioController_updateScenario36_invoker = createInvoker(
    ScenarioController_1.updateScenario(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ScenarioController",
      "updateScenario",
      Seq(classOf[String]),
      "PUT",
      """PUT             /scenario                                controllers.ScenarioController.updateScenario""",
      this.prefix + """scenario/""" + "$" + """scenarioId<[^/]+>/apis"""
    )
  )

  // @LINE:66
  private[this] lazy val controllers_ScenarioController_updateScenarioByDependsOn37_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("scenario/"), DynamicPart("scenarioId", """[^/]+""",true), StaticPart("/dependon")))
  )
  private[this] lazy val controllers_ScenarioController_updateScenarioByDependsOn37_invoker = createInvoker(
    ScenarioController_1.updateScenarioByDependsOn(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ScenarioController",
      "updateScenarioByDependsOn",
      Seq(classOf[String]),
      "PUT",
      """""",
      this.prefix + """scenario/""" + "$" + """scenarioId<[^/]+>/dependon"""
    )
  )

  // @LINE:68
  private[this] lazy val controllers_ScenarioController_removeScenarioByscenarioId38_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("scenario/"), DynamicPart("scenarioId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ScenarioController_removeScenarioByscenarioId38_invoker = createInvoker(
    ScenarioController_1.removeScenarioByscenarioId(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ScenarioController",
      "removeScenarioByscenarioId",
      Seq(classOf[String]),
      "DELETE",
      """""",
      this.prefix + """scenario/""" + "$" + """scenarioId<[^/]+>"""
    )
  )

  // @LINE:69
  private[this] lazy val controllers_ScenarioController_sendRequestByScenarioId39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("scenario/"), DynamicPart("scenarioId", """[^/]+""",true), StaticPart("/sendrequest")))
  )
  private[this] lazy val controllers_ScenarioController_sendRequestByScenarioId39_invoker = createInvoker(
    ScenarioController_1.sendRequestByScenarioId(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ScenarioController",
      "sendRequestByScenarioId",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """scenario/""" + "$" + """scenarioId<[^/]+>/sendrequest"""
    )
  )

  // @LINE:72
  private[this] lazy val controllers_Assets_versioned40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned40_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:14
    case controllers_HomeController_loginPage0_route(params) =>
      call { 
        controllers_HomeController_loginPage0_invoker.call(HomeController_0.loginPage)
      }
  
    // @LINE:16
    case controllers_HomeController_registerPage1_route(params) =>
      call { 
        controllers_HomeController_registerPage1_invoker.call(HomeController_0.registerPage)
      }
  
    // @LINE:18
    case controllers_HomeController_apiDocPage22_route(params) =>
      call { 
        controllers_HomeController_apiDocPage22_invoker.call(HomeController_0.apiDocPage2)
      }
  
    // @LINE:19
    case controllers_HomeController_apiDocPage3_route(params) =>
      call { 
        controllers_HomeController_apiDocPage3_invoker.call(HomeController_0.apiDocPage)
      }
  
    // @LINE:22
    case controllers_HomeController_apiDesignPage4_route(params) =>
      call { 
        controllers_HomeController_apiDesignPage4_invoker.call(HomeController_0.apiDesignPage)
      }
  
    // @LINE:24
    case controllers_HomeController_scenarioViewPage5_route(params) =>
      call(params.fromPath[String]("scenarioId", None)) { (scenarioId) =>
        controllers_HomeController_scenarioViewPage5_invoker.call(HomeController_0.scenarioViewPage(scenarioId))
      }
  
    // @LINE:26
    case controllers_HomeController_scenariosPage6_route(params) =>
      call { 
        controllers_HomeController_scenariosPage6_invoker.call(HomeController_0.scenariosPage)
      }
  
    // @LINE:27
    case controllers_HomeController_apiEditPage7_route(params) =>
      call { 
        controllers_HomeController_apiEditPage7_invoker.call(HomeController_0.apiEditPage)
      }
  
    // @LINE:31
    case controllers_UserController_userLogin8_route(params) =>
      call(params.fromPath[String]("email", None), params.fromPath[String]("pwd", None)) { (email, pwd) =>
        controllers_UserController_userLogin8_invoker.call(UserController_2.userLogin(email, pwd))
      }
  
    // @LINE:32
    case controllers_UserController_userUpdate9_route(params) =>
      call { 
        controllers_UserController_userUpdate9_invoker.call(UserController_2.userUpdate)
      }
  
    // @LINE:33
    case controllers_UserController_userRegister10_route(params) =>
      call { 
        controllers_UserController_userRegister10_invoker.call(UserController_2.userRegister)
      }
  
    // @LINE:34
    case controllers_UserController_userRemove11_route(params) =>
      call { 
        controllers_UserController_userRemove11_invoker.call(UserController_2.userRemove)
      }
  
    // @LINE:35
    case controllers_UserController_userSignout12_route(params) =>
      call { 
        controllers_UserController_userSignout12_invoker.call(UserController_2.userSignout)
      }
  
    // @LINE:37
    case controllers_ApiDocController_getApiDoc13_route(params) =>
      call { 
        controllers_ApiDocController_getApiDoc13_invoker.call(ApiDocController_3.getApiDoc())
      }
  
    // @LINE:38
    case controllers_ApiDocController_getApiDocByTitleAndVersion14_route(params) =>
      call(params.fromPath[String]("title", None), params.fromPath[String]("version", None)) { (title, version) =>
        controllers_ApiDocController_getApiDocByTitleAndVersion14_invoker.call(ApiDocController_3.getApiDocByTitleAndVersion(title, version))
      }
  
    // @LINE:39
    case controllers_ApiDocController_getApiDocs15_route(params) =>
      call { 
        controllers_ApiDocController_getApiDocs15_invoker.call(ApiDocController_3.getApiDocs())
      }
  
    // @LINE:40
    case controllers_ApiDocController_getApiDocsByTitle16_route(params) =>
      call(params.fromPath[String]("title", None)) { (title) =>
        controllers_ApiDocController_getApiDocsByTitle16_invoker.call(ApiDocController_3.getApiDocsByTitle(title))
      }
  
    // @LINE:41
    case controllers_ApiDocController_getApiDocsByVersion17_route(params) =>
      call(params.fromPath[String]("version", None)) { (version) =>
        controllers_ApiDocController_getApiDocsByVersion17_invoker.call(ApiDocController_3.getApiDocsByVersion(version))
      }
  
    // @LINE:42
    case controllers_ApiDocController_getApiDocInfos18_route(params) =>
      call { 
        controllers_ApiDocController_getApiDocInfos18_invoker.call(ApiDocController_3.getApiDocInfos)
      }
  
    // @LINE:43
    case controllers_ApiDocController_updateApiDoc19_route(params) =>
      call { 
        controllers_ApiDocController_updateApiDoc19_invoker.call(ApiDocController_3.updateApiDoc())
      }
  
    // @LINE:44
    case controllers_ApiDocController_addApiDoc20_route(params) =>
      call { 
        controllers_ApiDocController_addApiDoc20_invoker.call(ApiDocController_3.addApiDoc())
      }
  
    // @LINE:45
    case controllers_ApiDocController_removeApiDocByApiId21_route(params) =>
      call(params.fromPath[String]("apiId", None)) { (apiId) =>
        controllers_ApiDocController_removeApiDocByApiId21_invoker.call(ApiDocController_3.removeApiDocByApiId(apiId))
      }
  
    // @LINE:46
    case controllers_ApiDocController_getApis22_route(params) =>
      call { 
        controllers_ApiDocController_getApis22_invoker.call(ApiDocController_3.getApis())
      }
  
    // @LINE:47
    case controllers_ApiDocController_getApisByTitle23_route(params) =>
      call(params.fromPath[String]("title", None)) { (title) =>
        controllers_ApiDocController_getApisByTitle23_invoker.call(ApiDocController_3.getApisByTitle(title))
      }
  
    // @LINE:48
    case controllers_ApiDocController_getApisByVersion24_route(params) =>
      call(params.fromPath[String]("version", None)) { (version) =>
        controllers_ApiDocController_getApisByVersion24_invoker.call(ApiDocController_3.getApisByVersion(version))
      }
  
    // @LINE:49
    case controllers_ApiDocController_getApisByTitleAndVersion25_route(params) =>
      call(params.fromPath[String]("title", None), params.fromPath[String]("version", None)) { (title, version) =>
        controllers_ApiDocController_getApisByTitleAndVersion25_invoker.call(ApiDocController_3.getApisByTitleAndVersion(title, version))
      }
  
    // @LINE:53
    case controllers_ScenarioController_getScenarioDocSimplifysByEmail26_route(params) =>
      call { 
        controllers_ScenarioController_getScenarioDocSimplifysByEmail26_invoker.call(ScenarioController_1.getScenarioDocSimplifysByEmail())
      }
  
    // @LINE:54
    case controllers_ScenarioController_getApisByScenarioId27_route(params) =>
      call(params.fromPath[String]("scenarioId", None)) { (scenarioId) =>
        controllers_ScenarioController_getApisByScenarioId27_invoker.call(ScenarioController_1.getApisByScenarioId(scenarioId))
      }
  
    // @LINE:55
    case controllers_ScenarioController_getScenariosByScenarioId28_route(params) =>
      call(params.fromPath[String]("scenarioId", None)) { (scenarioId) =>
        controllers_ScenarioController_getScenariosByScenarioId28_invoker.call(ScenarioController_1.getScenariosByScenarioId(scenarioId))
      }
  
    // @LINE:56
    case controllers_ScenarioController_getScenariosByEmailOne29_route(params) =>
      call { 
        controllers_ScenarioController_getScenariosByEmailOne29_invoker.call(ScenarioController_1.getScenariosByEmailOne())
      }
  
    // @LINE:57
    case controllers_ScenarioController_getScenariosByEmail30_route(params) =>
      call { 
        controllers_ScenarioController_getScenariosByEmail30_invoker.call(ScenarioController_1.getScenariosByEmail())
      }
  
    // @LINE:58
    case controllers_ScenarioController_getScenariosByEmailAndTagName31_route(params) =>
      call(params.fromQuery[String]("email", None), params.fromPath[String]("tagName", None)) { (email, tagName) =>
        controllers_ScenarioController_getScenariosByEmailAndTagName31_invoker.call(ScenarioController_1.getScenariosByEmailAndTagName(email, tagName))
      }
  
    // @LINE:59
    case controllers_ScenarioController_getScenariosByEmailAndTitle32_route(params) =>
      call(params.fromQuery[String]("email", None), params.fromPath[String]("scenarioName", None)) { (email, scenarioName) =>
        controllers_ScenarioController_getScenariosByEmailAndTitle32_invoker.call(ScenarioController_1.getScenariosByEmailAndTitle(email, scenarioName))
      }
  
    // @LINE:60
    case controllers_ScenarioController_getScenariosByEmailTagNameAndTitle33_route(params) =>
      call(params.fromQuery[String]("email", None), params.fromPath[String]("tagName", None), params.fromPath[String]("scenarioName", None)) { (email, tagName, scenarioName) =>
        controllers_ScenarioController_getScenariosByEmailTagNameAndTitle33_invoker.call(ScenarioController_1.getScenariosByEmailTagNameAndTitle(email, tagName, scenarioName))
      }
  
    // @LINE:61
    case controllers_ScenarioController_getScenarioInfosByEmail34_route(params) =>
      call { 
        controllers_ScenarioController_getScenarioInfosByEmail34_invoker.call(ScenarioController_1.getScenarioInfosByEmail)
      }
  
    // @LINE:63
    case controllers_ScenarioController_addScenario35_route(params) =>
      call { 
        controllers_ScenarioController_addScenario35_invoker.call(ScenarioController_1.addScenario)
      }
  
    // @LINE:65
    case controllers_ScenarioController_updateScenario36_route(params) =>
      call(params.fromPath[String]("scenarioId", None)) { (scenarioId) =>
        controllers_ScenarioController_updateScenario36_invoker.call(ScenarioController_1.updateScenario(scenarioId))
      }
  
    // @LINE:66
    case controllers_ScenarioController_updateScenarioByDependsOn37_route(params) =>
      call(params.fromPath[String]("scenarioId", None)) { (scenarioId) =>
        controllers_ScenarioController_updateScenarioByDependsOn37_invoker.call(ScenarioController_1.updateScenarioByDependsOn(scenarioId))
      }
  
    // @LINE:68
    case controllers_ScenarioController_removeScenarioByscenarioId38_route(params) =>
      call(params.fromPath[String]("scenarioId", None)) { (scenarioId) =>
        controllers_ScenarioController_removeScenarioByscenarioId38_invoker.call(ScenarioController_1.removeScenarioByscenarioId(scenarioId))
      }
  
    // @LINE:69
    case controllers_ScenarioController_sendRequestByScenarioId39_route(params) =>
      call(params.fromPath[String]("scenarioId", None)) { (scenarioId) =>
        controllers_ScenarioController_sendRequestByScenarioId39_invoker.call(ScenarioController_1.sendRequestByScenarioId(scenarioId))
      }
  
    // @LINE:72
    case controllers_Assets_versioned40_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned40_invoker.call(Assets_4.versioned(path, file))
      }
  }
}
