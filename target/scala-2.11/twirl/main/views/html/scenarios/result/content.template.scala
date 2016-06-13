
package views.html.scenarios.result

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


Seq[Any](format.raw/*2.1*/("""<section class="content-header">
    <h1>
        scenario.getTag
    <small>scenario.getScenarioName</small>
    </h1>
    <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
        <li><a href="#">API</a></li>
        <li class="active">Task</li>
    </ol>
</section>

    <!-- Main content -->
<section class="content">
    <div class="row">
        <div class="col-xs-12">
            <div class="box">
                """),format.raw/*19.45*/("""
                    """),format.raw/*20.56*/("""
                    """),format.raw/*21.177*/("""
                    """),format.raw/*22.135*/("""
                    """),format.raw/*23.162*/("""
                """),format.raw/*24.48*/("""
                """),format.raw/*25.17*/("""<div class="box-body">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-md-12">
                                if(scenario.getScenarioApis.isEmpty) """),format.raw/*29.70*/("""{"""),format.raw/*29.71*/("""
                                    """),format.raw/*30.37*/("""<h1>Nothing to display</h1>
                                """),format.raw/*31.33*/("""}"""),format.raw/*31.34*/(""" """),format.raw/*31.35*/("""else """),format.raw/*31.40*/("""{"""),format.raw/*31.41*/("""
                                    """),format.raw/*32.37*/("""<div class="panel-group" id="panel">
                                    for(scenarioAPI <- scenario.getScenarioApis) """),format.raw/*33.82*/("""{"""),format.raw/*33.83*/("""
                                        """),format.raw/*34.41*/("""<div class="panel panel-default">
                                            <div class="panel-heading" ng-click="Check(scenarioAPI,scenarioAPI.getOrderNum)">
                                                <a class="panel-title collapsed" data-toggle="collapse" data-parent="#panel" href="#panel-element_scenarioAPI.getOrderNum">
                                                    <span>scenarioAPI.getOrderNum</span>
                                                    <span>scenarioAPI.getRequest.getComment</span>
                                                    <span>scenarioAPI.getRequest.getUrl</span>
                                                    <span>scenarioAPI.getResponse.getStatus</span>
                                                    <span>scenarioAPI.getResponse.getStatusText</span>
                                                </a>
                                            </div>
                                            <div id="panel-element_scenarioAPI.getOrderNum" class="panel-collapse collapse">
                                                <div class="panel-body">
                                                    <div class="row">
                                                        <div class="col-md-12">
                                                            """),format.raw/*48.98*/("""
                                                                """),format.raw/*49.158*/("""
                                                                """),format.raw/*50.99*/("""
                                                                    """),format.raw/*51.140*/("""
                                                                """),format.raw/*52.76*/("""
                                                            """),format.raw/*53.71*/("""
                                                            """),format.raw/*54.61*/("""<table  style="overflow:auto;" border="0px" width="100%">
                                                                <tr>
                                                                    <td id="reslutMessage">
                                                                        <div id="jsonFormate_scenarioAPI.getOrderNum" style="height:425px; overflow-y:auto; border:0px solid;"></div>
                                                                    </td>
                                                                </tr>
                                                            </table>
                                                        </div>
                                                    </div>

                                                </div>
                                            </div>
                                        </div>
                                    """),format.raw/*67.37*/("""}"""),format.raw/*67.38*/("""
                                    """),format.raw/*68.37*/("""</div>                                """),format.raw/*68.75*/("""}"""),format.raw/*68.76*/("""


                            """),format.raw/*71.29*/("""</div>
                        </div>
                    </div>

                </div><!-- /.box-body -->
            </div><!-- /.box -->

        </div><!-- /.col -->
    </div><!-- /.row -->

</section><!-- /.content -->"""))
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
                  DATE: Thu Jun 02 15:28:27 CST 2016
                  SOURCE: /Users/apple/Documents/PRO/ApiIntelligenceRobot/app/views/scenarios/result/content.scala.html
                  HASH: f8841e4450a55943494d5bae3291c468c1eabe95
                  MATRIX: 848->1|1342->495|1391->551|1441->728|1491->863|1541->1025|1586->1073|1631->1090|1895->1326|1924->1327|1989->1364|2077->1424|2106->1425|2135->1426|2168->1431|2197->1432|2262->1469|2408->1587|2437->1588|2506->1629|3863->2995|3957->3153|4050->3252|4148->3392|4241->3468|4330->3539|4419->3600|5373->4526|5402->4527|5467->4564|5533->4602|5562->4603|5621->4634
                  LINES: 32->2|49->19|50->20|51->21|52->22|53->23|54->24|55->25|59->29|59->29|60->30|61->31|61->31|61->31|61->31|61->31|62->32|63->33|63->33|64->34|78->48|79->49|80->50|81->51|82->52|83->53|84->54|97->67|97->67|98->68|98->68|98->68|101->71
                  -- GENERATED --
              */
          