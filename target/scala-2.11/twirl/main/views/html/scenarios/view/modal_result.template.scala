
package views.html.scenarios.view

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object modal_result_Scope0 {
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

class modal_result extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<div class="modal modal-info" id="myResult" tabindex="-1" role="dialog" aria-labelledby="myModalResult" aria-hidden="true" data-backdrop="static">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">
                    <span aria-hidden="true">&times;</span> <span class="sr-only">Close</span></button>
                <h4 class="modal-title" id="myModalResult">RESPONSE</h4>
            </div>
            <div class="modal-body">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-md-12">
                            <div class="panel-group" id="panel_result">
                                <div class="panel panel-default" ng-repeat="(orderNum,ScenarioApiInfoResult) in requestAll">
                                    <div class="panel-heading">
                                        <a class="panel-title collapsed" data-toggle="collapse" data-parent="#panel_result" href="#panel_result_"""),format.raw/*16.145*/("""{"""),format.raw/*16.146*/("""{"""),format.raw/*16.147*/("""orderNum"""),format.raw/*16.155*/("""}"""),format.raw/*16.156*/("""}"""),format.raw/*16.157*/("""">
                                            <span class="col-lg-1">"""),format.raw/*17.68*/("""{"""),format.raw/*17.69*/("""{"""),format.raw/*17.70*/("""orderNum"""),format.raw/*17.78*/("""}"""),format.raw/*17.79*/("""}"""),format.raw/*17.80*/("""</span>
                                            <span class="col-lg-1">"""),format.raw/*18.68*/("""{"""),format.raw/*18.69*/("""{"""),format.raw/*18.70*/("""ScenarioApiInfoResult.httpMethod"""),format.raw/*18.102*/("""}"""),format.raw/*18.103*/("""}"""),format.raw/*18.104*/("""</span>
                                            <span class="col-lg-9">"""),format.raw/*19.68*/("""{"""),format.raw/*19.69*/("""{"""),format.raw/*19.70*/("""ScenarioApiInfoResult.scheme"""),format.raw/*19.98*/("""}"""),format.raw/*19.99*/("""}"""),format.raw/*19.100*/("""://"""),format.raw/*19.103*/("""{"""),format.raw/*19.104*/("""{"""),format.raw/*19.105*/("""ScenarioApiInfoResult.host"""),format.raw/*19.131*/("""}"""),format.raw/*19.132*/("""}"""),format.raw/*19.133*/("""{"""),format.raw/*19.134*/("""{"""),format.raw/*19.135*/("""ScenarioApiInfoResult.basePath"""),format.raw/*19.165*/("""}"""),format.raw/*19.166*/("""}"""),format.raw/*19.167*/("""{"""),format.raw/*19.168*/("""{"""),format.raw/*19.169*/("""ScenarioApiInfoResult.pathUrl"""),format.raw/*19.198*/("""}"""),format.raw/*19.199*/("""}"""),format.raw/*19.200*/("""</span>
                                            <span>"""),format.raw/*20.51*/("""{"""),format.raw/*20.52*/("""{"""),format.raw/*20.53*/("""getResultFromResponse(ScenarioApiInfoResult.checks)"""),format.raw/*20.104*/("""}"""),format.raw/*20.105*/("""}"""),format.raw/*20.106*/("""</span>
                                        </a>
                                    </div>

                                    <div id="panel_result_"""),format.raw/*24.59*/("""{"""),format.raw/*24.60*/("""{"""),format.raw/*24.61*/("""orderNum"""),format.raw/*24.69*/("""}"""),format.raw/*24.70*/("""}"""),format.raw/*24.71*/("""" class="panel-collapse collapse">
                                        <div class="panel-body">
                                            <div class="row">
                                                <div class="col-md-12">
                                                    <div>
                                                        <div ng-jsoneditor="onLoad" ng-model="ScenarioApiInfoResult.response" prefer-text="true" options=""""),format.raw/*29.155*/("""{"""),format.raw/*29.156*/("""mode:'tree'"""),format.raw/*29.167*/("""}"""),format.raw/*29.168*/("""" style="height: 250px;"></div>
                                                    </div>
                                                </div>

                                                <div class="col-md-12" ng-hide=""""),format.raw/*33.81*/("""{"""),format.raw/*33.82*/("""{"""),format.raw/*33.83*/("""ScenarioApiInfoResult.checks.length==0"""),format.raw/*33.121*/("""}"""),format.raw/*33.122*/("""}"""),format.raw/*33.123*/("""">
                                                    <div class="margin">
                                                        <table class="table table-condensed" id="myChecks_result_"""),format.raw/*35.114*/("""{"""),format.raw/*35.115*/("""{"""),format.raw/*35.116*/("""orderNum"""),format.raw/*35.124*/("""}"""),format.raw/*35.125*/("""}"""),format.raw/*35.126*/("""">
                                                            <tbody>
                                                                <tr class="btn-instagram">
                                                                    <th>Field Name</th>
                                                                    <th>Method</th>
                                                                    <th>Target Field</th>
                                                                    <th>Expect</th>
                                                                    <th>Status</th>
                                                                </tr>
                                                                <tr ng-repeat="check in ScenarioApiInfoResult.checks">
                                                                    <td class="col-md-3"><input type="text" class="form-control" value=""""),format.raw/*45.137*/("""{"""),format.raw/*45.138*/("""{"""),format.raw/*45.139*/("""check.field"""),format.raw/*45.150*/("""}"""),format.raw/*45.151*/("""}"""),format.raw/*45.152*/(""""></td>
                                                                    <td>
                                                                        <select id="CheckMethodSelect" class="form-control select2" style="width: 100%;" ng-model="SchemeSelect">
                                                                            <option ng-selected="true">"""),format.raw/*48.104*/("""{"""),format.raw/*48.105*/("""{"""),format.raw/*48.106*/("""check.checkMethod"""),format.raw/*48.123*/("""}"""),format.raw/*48.124*/("""}"""),format.raw/*48.125*/("""</option>
                                                                            <option>Save</option>
                                                                            <option>Equal</option>
                                                                            <option>Contain</option>
                                                                            <option>IsNull</option>
                                                                            <option>IsNotContain</option>
                                                                            <option>HasItem</option>
                                                                            <option>DoNotHasItem</option>
                                                                        </select>
                                                                    </td>
                                                                    <td class="col-md-3"><input type="text" class="form-control" value=""""),format.raw/*58.137*/("""{"""),format.raw/*58.138*/("""{"""),format.raw/*58.139*/("""check.targetField"""),format.raw/*58.156*/("""}"""),format.raw/*58.157*/("""}"""),format.raw/*58.158*/(""""></td>
                                                                    <td class="col-md-3"><input type="text" class="form-control" value=""""),format.raw/*59.137*/("""{"""),format.raw/*59.138*/("""{"""),format.raw/*59.139*/("""check.expect"""),format.raw/*59.151*/("""}"""),format.raw/*59.152*/("""}"""),format.raw/*59.153*/(""""></td>
                                                                    <td class="col-md-1"><input type="text" class="form-control" value=""""),format.raw/*60.137*/("""{"""),format.raw/*60.138*/("""{"""),format.raw/*60.139*/("""check.status"""),format.raw/*60.151*/("""}"""),format.raw/*60.152*/("""}"""),format.raw/*60.153*/(""""></td>
                                                                </tr>
                                                            </tbody>
                                                        </table>
                                                        """),format.raw/*64.176*/("""
                                                    """),format.raw/*65.53*/("""</div>

                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div> <!-- /.col-md-12 -->
                </div> <!-- /.row -->
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-outline pull-left" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-outline" data-dismiss="modal">OK</button>
            </div>
        </div>
    </div>
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
object modal_result extends modal_result_Scope0.modal_result
              /*
                  -- GENERATED --
                  DATE: Mon Jun 06 17:59:33 CST 2016
                  SOURCE: /Users/apple/Documents/PRO/ApiIntelligenceRobot/app/views/scenarios/view/modal_result.scala.html
                  HASH: 8ca8e7c7ff0eae86158845ab4c195e38080641b1
                  MATRIX: 856->0|1991->1106|2021->1107|2051->1108|2088->1116|2118->1117|2148->1118|2246->1188|2275->1189|2304->1190|2340->1198|2369->1199|2398->1200|2501->1275|2530->1276|2559->1277|2620->1309|2650->1310|2680->1311|2783->1386|2812->1387|2841->1388|2897->1416|2926->1417|2956->1418|2988->1421|3018->1422|3048->1423|3103->1449|3133->1450|3163->1451|3193->1452|3223->1453|3282->1483|3312->1484|3342->1485|3372->1486|3402->1487|3460->1516|3490->1517|3520->1518|3606->1576|3635->1577|3664->1578|3744->1629|3774->1630|3804->1631|3987->1786|4016->1787|4045->1788|4081->1796|4110->1797|4139->1798|4614->2244|4644->2245|4684->2256|4714->2257|4969->2484|4998->2485|5027->2486|5094->2524|5124->2525|5154->2526|5372->2715|5402->2716|5432->2717|5469->2725|5499->2726|5529->2727|6475->3644|6505->3645|6535->3646|6575->3657|6605->3658|6635->3659|7026->4021|7056->4022|7086->4023|7132->4040|7162->4041|7192->4042|8234->5055|8264->5056|8294->5057|8340->5074|8370->5075|8400->5076|8573->5220|8603->5221|8633->5222|8674->5234|8704->5235|8734->5236|8907->5380|8937->5381|8967->5382|9008->5394|9038->5395|9068->5396|9365->5783|9446->5836
                  LINES: 32->1|47->16|47->16|47->16|47->16|47->16|47->16|48->17|48->17|48->17|48->17|48->17|48->17|49->18|49->18|49->18|49->18|49->18|49->18|50->19|50->19|50->19|50->19|50->19|50->19|50->19|50->19|50->19|50->19|50->19|50->19|50->19|50->19|50->19|50->19|50->19|50->19|50->19|50->19|50->19|50->19|51->20|51->20|51->20|51->20|51->20|51->20|55->24|55->24|55->24|55->24|55->24|55->24|60->29|60->29|60->29|60->29|64->33|64->33|64->33|64->33|64->33|64->33|66->35|66->35|66->35|66->35|66->35|66->35|76->45|76->45|76->45|76->45|76->45|76->45|79->48|79->48|79->48|79->48|79->48|79->48|89->58|89->58|89->58|89->58|89->58|89->58|90->59|90->59|90->59|90->59|90->59|90->59|91->60|91->60|91->60|91->60|91->60|91->60|95->64|96->65
                  -- GENERATED --
              */
          