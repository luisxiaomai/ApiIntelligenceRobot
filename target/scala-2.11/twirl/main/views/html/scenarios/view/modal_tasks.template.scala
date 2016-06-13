
package views.html.scenarios.view

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object modal_tasks_Scope0 {
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

class modal_tasks extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<div class="example-modal" >
    <div class="modal modal-info" id="myTask">
        <div class="modal-dialog modal-lg">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
                    <h4 class="modal-title">任务信息</h4>
                </div>
                <div class="modal-body">
                    """),format.raw/*10.54*/("""
                        """),format.raw/*11.46*/("""
                            """),format.raw/*12.56*/("""
                                """),format.raw/*13.70*/("""
                                    """),format.raw/*14.71*/("""
                                        """),format.raw/*15.110*/("""
                                    """),format.raw/*16.48*/("""
                                    """),format.raw/*17.109*/("""
                                """),format.raw/*18.43*/("""
                                """),format.raw/*19.69*/("""
                                    """),format.raw/*20.71*/("""
                                        """),format.raw/*21.110*/("""
                                    """),format.raw/*22.48*/("""
                                    """),format.raw/*23.109*/("""
                                """),format.raw/*24.43*/("""

                            """),format.raw/*26.39*/("""
                        """),format.raw/*27.35*/("""
                    """),format.raw/*28.31*/("""

                    """),format.raw/*30.21*/("""<div class="container-fluid">
                        <div class="row">
                            <div class="col-md-12" style="overflow:auto;height: 400px;">
                                <table class="table table-striped table-hover">
                                    <tbody>
                                        <tr>
                                            <th>idScenario</th>
                                            <th>idUser</th>
                                            <th>startTime</th>
                                            <th>status</th>
                                        </tr>
                                        <tr ng-repeat="taskInfo in TaskInfos | orderBy:'_id'">
                                            """),format.raw/*42.65*/("""
                                                """),format.raw/*43.118*/("""
                                                    """),format.raw/*44.123*/("""
                                                """),format.raw/*45.62*/("""
                                                """),format.raw/*46.118*/("""
                                                    """),format.raw/*47.122*/("""
                                                """),format.raw/*48.62*/("""
                                            """),format.raw/*49.54*/("""
                                            """),format.raw/*50.45*/("""<td>"""),format.raw/*50.49*/("""{"""),format.raw/*50.50*/("""{"""),format.raw/*50.51*/(""" """),format.raw/*50.52*/("""taskInfo.idScenario """),format.raw/*50.72*/("""}"""),format.raw/*50.73*/("""}"""),format.raw/*50.74*/("""</td>
                                            <td>"""),format.raw/*51.49*/("""{"""),format.raw/*51.50*/("""{"""),format.raw/*51.51*/(""" """),format.raw/*51.52*/("""taskInfo.idUser """),format.raw/*51.68*/("""}"""),format.raw/*51.69*/("""}"""),format.raw/*51.70*/("""</td>
                                            <td>"""),format.raw/*52.49*/("""{"""),format.raw/*52.50*/("""{"""),format.raw/*52.51*/(""" """),format.raw/*52.52*/("""taskInfo.startTime """),format.raw/*52.71*/("""}"""),format.raw/*52.72*/("""}"""),format.raw/*52.73*/("""</td>
                                            <td>"""),format.raw/*53.49*/("""{"""),format.raw/*53.50*/("""{"""),format.raw/*53.51*/(""" """),format.raw/*53.52*/("""taskInfo.status """),format.raw/*53.68*/("""}"""),format.raw/*53.69*/("""}"""),format.raw/*53.70*/("""</td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-outline pull-left" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-outline">Save changes</button>
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
object modal_tasks extends modal_tasks_Scope0.modal_tasks
              /*
                  -- GENERATED --
                  DATE: Thu Jun 02 15:28:27 CST 2016
                  SOURCE: /Users/apple/Documents/PRO/ApiIntelligenceRobot/app/views/scenarios/view/modal_tasks.scala.html
                  HASH: 50368ca1e773327cd35d948aa2310ab1f9a21719
                  MATRIX: 854->0|1362->513|1415->559|1472->615|1533->685|1598->756|1668->866|1733->914|1799->1023|1860->1066|1921->1135|1986->1206|2056->1316|2121->1364|2187->1473|2248->1516|2306->1556|2359->1591|2408->1622|2458->1644|3248->2426|3326->2544|3408->2667|3485->2729|3563->2847|3645->2969|3722->3031|3795->3085|3868->3130|3900->3134|3929->3135|3958->3136|3987->3137|4035->3157|4064->3158|4093->3159|4175->3213|4204->3214|4233->3215|4262->3216|4306->3232|4335->3233|4364->3234|4446->3288|4475->3289|4504->3290|4533->3291|4580->3310|4609->3311|4638->3312|4720->3366|4749->3367|4778->3368|4807->3369|4851->3385|4880->3386|4909->3387
                  LINES: 32->1|41->10|42->11|43->12|44->13|45->14|46->15|47->16|48->17|49->18|50->19|51->20|52->21|53->22|54->23|55->24|57->26|58->27|59->28|61->30|73->42|74->43|75->44|76->45|77->46|78->47|79->48|80->49|81->50|81->50|81->50|81->50|81->50|81->50|81->50|81->50|82->51|82->51|82->51|82->51|82->51|82->51|82->51|83->52|83->52|83->52|83->52|83->52|83->52|83->52|84->53|84->53|84->53|84->53|84->53|84->53|84->53
                  -- GENERATED --
              */
          