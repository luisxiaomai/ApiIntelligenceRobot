
package views.html.commons

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object foot_Scope0 {
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

class foot extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!-- Main Footer -->
<footer class="main-footer">
        <!-- To the right -->
    <div class="pull-right hidden-xs">
          Anything else
    </div>
        <!-- Default to the left -->
    <strong>Copyright &copy; 2016 <a href="#">paic</a>.</strong> All rights reserved.
</footer>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object foot extends foot_Scope0.foot
              /*
                  -- GENERATED --
                  DATE: Thu Jun 02 15:28:27 CST 2016
                  SOURCE: /Users/apple/Documents/PRO/ApiIntelligenceRobot/app/views/commons/foot.scala.html
                  HASH: 6ef92bc5b46d868f7d3cb91a5a456ea2da903961
                  MATRIX: 833->0
                  LINES: 32->1
                  -- GENERATED --
              */
          