
package views.html.apis.design

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object content_Scope0 {
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

class content extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<section class="content-header">
    <h4>"""),format.raw/*2.9*/("""{"""),format.raw/*2.10*/("""{"""),format.raw/*2.11*/("""msg"""),format.raw/*2.14*/("""}"""),format.raw/*2.15*/("""}"""),format.raw/*2.16*/("""</h4>
</section>
    <!-- Main content -->
<section class="content">
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-6" ng-jsoneditor="onLoad" ng-model="editor_code.data" options="editor_code.options" style="height: 700px;"></div>
            <div class="col-md-6" ng-jsoneditor="onLoad" ng-model="editor_code.data" options="editor_tree.options" style="height: 700px;"></div>
        </div>
    </div>
</section> <!-- /.content -->


"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object content extends content_Scope0.content
              /*
                  -- GENERATED --
                  DATE: Tue Jun 07 16:15:38 CST 2016
                  SOURCE: /Users/apple/Documents/PRO/ApiIntelligenceRobot/app/views/apis/design/content.scala.html
                  HASH: 7b3e492e0a1d92663db9e7b2f298ac124c245833
                  MATRIX: 843->0|910->41|938->42|966->43|996->46|1024->47|1052->48
                  LINES: 32->1|33->2|33->2|33->2|33->2|33->2|33->2
                  -- GENERATED --
              */
          