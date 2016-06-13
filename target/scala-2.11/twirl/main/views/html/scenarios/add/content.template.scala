
package views.html.scenarios.add

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


Seq[Any](format.raw/*1.1*/("""<section class="content-header">
    <h1><b>
        场景列表
    </b>
    </h1>
</section>

<section class="content">
    """),format.raw/*9.26*/("""
        """),format.raw/*10.44*/("""
            """),format.raw/*11.41*/("""
                """),format.raw/*12.173*/("""
                    """),format.raw/*13.55*/("""
                """),format.raw/*14.30*/("""
            """),format.raw/*15.23*/("""
        """),format.raw/*16.19*/("""
    """),format.raw/*17.15*/("""
    """),format.raw/*18.5*/("""<div class="row">
        <div ng-repeat="simpleScenario in simpleScenarios">
            <a href="/scenarioViewPage/"""),format.raw/*20.40*/("""{"""),format.raw/*20.41*/("""{"""),format.raw/*20.42*/("""simpleScenario._id"""),format.raw/*20.60*/("""}"""),format.raw/*20.61*/("""}"""),format.raw/*20.62*/("""">
                <div class="col-lg-3 col-xs-6">
                        <!-- small box -->
                    <div class="small-box bg-aqua">
                        <div class="inner">
                            <h4>"""),format.raw/*25.33*/("""{"""),format.raw/*25.34*/("""{"""),format.raw/*25.35*/("""simpleScenario.scenarioName"""),format.raw/*25.62*/("""}"""),format.raw/*25.63*/("""}"""),format.raw/*25.64*/("""</h4>
                            <p>"""),format.raw/*26.32*/("""{"""),format.raw/*26.33*/("""{"""),format.raw/*26.34*/("""simpleScenario.tagName"""),format.raw/*26.56*/("""}"""),format.raw/*26.57*/("""}"""),format.raw/*26.58*/("""</p>
                        </div>
                        <div class="icon">
                            <i class="ion ion-android-open"></i>
                        </div>
                        <p class="small-box-footer">More info<i class="fa fa-arrow-circle-right"></i></p>
                    </div>
                </div> <!-- ./col -->
            </a>
        </div>
        <a href="#" data-toggle="modal" data-target="#addScenario">
            <div class="col-lg-3 col-xs-6">
                    <!-- small box -->
                <div class="small-box bg-aqua-gradient">
                    <div class="inner">
                        <h4>Add</h4>
                        <p>version</p>
                    </div>
                    <div class="icon">
                        <i class="ion ion-android-add"></i>
                    </div>
                    <p class="small-box-footer">More info<i class="fa fa-arrow-circle-right"></i></p>
                    """),format.raw/*48.116*/("""
                """),format.raw/*49.17*/("""</div>
            </div><!-- ./col -->
        </a>
    </div>
</section>

"""),format.raw/*55.30*/("""
    """),format.raw/*56.26*/("""
        """),format.raw/*57.44*/("""
            """),format.raw/*58.41*/("""
                """),format.raw/*59.161*/("""
                    """),format.raw/*60.55*/("""
                """),format.raw/*61.30*/("""
            """),format.raw/*62.23*/("""
        """),format.raw/*63.19*/("""
    """),format.raw/*64.15*/("""
    """),format.raw/*65.26*/("""
        """),format.raw/*66.62*/("""
                """),format.raw/*67.87*/("""
                    """),format.raw/*68.56*/("""
                            """),format.raw/*69.51*/("""
                        """),format.raw/*70.60*/("""
                            """),format.raw/*71.52*/("""
                                """),format.raw/*72.62*/("""
                                """),format.raw/*73.63*/("""
                            """),format.raw/*74.39*/("""
                            """),format.raw/*75.51*/("""
                                """),format.raw/*76.73*/("""
                            """),format.raw/*77.39*/("""
                            """),format.raw/*78.114*/("""
                        """),format.raw/*79.35*/("""
                    """),format.raw/*80.46*/("""
                """),format.raw/*81.25*/("""
        """),format.raw/*82.19*/("""
    """),format.raw/*83.68*/("""
        """),format.raw/*84.44*/("""
                """),format.raw/*85.39*/("""
            """),format.raw/*86.57*/("""
                """),format.raw/*87.40*/("""
                    """),format.raw/*88.37*/("""
                    """),format.raw/*89.39*/("""
                """),format.raw/*90.27*/("""
                """),format.raw/*91.39*/("""
                    """),format.raw/*92.60*/("""
                """),format.raw/*93.27*/("""
                """),format.raw/*94.102*/("""
                """),format.raw/*95.112*/("""
            """),format.raw/*96.23*/("""
        """),format.raw/*97.33*/("""
    """),format.raw/*98.13*/("""
    """),format.raw/*99.15*/("""
"""),format.raw/*100.15*/("""

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
object content extends content_Scope0.content
              /*
                  -- GENERATED --
                  DATE: Tue Jun 07 17:05:33 CST 2016
                  SOURCE: /Users/apple/Documents/PRO/ApiIntelligenceRobot/app/views/scenarios/add/content.scala.html
                  HASH: 39f4fe472cb01fe7c82fa0cef846c9adfc57907e
                  MATRIX: 845->0|991->140|1028->184|1069->225|1115->398|1164->453|1209->483|1250->506|1287->525|1320->540|1352->545|1497->662|1526->663|1555->664|1601->682|1630->683|1659->684|1909->906|1938->907|1967->908|2022->935|2051->936|2080->937|2145->974|2174->975|2203->976|2253->998|2282->999|2311->1000|3317->2072|3362->2089|3466->2194|3499->2220|3536->2264|3577->2305|3623->2466|3672->2521|3717->2551|3758->2574|3795->2593|3828->2608|3861->2634|3898->2696|3943->2783|3992->2839|4049->2890|4102->2950|4159->3002|4220->3064|4281->3127|4338->3166|4395->3217|4456->3290|4513->3329|4571->3443|4624->3478|4673->3524|4718->3549|4755->3568|4788->3636|4825->3680|4870->3719|4911->3776|4956->3816|5005->3853|5054->3892|5099->3919|5144->3958|5193->4018|5238->4045|5284->4147|5330->4259|5371->4282|5408->4315|5441->4328|5474->4343|5504->4358
                  LINES: 32->1|40->9|41->10|42->11|43->12|44->13|45->14|46->15|47->16|48->17|49->18|51->20|51->20|51->20|51->20|51->20|51->20|56->25|56->25|56->25|56->25|56->25|56->25|57->26|57->26|57->26|57->26|57->26|57->26|79->48|80->49|86->55|87->56|88->57|89->58|90->59|91->60|92->61|93->62|94->63|95->64|96->65|97->66|98->67|99->68|100->69|101->70|102->71|103->72|104->73|105->74|106->75|107->76|108->77|109->78|110->79|111->80|112->81|113->82|114->83|115->84|116->85|117->86|118->87|119->88|120->89|121->90|122->91|123->92|124->93|125->94|126->95|127->96|128->97|129->98|130->99|131->100
                  -- GENERATED --
              */
          