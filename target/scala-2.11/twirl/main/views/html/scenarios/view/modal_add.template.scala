
package views.html.scenarios.view

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object modal_add_Scope0 {
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

class modal_add extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<div class="example-modal" >
    <div class="modal modal-info" id="myAdd">
        <div class="modal-dialog modal-lg">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
                    <h4 class="modal-title">接口添加</h4>
                </div>
                <div class="modal-body">
                    <div class="container-fluid">
                        """),format.raw/*11.46*/("""
                            """),format.raw/*12.55*/("""
                                """),format.raw/*13.61*/("""
                                    """),format.raw/*14.60*/("""
                                    """),format.raw/*15.228*/("""
                                        """),format.raw/*16.66*/("""
                                    """),format.raw/*17.50*/("""
                                """),format.raw/*18.64*/("""
                            """),format.raw/*19.39*/("""
                            """),format.raw/*20.55*/("""
                                """),format.raw/*21.61*/("""
                                    """),format.raw/*22.60*/("""
                                    """),format.raw/*23.239*/("""
                                        """),format.raw/*24.66*/("""
                                    """),format.raw/*25.50*/("""
                                """),format.raw/*26.64*/("""
                            """),format.raw/*27.39*/("""
                        """),format.raw/*28.35*/("""

                        """),format.raw/*30.25*/("""<div class="row">
                            <div class="col-md-12" style="overflow:auto;height:400px;">
                                <table class="table table-striped table-hover" style="table-layout:fixed;">
                                    <tbody>
                                        <tr ng-repeat="apiInfo_in in APIInfos_in track by $index">
                                            <td colspan="1">
                                                <button type="button" ng-click="delApi(apiInfo_in,APIInfos_in,APIInfos_out)" class="btn btn-default btn-sm">
                                                    <span class="glyphicon glyphicon-minus" aria-hidden="true" ></span>
                                                </button>
                                            </td>
                                            <td colspan="2" style="overflow:hidden;white-space:nowrap;text-overflow:ellipsis;">"""),format.raw/*40.128*/("""{"""),format.raw/*40.129*/("""{"""),format.raw/*40.130*/(""" """),format.raw/*40.131*/("""apiInfo_in.httpMethod """),format.raw/*40.153*/("""}"""),format.raw/*40.154*/("""}"""),format.raw/*40.155*/("""</td>
                                            <td colspan="4" style="overflow:hidden;white-space:nowrap;text-overflow:ellipsis;">"""),format.raw/*41.128*/("""{"""),format.raw/*41.129*/("""{"""),format.raw/*41.130*/(""" """),format.raw/*41.131*/("""apiInfo_in.operation.summary """),format.raw/*41.160*/("""}"""),format.raw/*41.161*/("""}"""),format.raw/*41.162*/("""</td>
                                            <td colspan="5" style="overflow:hidden;white-space:nowrap;text-overflow:ellipsis;">http://"""),format.raw/*42.135*/("""{"""),format.raw/*42.136*/("""{"""),format.raw/*42.137*/(""" """),format.raw/*42.138*/("""apiInfo_in.host """),format.raw/*42.154*/("""}"""),format.raw/*42.155*/("""}"""),format.raw/*42.156*/("""{"""),format.raw/*42.157*/("""{"""),format.raw/*42.158*/("""apiInfo_in.urlPath"""),format.raw/*42.176*/("""}"""),format.raw/*42.177*/("""}"""),format.raw/*42.178*/("""</td>
                                        </tr>

                                        <tr ng-repeat="apiInfo_out in APIInfos_out track by $index">
                                            <td colspan="1">
                                                <button type="button" ng-click="addApi(apiInfo_out,APIInfos_in,APIInfos_out)" class="btn btn-default btn-sm">
                                                    <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
                                                </button>
                                            </td>
                                            <td colspan="2" style="overflow:hidden;white-space:nowrap;text-overflow:ellipsis;">"""),format.raw/*51.128*/("""{"""),format.raw/*51.129*/("""{"""),format.raw/*51.130*/(""" """),format.raw/*51.131*/("""apiInfo_out.httpMethod """),format.raw/*51.154*/("""}"""),format.raw/*51.155*/("""}"""),format.raw/*51.156*/("""</td>
                                            <td colspan="4" style="overflow:hidden;white-space:nowrap;text-overflow:ellipsis;">"""),format.raw/*52.128*/("""{"""),format.raw/*52.129*/("""{"""),format.raw/*52.130*/(""" """),format.raw/*52.131*/("""apiInfo_out.operation.summary """),format.raw/*52.161*/("""}"""),format.raw/*52.162*/("""}"""),format.raw/*52.163*/("""</td>
                                            <td colspan="5" style="overflow:hidden;white-space:nowrap;text-overflow:ellipsis;">http://"""),format.raw/*53.135*/("""{"""),format.raw/*53.136*/("""{"""),format.raw/*53.137*/("""apiInfo_out.host"""),format.raw/*53.153*/("""}"""),format.raw/*53.154*/("""}"""),format.raw/*53.155*/("""{"""),format.raw/*53.156*/("""{"""),format.raw/*53.157*/("""apiInfo_out.urlPath"""),format.raw/*53.176*/("""}"""),format.raw/*53.177*/("""}"""),format.raw/*53.178*/("""</td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-outline pull-left" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-outline" data-dismiss="modal" ng-click="addScenarioApi(scenarioDocInit._id,APIInfos_in,'scenarioDoc.getTagName','scenarioDoc.getScenarioName')">Save changes</button>
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
object modal_add extends modal_add_Scope0.modal_add
              /*
                  -- GENERATED --
                  DATE: Wed Jun 08 11:16:35 CST 2016
                  SOURCE: /Users/apple/Documents/PRO/ApiIntelligenceRobot/app/views/scenarios/view/modal_add.scala.html
                  HASH: 4334ea0a8d61618570b56038391410bd137387ea
                  MATRIX: 850->0|1411->554|1468->609|1529->670|1594->730|1660->958|1729->1024|1794->1074|1855->1138|1912->1177|1969->1232|2030->1293|2095->1353|2161->1592|2230->1658|2295->1708|2356->1772|2413->1811|2466->1846|2520->1872|3479->2802|3509->2803|3539->2804|3569->2805|3620->2827|3650->2828|3680->2829|3842->2962|3872->2963|3902->2964|3932->2965|3990->2994|4020->2995|4050->2996|4219->3136|4249->3137|4279->3138|4309->3139|4354->3155|4384->3156|4414->3157|4444->3158|4474->3159|4521->3177|4551->3178|4581->3179|5336->3905|5366->3906|5396->3907|5426->3908|5478->3931|5508->3932|5538->3933|5700->4066|5730->4067|5760->4068|5790->4069|5849->4099|5879->4100|5909->4101|6078->4241|6108->4242|6138->4243|6183->4259|6213->4260|6243->4261|6273->4262|6303->4263|6351->4282|6381->4283|6411->4284
                  LINES: 32->1|42->11|43->12|44->13|45->14|46->15|47->16|48->17|49->18|50->19|51->20|52->21|53->22|54->23|55->24|56->25|57->26|58->27|59->28|61->30|71->40|71->40|71->40|71->40|71->40|71->40|71->40|72->41|72->41|72->41|72->41|72->41|72->41|72->41|73->42|73->42|73->42|73->42|73->42|73->42|73->42|73->42|73->42|73->42|73->42|73->42|82->51|82->51|82->51|82->51|82->51|82->51|82->51|83->52|83->52|83->52|83->52|83->52|83->52|83->52|84->53|84->53|84->53|84->53|84->53|84->53|84->53|84->53|84->53|84->53|84->53
                  -- GENERATED --
              */
          