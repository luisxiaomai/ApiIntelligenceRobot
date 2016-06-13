
package views.html.apis.design

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object ApiDesign_Scope0 {
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

     object ApiDesign_Scope1 {
import models.users.UserInfo

class ApiDesign extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[UserInfo,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(userInfo:UserInfo):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.21*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html ng-app="ApiOperateApp">
    <head>
        <title>APIDesign</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- AdminLTE Skins. Choose a skin from the css/skins folder instead of downloading all of them to reduce the load. -->
        <link rel="stylesheet" href=""""),_display_(/*9.39*/routes/*9.45*/.Assets.versioned("dist/css/skins/_all-skins.min.css")),format.raw/*9.99*/("""">

        <link rel="stylesheet" href=""""),_display_(/*11.39*/routes/*11.45*/.Assets.versioned("bootstrap/css/bootstrap.min.css")),format.raw/*11.97*/("""">
            <!-- Font Awesome -->
        <link rel="stylesheet" href=""""),_display_(/*13.39*/routes/*13.45*/.Assets.versioned("awesome/css/font-awesome.min.css")),format.raw/*13.98*/("""">

            <!-- Ionicons -->
        <link rel="stylesheet" href=""""),_display_(/*16.39*/routes/*16.45*/.Assets.versioned("ionicons/css/ionicons.min.css")),format.raw/*16.95*/("""">

            <!-- Theme style -->
        <link rel="stylesheet" href=""""),_display_(/*19.39*/routes/*19.45*/.Assets.versioned("dist/css/AdminLTE.min.css")),format.raw/*19.91*/("""">


        <link rel="stylesheet" href=""""),_display_(/*22.39*/routes/*22.45*/.Assets.versioned("jsoneditor/jsoneditor.css")),format.raw/*22.91*/("""">

        <script src=""""),_display_(/*24.23*/routes/*24.29*/.Assets.versioned("jsoneditor/jsoneditor.min.js")),format.raw/*24.78*/(""""></script>

        <script src=""""),_display_(/*26.23*/routes/*26.29*/.Assets.versioned("angular/angular.min.js")),format.raw/*26.72*/(""""></script>

        <script src=""""),_display_(/*28.23*/routes/*28.29*/.Assets.versioned("jsoneditor/ng-jsoneditor.js")),format.raw/*28.77*/(""""></script>

        <script src=""""),_display_(/*30.23*/routes/*30.29*/.Assets.versioned("custom/angular/ApiOperateApp.js")),format.raw/*30.81*/(""""></script>
        <script src=""""),_display_(/*31.23*/routes/*31.29*/.Assets.versioned("custom/swagger/swagger-parser.js")),format.raw/*31.82*/(""""></script>


    </head>
    <body class="skin-blue sidebar-mini sidebar-collapse" data-spy="scroll" data-target="#scrollspy" ng-controller="ApiDesignController">
        <div class="wrapper">

            <header class="main-header">
                """),_display_(/*39.18*/views/*39.23*/.html.commons.head(userInfo,"Design","/apiDocPage")),format.raw/*39.74*/("""
            """),format.raw/*40.13*/("""</header>
                <!-- Left side column. contains the logo and sidebar -->
            <aside class="main-sidebar">
                    <!-- sidebar: style can be found in sidebar.less -->
                """),_display_(/*44.18*/views/*44.23*/.html.apis.design.left_nav()),format.raw/*44.51*/("""
                    """),format.raw/*45.21*/("""<!-- /.sidebar -->
            </aside>

                <!-- Content Wrapper. Contains page content -->
            <div class="content-wrapper">
                    <!-- Content Header (Page header) -->
                """),_display_(/*51.18*/views/*51.23*/.html.apis.design.content()),format.raw/*51.50*/("""

            """),format.raw/*53.13*/("""</div><!-- /.content-wrapper -->

            <!-- Main Footer -->
            """),_display_(/*56.14*/views/*56.19*/.html.commons.foot()),format.raw/*56.39*/("""
            """),format.raw/*57.13*/("""<!-- /.Main Footer -->
            <!-- Control Sidebar -->
            <!-- /.control-sidebar -->
            <!-- Add the sidebar's background. This div must be placed
           immediately after the control sidebar -->
            <div class="control-sidebar-bg"></div>
        </div><!-- ./wrapper -->

        <!-- modal-content -->
        """),_display_(/*66.10*/views/*66.15*/.html.apis.design.modal_add_guide()),format.raw/*66.50*/("""

        """),format.raw/*68.9*/("""<script src=""""),_display_(/*68.23*/routes/*68.29*/.Assets.versioned("plugins/jQuery/jQuery-2.1.4.min.js")),format.raw/*68.84*/(""""></script>
            <!-- Bootstrap 3.3.5 -->
        <script src=""""),_display_(/*70.23*/routes/*70.29*/.Assets.versioned("bootstrap/js/bootstrap.min.js")),format.raw/*70.79*/(""""></script>
            <!-- AdminLTE App -->
        <script src=""""),_display_(/*72.23*/routes/*72.29*/.Assets.versioned("dist/js/app.min.js")),format.raw/*72.68*/(""""></script>
            <!-- SlimScroll -->
        <script src=""""),_display_(/*74.23*/routes/*74.29*/.Assets.versioned("plugins/slimScroll/jquery.slimscroll.min.js")),format.raw/*74.93*/(""""></script>
            <!-- FastClick -->
        <script src=""""),_display_(/*76.23*/routes/*76.29*/.Assets.versioned("plugins/fastclick/fastclick.min.js")),format.raw/*76.84*/(""""></script>
            <!-- AdminLTE for demo purposes -->
        <script src=""""),_display_(/*78.23*/routes/*78.29*/.Assets.versioned("dist/js/demo.js")),format.raw/*78.65*/(""""></script>
        <script src=""""),_display_(/*79.23*/routes/*79.29*/.Assets.versioned("jsonformater/jsonFormater.js")),format.raw/*79.78*/(""""></script>
        <script src=""""),_display_(/*80.23*/routes/*80.29*/.Assets.versioned("plugins/select2/select2.full.min.js")),format.raw/*80.85*/(""""></script>
    </body>
</html>

"""))
      }
    }
  }

  def render(userInfo:UserInfo): play.twirl.api.HtmlFormat.Appendable = apply(userInfo)

  def f:((UserInfo) => play.twirl.api.HtmlFormat.Appendable) = (userInfo) => apply(userInfo)

  def ref: this.type = this

}


}
}

/**/
object ApiDesign extends ApiDesign_Scope0.ApiDesign_Scope1.ApiDesign
              /*
                  -- GENERATED --
                  DATE: Tue Jun 07 16:04:21 CST 2016
                  SOURCE: /Users/apple/Documents/PRO/ApiIntelligenceRobot/app/views/apis/design/ApiDesign.scala.html
                  HASH: b667aaac13e0bbae6f00df80f32b32518ea3fe2a
                  MATRIX: 828->31|942->50|969->51|1327->383|1341->389|1415->443|1484->485|1499->491|1572->543|1674->618|1689->624|1763->677|1862->749|1877->755|1948->805|2050->880|2065->886|2132->932|2202->975|2217->981|2284->1027|2337->1053|2352->1059|2422->1108|2484->1143|2499->1149|2563->1192|2625->1227|2640->1233|2709->1281|2771->1316|2786->1322|2859->1374|2920->1408|2935->1414|3009->1467|3289->1720|3303->1725|3375->1776|3416->1789|3657->2003|3671->2008|3720->2036|3769->2057|4018->2279|4032->2284|4080->2311|4122->2325|4229->2405|4243->2410|4284->2430|4325->2443|4700->2791|4714->2796|4770->2831|4807->2841|4848->2855|4863->2861|4939->2916|5037->2987|5052->2993|5123->3043|5218->3111|5233->3117|5293->3156|5386->3222|5401->3228|5486->3292|5578->3357|5593->3363|5669->3418|5778->3500|5793->3506|5850->3542|5911->3576|5926->3582|5996->3631|6057->3665|6072->3671|6149->3727
                  LINES: 30->2|35->2|36->3|42->9|42->9|42->9|44->11|44->11|44->11|46->13|46->13|46->13|49->16|49->16|49->16|52->19|52->19|52->19|55->22|55->22|55->22|57->24|57->24|57->24|59->26|59->26|59->26|61->28|61->28|61->28|63->30|63->30|63->30|64->31|64->31|64->31|72->39|72->39|72->39|73->40|77->44|77->44|77->44|78->45|84->51|84->51|84->51|86->53|89->56|89->56|89->56|90->57|99->66|99->66|99->66|101->68|101->68|101->68|101->68|103->70|103->70|103->70|105->72|105->72|105->72|107->74|107->74|107->74|109->76|109->76|109->76|111->78|111->78|111->78|112->79|112->79|112->79|113->80|113->80|113->80
                  -- GENERATED --
              */
          