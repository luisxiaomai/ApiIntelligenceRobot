
package views.html.scenarios.view

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object modal_rule_Scope0 {
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

class modal_rule extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<div class="modal modal-info" id="myRule" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" data-backdrop="static">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">
                    <span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
                <h4 class="modal-title" id="myModalLabel">RULES</h4>
            </div>
            <div class="modal-body">

                <div class="container-fluid">
                    <div class="row">
                        <div class="col-md-12">
                            <div style="overflow:auto;max-height: 350px">
                                <table id="viewChecks" class="table table-condensed" style="width: 100%">
                                    <tbody>
                                        <tr ng-repeat="check in OrderNumChecks">
                                            <td class="col-md-3"><input type="text" class="form-control" value=""""),format.raw/*19.113*/("""{"""),format.raw/*19.114*/("""{"""),format.raw/*19.115*/("""check.field"""),format.raw/*19.126*/("""}"""),format.raw/*19.127*/("""}"""),format.raw/*19.128*/(""""></td>
                                            <td>
                                                <select id="CheckMethodSelect" class="form-control select2" style="width: 100%;" ng-model="SchemeSelect">
                                                    <option ng-selected="true">"""),format.raw/*22.80*/("""{"""),format.raw/*22.81*/("""{"""),format.raw/*22.82*/("""check.checkMethod"""),format.raw/*22.99*/("""}"""),format.raw/*22.100*/("""}"""),format.raw/*22.101*/("""</option>
                                                    <option>Save</option>
                                                    <option>Equal</option>
                                                    <option>TypeOf</option>
                                                    <option>Diff</option>
                                                    <option>Contain</option>
                                                    <option>Random</option>
                                                </select>
                                            </td>
                                            <td class="col-md-3"><input type="text" class="form-control" value=""""),format.raw/*31.113*/("""{"""),format.raw/*31.114*/("""{"""),format.raw/*31.115*/("""check.targetField"""),format.raw/*31.132*/("""}"""),format.raw/*31.133*/("""}"""),format.raw/*31.134*/(""""></td>
                                            <td class="col-md-3"><input type="text" class="form-control" value=""""),format.raw/*32.113*/("""{"""),format.raw/*32.114*/("""{"""),format.raw/*32.115*/("""check.expect"""),format.raw/*32.127*/("""}"""),format.raw/*32.128*/("""}"""),format.raw/*32.129*/(""""></td>
                                        </tr>
                                        """),format.raw/*34.49*/("""
                                            """),format.raw/*35.65*/("""
                                                """),format.raw/*36.152*/("""
                                                    """),format.raw/*37.99*/("""
                                                    """),format.raw/*38.80*/("""
                                                    """),format.raw/*39.80*/("""
                                                """),format.raw/*40.62*/("""
                                            """),format.raw/*41.54*/("""
                                            """),format.raw/*42.65*/("""
                                                """),format.raw/*43.158*/("""
                                                    """),format.raw/*44.99*/("""
                                                    """),format.raw/*45.80*/("""
                                                    """),format.raw/*46.80*/("""
                                                """),format.raw/*47.62*/("""
                                            """),format.raw/*48.54*/("""
                                            """),format.raw/*49.65*/("""
                                                """),format.raw/*50.158*/("""
                                                    """),format.raw/*51.97*/("""
                                                    """),format.raw/*52.79*/("""
                                                    """),format.raw/*53.80*/("""
                                                    """),format.raw/*54.78*/("""
                                                    """),format.raw/*55.81*/("""
                                                    """),format.raw/*56.80*/("""
                                                """),format.raw/*57.62*/("""
                                            """),format.raw/*58.54*/("""
                                            """),format.raw/*59.65*/("""
                                                """),format.raw/*60.167*/("""
                                                    """),format.raw/*61.78*/("""
                                                    """),format.raw/*62.78*/("""
                                                """),format.raw/*63.62*/("""
                                            """),format.raw/*64.54*/("""
                                        """),format.raw/*65.50*/("""
                                        """),format.raw/*66.49*/("""
                                            """),format.raw/*67.65*/("""
                                                """),format.raw/*68.152*/("""
                                                    """),format.raw/*69.99*/("""
                                                    """),format.raw/*70.80*/("""
                                                    """),format.raw/*71.80*/("""
                                                """),format.raw/*72.62*/("""
                                            """),format.raw/*73.54*/("""
                                            """),format.raw/*74.65*/("""
                                                """),format.raw/*75.158*/("""
                                                    """),format.raw/*76.99*/("""
                                                    """),format.raw/*77.80*/("""
                                                    """),format.raw/*78.80*/("""
                                                """),format.raw/*79.62*/("""
                                            """),format.raw/*80.54*/("""
                                            """),format.raw/*81.65*/("""
                                                """),format.raw/*82.158*/("""
                                                    """),format.raw/*83.97*/("""
                                                    """),format.raw/*84.79*/("""
                                                    """),format.raw/*85.80*/("""
                                                    """),format.raw/*86.78*/("""
                                                    """),format.raw/*87.81*/("""
                                                    """),format.raw/*88.80*/("""
                                                """),format.raw/*89.62*/("""
                                            """),format.raw/*90.54*/("""
                                            """),format.raw/*91.65*/("""
                                                """),format.raw/*92.167*/("""
                                                    """),format.raw/*93.78*/("""
                                                    """),format.raw/*94.78*/("""
                                                """),format.raw/*95.62*/("""
                                            """),format.raw/*96.54*/("""
                                        """),format.raw/*97.50*/("""
                                    """),format.raw/*98.37*/("""</tbody>
                                </table>
                            </div>
                        </div>
                    </div><!-- /.col-md-12 -->
                </div><!-- /.row -->
            </div>

            <div class="modal-footer">
                <button type="button" class="btn btn-outline pull-left" ng-click="addCheck()">Add</button>
                <button type="button" class="btn btn-outline" data-dismiss="modal" ng-click="saveChecks()">Save changes</button>
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
object modal_rule extends modal_rule_Scope0.modal_rule
              /*
                  -- GENERATED --
                  DATE: Thu Jun 02 15:28:27 CST 2016
                  SOURCE: /Users/apple/Documents/PRO/ApiIntelligenceRobot/app/views/scenarios/view/modal_rule.scala.html
                  HASH: 742e32466a1d4987f2980d236a87f473694d5c56
                  MATRIX: 852->1|1992->1112|2022->1113|2052->1114|2092->1125|2122->1126|2152->1127|2470->1417|2499->1418|2528->1419|2573->1436|2603->1437|2633->1438|3344->2120|3374->2121|3404->2122|3450->2139|3480->2140|3510->2141|3659->2261|3689->2262|3719->2263|3760->2275|3790->2276|3820->2277|3942->2379|4015->2444|4093->2596|4174->2695|4255->2775|4336->2855|4413->2917|4486->2971|4559->3036|4637->3194|4718->3293|4799->3373|4880->3453|4957->3515|5030->3569|5103->3634|5181->3792|5262->3889|5343->3968|5424->4048|5505->4126|5586->4207|5667->4287|5744->4349|5817->4403|5890->4468|5968->4635|6049->4713|6130->4791|6207->4853|6280->4907|6349->4957|6418->5006|6491->5071|6569->5223|6650->5322|6731->5402|6812->5482|6889->5544|6962->5598|7035->5663|7113->5821|7194->5920|7275->6000|7356->6080|7433->6142|7506->6196|7579->6261|7657->6419|7738->6516|7819->6595|7900->6675|7981->6753|8062->6834|8143->6914|8220->6976|8293->7030|8366->7095|8444->7262|8525->7340|8606->7418|8683->7480|8756->7534|8825->7584|8890->7621
                  LINES: 32->2|49->19|49->19|49->19|49->19|49->19|49->19|52->22|52->22|52->22|52->22|52->22|52->22|61->31|61->31|61->31|61->31|61->31|61->31|62->32|62->32|62->32|62->32|62->32|62->32|64->34|65->35|66->36|67->37|68->38|69->39|70->40|71->41|72->42|73->43|74->44|75->45|76->46|77->47|78->48|79->49|80->50|81->51|82->52|83->53|84->54|85->55|86->56|87->57|88->58|89->59|90->60|91->61|92->62|93->63|94->64|95->65|96->66|97->67|98->68|99->69|100->70|101->71|102->72|103->73|104->74|105->75|106->76|107->77|108->78|109->79|110->80|111->81|112->82|113->83|114->84|115->85|116->86|117->87|118->88|119->89|120->90|121->91|122->92|123->93|124->94|125->95|126->96|127->97|128->98
                  -- GENERATED --
              */
          