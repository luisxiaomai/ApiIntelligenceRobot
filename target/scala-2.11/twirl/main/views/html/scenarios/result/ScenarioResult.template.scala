
package views.html.scenarios.result

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object ScenarioResult_Scope0 {
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

class ScenarioResult extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html ng-app="UserScenariosApp">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>ScenarioInfo</title>
            <!-- Tell the browser to be responsive to screen width -->
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
            <!-- Bootstrap 3.3.5 -->
        <link rel="stylesheet" href=""""),_display_(/*10.39*/routes/*10.45*/.Assets.versioned("bootstrap/css/bootstrap.min.css")),format.raw/*10.97*/("""">
            <!-- Font Awesome -->
        <link rel="stylesheet" href=""""),_display_(/*12.39*/routes/*12.45*/.Assets.versioned("awesome/css/font-awesome.min.css")),format.raw/*12.98*/("""">
            <!-- Ionicons -->
        <link rel="stylesheet" href=""""),_display_(/*14.39*/routes/*14.45*/.Assets.versioned("ionicons/css/ionicons.min.css")),format.raw/*14.95*/("""">
        <link rel="stylesheet" href=""""),_display_(/*15.39*/routes/*15.45*/.Assets.versioned("jsonformater/jsonFormater.css")),format.raw/*15.95*/("""">
            <!-- DataTables -->
        <link rel="stylesheet" href=""""),_display_(/*17.39*/routes/*17.45*/.Assets.versioned("plugins/datatables/dataTables.bootstrap.css")),format.raw/*17.109*/("""">
            <!-- SELECT2 -->
        <link rel="stylesheet" href=""""),_display_(/*19.39*/routes/*19.45*/.Assets.versioned("plugins/select2/select2.min.css")),format.raw/*19.97*/("""">
            <!-- Theme style -->
        <link rel="stylesheet" href=""""),_display_(/*21.39*/routes/*21.45*/.Assets.versioned("dist/css/AdminLTE.min.css")),format.raw/*21.91*/("""">
            <!-- AdminLTE Skins. Choose a skin from the css/skins folder instead of downloading all of them to reduce the load. -->
        <link rel="stylesheet" href=""""),_display_(/*23.39*/routes/*23.45*/.Assets.versioned("dist/css/skins/_all-skins.min.css")),format.raw/*23.99*/("""">

        <script src=""""),_display_(/*25.23*/routes/*25.29*/.Assets.versioned("angular/angular.min.js")),format.raw/*25.72*/(""""></script>
        <script src=""""),_display_(/*26.23*/routes/*26.29*/.Assets.versioned("custom/userScenariosApp.js")),format.raw/*26.76*/(""""></script>

            <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
            <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
            <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    </head>
    <body class="skin-blue sidebar-mini sidebar-collapse" data-spy="scroll" data-target="#scrollspy" ng-controller="ScenarioResultController">
        <div class="wrapper">

            <header class="main-header">
            views.html.commons.head(userInfo,"Task","/scenarioInfos")
            </header>
                <!-- Left side column. contains the logo and sidebar -->
            <aside class="main-sidebar">
                    <!-- sidebar: style can be found in sidebar.less -->
                views.html.scenarios.view.left_nav()
                    <!-- /.sidebar -->
            </aside>

                <!-- Content Wrapper. Contains page content -->
            <div class="content-wrapper">
                    <!-- Content Header (Page header) -->
                """),_display_(/*51.18*/views/*51.23*/.html.scenarios.result.content()),format.raw/*51.55*/("""

            """),format.raw/*53.13*/("""</div><!-- /.content-wrapper -->

            <!-- Main Footer -->
        """),_display_(/*56.10*/views/*56.15*/.html.commons.foot()),format.raw/*56.35*/("""
            """),format.raw/*57.13*/("""<!-- /.Main Footer -->
            <!-- Control Sidebar -->
        """),_display_(/*59.10*/views/*59.15*/.html.commons.control_sidebar()),format.raw/*59.46*/("""
            """),format.raw/*60.13*/("""<!-- /.control-sidebar -->
            <!-- Add the sidebar's background. This div must be placed
           immediately after the control sidebar -->
            <div class="control-sidebar-bg"></div>
        </div><!-- ./wrapper -->

        <!-- modal-content -->
    """),_display_(/*67.6*/views/*67.11*/.html.scenarios.view.modal_rule()),format.raw/*67.44*/("""
    """),format.raw/*68.5*/("""views.html.scenarios.view.modal_add()
    """),_display_(/*69.6*/views/*69.11*/.html.scenarios.view.modal_tasks()),format.raw/*69.45*/("""
        """),format.raw/*70.9*/("""<!-- ./modal-content -->


        <!-- jQuery 2.1.4 -->
        <script src=""""),_display_(/*74.23*/routes/*74.29*/.Assets.versioned("plugins/jQuery/jQuery-2.1.4.min.js")),format.raw/*74.84*/(""""></script>
            <!-- Bootstrap 3.3.5 -->
        <script src=""""),_display_(/*76.23*/routes/*76.29*/.Assets.versioned("bootstrap/js/bootstrap.min.js")),format.raw/*76.79*/(""""></script>
            <!-- AdminLTE App -->
        <script src=""""),_display_(/*78.23*/routes/*78.29*/.Assets.versioned("dist/js/app.min.js")),format.raw/*78.68*/(""""></script>
            <!-- SlimScroll -->
        <script src=""""),_display_(/*80.23*/routes/*80.29*/.Assets.versioned("plugins/slimScroll/jquery.slimscroll.min.js")),format.raw/*80.93*/(""""></script>
            <!-- FastClick -->
        <script src=""""),_display_(/*82.23*/routes/*82.29*/.Assets.versioned("plugins/fastclick/fastclick.min.js")),format.raw/*82.84*/(""""></script>
            <!-- AdminLTE for demo purposes -->
        <script src=""""),_display_(/*84.23*/routes/*84.29*/.Assets.versioned("dist/js/demo.js")),format.raw/*84.65*/(""""></script>
        <script src=""""),_display_(/*85.23*/routes/*85.29*/.Assets.versioned("jsonformater/jsonFormater.js")),format.raw/*85.78*/(""""></script>
        <script src=""""),_display_(/*86.23*/routes/*86.29*/.Assets.versioned("plugins/select2/select2.full.min.js")),format.raw/*86.85*/(""""></script>

        <script>
                $(function () """),format.raw/*89.31*/("""{"""),format.raw/*89.32*/("""
                    """),format.raw/*90.21*/("""//Initialize Select2 Elements
                    $(".select2").select2();
                """),format.raw/*92.17*/("""}"""),format.raw/*92.18*/(""");
        </script>
    </body>
</html>
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
object ScenarioResult extends ScenarioResult_Scope0.ScenarioResult
              /*
                  -- GENERATED --
                  DATE: Thu Jun 02 15:28:27 CST 2016
                  SOURCE: /Users/apple/Documents/PRO/ApiIntelligenceRobot/app/views/scenarios/result/ScenarioResult.scala.html
                  HASH: 4834772773f7c21e2e2acb6b5eb9521fb4ed89f1
                  MATRIX: 862->0|1336->447|1351->453|1424->505|1526->580|1541->586|1615->639|1713->710|1728->716|1799->766|1867->807|1882->813|1953->863|2053->936|2068->942|2154->1006|2251->1076|2266->1082|2339->1134|2440->1208|2455->1214|2522->1260|2722->1433|2737->1439|2812->1493|2865->1519|2880->1525|2944->1568|3005->1602|3020->1608|3088->1655|4330->2870|4344->2875|4397->2907|4439->2921|4542->2997|4556->3002|4597->3022|4638->3035|4734->3104|4748->3109|4800->3140|4841->3153|5139->3425|5153->3430|5207->3463|5239->3468|5308->3511|5322->3516|5377->3550|5413->3559|5519->3638|5534->3644|5610->3699|5708->3770|5723->3776|5794->3826|5889->3894|5904->3900|5964->3939|6057->4005|6072->4011|6157->4075|6249->4140|6264->4146|6340->4201|6449->4283|6464->4289|6521->4325|6582->4359|6597->4365|6667->4414|6728->4448|6743->4454|6820->4510|6908->4570|6937->4571|6986->4592|7105->4683|7134->4684
                  LINES: 32->1|41->10|41->10|41->10|43->12|43->12|43->12|45->14|45->14|45->14|46->15|46->15|46->15|48->17|48->17|48->17|50->19|50->19|50->19|52->21|52->21|52->21|54->23|54->23|54->23|56->25|56->25|56->25|57->26|57->26|57->26|82->51|82->51|82->51|84->53|87->56|87->56|87->56|88->57|90->59|90->59|90->59|91->60|98->67|98->67|98->67|99->68|100->69|100->69|100->69|101->70|105->74|105->74|105->74|107->76|107->76|107->76|109->78|109->78|109->78|111->80|111->80|111->80|113->82|113->82|113->82|115->84|115->84|115->84|116->85|116->85|116->85|117->86|117->86|117->86|120->89|120->89|121->90|123->92|123->92
                  -- GENERATED --
              */
          