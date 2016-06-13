
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/apple/Documents/PRO/ApiIntelligenceRobot/conf/routes
// @DATE:Mon Jun 13 15:30:30 CST 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
