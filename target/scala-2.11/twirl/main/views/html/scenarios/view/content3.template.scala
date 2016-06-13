
package views.html.scenarios.view

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object content3_Scope0 {
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

class content3 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
                    <button class="btn btn-info btn-flat right" type="button" data-toggle="modal" data-target="#myAdd" ng-click="getApis(scenarioDocInit._id)">Edit</button>
                    <button class="btn btn-info btn-flat right" type="button" ng-click="runTask('scenario.get_id()')">RUN</button>
                    <button class="btn btn-info btn-flat right" type="button" data-toggle="modal" data-target="#myTask" ng-click="viewTasks()">Tasks</button>
                    <button class="btn btn-info btn-flat right" type="button"  ng-click="viewResult('scenario.get_id()')">Result</button>
                </div><!-- /.box-header -->
                <div class="box-body">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-md-12">
                                <h1 ng-if="scenarioDocInit.swagger.paths == null">Nothing to display</h1>
                                <div ng-if="scenarioDocInit.swagger.paths != null" class="panel-group" id="panel">
                                    <div ng-repeat="(urlPath,Path) in scenarioDocInit.swagger.paths">
                                        <div ng-repeat="(httpMethod,Operation) in Path">
                                    <div class="panel panel-default">
                                            <div class="panel-heading">
                                                <a class="panel-title collapsed" data-toggle="collapse" data-parent="#panel" href="#panel-element_"""),format.raw/*34.147*/("""{"""),format.raw/*34.148*/("""{"""),format.raw/*34.149*/("""$parent.$index"""),format.raw/*34.163*/("""}"""),format.raw/*34.164*/("""}"""),format.raw/*34.165*/("""{"""),format.raw/*34.166*/("""{"""),format.raw/*34.167*/("""$index"""),format.raw/*34.173*/("""}"""),format.raw/*34.174*/("""}"""),format.raw/*34.175*/("""">
                                                    <span class="col-lg-1">"""),format.raw/*35.76*/("""{"""),format.raw/*35.77*/("""{"""),format.raw/*35.78*/("""$parent.$index"""),format.raw/*35.92*/("""}"""),format.raw/*35.93*/("""}"""),format.raw/*35.94*/("""{"""),format.raw/*35.95*/("""{"""),format.raw/*35.96*/("""$index"""),format.raw/*35.102*/("""}"""),format.raw/*35.103*/("""}"""),format.raw/*35.104*/("""</span>
                                                    <span class="col-lg-4">"""),format.raw/*36.76*/("""{"""),format.raw/*36.77*/("""{"""),format.raw/*36.78*/("""Operation.summary"""),format.raw/*36.95*/("""}"""),format.raw/*36.96*/("""}"""),format.raw/*36.97*/("""</span>
                                                    <span class="col-lg-1">"""),format.raw/*37.76*/("""{"""),format.raw/*37.77*/("""{"""),format.raw/*37.78*/("""httpMethod"""),format.raw/*37.88*/("""}"""),format.raw/*37.89*/("""}"""),format.raw/*37.90*/("""</span>
                                                    <span>http://"""),format.raw/*38.66*/("""{"""),format.raw/*38.67*/("""{"""),format.raw/*38.68*/("""scenarioDocInit.swagger.host"""),format.raw/*38.96*/("""}"""),format.raw/*38.97*/("""}"""),format.raw/*38.98*/("""{"""),format.raw/*38.99*/("""{"""),format.raw/*38.100*/("""scenarioDocInit.swagger.basePath"""),format.raw/*38.132*/("""}"""),format.raw/*38.133*/("""}"""),format.raw/*38.134*/("""{"""),format.raw/*38.135*/("""{"""),format.raw/*38.136*/("""urlPath"""),format.raw/*38.143*/("""}"""),format.raw/*38.144*/("""}"""),format.raw/*38.145*/("""</span>
                                                </a>
                                            </div>
                                            <div id="panel-element_"""),format.raw/*41.68*/("""{"""),format.raw/*41.69*/("""{"""),format.raw/*41.70*/("""$parent.$index"""),format.raw/*41.84*/("""}"""),format.raw/*41.85*/("""}"""),format.raw/*41.86*/("""{"""),format.raw/*41.87*/("""{"""),format.raw/*41.88*/("""$index"""),format.raw/*41.94*/("""}"""),format.raw/*41.95*/("""}"""),format.raw/*41.96*/("""" class="panel-collapse collapse">
                                                <div class="panel-body">

                                                    <div class="row">
                                                        <div class="col-md-6">
                                                            <div>
                                                                <div class="input-group margin">
                                                                    <input type="text" class="btn btn-block btn-instagram" value="REQUEST" ng-readonly="true">
                                                                    <span class="input-group-btn">
                                                                        <button class="btn btn-info btn-flat" type="button" ng-click="SendRequest(scenarioDocInit._id,httpMethod,$parent.$index,$index)">Go!</button>
                                                                        """),format.raw/*51.219*/("""

                                                                    """),format.raw/*53.69*/("""</span>
                                                                </div>


                                                                <div class="margin">
                                                                    <select id="myScheme_"""),format.raw/*58.90*/("""{"""),format.raw/*58.91*/("""{"""),format.raw/*58.92*/("""$parent.$index"""),format.raw/*58.106*/("""}"""),format.raw/*58.107*/("""}"""),format.raw/*58.108*/("""{"""),format.raw/*58.109*/("""{"""),format.raw/*58.110*/("""$index"""),format.raw/*58.116*/("""}"""),format.raw/*58.117*/("""}"""),format.raw/*58.118*/("""" ng-model="myScheme" ng-options="myScheme for myScheme in scenarioDocInit.swagger.schemes" class="form-control select2" style="width: 100%;">
                                                                        <option >scheme</option>
                                                                    </select>

                                                                </div>

                                                                <div class="input-group margin">
                                                                    <span class="input-group-btn">
                                                                        <button class="btn btn-info btn-flat" type="button">U</button>
                                                                    </span>
                                                                    <input id="myUrl_"""),format.raw/*68.86*/("""{"""),format.raw/*68.87*/("""{"""),format.raw/*68.88*/("""$parent.$index"""),format.raw/*68.102*/("""}"""),format.raw/*68.103*/("""}"""),format.raw/*68.104*/("""{"""),format.raw/*68.105*/("""{"""),format.raw/*68.106*/("""$index"""),format.raw/*68.112*/("""}"""),format.raw/*68.113*/("""}"""),format.raw/*68.114*/("""" type="text" class="form-control" value=""""),format.raw/*68.156*/("""{"""),format.raw/*68.157*/("""{"""),format.raw/*68.158*/("""scenarioDocInit.swagger.basePath"""),format.raw/*68.190*/("""}"""),format.raw/*68.191*/("""}"""),format.raw/*68.192*/("""{"""),format.raw/*68.193*/("""{"""),format.raw/*68.194*/("""urlPath"""),format.raw/*68.201*/("""}"""),format.raw/*68.202*/("""}"""),format.raw/*68.203*/("""">
                                                                </div>

                                                                <div id="panel_header_"""),format.raw/*71.87*/("""{"""),format.raw/*71.88*/("""{"""),format.raw/*71.89*/("""$parent.$index"""),format.raw/*71.103*/("""}"""),format.raw/*71.104*/("""}"""),format.raw/*71.105*/("""{"""),format.raw/*71.106*/("""{"""),format.raw/*71.107*/("""$index"""),format.raw/*71.113*/("""}"""),format.raw/*71.114*/("""}"""),format.raw/*71.115*/("""" >
                                                                    <div>
                                                                        <div>
                                                                            <a data-toggle="collapse" data-parent="#panel_header" href="#panel-element_header_"""),format.raw/*74.159*/("""{"""),format.raw/*74.160*/("""{"""),format.raw/*74.161*/("""$parent.$index"""),format.raw/*74.175*/("""}"""),format.raw/*74.176*/("""}"""),format.raw/*74.177*/("""{"""),format.raw/*74.178*/("""{"""),format.raw/*74.179*/("""$index"""),format.raw/*74.185*/("""}"""),format.raw/*74.186*/("""}"""),format.raw/*74.187*/("""">
                                                                                <div class="input-group margin">
                                                                                    <span class="input-group-btn">
                                                                                        <button class="btn btn-info btn-flat" type="button">H</button>
                                                                                    </span>
                                                                                    <input type="text" class="form-control" value="scenarioAPI.getHeaderParameters.toString">
                                                                                </div>
                                                                            </a>
                                                                        </div>
                                                                        <div id="panel-element_header_"""),format.raw/*83.103*/("""{"""),format.raw/*83.104*/("""{"""),format.raw/*83.105*/("""$parent.$index"""),format.raw/*83.119*/("""}"""),format.raw/*83.120*/("""}"""),format.raw/*83.121*/("""{"""),format.raw/*83.122*/("""{"""),format.raw/*83.123*/("""$index"""),format.raw/*83.129*/("""}"""),format.raw/*83.130*/("""}"""),format.raw/*83.131*/("""" class="panel-collapse collapse">
                                                                            <div class="margin">
                                                                                <table class="table table-condensed" id="myHeader_"""),format.raw/*85.131*/("""{"""),format.raw/*85.132*/("""{"""),format.raw/*85.133*/("""$parent.$index"""),format.raw/*85.147*/("""}"""),format.raw/*85.148*/("""}"""),format.raw/*85.149*/("""{"""),format.raw/*85.150*/("""{"""),format.raw/*85.151*/("""$index"""),format.raw/*85.157*/("""}"""),format.raw/*85.158*/("""}"""),format.raw/*85.159*/("""">
                                                                                    <tbody>
                                                                                        <tr class="btn-instagram">
                                                                                            <th>Param Name</th>
                                                                                            <th>Description</th>
                                                                                            <th>Param Value</th>
                                                                                            <th>Param Type</th>
                                                                                        </tr>
                                                                                        """),format.raw/*93.139*/("""
                                                                                            """),format.raw/*94.93*/("""<tr>
                                                                                                <td>header.getName</td>
                                                                                                <td>header.getDescription</td>
                                                                                                <td><input type="text" value="header.getDefaultValue"></td>
                                                                                                <td>header.getIn</td>
                                                                                            </tr>
                                                                                        """),format.raw/*100.94*/("""
                                                                                    """),format.raw/*101.85*/("""</tbody>
                                                                                </table>
                                                                            </div>
                                                                        </div>
                                                                    </div>
                                                                </div>

                                                                <div id="panel_params_"""),format.raw/*108.87*/("""{"""),format.raw/*108.88*/("""{"""),format.raw/*108.89*/("""$parent.$index"""),format.raw/*108.103*/("""}"""),format.raw/*108.104*/("""}"""),format.raw/*108.105*/("""{"""),format.raw/*108.106*/("""{"""),format.raw/*108.107*/("""$index"""),format.raw/*108.113*/("""}"""),format.raw/*108.114*/("""}"""),format.raw/*108.115*/("""" ng-hide="scenarioAPI.getQueryParameters.toString==''">
                                                                    <div>
                                                                        <div>
                                                                            <a data-toggle="collapse" data-parent="#panel_params_"""),format.raw/*111.130*/("""{"""),format.raw/*111.131*/("""{"""),format.raw/*111.132*/("""$parent.$index"""),format.raw/*111.146*/("""}"""),format.raw/*111.147*/("""}"""),format.raw/*111.148*/("""{"""),format.raw/*111.149*/("""{"""),format.raw/*111.150*/("""$index"""),format.raw/*111.156*/("""}"""),format.raw/*111.157*/("""}"""),format.raw/*111.158*/("""" href="#panel-element_params_"""),format.raw/*111.188*/("""{"""),format.raw/*111.189*/("""{"""),format.raw/*111.190*/("""$parent.$index"""),format.raw/*111.204*/("""}"""),format.raw/*111.205*/("""}"""),format.raw/*111.206*/("""{"""),format.raw/*111.207*/("""{"""),format.raw/*111.208*/("""$index"""),format.raw/*111.214*/("""}"""),format.raw/*111.215*/("""}"""),format.raw/*111.216*/("""">
                                                                                <div class="input-group margin" >
                                                                                    <span class="input-group-btn">
                                                                                        <button class="btn btn-info btn-flat" type="button">Q</button>
                                                                                    </span>
                                                                                    <input type="text" class="form-control" value=""""),format.raw/*116.132*/("""{"""),format.raw/*116.133*/("""{"""),format.raw/*116.134*/("""Operation.parameters"""),format.raw/*116.154*/("""}"""),format.raw/*116.155*/("""}"""),format.raw/*116.156*/("""">
                                                                                </div>
                                                                            </a>
                                                                        </div>
                                                                        <div id="panel-element_params_"""),format.raw/*120.103*/("""{"""),format.raw/*120.104*/("""{"""),format.raw/*120.105*/("""$parent.$index"""),format.raw/*120.119*/("""}"""),format.raw/*120.120*/("""}"""),format.raw/*120.121*/("""{"""),format.raw/*120.122*/("""{"""),format.raw/*120.123*/("""$index"""),format.raw/*120.129*/("""}"""),format.raw/*120.130*/("""}"""),format.raw/*120.131*/("""" class="panel-collapse collapse">
                                                                            <div class="margin">

                                                                                <table class="table table-condensed" id="myParams_"""),format.raw/*123.131*/("""{"""),format.raw/*123.132*/("""{"""),format.raw/*123.133*/("""$parent.$index"""),format.raw/*123.147*/("""}"""),format.raw/*123.148*/("""}"""),format.raw/*123.149*/("""{"""),format.raw/*123.150*/("""{"""),format.raw/*123.151*/("""$index"""),format.raw/*123.157*/("""}"""),format.raw/*123.158*/("""}"""),format.raw/*123.159*/("""">
                                                                                    <tbody>
                                                                                        <tr class="btn-instagram">
                                                                                            <th>Param Name</th>
                                                                                            <th>Required</th>
                                                                                            <th>Param Value</th>
                                                                                            <th>Param Type</th>
                                                                                        </tr>
                                                                                        <tr ng-repeat="Parameter in Operation.parameters">
                                                                                            <td>"""),format.raw/*132.97*/("""{"""),format.raw/*132.98*/("""{"""),format.raw/*132.99*/("""Parameter.name"""),format.raw/*132.113*/("""}"""),format.raw/*132.114*/("""}"""),format.raw/*132.115*/("""</td>
                                                                                            <td>"""),format.raw/*133.97*/("""{"""),format.raw/*133.98*/("""{"""),format.raw/*133.99*/("""Parameter.required"""),format.raw/*133.117*/("""}"""),format.raw/*133.118*/("""}"""),format.raw/*133.119*/("""</td>
                                                                                            <td><input class="form-control" type="text"></td>
                                                                                            <td>"""),format.raw/*135.97*/("""{"""),format.raw/*135.98*/("""{"""),format.raw/*135.99*/("""Parameter.in"""),format.raw/*135.111*/("""}"""),format.raw/*135.112*/("""}"""),format.raw/*135.113*/("""</td>
                                                                                        </tr>
                                                                                        """),format.raw/*137.174*/("""
                                                                                            """),format.raw/*138.124*/("""
                                                                                            """),format.raw/*139.128*/("""
                                                                                            """),format.raw/*140.146*/("""
                                                                                            """),format.raw/*141.122*/("""
                                                                                        """),format.raw/*142.98*/("""
                                                                                        """),format.raw/*143.174*/("""
                                                                                            """),format.raw/*144.124*/("""
                                                                                            """),format.raw/*145.128*/("""
                                                                                            """),format.raw/*146.166*/("""
                                                                                            """),format.raw/*147.122*/("""
                                                                                        """),format.raw/*148.98*/("""
                                                                                    """),format.raw/*149.85*/("""</tbody>
                                                                                </table>
                                                                                <div ng-jsoneditor="onLoad" ng-model="Operation.parameters" options="parameters_tree.options" style="height: 250px;"></div>
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
object content3 extends content3_Scope0.content3
              /*
                  -- GENERATED --
                  DATE: Thu Jun 02 15:28:27 CST 2016
                  SOURCE: /Users/apple/Documents/PRO/ApiIntelligenceRobot/app/views/scenarios/view/content3.scala.html
                  HASH: 392030c36cc3f3bb49baa79f944a58b3c44ad3de
                  MATRIX: 848->0|960->86|988->87|1016->88|1066->111|1094->112|1122->113|1157->122|1191->129|1219->130|1247->131|1308->165|1336->166|1364->167|3315->2089|3345->2090|3375->2091|3418->2105|3448->2106|3478->2107|3508->2108|3538->2109|3573->2115|3603->2116|3633->2117|3739->2195|3768->2196|3797->2197|3839->2211|3868->2212|3897->2213|3926->2214|3955->2215|3990->2221|4020->2222|4050->2223|4161->2306|4190->2307|4219->2308|4264->2325|4293->2326|4322->2327|4433->2410|4462->2411|4491->2412|4529->2422|4558->2423|4587->2424|4688->2497|4717->2498|4746->2499|4802->2527|4831->2528|4860->2529|4889->2530|4919->2531|4980->2563|5010->2564|5040->2565|5070->2566|5100->2567|5136->2574|5166->2575|5196->2576|5403->2755|5432->2756|5461->2757|5503->2771|5532->2772|5561->2773|5590->2774|5619->2775|5653->2781|5682->2782|5711->2783|6705->3894|6803->3964|7086->4219|7115->4220|7144->4221|7187->4235|7217->4236|7247->4237|7277->4238|7307->4239|7342->4245|7372->4246|7402->4247|8313->5130|8342->5131|8371->5132|8414->5146|8444->5147|8474->5148|8504->5149|8534->5150|8569->5156|8599->5157|8629->5158|8700->5200|8730->5201|8760->5202|8821->5234|8851->5235|8881->5236|8911->5237|8941->5238|8977->5245|9007->5246|9037->5247|9226->5408|9255->5409|9284->5410|9327->5424|9357->5425|9387->5426|9417->5427|9447->5428|9482->5434|9512->5435|9542->5436|9885->5750|9915->5751|9945->5752|9988->5766|10018->5767|10048->5768|10078->5769|10108->5770|10143->5776|10173->5777|10203->5778|11229->6775|11259->6776|11289->6777|11332->6791|11362->6792|11392->6793|11422->6794|11452->6795|11487->6801|11517->6802|11547->6803|11838->7065|11868->7066|11898->7067|11941->7081|11971->7082|12001->7083|12031->7084|12061->7085|12096->7091|12126->7092|12156->7093|13027->7985|13148->8078|13889->8795|14003->8880|14525->9373|14555->9374|14585->9375|14629->9389|14660->9390|14691->9391|14722->9392|14753->9393|14789->9399|14820->9400|14851->9401|15219->9739|15250->9740|15281->9741|15325->9755|15356->9756|15387->9757|15418->9758|15449->9759|15485->9765|15516->9766|15547->9767|15607->9797|15638->9798|15669->9799|15713->9813|15744->9814|15775->9815|15806->9816|15837->9817|15873->9823|15904->9824|15935->9825|16571->10431|16602->10432|16633->10433|16683->10453|16714->10454|16745->10455|17127->10807|17158->10808|17189->10809|17233->10823|17264->10824|17295->10825|17326->10826|17357->10827|17393->10833|17424->10834|17455->10835|17748->11098|17779->11099|17810->11100|17854->11114|17885->11115|17916->11116|17947->11117|17978->11118|18014->11124|18045->11125|18076->11126|19091->12112|19121->12113|19151->12114|19195->12128|19226->12129|19257->12130|19388->12232|19418->12233|19448->12234|19496->12252|19527->12253|19558->12254|19831->12498|19861->12499|19891->12500|19933->12512|19964->12513|19995->12514|20213->12787|20336->12911|20459->13039|20582->13185|20705->13307|20823->13405|20942->13579|21065->13703|21188->13831|21311->13997|21434->14119|21552->14217|21666->14302
                  LINES: 32->1|34->3|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|35->4|35->4|35->4|65->34|65->34|65->34|65->34|65->34|65->34|65->34|65->34|65->34|65->34|65->34|66->35|66->35|66->35|66->35|66->35|66->35|66->35|66->35|66->35|66->35|66->35|67->36|67->36|67->36|67->36|67->36|67->36|68->37|68->37|68->37|68->37|68->37|68->37|69->38|69->38|69->38|69->38|69->38|69->38|69->38|69->38|69->38|69->38|69->38|69->38|69->38|69->38|69->38|69->38|72->41|72->41|72->41|72->41|72->41|72->41|72->41|72->41|72->41|72->41|72->41|82->51|84->53|89->58|89->58|89->58|89->58|89->58|89->58|89->58|89->58|89->58|89->58|89->58|99->68|99->68|99->68|99->68|99->68|99->68|99->68|99->68|99->68|99->68|99->68|99->68|99->68|99->68|99->68|99->68|99->68|99->68|99->68|99->68|99->68|99->68|102->71|102->71|102->71|102->71|102->71|102->71|102->71|102->71|102->71|102->71|102->71|105->74|105->74|105->74|105->74|105->74|105->74|105->74|105->74|105->74|105->74|105->74|114->83|114->83|114->83|114->83|114->83|114->83|114->83|114->83|114->83|114->83|114->83|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|124->93|125->94|131->100|132->101|139->108|139->108|139->108|139->108|139->108|139->108|139->108|139->108|139->108|139->108|139->108|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|147->116|147->116|147->116|147->116|147->116|147->116|151->120|151->120|151->120|151->120|151->120|151->120|151->120|151->120|151->120|151->120|151->120|154->123|154->123|154->123|154->123|154->123|154->123|154->123|154->123|154->123|154->123|154->123|163->132|163->132|163->132|163->132|163->132|163->132|164->133|164->133|164->133|164->133|164->133|164->133|166->135|166->135|166->135|166->135|166->135|166->135|168->137|169->138|170->139|171->140|172->141|173->142|174->143|175->144|176->145|177->146|178->147|179->148|180->149
                  -- GENERATED --
              */
          