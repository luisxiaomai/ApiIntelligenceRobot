
package views.html.apis.doc

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

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!-- sidebar: style can be found in sidebar.less -->
<section class="sidebar">
        <!-- Sidebar user panel (optional) -->
    """),format.raw/*4.33*/("""
        """),format.raw/*5.42*/("""
            """),format.raw/*6.112*/("""
        """),format.raw/*7.19*/("""
        """),format.raw/*8.41*/("""
            """),format.raw/*9.35*/("""
                """),format.raw/*10.36*/("""
            """),format.raw/*11.81*/("""
        """),format.raw/*12.19*/("""
    """),format.raw/*13.15*/("""

        """),format.raw/*15.44*/("""
    """),format.raw/*16.60*/("""
        """),format.raw/*17.38*/("""
            """),format.raw/*18.90*/("""
            """),format.raw/*19.47*/("""
                """),format.raw/*20.131*/("""
            """),format.raw/*21.24*/("""
        """),format.raw/*22.19*/("""
    """),format.raw/*23.16*/("""
        """),format.raw/*24.9*/("""<!-- /.search form -->

        <!-- Sidebar Menu -->
    <ul class="sidebar-menu">
        <li class="header">HEADER</li>
            <!-- Optionally, you can add icons to the links -->
            <li class="treeview" ng-repeat="apiDocTitle in apiDocTitleVersions">
                <a href="#">
                    <i class="fa fa-circle-o"></i>
                    <span>"""),format.raw/*33.27*/("""{"""),format.raw/*33.28*/("""{"""),format.raw/*33.29*/("""apiDocTitle._id"""),format.raw/*33.44*/("""}"""),format.raw/*33.45*/("""}"""),format.raw/*33.46*/("""</span>
                    <span class="label label-primary pull-right">"""),format.raw/*34.66*/("""{"""),format.raw/*34.67*/("""{"""),format.raw/*34.68*/("""apiDocTitle.versions.length"""),format.raw/*34.95*/("""}"""),format.raw/*34.96*/("""}"""),format.raw/*34.97*/("""</span>
                </a>
                <ul class="treeview-menu">
                    <li ng-repeat="apiDocVersion in apiDocTitle.versions" ng-click="selectApiDocByTitleAndVersion(apiDocTitle._id,apiDocVersion)"><a href="#"><span>"""),format.raw/*37.165*/("""{"""),format.raw/*37.166*/("""{"""),format.raw/*37.167*/("""apiDocVersion"""),format.raw/*37.180*/("""}"""),format.raw/*37.181*/("""}"""),format.raw/*37.182*/("""</span> </a></li>
                </ul>
            </li>


    </ul><!-- /.sidebar-menu -->
</section><!-- /.sidebar -->"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object left extends left_Scope0.left
              /*
                  -- GENERATED --
                  DATE: Mon Jun 13 09:58:08 CST 2016
                  SOURCE: /Users/apple/Documents/PRO/ApiIntelligenceRobot/app/views/apis/doc/left.scala.html
                  HASH: 4dcdf5b58f2512eac2c63704031bf41f8554c10b
                  MATRIX: 834->0|991->158|1027->200|1068->312|1104->331|1140->372|1180->407|1225->443|1266->524|1303->543|1336->558|1374->603|1407->663|1444->701|1485->791|1526->838|1572->969|1613->993|1650->1012|1683->1028|1719->1037|2121->1411|2150->1412|2179->1413|2222->1428|2251->1429|2280->1430|2381->1503|2410->1504|2439->1505|2494->1532|2523->1533|2552->1534|2817->1770|2847->1771|2877->1772|2919->1785|2949->1786|2979->1787
                  LINES: 32->1|35->4|36->5|37->6|38->7|39->8|40->9|41->10|42->11|43->12|44->13|46->15|47->16|48->17|49->18|50->19|51->20|52->21|53->22|54->23|55->24|64->33|64->33|64->33|64->33|64->33|64->33|65->34|65->34|65->34|65->34|65->34|65->34|68->37|68->37|68->37|68->37|68->37|68->37
                  -- GENERATED --
              */
          