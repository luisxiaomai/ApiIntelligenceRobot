
package views.html.apis.doc

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object content_apiinfo_Scope0 {
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

class content_apiinfo extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!-- Content Header (Page header) -->
    <section class="content-header">
        <h1><b>
            """),format.raw/*4.13*/("""{"""),format.raw/*4.14*/("""{"""),format.raw/*4.15*/("""apiDoc.info.description"""),format.raw/*4.38*/("""}"""),format.raw/*4.39*/("""}"""),format.raw/*4.40*/("""
            """),format.raw/*5.13*/("""<small>"""),format.raw/*5.20*/("""{"""),format.raw/*5.21*/("""{"""),format.raw/*5.22*/("""apiDoc.info.version"""),format.raw/*5.41*/("""}"""),format.raw/*5.42*/("""}"""),format.raw/*5.43*/("""</small>
        </b>
        </h1>
        <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i> """),format.raw/*9.61*/("""{"""),format.raw/*9.62*/("""{"""),format.raw/*9.63*/("""apiDoc.info.title"""),format.raw/*9.80*/("""}"""),format.raw/*9.81*/("""}"""),format.raw/*9.82*/(""" """),format.raw/*9.83*/("""</a></li>
        </ol>
    </section>


    <section class="content">
        <div ng-repeat="(path,operation) in apiDoc.paths">
            <div ng-repeat="(method,apiInfo) in operation">

                <div class="box box-default collapsed-box">
                    <div class="box-header with-border">
                            <span class="col-lg-3">"""),format.raw/*20.52*/("""{"""),format.raw/*20.53*/("""{"""),format.raw/*20.54*/("""apiInfo.summary"""),format.raw/*20.69*/("""}"""),format.raw/*20.70*/("""}"""),format.raw/*20.71*/("""</span>
                            <span class="col-lg-2">"""),format.raw/*21.52*/("""{"""),format.raw/*21.53*/("""{"""),format.raw/*21.54*/("""method"""),format.raw/*21.60*/("""}"""),format.raw/*21.61*/("""}"""),format.raw/*21.62*/("""</span>
                            <span>"""),format.raw/*22.35*/("""{"""),format.raw/*22.36*/("""{"""),format.raw/*22.37*/("""apiDoc.host"""),format.raw/*22.48*/("""}"""),format.raw/*22.49*/("""}"""),format.raw/*22.50*/("""{"""),format.raw/*22.51*/("""{"""),format.raw/*22.52*/("""apiDoc.basePath"""),format.raw/*22.67*/("""}"""),format.raw/*22.68*/("""}"""),format.raw/*22.69*/("""{"""),format.raw/*22.70*/("""{"""),format.raw/*22.71*/("""path"""),format.raw/*22.75*/("""}"""),format.raw/*22.76*/("""}"""),format.raw/*22.77*/("""</span>
                        <div class="box-tools pull-right">
                            <button class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-plus"></i></button>
                        </div> <!-- /.box-tools -->
                    </div> <!-- /.box-header -->
                    <div class="box-body">
                        <h3><b>参数列表:</b></h3>
                        <table style="width: 100%">
                            <thead>
                                <tr>
                                    <th> Name </th>
                                    <th> Type </th>
                                    <th> Required </th>
                                    <th> Description </th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr ng-repeat="paramter in apiInfo.parameters">
                                    <td> """),format.raw/*40.42*/("""{"""),format.raw/*40.43*/("""{"""),format.raw/*40.44*/("""paramter.name"""),format.raw/*40.57*/("""}"""),format.raw/*40.58*/("""}"""),format.raw/*40.59*/(""" """),format.raw/*40.60*/("""</td>
                                    <td> """),format.raw/*41.42*/("""{"""),format.raw/*41.43*/("""{"""),format.raw/*41.44*/("""paramter.type"""),format.raw/*41.57*/("""}"""),format.raw/*41.58*/("""}"""),format.raw/*41.59*/(""" """),format.raw/*41.60*/("""</td>
                                    <td> """),format.raw/*42.42*/("""{"""),format.raw/*42.43*/("""{"""),format.raw/*42.44*/("""paramter.required"""),format.raw/*42.61*/("""}"""),format.raw/*42.62*/("""}"""),format.raw/*42.63*/(""" """),format.raw/*42.64*/("""</td>
                                    <td> """),format.raw/*43.42*/("""{"""),format.raw/*43.43*/("""{"""),format.raw/*43.44*/("""paramter.description"""),format.raw/*43.64*/("""}"""),format.raw/*43.65*/("""}"""),format.raw/*43.66*/(""" """),format.raw/*43.67*/("""</td>
                                </tr>
                            </tbody>
                        </table>

                        <h3><b>返回格式:</b></h3>
                        <pre class="hierarchy bring-up">
                            <code class="language-bash" data-lang="bash">"""),format.raw/*50.74*/("""{"""),format.raw/*50.75*/("""{"""),format.raw/*50.76*/("""apiInfo.responses | json"""),format.raw/*50.100*/("""}"""),format.raw/*50.101*/("""}"""),format.raw/*50.102*/("""</code>
                        </pre>
                    </div> <!-- /.box-body -->
                </div> <!-- /.box -->
            </div>
        </div>
    </section> <!-- /.content -->


    <!-- Main content -->
    <!--
    <section class="content">
        <div ng-repeat="(path,operation) in apiDoc.paths">
            <div ng-repeat="(method,apiInfo) in operation">
                <pre class="hierarchy bring-up"><b>"""),format.raw/*64.52*/("""{"""),format.raw/*64.53*/("""{"""),format.raw/*64.54*/("""apiInfo.summary"""),format.raw/*64.69*/("""}"""),format.raw/*64.70*/("""}"""),format.raw/*64.71*/("""</b> <strong>"""),format.raw/*64.84*/("""{"""),format.raw/*64.85*/("""{"""),format.raw/*64.86*/("""method"""),format.raw/*64.92*/("""}"""),format.raw/*64.93*/("""}"""),format.raw/*64.94*/("""</strong>
                    """),format.raw/*65.21*/("""{"""),format.raw/*65.22*/("""{"""),format.raw/*65.23*/("""apiDoc.host"""),format.raw/*65.34*/("""}"""),format.raw/*65.35*/("""}"""),format.raw/*65.36*/("""{"""),format.raw/*65.37*/("""{"""),format.raw/*65.38*/("""apiDoc.basePath"""),format.raw/*65.53*/("""}"""),format.raw/*65.54*/("""}"""),format.raw/*65.55*/("""{"""),format.raw/*65.56*/("""{"""),format.raw/*65.57*/("""path"""),format.raw/*65.61*/("""}"""),format.raw/*65.62*/("""}"""),format.raw/*65.63*/("""</pre>
                <h3><b>参数列表:</b></h3>
                <table style="width: 100%">
                    <thead>
                        <tr>
                            <th> Name </th>
                            <th> Type </th>
                            <th> Required </th>
                            <th> Description </th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr ng-repeat="paramter in apiInfo.parameters">
                            <td> """),format.raw/*78.34*/("""{"""),format.raw/*78.35*/("""{"""),format.raw/*78.36*/("""paramter.name"""),format.raw/*78.49*/("""}"""),format.raw/*78.50*/("""}"""),format.raw/*78.51*/(""" """),format.raw/*78.52*/("""</td>
                            <td> """),format.raw/*79.34*/("""{"""),format.raw/*79.35*/("""{"""),format.raw/*79.36*/("""paramter.type"""),format.raw/*79.49*/("""}"""),format.raw/*79.50*/("""}"""),format.raw/*79.51*/(""" """),format.raw/*79.52*/("""</td>
                            <td> """),format.raw/*80.34*/("""{"""),format.raw/*80.35*/("""{"""),format.raw/*80.36*/("""paramter.required"""),format.raw/*80.53*/("""}"""),format.raw/*80.54*/("""}"""),format.raw/*80.55*/(""" """),format.raw/*80.56*/("""</td>
                            <td> """),format.raw/*81.34*/("""{"""),format.raw/*81.35*/("""{"""),format.raw/*81.36*/("""paramter.description"""),format.raw/*81.56*/("""}"""),format.raw/*81.57*/("""}"""),format.raw/*81.58*/(""" """),format.raw/*81.59*/("""</td>
                        </tr>
                    </tbody>
                </table>

                <h3><b>返回格式:</b></h3>
                <pre class="hierarchy bring-up">
                    <code class="language-bash" data-lang="bash">"""),format.raw/*88.66*/("""{"""),format.raw/*88.67*/("""{"""),format.raw/*88.68*/("""apiInfo.responses | json"""),format.raw/*88.92*/("""}"""),format.raw/*88.93*/("""}"""),format.raw/*88.94*/("""</code>
                </pre>
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
object content_apiinfo extends content_apiinfo_Scope0.content_apiinfo
              /*
                  -- GENERATED --
                  DATE: Mon Jun 13 15:19:27 CST 2016
                  SOURCE: /Users/apple/Documents/PRO/ApiIntelligenceRobot/app/views/apis/doc/content_apiinfo.scala.html
                  HASH: e1c4e1165a40939da193f07255bdcf0a42d53bb6
                  MATRIX: 856->0|986->103|1014->104|1042->105|1092->128|1120->129|1148->130|1188->143|1222->150|1250->151|1278->152|1324->171|1352->172|1380->173|1535->301|1563->302|1591->303|1635->320|1663->321|1691->322|1719->323|2106->682|2135->683|2164->684|2207->699|2236->700|2265->701|2352->760|2381->761|2410->762|2444->768|2473->769|2502->770|2572->812|2601->813|2630->814|2669->825|2698->826|2727->827|2756->828|2785->829|2828->844|2857->845|2886->846|2915->847|2944->848|2976->852|3005->853|3034->854|4015->1807|4044->1808|4073->1809|4114->1822|4143->1823|4172->1824|4201->1825|4276->1872|4305->1873|4334->1874|4375->1887|4404->1888|4433->1889|4462->1890|4537->1937|4566->1938|4595->1939|4640->1956|4669->1957|4698->1958|4727->1959|4802->2006|4831->2007|4860->2008|4908->2028|4937->2029|4966->2030|4995->2031|5314->2322|5343->2323|5372->2324|5425->2348|5455->2349|5485->2350|5942->2779|5971->2780|6000->2781|6043->2796|6072->2797|6101->2798|6142->2811|6171->2812|6200->2813|6234->2819|6263->2820|6292->2821|6350->2851|6379->2852|6408->2853|6447->2864|6476->2865|6505->2866|6534->2867|6563->2868|6606->2883|6635->2884|6664->2885|6693->2886|6722->2887|6754->2891|6783->2892|6812->2893|7365->3418|7394->3419|7423->3420|7464->3433|7493->3434|7522->3435|7551->3436|7618->3475|7647->3476|7676->3477|7717->3490|7746->3491|7775->3492|7804->3493|7871->3532|7900->3533|7929->3534|7974->3551|8003->3552|8032->3553|8061->3554|8128->3593|8157->3594|8186->3595|8234->3615|8263->3616|8292->3617|8321->3618|8592->3861|8621->3862|8650->3863|8702->3887|8731->3888|8760->3889
                  LINES: 32->1|35->4|35->4|35->4|35->4|35->4|35->4|36->5|36->5|36->5|36->5|36->5|36->5|36->5|40->9|40->9|40->9|40->9|40->9|40->9|40->9|51->20|51->20|51->20|51->20|51->20|51->20|52->21|52->21|52->21|52->21|52->21|52->21|53->22|53->22|53->22|53->22|53->22|53->22|53->22|53->22|53->22|53->22|53->22|53->22|53->22|53->22|53->22|53->22|71->40|71->40|71->40|71->40|71->40|71->40|71->40|72->41|72->41|72->41|72->41|72->41|72->41|72->41|73->42|73->42|73->42|73->42|73->42|73->42|73->42|74->43|74->43|74->43|74->43|74->43|74->43|74->43|81->50|81->50|81->50|81->50|81->50|81->50|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|96->65|96->65|96->65|96->65|96->65|96->65|96->65|96->65|96->65|96->65|96->65|96->65|96->65|96->65|96->65|96->65|109->78|109->78|109->78|109->78|109->78|109->78|109->78|110->79|110->79|110->79|110->79|110->79|110->79|110->79|111->80|111->80|111->80|111->80|111->80|111->80|111->80|112->81|112->81|112->81|112->81|112->81|112->81|112->81|119->88|119->88|119->88|119->88|119->88|119->88
                  -- GENERATED --
              */
          