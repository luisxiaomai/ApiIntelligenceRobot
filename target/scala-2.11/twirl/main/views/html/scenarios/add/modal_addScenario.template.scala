
package views.html.scenarios.add

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object modal_addScenario_Scope0 {
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

class modal_addScenario extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<div class="example-modal" >
    <div class="modal modal-info" id="addScenario">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
                    <h4 class="modal-title">场景添加</h4>
                </div>
                <div class="modal-body">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-md-12">
                                """),format.raw/*13.33*/("""{"""),format.raw/*13.34*/("""{"""),format.raw/*13.35*/("""msg"""),format.raw/*13.38*/("""}"""),format.raw/*13.39*/("""}"""),format.raw/*13.40*/("""
                                """),format.raw/*14.33*/("""<div class="form-group margin">
                                    <select id="select_title" ng-model="select_title" ng-options="titleVersion._id  for titleVersion in apiDocTitleVersions" class="form-control" style="width : 100% ;">
                                        <option value="">项目名称</option>
                                    </select>
                                </div>

                                <div class="form-group margin">
                                    <select id="select_version" ng-model="select_version" ng-options="version for version in select_title.versions" class="form-control" style="width : 100% ;">
                                        <option value="">版本</option>
                                    </select>
                                </div>

                                <div class="input-group margin" >
                                    <span class="input-group-btn">
                                        <button class="btn btn-info btn-flat" type="button">分类名</button>
                                    </span>
                                    <input type="text" class="form-control" PLACEHOLDER="TAGS" ng-model="tagInfo">
                                </div>

                                <div class="input-group margin">
                                    <span class="input-group-btn">
                                        <button class="btn btn-info btn-flat" type="button">场景名</button>
                                    </span>
                                    <input type="text" class="form-control" PLACEHOLDER="NAME" ng-model="scenarioInfo">
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-outline pull-left" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-outline" ng-click="addScenario(tagInfo,scenarioInfo)">Save changes</button>

                    """),format.raw/*47.137*/("""
                """),format.raw/*48.17*/("""</div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
    </div><!-- /.modal -->
</div>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object modal_addScenario extends modal_addScenario_Scope0.modal_addScenario
              /*
                  -- GENERATED --
                  DATE: Tue Jun 07 17:26:00 CST 2016
                  SOURCE: /Users/apple/Documents/PRO/ApiIntelligenceRobot/app/views/scenarios/add/modal_addScenario.scala.html
                  HASH: 84712c2ec9a6f5f9ce3fab0dd62be1e3f80e05b7
                  MATRIX: 865->0|1525->632|1554->633|1583->634|1614->637|1643->638|1672->639|1733->672|3867->2893|3912->2910
                  LINES: 32->1|44->13|44->13|44->13|44->13|44->13|44->13|45->14|78->47|79->48
                  -- GENERATED --
              */
          