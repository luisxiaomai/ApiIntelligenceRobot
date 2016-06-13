
package views.html.scenarios.view

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object left_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class left extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /*<section class="sidebar">*/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.33*/("""
    """),format.raw/*3.60*/("""
        """),format.raw/*4.38*/("""
            """),format.raw/*5.90*/("""
            """),format.raw/*6.47*/("""
                """),format.raw/*7.131*/("""
            """),format.raw/*8.24*/("""
        """),format.raw/*9.19*/("""
    """),format.raw/*10.16*/("""
        """),format.raw/*11.35*/("""
        """),format.raw/*12.72*/("""
    """),format.raw/*13.34*/("""
        """),format.raw/*14.52*/("""
        """),format.raw/*15.78*/("""
            """),format.raw/*16.29*/("""
                """),format.raw/*17.50*/("""
                """),format.raw/*18.53*/("""
                """),format.raw/*19.64*/("""
                """),format.raw/*20.109*/("""
            """),format.raw/*21.21*/("""
            """),format.raw/*22.43*/("""
                """),format.raw/*23.141*/("""
                    """),format.raw/*24.37*/("""
                        """),format.raw/*25.84*/("""
            """),format.raw/*26.22*/("""
        """),format.raw/*27.18*/("""
    """),format.raw/*28.14*/("""
"""),format.raw/*29.15*/("""



"""),format.raw/*33.1*/("""<section class="sidebar">
        <!-- search form -->
    <form action="#" method="get" class="sidebar-form">
        <div class="input-group">
            <input type="text" name="q" class="form-control" placeholder="Search...">
            <span class="input-group-btn">
                <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i></button>
            </span>
        </div>
    </form>
        <!-- /.search form -->
        <!-- sidebar menu: : style can be found in sidebar.less -->
    <ul class="sidebar-menu">
        <li class="header">MAIN NAVIGATION</li>
        <li class="treeview" ng-repeat="(key,value) in simpleScenarios  | groupBy: 'tagName'">
            <a href="#">
                <i class="fa fa-files-o"></i>
                <span>"""),format.raw/*50.23*/("""{"""),format.raw/*50.24*/("""{"""),format.raw/*50.25*/("""key"""),format.raw/*50.28*/("""}"""),format.raw/*50.29*/("""}"""),format.raw/*50.30*/("""</span>
                <i class="fa fa-angle-left pull-right"></i>
                """),format.raw/*52.74*/("""
            """),format.raw/*53.13*/("""</a>
            <ul class="treeview-menu">
                <li ng-repeat="simpleScenario in value">
                    <a href="/scenarioViewPage/"""),format.raw/*56.48*/("""{"""),format.raw/*56.49*/("""{"""),format.raw/*56.50*/("""simpleScenario._id"""),format.raw/*56.68*/("""}"""),format.raw/*56.69*/("""}"""),format.raw/*56.70*/("""">
                        <i class="fa fa-circle-o"></i>
                        """),format.raw/*58.25*/("""{"""),format.raw/*58.26*/("""{"""),format.raw/*58.27*/("""simpleScenario.scenarioName"""),format.raw/*58.54*/("""}"""),format.raw/*58.55*/("""}"""),format.raw/*58.56*/("""
                    """),format.raw/*59.21*/("""</a>
                </li>
            </ul>
        </li>
    </ul>
</section>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/*<section class="sidebar">*/
object left extends left_Scope0.left
              /*
                  -- GENERATED --
                  DATE: Fri Jun 03 17:46:43 CST 2016
                  SOURCE: /Users/apple/Documents/PRO/ApiIntelligenceRobot/app/views/scenarios/view/left.scala.html
                  HASH: fba2114a55d214d46ac42cd6b16d394c5d19d13e
                  MATRIX: 866->62|898->122|934->160|974->250|1014->297|1059->428|1099->452|1135->471|1168->487|1205->522|1242->594|1275->628|1312->680|1349->758|1390->787|1435->837|1480->890|1525->954|1571->1063|1612->1084|1653->1127|1699->1268|1748->1305|1801->1389|1842->1411|1879->1429|1912->1443|1941->1458|1972->1462|2813->2275|2842->2276|2871->2277|2902->2280|2931->2281|2960->2282|3072->2423|3113->2436|3289->2584|3318->2585|3347->2586|3393->2604|3422->2605|3451->2606|3561->2688|3590->2689|3619->2690|3674->2717|3703->2718|3732->2719|3781->2740
                  LINES: 32->2|33->3|34->4|35->5|36->6|37->7|38->8|39->9|40->10|41->11|42->12|43->13|44->14|45->15|46->16|47->17|48->18|49->19|50->20|51->21|52->22|53->23|54->24|55->25|56->26|57->27|58->28|59->29|63->33|80->50|80->50|80->50|80->50|80->50|80->50|82->52|83->53|86->56|86->56|86->56|86->56|86->56|86->56|88->58|88->58|88->58|88->58|88->58|88->58|89->59
                  -- GENERATED --
              */
          