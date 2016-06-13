
package views.html.scenarios.add

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object Scenarios_Scope0 {
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

     object Scenarios_Scope1 {
import models.users.UserInfo

class Scenarios extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[UserInfo,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(userInfo: UserInfo):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.22*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html ng-app="UserScenarioAddApp">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>ScenarioInfo</title>
            <!-- Tell the browser to be responsive to screen width -->
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
        """),format.raw/*11.107*/("""

            """),format.raw/*13.13*/("""<!-- Bootstrap 3.3.5 -->
        <link rel="stylesheet" href=""""),_display_(/*14.39*/routes/*14.45*/.Assets.versioned("bootstrap/css/bootstrap.min.css")),format.raw/*14.97*/("""">
            <!-- Font Awesome -->
        <link rel="stylesheet" href=""""),_display_(/*16.39*/routes/*16.45*/.Assets.versioned("awesome/css/font-awesome.min.css")),format.raw/*16.98*/("""">
            <!-- Ionicons -->
        <link rel="stylesheet" href=""""),_display_(/*18.39*/routes/*18.45*/.Assets.versioned("ionicons/css/ionicons.min.css")),format.raw/*18.95*/("""">

        <link rel="stylesheet" href=""""),_display_(/*20.39*/routes/*20.45*/.Assets.versioned("jsonformater/jsonFormater.css")),format.raw/*20.95*/("""">
            <!-- DataTables -->
        <link rel="stylesheet" href=""""),_display_(/*22.39*/routes/*22.45*/.Assets.versioned("plugins/datatables/dataTables.bootstrap.css")),format.raw/*22.109*/("""">
            <!-- SELECT2 -->
        <link rel="stylesheet" href=""""),_display_(/*24.39*/routes/*24.45*/.Assets.versioned("plugins/select2/select2.min.css")),format.raw/*24.97*/("""">
            <!-- Theme style -->
        <link rel="stylesheet" href=""""),_display_(/*26.39*/routes/*26.45*/.Assets.versioned("dist/css/AdminLTE.min.css")),format.raw/*26.91*/("""">
            <!-- AdminLTE Skins. Choose a skin from the css/skins folder instead of downloading all of them to reduce the load. -->
        <link rel="stylesheet" href=""""),_display_(/*28.39*/routes/*28.45*/.Assets.versioned("dist/css/skins/_all-skins.min.css")),format.raw/*28.99*/("""">

        <link rel="stylesheet" href=""""),_display_(/*30.39*/routes/*30.45*/.Assets.versioned("plugins/bootstrap-table/bootstrap-table.min.css")),format.raw/*30.113*/("""">

        <script src=""""),_display_(/*32.23*/routes/*32.29*/.Assets.versioned("angular/angular.min.js")),format.raw/*32.72*/(""""></script>
        <script src=""""),_display_(/*33.23*/routes/*33.29*/.Assets.versioned("angular/angular-filter.min.js")),format.raw/*33.79*/(""""></script>
        <script src=""""),_display_(/*34.23*/routes/*34.29*/.Assets.versioned("custom/angular/ScenarioAddApp.js")),format.raw/*34.82*/(""""></script>


            <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
            <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
            <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>

    <![endif]-->
    </head>
    <body class="skin-blue sidebar-mini sidebar-collapse" data-spy="scroll" data-target="#scrollspy" ng-controller="ScenarioAddController">
        <div class="wrapper">

            <header class="main-header">
            """),_display_(/*49.14*/views/*49.19*/.html.commons.head(userInfo, "Scenario", "/scenariosPage")),format.raw/*49.77*/("""
            """),format.raw/*50.13*/("""</header>
                <!-- Left side column. contains the logo and sidebar -->
            <aside class="main-sidebar">
                    <!-- sidebar: style can be found in sidebar.less -->
                """),_display_(/*54.18*/views/*54.23*/.html.scenarios.view.left()),format.raw/*54.50*/("""
                    """),format.raw/*55.21*/("""<!-- /.sidebar -->
            </aside>

                <!-- Content Wrapper. Contains page content -->
            <div class="content-wrapper">
                    <!-- Content Header (Page header) -->
                """),_display_(/*61.18*/views/*61.23*/.html.scenarios.add.content()),format.raw/*61.52*/("""

            """),format.raw/*63.13*/("""</div><!-- /.content-wrapper -->

            <!-- Main Footer -->
            """),_display_(/*66.14*/views/*66.19*/.html.commons.foot()),format.raw/*66.39*/("""
            """),format.raw/*67.13*/("""<!-- /.Main Footer -->
            <!-- Control Sidebar -->
            """),_display_(/*69.14*/views/*69.19*/.html.commons.control_sidebar()),format.raw/*69.50*/("""
            """),format.raw/*70.13*/("""<!-- /.control-sidebar -->
            <!-- Add the sidebar's background. This div must be placed immediately after the control sidebar -->
            <div class="control-sidebar-bg"></div>

        </div><!-- ./wrapper -->

        <!-- modal-content -->
    """),_display_(/*77.6*/views/*77.11*/.html.scenarios.add.modal_addScenario()),format.raw/*77.50*/("""

        """),format.raw/*79.9*/("""<!-- jQuery 2.1.4 -->
        <script src=""""),_display_(/*80.23*/routes/*80.29*/.Assets.versioned("plugins/jQuery/jQuery-2.1.4.min.js")),format.raw/*80.84*/(""""></script>
            <!-- Bootstrap 3.3.5 -->
        <script src=""""),_display_(/*82.23*/routes/*82.29*/.Assets.versioned("bootstrap/js/bootstrap.min.js")),format.raw/*82.79*/(""""></script>
            <!-- AdminLTE App -->
        <script src=""""),_display_(/*84.23*/routes/*84.29*/.Assets.versioned("dist/js/app.min.js")),format.raw/*84.68*/(""""></script>
            <!-- DataTables -->
        <script src=""""),_display_(/*86.23*/routes/*86.29*/.Assets.versioned("plugins/datatables/jquery.dataTables.min.js")),format.raw/*86.93*/(""""></script>
        <script src=""""),_display_(/*87.23*/routes/*87.29*/.Assets.versioned("plugins/datatables/dataTables.bootstrap.min.js")),format.raw/*87.96*/(""""></script>
            <!-- SlimScroll -->
        <script src=""""),_display_(/*89.23*/routes/*89.29*/.Assets.versioned("plugins/slimScroll/jquery.slimscroll.min.js")),format.raw/*89.93*/(""""></script>
            <!-- FastClick -->
        <script src=""""),_display_(/*91.23*/routes/*91.29*/.Assets.versioned("plugins/fastclick/fastclick.min.js")),format.raw/*91.84*/(""""></script>
            <!-- AdminLTE for demo purposes -->
        <script src=""""),_display_(/*93.23*/routes/*93.29*/.Assets.versioned("dist/js/demo.js")),format.raw/*93.65*/(""""></script>
        <script src=""""),_display_(/*94.23*/routes/*94.29*/.Assets.versioned("jsonformater/jsonFormater.js")),format.raw/*94.78*/(""""></script>
        <script src=""""),_display_(/*95.23*/routes/*95.29*/.Assets.versioned("plugins/select2/select2.full.min.js")),format.raw/*95.85*/(""""></script>
        """),format.raw/*96.98*/("""
        """),format.raw/*97.97*/("""
        """),format.raw/*98.98*/("""
        """),format.raw/*99.107*/("""
        """),format.raw/*100.119*/("""
    """),format.raw/*101.5*/("""</body>
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
object Scenarios extends Scenarios_Scope0.Scenarios_Scope1.Scenarios
              /*
                  -- GENERATED --
                  DATE: Mon Jun 06 14:39:42 CST 2016
                  SOURCE: /Users/apple/Documents/PRO/ApiIntelligenceRobot/app/views/scenarios/add/Scenarios.scala.html
                  HASH: 08e74329aedc3bc15fc72c4971254061f259a91b
                  MATRIX: 830->31|945->51|972->52|1383->532|1425->546|1515->609|1530->615|1603->667|1705->742|1720->748|1794->801|1892->872|1907->878|1978->928|2047->970|2062->976|2133->1026|2233->1099|2248->1105|2334->1169|2431->1239|2446->1245|2519->1297|2620->1371|2635->1377|2702->1423|2902->1596|2917->1602|2992->1656|3061->1698|3076->1704|3166->1772|3219->1798|3234->1804|3298->1847|3359->1881|3374->1887|3445->1937|3506->1971|3521->1977|3595->2030|4275->2683|4289->2688|4368->2746|4409->2759|4650->2973|4664->2978|4712->3005|4761->3026|5010->3248|5024->3253|5074->3282|5116->3296|5223->3376|5237->3381|5278->3401|5319->3414|5419->3487|5433->3492|5485->3523|5526->3536|5814->3798|5828->3803|5888->3842|5925->3852|5996->3896|6011->3902|6087->3957|6185->4028|6200->4034|6271->4084|6366->4152|6381->4158|6441->4197|6534->4263|6549->4269|6634->4333|6695->4367|6710->4373|6798->4440|6891->4506|6906->4512|6991->4576|7083->4641|7098->4647|7174->4702|7283->4784|7298->4790|7355->4826|7416->4860|7431->4866|7501->4915|7562->4949|7577->4955|7654->5011|7702->5120|7739->5217|7776->5315|7814->5422|7853->5541|7886->5546
                  LINES: 30->2|35->2|36->3|44->11|46->13|47->14|47->14|47->14|49->16|49->16|49->16|51->18|51->18|51->18|53->20|53->20|53->20|55->22|55->22|55->22|57->24|57->24|57->24|59->26|59->26|59->26|61->28|61->28|61->28|63->30|63->30|63->30|65->32|65->32|65->32|66->33|66->33|66->33|67->34|67->34|67->34|82->49|82->49|82->49|83->50|87->54|87->54|87->54|88->55|94->61|94->61|94->61|96->63|99->66|99->66|99->66|100->67|102->69|102->69|102->69|103->70|110->77|110->77|110->77|112->79|113->80|113->80|113->80|115->82|115->82|115->82|117->84|117->84|117->84|119->86|119->86|119->86|120->87|120->87|120->87|122->89|122->89|122->89|124->91|124->91|124->91|126->93|126->93|126->93|127->94|127->94|127->94|128->95|128->95|128->95|129->96|130->97|131->98|132->99|133->100|134->101
                  -- GENERATED --
              */
          