
package views.html.scenarios.view

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object content2_Scope0 {
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

class content2 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<section class="content-header" xmlns="http://www.w3.org/1999/html">
    <h1>
        """),format.raw/*3.9*/("""{"""),format.raw/*3.10*/("""{"""),format.raw/*3.11*/("""scenarioDocInit.tagName"""),format.raw/*3.34*/("""}"""),format.raw/*3.35*/("""}"""),format.raw/*3.36*/("""
        """),format.raw/*4.9*/("""<small>"""),format.raw/*4.16*/("""{"""),format.raw/*4.17*/("""{"""),format.raw/*4.18*/("""scenarioDocInit.swagger.info.title"""),format.raw/*4.52*/("""}"""),format.raw/*4.53*/("""}"""),format.raw/*4.54*/("""</small>
    </h1>
    <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
        <li><a href="#">Scenario</a></li>
        <li class="active">Page</li>
    </ol>
</section>

    <!-- Main content -->
<section class="content">
    <div class="row">
        <div class="col-xs-12">
            <div class="box">
                <div class="box-header">
                    <button class="btn btn-info btn-flat right" type="button" data-toggle="modal" data-target="#myAdd" ng-click="getApis('scenarioDoc.get_id()')">Edit</button>
                    <button class="btn btn-info btn-flat right" type="button" ng-click="runTask('scenario.get_id()')">RUN</button>
                    <button class="btn btn-info btn-flat right" type="button" data-toggle="modal" data-target="#myTask" ng-click="viewTasks()">Tasks</button>
                    <button class="btn btn-info btn-flat right" type="button"  ng-click="viewResult('scenario.get_id()')">Result</button>
                </div><!-- /.box-header -->
                <div class="box-body">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-md-12">
                                    <h1 ng-if="scenarioDocInit.swagger.paths == null">Nothing to display</h1>
                                <div class="panel-group" id="panel">
                                    <div ng-repeat="(urlPath,Path) in scenarioDocInit.swagger.paths">
                                        <div ng-repeat="(httpMethod,Operation) in Path">
                                    <div class="panel panel-default">
                                            <div class="panel-heading">
                                                <a class="panel-title collapsed" data-toggle="collapse" data-parent="#panel" href="#panel-element_"""),format.raw/*34.147*/("""{"""),format.raw/*34.148*/("""{"""),format.raw/*34.149*/("""$parent.$index"""),format.raw/*34.163*/("""}"""),format.raw/*34.164*/("""}"""),format.raw/*34.165*/("""{"""),format.raw/*34.166*/("""{"""),format.raw/*34.167*/("""$index"""),format.raw/*34.173*/("""}"""),format.raw/*34.174*/("""}"""),format.raw/*34.175*/("""">
                                                    <span class="col-lg-1">"""),format.raw/*35.76*/("""{"""),format.raw/*35.77*/("""{"""),format.raw/*35.78*/("""$parent.$index"""),format.raw/*35.92*/("""}"""),format.raw/*35.93*/("""}"""),format.raw/*35.94*/("""{"""),format.raw/*35.95*/("""{"""),format.raw/*35.96*/("""$index"""),format.raw/*35.102*/("""}"""),format.raw/*35.103*/("""}"""),format.raw/*35.104*/("""</span>
                                                    <span class="col-lg-4">"""),format.raw/*36.76*/("""{"""),format.raw/*36.77*/("""{"""),format.raw/*36.78*/("""Operation.summary"""),format.raw/*36.95*/("""}"""),format.raw/*36.96*/("""}"""),format.raw/*36.97*/("""</span>
                                                    <span>http://"""),format.raw/*37.66*/("""{"""),format.raw/*37.67*/("""{"""),format.raw/*37.68*/("""scenarioDocInit.swagger.host"""),format.raw/*37.96*/("""}"""),format.raw/*37.97*/("""}"""),format.raw/*37.98*/("""{"""),format.raw/*37.99*/("""{"""),format.raw/*37.100*/("""scenarioDocInit.swagger.basePath"""),format.raw/*37.132*/("""}"""),format.raw/*37.133*/("""}"""),format.raw/*37.134*/("""{"""),format.raw/*37.135*/("""{"""),format.raw/*37.136*/("""urlPath"""),format.raw/*37.143*/("""}"""),format.raw/*37.144*/("""}"""),format.raw/*37.145*/("""</span>
                                                </a>
                                            </div>
                                            <div id="panel-element_"""),format.raw/*40.68*/("""{"""),format.raw/*40.69*/("""{"""),format.raw/*40.70*/("""$parent.$index"""),format.raw/*40.84*/("""}"""),format.raw/*40.85*/("""}"""),format.raw/*40.86*/("""{"""),format.raw/*40.87*/("""{"""),format.raw/*40.88*/("""$index"""),format.raw/*40.94*/("""}"""),format.raw/*40.95*/("""}"""),format.raw/*40.96*/("""" class="panel-collapse collapse">
                                                <div class="panel-body">

                                                    <div class="row">
                                                        <div class="col-md-6">
                                                            <div>
                                                                <div class="input-group margin">
                                                                    <input type="text" class="btn btn-block btn-instagram" value="REQUEST" ng-readonly="true">
                                                                    <span class="input-group-btn">
                                                                        <button class="btn btn-info btn-flat" type="button" ng-click="SendRequest('scenarioDoc.get_id()','scenarioAPI.getApiDocId','scenarioAPI.getOrderNum')">Go!</button>
                                                                    </span>
                                                                </div>


                                                                <div class="margin">
                                                                    <select id="myScheme" ng-model="myScheme" ng-options="myScheme for myScheme in scenarioDocInit.swagger.schemes" class="form-control select2" style="width: 100%;">
                                                                        <option >scheme</option>
                                                                    </select>

                                                                </div>

                                                                <div class="input-group margin">
                                                                    <span class="input-group-btn">
                                                                        <button class="btn btn-info btn-flat" type="button">U</button>
                                                                    </span>
                                                                    <input id="myUrl" type="text" class="form-control" value=""""),format.raw/*65.127*/("""{"""),format.raw/*65.128*/("""{"""),format.raw/*65.129*/("""myScheme"""),format.raw/*65.137*/("""}"""),format.raw/*65.138*/("""}"""),format.raw/*65.139*/("""://"""),format.raw/*65.142*/("""{"""),format.raw/*65.143*/("""{"""),format.raw/*65.144*/("""scenarioDocInit.swagger.host"""),format.raw/*65.172*/("""}"""),format.raw/*65.173*/("""}"""),format.raw/*65.174*/("""{"""),format.raw/*65.175*/("""{"""),format.raw/*65.176*/("""scenarioDocInit.swagger.basePath"""),format.raw/*65.208*/("""}"""),format.raw/*65.209*/("""}"""),format.raw/*65.210*/("""{"""),format.raw/*65.211*/("""{"""),format.raw/*65.212*/("""urlPath"""),format.raw/*65.219*/("""}"""),format.raw/*65.220*/("""}"""),format.raw/*65.221*/("""">
                                                                </div>

                                                                <div id="panel_header_"""),format.raw/*68.87*/("""{"""),format.raw/*68.88*/("""{"""),format.raw/*68.89*/("""$parent.$index"""),format.raw/*68.103*/("""}"""),format.raw/*68.104*/("""}"""),format.raw/*68.105*/("""{"""),format.raw/*68.106*/("""{"""),format.raw/*68.107*/("""$index"""),format.raw/*68.113*/("""}"""),format.raw/*68.114*/("""}"""),format.raw/*68.115*/("""">
                                                                    <div>
                                                                        <div>
                                                                            <a data-toggle="collapse" data-parent="#panel_header" href="#panel-element_header_"""),format.raw/*71.159*/("""{"""),format.raw/*71.160*/("""{"""),format.raw/*71.161*/("""$parent.$index"""),format.raw/*71.175*/("""}"""),format.raw/*71.176*/("""}"""),format.raw/*71.177*/("""{"""),format.raw/*71.178*/("""{"""),format.raw/*71.179*/("""$index"""),format.raw/*71.185*/("""}"""),format.raw/*71.186*/("""}"""),format.raw/*71.187*/("""">
                                                                                <div class="input-group margin">
                                                                                    <span class="input-group-btn">
                                                                                        <button class="btn btn-info btn-flat" type="button">H</button>
                                                                                    </span>
                                                                                    <input type="text" class="form-control" value="scenarioAPI.getHeaderParameters.toString">
                                                                                </div>
                                                                            </a>
                                                                        </div>
                                                                        <div id="panel-element_header_"""),format.raw/*80.103*/("""{"""),format.raw/*80.104*/("""{"""),format.raw/*80.105*/("""$parent.$index"""),format.raw/*80.119*/("""}"""),format.raw/*80.120*/("""}"""),format.raw/*80.121*/("""{"""),format.raw/*80.122*/("""{"""),format.raw/*80.123*/("""$index"""),format.raw/*80.129*/("""}"""),format.raw/*80.130*/("""}"""),format.raw/*80.131*/("""" class="panel-collapse collapse">
                                                                            <div class="margin">
                                                                                <table class="table table-condensed" id="myHeader_scenarioAPI.getOrderNum">
                                                                                    <tbody>
                                                                                        <tr class="btn-instagram">
                                                                                            <th>Param Name</th>
                                                                                            <th>Description</th>
                                                                                            <th>Param Value</th>
                                                                                            <th>Param Type</th>
                                                                                        </tr>
                                                                                        """),format.raw/*90.139*/("""
                                                                                            """),format.raw/*91.93*/("""<tr>
                                                                                                <td>header.getName</td>
                                                                                                <td>header.getDescription</td>
                                                                                                <td><input type="text" value="header.getDefaultValue"></td>
                                                                                                <td>header.getIn</td>
                                                                                            </tr>
                                                                                        """),format.raw/*97.94*/("""
                                                                                    """),format.raw/*98.85*/("""</tbody>
                                                                                </table>
                                                                            </div>
                                                                        </div>
                                                                    </div>
                                                                </div>

                                                                <div id="panel_params_"""),format.raw/*105.87*/("""{"""),format.raw/*105.88*/("""{"""),format.raw/*105.89*/("""$parent.$index"""),format.raw/*105.103*/("""}"""),format.raw/*105.104*/("""}"""),format.raw/*105.105*/("""{"""),format.raw/*105.106*/("""{"""),format.raw/*105.107*/("""$index"""),format.raw/*105.113*/("""}"""),format.raw/*105.114*/("""}"""),format.raw/*105.115*/("""" ng-hide="scenarioAPI.getQueryParameters.toString==''">
                                                                    <div>
                                                                        <div>
                                                                            <a data-toggle="collapse" data-parent="#panel_query" href="#panel-element_params_"""),format.raw/*108.158*/("""{"""),format.raw/*108.159*/("""{"""),format.raw/*108.160*/("""$parent.$index"""),format.raw/*108.174*/("""}"""),format.raw/*108.175*/("""}"""),format.raw/*108.176*/("""{"""),format.raw/*108.177*/("""{"""),format.raw/*108.178*/("""$index"""),format.raw/*108.184*/("""}"""),format.raw/*108.185*/("""}"""),format.raw/*108.186*/("""">
                                                                                <div class="input-group margin" >
                                                                                    <span class="input-group-btn">
                                                                                        <button class="btn btn-info btn-flat" type="button">Q</button>
                                                                                    </span>
                                                                                    <input type="text" class="form-control" value="scenarioAPI.getQueryParameters.toString">
                                                                                </div>
                                                                            </a>
                                                                        </div>
                                                                        <div id="panel-element_params_"""),format.raw/*117.103*/("""{"""),format.raw/*117.104*/("""{"""),format.raw/*117.105*/("""$parent.$index"""),format.raw/*117.119*/("""}"""),format.raw/*117.120*/("""}"""),format.raw/*117.121*/("""{"""),format.raw/*117.122*/("""{"""),format.raw/*117.123*/("""$index"""),format.raw/*117.129*/("""}"""),format.raw/*117.130*/("""}"""),format.raw/*117.131*/("""" class="panel-collapse collapse">
                                                                            <div class="margin">
                                                                                """),format.raw/*119.208*/("""
                                                                                """),format.raw/*120.110*/("""

                                                                                """),format.raw/*122.81*/("""<div ng-jsoneditor="onLoad" ng-model="scenarioDocSwaggerDoc" options="parameters_tree.options" style="height: 500px;"></div>
                                                                                <table class="table table-condensed" id="myParams_table">
                                                                                    <tbody >
                                                                                        """),format.raw/*125.165*/("""
                                                                                            """),format.raw/*126.116*/("""
                                                                                            """),format.raw/*127.117*/("""
                                                                                            """),format.raw/*128.117*/("""
                                                                                            """),format.raw/*129.116*/("""
                                                                                        """),format.raw/*130.98*/("""
                                                                                        """),format.raw/*131.117*/("""
                                                                                        """),format.raw/*132.137*/("""
                                                                                            """),format.raw/*133.147*/("""
                                                                                                """),format.raw/*134.165*/("""
                                                                                                """),format.raw/*135.156*/("""
                                                                                                """),format.raw/*136.123*/("""
                                                                                                """),format.raw/*137.180*/("""
                                                                                                """),format.raw/*138.121*/("""
                                                                                            """),format.raw/*139.102*/("""
                                                                                        """),format.raw/*140.94*/("""
                                                                                    """),format.raw/*141.85*/("""</tbody>
                                                                                </table>
                                                                            </div>
                                                                        </div>
                                                                    </div>
                                                                </div>




                                                            </div>
                                                        </div>
                                                        <div class="col-md-6">
                                                            <div class="input-group margin">
                                                                <input type="text" class="btn btn-block btn-instagram" value="CHECKS" ng-readonly="true">
                                                                <span class="input-group-btn">
                                                                    <button class="btn btn-info btn-flat" type="button"  data-toggle="modal" data-target="#myRule">ADD</button>
                                                                </span>
                                                            </div>
                                                            <div class="input-group margin">
                                                                <span class="input-group-btn">
                                                                    <button class="btn btn-info btn-flat" type="button">1</button>
                                                                </span>
                                                                <input type="text" class="form-control" value="field  targetField  method  expect">
                                                            </div>
                                                            <div class="input-group margin">
                                                                <span class="input-group-btn">
                                                                    <button class="btn btn-info btn-flat" type="button">2</button>
                                                                </span>
                                                                <input type="text" class="form-control" value="field  targetField  method  expect">
                                                            </div>


                                                        </div>

                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-12">
                                                            <div class="input-group margin">
                                                                <input type="text" class="btn btn-block btn-instagram" value="RESPONSE" ng-readonly="true">
                                                                <span class="input-group-btn">
                                                                    <button class="btn btn-info btn-flat" type="button" ng-click="">DETAILS</button>
                                                                </span>
                                                            </div>
                                                            <table  style="overflow:auto;" border="0px" width="100%">
                                                                <tr>
                                                                    <td id="reslutMessage">
                                                                        <div id="jsonFormate_scenarioAPI.getOrderNum"></div>
                                                                    </td>
                                                                </tr>
                                                            </table>
                                                        </div>
                                                    </div>

                                                </div>
                                            </div>
                                        </div>
                                        </div>
                                    </div>
                            </div>

                        </div>
                    </div>

                </div><!-- /.box-body -->
            </div><!-- /.box -->

        </div><!-- /.col -->
    </div><!-- /.row -->

</section><!-- /.content -->

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
object content2 extends content2_Scope0.content2
              /*
                  -- GENERATED --
                  DATE: Thu Jun 02 15:28:27 CST 2016
                  SOURCE: /Users/apple/Documents/PRO/ApiIntelligenceRobot/app/views/scenarios/view/content2.scala.html
                  HASH: 9cc0f74f40a8edca9b8022e6eeb2fa081a499640
                  MATRIX: 848->0|960->86|988->87|1016->88|1066->111|1094->112|1122->113|1157->122|1191->129|1219->130|1247->131|1308->165|1336->166|1364->167|3276->2050|3306->2051|3336->2052|3379->2066|3409->2067|3439->2068|3469->2069|3499->2070|3534->2076|3564->2077|3594->2078|3700->2156|3729->2157|3758->2158|3800->2172|3829->2173|3858->2174|3887->2175|3916->2176|3951->2182|3981->2183|4011->2184|4122->2267|4151->2268|4180->2269|4225->2286|4254->2287|4283->2288|4384->2361|4413->2362|4442->2363|4498->2391|4527->2392|4556->2393|4585->2394|4615->2395|4676->2427|4706->2428|4736->2429|4766->2430|4796->2431|4832->2438|4862->2439|4892->2440|5099->2619|5128->2620|5157->2621|5199->2635|5228->2636|5257->2637|5286->2638|5315->2639|5349->2645|5378->2646|5407->2647|7597->4808|7627->4809|7657->4810|7694->4818|7724->4819|7754->4820|7786->4823|7816->4824|7846->4825|7903->4853|7933->4854|7963->4855|7993->4856|8023->4857|8084->4889|8114->4890|8144->4891|8174->4892|8204->4893|8240->4900|8270->4901|8300->4902|8489->5063|8518->5064|8547->5065|8590->5079|8620->5080|8650->5081|8680->5082|8710->5083|8745->5089|8775->5090|8805->5091|9147->5404|9177->5405|9207->5406|9250->5420|9280->5421|9310->5422|9340->5423|9370->5424|9405->5430|9435->5431|9465->5432|10491->6429|10521->6430|10551->6431|10594->6445|10624->6446|10654->6447|10684->6448|10714->6449|10749->6455|10779->6456|10809->6457|11965->7634|12086->7727|12826->8444|12939->8529|13461->9022|13491->9023|13521->9024|13565->9038|13596->9039|13627->9040|13658->9041|13689->9042|13725->9048|13756->9049|13787->9050|14183->9416|14214->9417|14245->9418|14289->9432|14320->9433|14351->9434|14382->9435|14413->9436|14449->9442|14480->9443|14511->9444|15538->10441|15569->10442|15600->10443|15644->10457|15675->10458|15706->10459|15737->10460|15768->10461|15804->10467|15835->10468|15866->10469|16108->10808|16219->10918|16330->11000|16804->11520|16927->11636|17050->11753|17173->11870|17296->11986|17414->12084|17533->12201|17652->12338|17775->12485|17902->12650|18029->12806|18156->12929|18283->13109|18410->13230|18533->13332|18651->13426|18765->13511
                  LINES: 32->1|34->3|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|35->4|35->4|35->4|65->34|65->34|65->34|65->34|65->34|65->34|65->34|65->34|65->34|65->34|65->34|66->35|66->35|66->35|66->35|66->35|66->35|66->35|66->35|66->35|66->35|66->35|67->36|67->36|67->36|67->36|67->36|67->36|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|71->40|71->40|71->40|71->40|71->40|71->40|71->40|71->40|71->40|71->40|71->40|96->65|96->65|96->65|96->65|96->65|96->65|96->65|96->65|96->65|96->65|96->65|96->65|96->65|96->65|96->65|96->65|96->65|96->65|96->65|96->65|96->65|96->65|99->68|99->68|99->68|99->68|99->68|99->68|99->68|99->68|99->68|99->68|99->68|102->71|102->71|102->71|102->71|102->71|102->71|102->71|102->71|102->71|102->71|102->71|111->80|111->80|111->80|111->80|111->80|111->80|111->80|111->80|111->80|111->80|111->80|121->90|122->91|128->97|129->98|136->105|136->105|136->105|136->105|136->105|136->105|136->105|136->105|136->105|136->105|136->105|139->108|139->108|139->108|139->108|139->108|139->108|139->108|139->108|139->108|139->108|139->108|148->117|148->117|148->117|148->117|148->117|148->117|148->117|148->117|148->117|148->117|148->117|150->119|151->120|153->122|156->125|157->126|158->127|159->128|160->129|161->130|162->131|163->132|164->133|165->134|166->135|167->136|168->137|169->138|170->139|171->140|172->141
                  -- GENERATED --
              */
          