
package views.html.scenarios.view

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object ScenarioView_Scope0 {
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

     object ScenarioView_Scope1 {
import models.users.UserInfo

class ScenarioView extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[UserInfo,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(userInfo:UserInfo):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.21*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html ng-app="UserScenariosApp">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>ScenarioInfo</title>
            <!-- Tell the browser to be responsive to screen width -->
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
            <!-- Bootstrap 3.3.5 -->
        <link rel="stylesheet" href=""""),_display_(/*12.39*/routes/*12.45*/.Assets.versioned("bootstrap/css/bootstrap.min.css")),format.raw/*12.97*/("""">
            <!-- Font Awesome -->
        <link rel="stylesheet" href=""""),_display_(/*14.39*/routes/*14.45*/.Assets.versioned("awesome/css/font-awesome.min.css")),format.raw/*14.98*/("""">
            <!-- Ionicons -->
        <link rel="stylesheet" href=""""),_display_(/*16.39*/routes/*16.45*/.Assets.versioned("ionicons/css/ionicons.min.css")),format.raw/*16.95*/("""">

        <link rel="stylesheet" href=""""),_display_(/*18.39*/routes/*18.45*/.Assets.versioned("jsonformater/jsonFormater.css")),format.raw/*18.95*/("""">
            <!-- DataTables -->
        <link rel="stylesheet" href=""""),_display_(/*20.39*/routes/*20.45*/.Assets.versioned("plugins/datatables/dataTables.bootstrap.css")),format.raw/*20.109*/("""">
            <!-- SELECT2 -->
        <link rel="stylesheet" href=""""),_display_(/*22.39*/routes/*22.45*/.Assets.versioned("plugins/select2/select2.min.css")),format.raw/*22.97*/("""">
            <!-- Theme style -->
        <link rel="stylesheet" href=""""),_display_(/*24.39*/routes/*24.45*/.Assets.versioned("dist/css/AdminLTE.min.css")),format.raw/*24.91*/("""">
            <!-- AdminLTE Skins. Choose a skin from the css/skins folder instead of downloading all of them to reduce the load. -->
        <link rel="stylesheet" href=""""),_display_(/*26.39*/routes/*26.45*/.Assets.versioned("dist/css/skins/_all-skins.min.css")),format.raw/*26.99*/("""">

        <link rel="stylesheet" href=""""),_display_(/*28.39*/routes/*28.45*/.Assets.versioned("jsoneditor/jsoneditor.css")),format.raw/*28.91*/("""">



        <script src=""""),_display_(/*32.23*/routes/*32.29*/.Assets.versioned("angular/angular.min.js")),format.raw/*32.72*/(""""></script>
        <script src=""""),_display_(/*33.23*/routes/*33.29*/.Assets.versioned("custom/angular/ScenariosApp.js")),format.raw/*33.80*/(""""></script>
        <script src=""""),_display_(/*34.23*/routes/*34.29*/.Assets.versioned("custom/swagger/swagger-parser.js")),format.raw/*34.82*/(""""></script>
        <script src=""""),_display_(/*35.23*/routes/*35.29*/.Assets.versioned("custom/swagger/swagger-client.min.js")),format.raw/*35.86*/(""""></script>
        <script src=""""),_display_(/*36.23*/routes/*36.29*/.Assets.versioned("jsoneditor/jsoneditor.min.js")),format.raw/*36.78*/(""""></script>
        <script src=""""),_display_(/*37.23*/routes/*37.29*/.Assets.versioned("jsoneditor/ng-jsoneditor.js")),format.raw/*37.77*/(""""></script>
        <script src=""""),_display_(/*38.23*/routes/*38.29*/.Assets.versioned("angular/angular-filter.min.js")),format.raw/*38.79*/(""""></script>



        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
            <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
            <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    </head>
    <body class="skin-blue sidebar-mini sidebar-collapse" data-spy="scroll" data-target="#scrollspy" ng-controller="ScenarioViewController">
        <div class="wrapper">

            <header class="main-header">
                """),_display_(/*53.18*/views/*53.23*/.html.commons.head(userInfo,"Task","/scenariosPage")),format.raw/*53.75*/("""
            """),format.raw/*54.13*/("""</header>
                <!-- Left side column. contains the logo and sidebar -->
            <aside class="main-sidebar">
                    <!-- sidebar: style can be found in sidebar.less -->
                """),_display_(/*58.18*/views/*58.23*/.html.scenarios.view.left()),format.raw/*58.50*/("""
                    """),format.raw/*59.21*/("""<!-- /.sidebar -->
            </aside>

                <!-- Content Wrapper. Contains page content -->
            <div class="content-wrapper">
                    <!-- Content Header (Page header) -->
                """),_display_(/*65.18*/views/*65.23*/.html.scenarios.view.content4()),format.raw/*65.54*/("""

            """),format.raw/*67.13*/("""</div><!-- /.content-wrapper -->
            <!-- Main Footer -->
        """),_display_(/*69.10*/views/*69.15*/.html.commons.foot()),format.raw/*69.35*/("""
            """),format.raw/*70.13*/("""<!-- /.Main Footer -->
            <!-- Control Sidebar -->
        """),_display_(/*72.10*/views/*72.15*/.html.commons.control_sidebar()),format.raw/*72.46*/("""
            """),format.raw/*73.13*/("""<!-- /.control-sidebar -->
            <!-- Add the sidebar's background. This div must be placed
           immediately after the control sidebar -->
            <div class="control-sidebar-bg"></div>
        </div><!-- ./wrapper -->

        <!-- modal-content -->
    """),_display_(/*80.6*/views/*80.11*/.html.scenarios.view.modal_add()),format.raw/*80.43*/("""
    """),_display_(/*81.6*/views/*81.11*/.html.scenarios.view.modal_result()),format.raw/*81.46*/("""


        """),format.raw/*84.9*/("""<!-- jQuery 2.1.4 -->
        <script src=""""),_display_(/*85.23*/routes/*85.29*/.Assets.versioned("plugins/jQuery/jQuery-2.1.4.min.js")),format.raw/*85.84*/(""""></script>
            <!-- Bootstrap 3.3.5 -->
        <script src=""""),_display_(/*87.23*/routes/*87.29*/.Assets.versioned("bootstrap/js/bootstrap.min.js")),format.raw/*87.79*/(""""></script>
            <!-- AdminLTE App -->
        <script src=""""),_display_(/*89.23*/routes/*89.29*/.Assets.versioned("dist/js/app.min.js")),format.raw/*89.68*/(""""></script>
            <!-- SlimScroll -->
        <script src=""""),_display_(/*91.23*/routes/*91.29*/.Assets.versioned("plugins/slimScroll/jquery.slimscroll.min.js")),format.raw/*91.93*/(""""></script>
            <!-- FastClick -->
        <script src=""""),_display_(/*93.23*/routes/*93.29*/.Assets.versioned("plugins/fastclick/fastclick.min.js")),format.raw/*93.84*/(""""></script>
            <!-- AdminLTE for demo purposes -->
        <script src=""""),_display_(/*95.23*/routes/*95.29*/.Assets.versioned("dist/js/demo.js")),format.raw/*95.65*/(""""></script>
        <script src=""""),_display_(/*96.23*/routes/*96.29*/.Assets.versioned("jsonformater/jsonFormater.js")),format.raw/*96.78*/(""""></script>
        <script src=""""),_display_(/*97.23*/routes/*97.29*/.Assets.versioned("plugins/select2/select2.full.min.js")),format.raw/*97.85*/(""""></script>
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
object ScenarioView extends ScenarioView_Scope0.ScenarioView_Scope1.ScenarioView
              /*
                  -- GENERATED --
                  DATE: Mon Jun 13 15:08:27 CST 2016
                  SOURCE: /Users/apple/Documents/PRO/ApiIntelligenceRobot/app/views/scenarios/view/ScenarioView.scala.html
                  HASH: a3d95a3f84bbb8af378a8d4ce626a728bc50effa
                  MATRIX: 840->31|954->50|981->51|1455->498|1470->504|1543->556|1645->631|1660->637|1734->690|1832->761|1847->767|1918->817|1987->859|2002->865|2073->915|2173->988|2188->994|2274->1058|2371->1128|2386->1134|2459->1186|2560->1260|2575->1266|2642->1312|2842->1485|2857->1491|2932->1545|3001->1587|3016->1593|3083->1639|3138->1667|3153->1673|3217->1716|3278->1750|3293->1756|3365->1807|3426->1841|3441->1847|3515->1900|3576->1934|3591->1940|3669->1997|3730->2031|3745->2037|3815->2086|3876->2120|3891->2126|3960->2174|4021->2208|4036->2214|4107->2264|4788->2918|4802->2923|4875->2975|4916->2988|5157->3202|5171->3207|5219->3234|5268->3255|5517->3477|5531->3482|5583->3513|5625->3527|5727->3602|5741->3607|5782->3627|5823->3640|5919->3709|5933->3714|5985->3745|6026->3758|6324->4030|6338->4035|6391->4067|6423->4073|6437->4078|6493->4113|6531->4124|6602->4168|6617->4174|6693->4229|6791->4300|6806->4306|6877->4356|6972->4424|6987->4430|7047->4469|7140->4535|7155->4541|7240->4605|7332->4670|7347->4676|7423->4731|7532->4813|7547->4819|7604->4855|7665->4889|7680->4895|7750->4944|7811->4978|7826->4984|7903->5040
                  LINES: 30->2|35->2|36->3|45->12|45->12|45->12|47->14|47->14|47->14|49->16|49->16|49->16|51->18|51->18|51->18|53->20|53->20|53->20|55->22|55->22|55->22|57->24|57->24|57->24|59->26|59->26|59->26|61->28|61->28|61->28|65->32|65->32|65->32|66->33|66->33|66->33|67->34|67->34|67->34|68->35|68->35|68->35|69->36|69->36|69->36|70->37|70->37|70->37|71->38|71->38|71->38|86->53|86->53|86->53|87->54|91->58|91->58|91->58|92->59|98->65|98->65|98->65|100->67|102->69|102->69|102->69|103->70|105->72|105->72|105->72|106->73|113->80|113->80|113->80|114->81|114->81|114->81|117->84|118->85|118->85|118->85|120->87|120->87|120->87|122->89|122->89|122->89|124->91|124->91|124->91|126->93|126->93|126->93|128->95|128->95|128->95|129->96|129->96|129->96|130->97|130->97|130->97
                  -- GENERATED --
              */
          