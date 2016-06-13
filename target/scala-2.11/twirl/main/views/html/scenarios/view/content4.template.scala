
package views.html.scenarios.view

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object content4_Scope0 {
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

class content4 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<section class="content-header" xmlns="http://www.w3.org/1999/html">
    <h1>
        """),format.raw/*3.9*/("""{"""),format.raw/*3.10*/("""{"""),format.raw/*3.11*/("""scenarioDocInit.tagName"""),format.raw/*3.34*/("""}"""),format.raw/*3.35*/("""}"""),format.raw/*3.36*/("""
        """),format.raw/*4.9*/("""<small>"""),format.raw/*4.16*/("""{"""),format.raw/*4.17*/("""{"""),format.raw/*4.18*/("""scenarioDocInit.scenarioName"""),format.raw/*4.46*/("""}"""),format.raw/*4.47*/("""}"""),format.raw/*4.48*/("""</small>
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
                    <button class="btn btn-info btn-flat right" type="button" data-toggle="modal" data-target="#myAdd" ng-click="getApis(scenarioDocInit._id)">Edit</button>
                    <button class="btn btn-info btn-flat right" type="button" data-toggle="modal" data-target="#myResult" ng-click="sendRequestAll(scenarioDocInit._id)">RUN</button>
                </div><!-- /.box-header -->
                <div class="box-body">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-md-12">
                                <h1 ng-if="dependsOnLength == 2">Nothing to display,Please add APIs!</h1>
                                <div ng-if="dependsOnLength != 2" class="panel-group" id="panel">
                                    <div class="panel panel-default" ng-repeat="(orderNum,ScenarioApiInfo) in scenarioDocDependsOn">
                                            <div class="panel-heading">
                                                <a class="panel-title collapsed" data-toggle="collapse" data-parent="#panel" href="#panel-element_"""),format.raw/*30.147*/("""{"""),format.raw/*30.148*/("""{"""),format.raw/*30.149*/("""orderNum"""),format.raw/*30.157*/("""}"""),format.raw/*30.158*/("""}"""),format.raw/*30.159*/("""">
                                                    <span class="col-lg-1">"""),format.raw/*31.76*/("""{"""),format.raw/*31.77*/("""{"""),format.raw/*31.78*/("""orderNum"""),format.raw/*31.86*/("""}"""),format.raw/*31.87*/("""}"""),format.raw/*31.88*/("""</span>
                                                    <span class="col-lg-4">"""),format.raw/*32.76*/("""{"""),format.raw/*32.77*/("""{"""),format.raw/*32.78*/("""scenarioSwaggerDoc.paths[ScenarioApiInfo.pathUrl][ScenarioApiInfo.httpMethod.toLowerCase()].summary"""),format.raw/*32.177*/("""}"""),format.raw/*32.178*/("""}"""),format.raw/*32.179*/("""</span>
                                                    <span class="col-lg-1">"""),format.raw/*33.76*/("""{"""),format.raw/*33.77*/("""{"""),format.raw/*33.78*/("""ScenarioApiInfo.httpMethod"""),format.raw/*33.104*/("""}"""),format.raw/*33.105*/("""}"""),format.raw/*33.106*/("""</span>
                                                    <span>"""),format.raw/*34.59*/("""{"""),format.raw/*34.60*/("""{"""),format.raw/*34.61*/("""ScenarioApiInfo.scheme"""),format.raw/*34.83*/("""}"""),format.raw/*34.84*/("""}"""),format.raw/*34.85*/("""://"""),format.raw/*34.88*/("""{"""),format.raw/*34.89*/("""{"""),format.raw/*34.90*/("""ScenarioApiInfo.host"""),format.raw/*34.110*/("""}"""),format.raw/*34.111*/("""}"""),format.raw/*34.112*/("""{"""),format.raw/*34.113*/("""{"""),format.raw/*34.114*/("""ScenarioApiInfo.basePath"""),format.raw/*34.138*/("""}"""),format.raw/*34.139*/("""}"""),format.raw/*34.140*/("""{"""),format.raw/*34.141*/("""{"""),format.raw/*34.142*/("""ScenarioApiInfo.pathUrl"""),format.raw/*34.165*/("""}"""),format.raw/*34.166*/("""}"""),format.raw/*34.167*/("""</span>
                                                </a>
                                            </div>
                                            <div id="panel-element_"""),format.raw/*37.68*/("""{"""),format.raw/*37.69*/("""{"""),format.raw/*37.70*/("""orderNum"""),format.raw/*37.78*/("""}"""),format.raw/*37.79*/("""}"""),format.raw/*37.80*/("""" class="panel-collapse collapse">
                                                <div class="panel-body">

                                                    <div class="row">
                                                        <div class="col-md-6">
                                                            <div>
                                                                <div class="input-group margin">
                                                                    <input type="text" class="btn btn-block btn-instagram" value="REQUEST" ng-readonly="true">
                                                                    <span class="input-group-btn">
                                                                        <button class="btn btn-info btn-flat" type="button" data-toggle="modal" data-target="#myResult" ng-click="SendRequest(scenarioDocInit._id,orderNum)">Go!</button>
                                                                    </span>
                                                                </div>


                                                                <div class="margin">
                                                                    <select id="myScheme_"""),format.raw/*52.90*/("""{"""),format.raw/*52.91*/("""{"""),format.raw/*52.92*/("""orderNum"""),format.raw/*52.100*/("""}"""),format.raw/*52.101*/("""}"""),format.raw/*52.102*/("""" ng-model="myScheme" ng-options="myScheme for myScheme in scenarioDocInit.swagger.schemes" class="form-control" style="width: 100%;">
                                                                        """),format.raw/*53.107*/("""
                                                                    """),format.raw/*54.69*/("""</select>
                                                                </div>
                                                                <div class="input-group margin">
                                                                    <span class="input-group-btn">
                                                                        <button class="btn btn-info btn-flat" type="button">H</button>
                                                                    </span>
                                                                    <input id="myHost_"""),format.raw/*60.87*/("""{"""),format.raw/*60.88*/("""{"""),format.raw/*60.89*/("""orderNum"""),format.raw/*60.97*/("""}"""),format.raw/*60.98*/("""}"""),format.raw/*60.99*/("""" type="text" class="form-control" value=""""),format.raw/*60.141*/("""{"""),format.raw/*60.142*/("""{"""),format.raw/*60.143*/("""ScenarioApiInfo.host"""),format.raw/*60.163*/("""}"""),format.raw/*60.164*/("""}"""),format.raw/*60.165*/("""">
                                                                </div>

                                                                <div class="input-group margin">
                                                                    <span class="input-group-btn">
                                                                        <button class="btn btn-info btn-flat" type="button">P</button>
                                                                    </span>
                                                                    <input id="myPath_"""),format.raw/*67.87*/("""{"""),format.raw/*67.88*/("""{"""),format.raw/*67.89*/("""orderNum"""),format.raw/*67.97*/("""}"""),format.raw/*67.98*/("""}"""),format.raw/*67.99*/("""" ng-readonly="true" type="text" class="form-control" value=""""),format.raw/*67.160*/("""{"""),format.raw/*67.161*/("""{"""),format.raw/*67.162*/("""ScenarioApiInfo.basePath"""),format.raw/*67.186*/("""}"""),format.raw/*67.187*/("""}"""),format.raw/*67.188*/("""{"""),format.raw/*67.189*/("""{"""),format.raw/*67.190*/("""ScenarioApiInfo.pathUrl"""),format.raw/*67.213*/("""}"""),format.raw/*67.214*/("""}"""),format.raw/*67.215*/("""">
                                                                </div>


                                                                <div id="panel_header_"""),format.raw/*71.87*/("""{"""),format.raw/*71.88*/("""{"""),format.raw/*71.89*/("""orderNum"""),format.raw/*71.97*/("""}"""),format.raw/*71.98*/("""}"""),format.raw/*71.99*/("""" >
                                                                    <div>
                                                                        <div>
                                                                            <a data-toggle="collapse" data-parent="#panel_header" href="#panel-element_header_"""),format.raw/*74.159*/("""{"""),format.raw/*74.160*/("""{"""),format.raw/*74.161*/("""orderNum"""),format.raw/*74.169*/("""}"""),format.raw/*74.170*/("""}"""),format.raw/*74.171*/("""">
                                                                                <div class="input-group margin">
                                                                                    <span class="input-group-btn">
                                                                                        <button class="btn btn-info btn-flat" type="button">H</button>
                                                                                    </span>
                                                                                    <input type="text" id="myHeader_"""),format.raw/*79.117*/("""{"""),format.raw/*79.118*/("""{"""),format.raw/*79.119*/("""orderNum"""),format.raw/*79.127*/("""}"""),format.raw/*79.128*/("""}"""),format.raw/*79.129*/("""" class="form-control" placeholder='"""),format.raw/*79.165*/("""{"""),format.raw/*79.166*/(""""myHeader":"value""""),format.raw/*79.184*/("""}"""),format.raw/*79.185*/("""' value='"""),format.raw/*79.194*/("""{"""),format.raw/*79.195*/("""{"""),format.raw/*79.196*/("""ScenarioApiInfo.headers"""),format.raw/*79.219*/("""}"""),format.raw/*79.220*/("""}"""),format.raw/*79.221*/("""'>
                                                                                </div>
                                                                            </a>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                                <div id="panel_params_"""),format.raw/*85.87*/("""{"""),format.raw/*85.88*/("""{"""),format.raw/*85.89*/("""orderNum"""),format.raw/*85.97*/("""}"""),format.raw/*85.98*/("""}"""),format.raw/*85.99*/("""" ng-hide="scenarioSwaggerDoc.paths[ScenarioApiInfo.pathUrl][ScenarioApiInfo.httpMethod.toLowerCase()].parameters==''">
                                                                    <div>
                                                                        <div>
                                                                            <a data-toggle="collapse" data-parent="#panel_params_"""),format.raw/*88.130*/("""{"""),format.raw/*88.131*/("""{"""),format.raw/*88.132*/("""orderNum"""),format.raw/*88.140*/("""}"""),format.raw/*88.141*/("""}"""),format.raw/*88.142*/("""" href="#panel-element_params_"""),format.raw/*88.172*/("""{"""),format.raw/*88.173*/("""{"""),format.raw/*88.174*/("""orderNum"""),format.raw/*88.182*/("""}"""),format.raw/*88.183*/("""}"""),format.raw/*88.184*/("""">
                                                                                <div class="input-group margin" >
                                                                                    <span class="input-group-btn">
                                                                                        <button class="btn btn-info btn-flat" type="button">P</button>
                                                                                    </span>
                                                                                    <input type="text" class="form-control" ng-readonly="true" value=""""),format.raw/*93.151*/("""{"""),format.raw/*93.152*/("""{"""),format.raw/*93.153*/("""scenarioSwaggerDoc.paths[ScenarioApiInfo.pathUrl][ScenarioApiInfo.httpMethod.toLowerCase()].parameters"""),format.raw/*93.255*/("""}"""),format.raw/*93.256*/("""}"""),format.raw/*93.257*/("""">
                                                                                </div>
                                                                            </a>
                                                                        </div>
                                                                        <div id="panel-element_params_"""),format.raw/*97.103*/("""{"""),format.raw/*97.104*/("""{"""),format.raw/*97.105*/("""orderNum"""),format.raw/*97.113*/("""}"""),format.raw/*97.114*/("""}"""),format.raw/*97.115*/("""" class="panel-collapse collapse">
                                                                            <div class="margin">

                                                                                <table class="table table-condensed" id="myParams_"""),format.raw/*100.131*/("""{"""),format.raw/*100.132*/("""{"""),format.raw/*100.133*/("""orderNum"""),format.raw/*100.141*/("""}"""),format.raw/*100.142*/("""}"""),format.raw/*100.143*/("""">
                                                                                    <tbody>
                                                                                        <tr class="btn-instagram">
                                                                                            <th>Param Name</th>
                                                                                            """),format.raw/*104.114*/("""
                                                                                            """),format.raw/*105.93*/("""<th>Param Value</th>
                                                                                            <th>Param Type</th>
                                                                                        </tr>
                                                                                        <tr ng-repeat="fieldValue in ScenarioApiInfo.fieldValues">
                                                                                            <td>"""),format.raw/*109.97*/("""{"""),format.raw/*109.98*/("""{"""),format.raw/*109.99*/("""fieldValue.name"""),format.raw/*109.114*/("""}"""),format.raw/*109.115*/("""}"""),format.raw/*109.116*/("""</td>
                                                                                            """),format.raw/*110.124*/("""
                                                                                            """),format.raw/*111.93*/("""<td><input class="form-control" type="text" value=""""),format.raw/*111.144*/("""{"""),format.raw/*111.145*/("""{"""),format.raw/*111.146*/("""fieldValue.value"""),format.raw/*111.162*/("""}"""),format.raw/*111.163*/("""}"""),format.raw/*111.164*/(""""></td>
                                                                                            <td>"""),format.raw/*112.97*/("""{"""),format.raw/*112.98*/("""{"""),format.raw/*112.99*/("""fieldValue.in"""),format.raw/*112.112*/("""}"""),format.raw/*112.113*/("""}"""),format.raw/*112.114*/("""</td>
                                                                                        </tr>
                                                                                        """),format.raw/*114.225*/("""
                                                                                            """),format.raw/*115.124*/("""
                                                                                            """),format.raw/*116.128*/("""
                                                                                            """),format.raw/*117.200*/("""
                                                                                            """),format.raw/*118.122*/("""
                                                                                        """),format.raw/*119.98*/("""
                                                                                        """),format.raw/*120.174*/("""
                                                                                            """),format.raw/*121.124*/("""
                                                                                            """),format.raw/*122.128*/("""
                                                                                            """),format.raw/*123.146*/("""
                                                                                            """),format.raw/*124.122*/("""
                                                                                        """),format.raw/*125.98*/("""
                                                                                        """),format.raw/*126.174*/("""
                                                                                            """),format.raw/*127.124*/("""
                                                                                            """),format.raw/*128.128*/("""
                                                                                            """),format.raw/*129.166*/("""
                                                                                            """),format.raw/*130.122*/("""
                                                                                        """),format.raw/*131.98*/("""
                                                                                    """),format.raw/*132.85*/("""</tbody>
                                                                                </table>
                                                                                <div ng-jsoneditor="onLoad" ng-model="scenarioSwaggerDoc.paths[ScenarioApiInfo.pathUrl][ScenarioApiInfo.httpMethod.toLowerCase()].parameters" options="parameters_tree.options" style="height: 250px;"></div>
                                                                            </div>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="col-md-6" id="scenarioApiChecks_"""),format.raw/*141.101*/("""{"""),format.raw/*141.102*/("""{"""),format.raw/*141.103*/("""orderNum"""),format.raw/*141.111*/("""}"""),format.raw/*141.112*/("""}"""),format.raw/*141.113*/("""">
                                                            <div class="input-group margin">
                                                                <input type="text" class="btn btn-block btn-instagram" value="CHECKS" ng-readonly="true">
                                                                <span class="input-group-btn">
                                                                    <button class="btn btn-info btn-flat" type="button" ng-click="addChecks(orderNum)">ADD</button>
                                                                </span>
                                                            </div>

                                                            """),format.raw/*149.138*/("""
                                                            """),format.raw/*150.61*/("""<div id="panel_checks_"""),format.raw/*150.83*/("""{"""),format.raw/*150.84*/("""{"""),format.raw/*150.85*/("""orderNum"""),format.raw/*150.93*/("""}"""),format.raw/*150.94*/("""}"""),format.raw/*150.95*/("""">

                                                            <div>
                                                                    <div>
                                                                        <a data-toggle="collapse" data-parent="#panel_checks_"""),format.raw/*154.126*/("""{"""),format.raw/*154.127*/("""{"""),format.raw/*154.128*/("""orderNum"""),format.raw/*154.136*/("""}"""),format.raw/*154.137*/("""}"""),format.raw/*154.138*/("""" href="#panel-element_checks_"""),format.raw/*154.168*/("""{"""),format.raw/*154.169*/("""{"""),format.raw/*154.170*/("""orderNum"""),format.raw/*154.178*/("""}"""),format.raw/*154.179*/("""}"""),format.raw/*154.180*/("""">
                                                                            <div class="input-group margin" >
                                                                                <span class="input-group-btn">
                                                                                    <button class="btn btn-info btn-flat" type="button">C</button>
                                                                                </span>
                                                                                <input type="text" class="form-control" value=""""),format.raw/*159.128*/("""{"""),format.raw/*159.129*/("""{"""),format.raw/*159.130*/("""ScenarioApiInfo.checks"""),format.raw/*159.152*/("""}"""),format.raw/*159.153*/("""}"""),format.raw/*159.154*/("""" ng-readonly="true">
                                                                            </div>
                                                                        </a>
                                                                    </div>
                                                                    <div id="panel-element_checks_"""),format.raw/*163.99*/("""{"""),format.raw/*163.100*/("""{"""),format.raw/*163.101*/("""orderNum"""),format.raw/*163.109*/("""}"""),format.raw/*163.110*/("""}"""),format.raw/*163.111*/("""" class="panel-collapse collapse">
                                                                        <div class="margin">
                                                                            <table class="table table-condensed" id="myChecks_"""),format.raw/*165.127*/("""{"""),format.raw/*165.128*/("""{"""),format.raw/*165.129*/("""orderNum"""),format.raw/*165.137*/("""}"""),format.raw/*165.138*/("""}"""),format.raw/*165.139*/("""">
                                                                                <tbody>
                                                                                    <tr class="btn-instagram">
                                                                                        <th>Field Name</th>
                                                                                        <th>Method</th>
                                                                                        <th>Target Field</th>
                                                                                        <th>Expect</th>
                                                                                    </tr>
                                                                                    <tr ng-repeat="check in ScenarioApiInfo.checks">
                                                                                        <td class="col-md-3"><input type="text" class="form-control" value=""""),format.raw/*174.157*/("""{"""),format.raw/*174.158*/("""{"""),format.raw/*174.159*/("""check.field"""),format.raw/*174.170*/("""}"""),format.raw/*174.171*/("""}"""),format.raw/*174.172*/(""""></td>
                                                                                        <td>
                                                                                            <select id="CheckMethodSelect" class="form-control select2" style="width: 100%;" ng-model="SchemeSelect">
                                                                                                <option ng-selected="true">"""),format.raw/*177.124*/("""{"""),format.raw/*177.125*/("""{"""),format.raw/*177.126*/("""check.checkMethod"""),format.raw/*177.143*/("""}"""),format.raw/*177.144*/("""}"""),format.raw/*177.145*/("""</option>
                                                                                                <option>Save</option>
                                                                                                <option>Equal</option>
                                                                                                <option>Contain</option>
                                                                                                <option>IsNull</option>
                                                                                                <option>IsNotContain</option>
                                                                                                <option>HasItem</option>
                                                                                                <option>DoNotHasItem</option>
                                                                                            </select>
                                                                                        </td>
                                                                                        <td class="col-md-3"><input type="text" class="form-control" value=""""),format.raw/*187.157*/("""{"""),format.raw/*187.158*/("""{"""),format.raw/*187.159*/("""check.targetField"""),format.raw/*187.176*/("""}"""),format.raw/*187.177*/("""}"""),format.raw/*187.178*/(""""></td>
                                                                                        <td class="col-md-3"><input type="text" class="form-control" value=""""),format.raw/*188.157*/("""{"""),format.raw/*188.158*/("""{"""),format.raw/*188.159*/("""check.expect"""),format.raw/*188.171*/("""}"""),format.raw/*188.172*/("""}"""),format.raw/*188.173*/(""""></td>
                                                                                    </tr>
                                                                                </tbody>
                                                                            </table>
                                                                            """),format.raw/*192.196*/("""
                                                                        """),format.raw/*193.73*/("""</div>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>

                                                    </div>
                                                    """),format.raw/*200.74*/("""
                                                        """),format.raw/*201.84*/("""
                                                            """),format.raw/*202.97*/("""
                                                                """),format.raw/*203.160*/("""
                                                                """),format.raw/*204.99*/("""
                                                                    """),format.raw/*205.153*/("""
                                                                """),format.raw/*206.76*/("""
                                                            """),format.raw/*207.71*/("""
                                                            """),format.raw/*208.122*/("""
                                                                """),format.raw/*209.73*/("""
                                                                    """),format.raw/*210.96*/("""
                                                                        """),format.raw/*211.129*/("""
                                                                    """),format.raw/*212.78*/("""
                                                                """),format.raw/*213.74*/("""
                                                            """),format.raw/*214.73*/("""
                                                        """),format.raw/*215.67*/("""
                                                    """),format.raw/*216.63*/("""

                                                """),format.raw/*218.49*/("""</div>
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
object content4 extends content4_Scope0.content4
              /*
                  -- GENERATED --
                  DATE: Sun Jun 12 16:15:15 CST 2016
                  SOURCE: /Users/apple/Documents/PRO/ApiIntelligenceRobot/app/views/scenarios/view/content4.scala.html
                  HASH: fd71e013d30d3fa9127b80a64baa62dbdaaf9e0a
                  MATRIX: 848->0|960->86|988->87|1016->88|1066->111|1094->112|1122->113|1157->122|1191->129|1219->130|1247->131|1302->159|1330->160|1358->161|2919->1693|2949->1694|2979->1695|3016->1703|3046->1704|3076->1705|3182->1783|3211->1784|3240->1785|3276->1793|3305->1794|3334->1795|3445->1878|3474->1879|3503->1880|3631->1979|3661->1980|3691->1981|3802->2064|3831->2065|3860->2066|3915->2092|3945->2093|3975->2094|4069->2160|4098->2161|4127->2162|4177->2184|4206->2185|4235->2186|4266->2189|4295->2190|4324->2191|4373->2211|4403->2212|4433->2213|4463->2214|4493->2215|4546->2239|4576->2240|4606->2241|4636->2242|4666->2243|4718->2266|4748->2267|4778->2268|4985->2447|5014->2448|5043->2449|5079->2457|5108->2458|5137->2459|6401->3695|6430->3696|6459->3697|6496->3705|6526->3706|6556->3707|6792->3948|6889->4017|7491->4591|7520->4592|7549->4593|7585->4601|7614->4602|7643->4603|7714->4645|7744->4646|7774->4647|7823->4667|7853->4668|7883->4669|8479->5237|8508->5238|8537->5239|8573->5247|8602->5248|8631->5249|8721->5310|8751->5311|8781->5312|8834->5336|8864->5337|8894->5338|8924->5339|8954->5340|9006->5363|9036->5364|9066->5365|9256->5527|9285->5528|9314->5529|9350->5537|9379->5538|9408->5539|9751->5853|9781->5854|9811->5855|9848->5863|9878->5864|9908->5865|10527->6455|10557->6456|10587->6457|10624->6465|10654->6466|10684->6467|10749->6503|10779->6504|10826->6522|10856->6523|10894->6532|10924->6533|10954->6534|11006->6557|11036->6558|11066->6559|11576->7041|11605->7042|11634->7043|11670->7051|11699->7052|11728->7053|12158->7454|12188->7455|12218->7456|12255->7464|12285->7465|12315->7466|12374->7496|12404->7497|12434->7498|12471->7506|12501->7507|12531->7508|13185->8133|13215->8134|13245->8135|13376->8237|13406->8238|13436->8239|13817->8591|13847->8592|13877->8593|13914->8601|13944->8602|13974->8603|14267->8866|14298->8867|14329->8868|14367->8876|14398->8877|14429->8878|14873->9313|14995->9406|15494->9876|15524->9877|15554->9878|15599->9893|15630->9894|15661->9895|15789->10024|15911->10117|15992->10168|16023->10169|16054->10170|16100->10186|16131->10187|16162->10188|16295->10292|16325->10293|16355->10294|16398->10307|16429->10308|16460->10309|16678->10633|16801->10757|16924->10885|17047->11085|17170->11207|17288->11305|17407->11479|17530->11603|17653->11731|17776->11877|17899->11999|18017->12097|18136->12271|18259->12395|18382->12523|18505->12689|18628->12811|18746->12909|18860->12994|19812->13916|19843->13917|19874->13918|19912->13926|19943->13927|19974->13928|20713->14714|20803->14775|20854->14797|20884->14798|20914->14799|20951->14807|20981->14808|21011->14809|21310->15078|21341->15079|21372->15080|21410->15088|21441->15089|21472->15090|21532->15120|21563->15121|21594->15122|21632->15130|21663->15131|21694->15132|22310->15718|22341->15719|22372->15720|22424->15742|22455->15743|22486->15744|22870->16099|22901->16100|22932->16101|22970->16109|23001->16110|23032->16111|23316->16365|23347->16366|23378->16367|23416->16375|23447->16376|23478->16377|24515->17384|24546->17385|24577->17386|24618->17397|24649->17398|24680->17399|25132->17821|25163->17822|25194->17823|25241->17840|25272->17841|25303->17842|26546->19055|26577->19056|26608->19057|26655->19074|26686->19075|26717->19076|26911->19240|26942->19241|26973->19242|27015->19254|27046->19255|27077->19256|27455->19723|27557->19796|27981->20212|28067->20296|28157->20393|28252->20553|28346->20652|28445->20805|28539->20881|28629->20952|28720->21074|28814->21147|28912->21243|29015->21372|29113->21450|29207->21524|29297->21597|29383->21664|29465->21727|29544->21777
                  LINES: 32->1|34->3|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|35->4|35->4|35->4|61->30|61->30|61->30|61->30|61->30|61->30|62->31|62->31|62->31|62->31|62->31|62->31|63->32|63->32|63->32|63->32|63->32|63->32|64->33|64->33|64->33|64->33|64->33|64->33|65->34|65->34|65->34|65->34|65->34|65->34|65->34|65->34|65->34|65->34|65->34|65->34|65->34|65->34|65->34|65->34|65->34|65->34|65->34|65->34|65->34|65->34|68->37|68->37|68->37|68->37|68->37|68->37|83->52|83->52|83->52|83->52|83->52|83->52|84->53|85->54|91->60|91->60|91->60|91->60|91->60|91->60|91->60|91->60|91->60|91->60|91->60|91->60|98->67|98->67|98->67|98->67|98->67|98->67|98->67|98->67|98->67|98->67|98->67|98->67|98->67|98->67|98->67|98->67|98->67|102->71|102->71|102->71|102->71|102->71|102->71|105->74|105->74|105->74|105->74|105->74|105->74|110->79|110->79|110->79|110->79|110->79|110->79|110->79|110->79|110->79|110->79|110->79|110->79|110->79|110->79|110->79|110->79|116->85|116->85|116->85|116->85|116->85|116->85|119->88|119->88|119->88|119->88|119->88|119->88|119->88|119->88|119->88|119->88|119->88|119->88|124->93|124->93|124->93|124->93|124->93|124->93|128->97|128->97|128->97|128->97|128->97|128->97|131->100|131->100|131->100|131->100|131->100|131->100|135->104|136->105|140->109|140->109|140->109|140->109|140->109|140->109|141->110|142->111|142->111|142->111|142->111|142->111|142->111|142->111|143->112|143->112|143->112|143->112|143->112|143->112|145->114|146->115|147->116|148->117|149->118|150->119|151->120|152->121|153->122|154->123|155->124|156->125|157->126|158->127|159->128|160->129|161->130|162->131|163->132|172->141|172->141|172->141|172->141|172->141|172->141|180->149|181->150|181->150|181->150|181->150|181->150|181->150|181->150|185->154|185->154|185->154|185->154|185->154|185->154|185->154|185->154|185->154|185->154|185->154|185->154|190->159|190->159|190->159|190->159|190->159|190->159|194->163|194->163|194->163|194->163|194->163|194->163|196->165|196->165|196->165|196->165|196->165|196->165|205->174|205->174|205->174|205->174|205->174|205->174|208->177|208->177|208->177|208->177|208->177|208->177|218->187|218->187|218->187|218->187|218->187|218->187|219->188|219->188|219->188|219->188|219->188|219->188|223->192|224->193|231->200|232->201|233->202|234->203|235->204|236->205|237->206|238->207|239->208|240->209|241->210|242->211|243->212|244->213|245->214|246->215|247->216|249->218
                  -- GENERATED --
              */
          