
package views.html.apis.design

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object left_nav_Scope0 {
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

class left_nav extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<section class="sidebar">
        <!-- sidebar menu: : style can be found in sidebar.less -->
    <ul class="sidebar-menu">
        <li class="treeview" ng-click="newApiDoc()"><a href="#"><i class="fa fa-plus"></i> <span>New</span></a></li>
        <li class="treeview" ng-click="apiSave()"><a href="#"><i class="fa fa-save"></i> <span>Save</span></a></li>
        <li class="treeview"><a href="/apiEditPage"><i class="glyphicon glyphicon-link"></i> <span>文档编写</span></a></li>
        """),format.raw/*7.104*/("""
        """),format.raw/*8.104*/("""
        """),format.raw/*9.104*/("""
        """),format.raw/*10.104*/("""
    """),format.raw/*11.5*/("""</ul>
</section>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object left_nav extends left_nav_Scope0.left_nav
              /*
                  -- GENERATED --
                  DATE: Tue Jun 07 16:23:56 CST 2016
                  SOURCE: /Users/apple/Documents/PRO/ApiIntelligenceRobot/app/views/apis/design/left_nav.scala.html
                  HASH: 83919958a229b2e8eebd252228ce7caca2921214
                  MATRIX: 845->0|1358->580|1395->684|1432->788|1470->892|1502->897
                  LINES: 32->1|38->7|39->8|40->9|41->10|42->11
                  -- GENERATED --
              */
          