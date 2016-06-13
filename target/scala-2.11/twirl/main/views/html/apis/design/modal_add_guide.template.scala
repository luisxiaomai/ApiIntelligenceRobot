
package views.html.apis.design

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object modal_add_guide_Scope0 {
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

class modal_add_guide extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<div class="example-modal" >
    <div class="modal modal-info" id="addGuide">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
                    <h4 class="modal-title">Guide</h4>
                </div>
                <div class="modal-body">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-md-12">
                                <div class="input-group margin">
                                    <span class="input-group-btn">
                                        <button class="btn btn-info btn-flat" type="button">项目信息</button>
                                    </span>
                                    <input type="text" class="form-control" PLACEHOLDER='"""),format.raw/*17.90*/("""{"""),format.raw/*17.91*/(""""info":"""),format.raw/*17.98*/("""{"""),format.raw/*17.99*/(""""description":"API Documentation Description","version":"0.0.1","title":"Name API""""),format.raw/*17.181*/("""}"""),format.raw/*17.182*/("""}"""),format.raw/*17.183*/("""' ng-model="info">
                                </div>
                                <div class="input-group margin" >
                                    <span class="input-group-btn">
                                        <button class="btn btn-info btn-flat" type="button">请求路径</button>
                                    </span>
                                    <input type="text" class="form-control" PLACEHOLDER="/api/account" ng-model="urlPath">
                                </div>
                                <div class="input-group margin">
                                    <span class="input-group-btn">
                                        <button class="btn btn-info btn-flat" type="button">分类信息</button>
                                    </span>
                                    <input type="text" class="form-control" PLACEHOLDER='"""),format.raw/*29.90*/("""{"""),format.raw/*29.91*/(""""tags":["tagName","tagName"]"""),format.raw/*29.119*/("""}"""),format.raw/*29.120*/("""' ng-model="tagInfo">
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-outline pull-left" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-outline" data-dismiss="modal" ng-click="addApiPath(info,urlPath,tagInfo)">Save changes</button>
                </div>
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
object modal_add_guide extends modal_add_guide_Scope0.modal_add_guide
              /*
                  -- GENERATED --
                  DATE: Thu Jun 02 15:28:27 CST 2016
                  SOURCE: /Users/apple/Documents/PRO/ApiIntelligenceRobot/app/views/apis/design/modal_add_guide.scala.html
                  HASH: 2fe0b94e35e41d1c8b4ab087781a02badc1a1e88
                  MATRIX: 859->0|1856->969|1885->970|1920->977|1949->978|2060->1060|2090->1061|2120->1062|3022->1936|3051->1937|3108->1965|3138->1966
                  LINES: 32->1|48->17|48->17|48->17|48->17|48->17|48->17|48->17|60->29|60->29|60->29|60->29
                  -- GENERATED --
              */
          