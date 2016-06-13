
package views.html.apis.doc

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object ApiDocs2_Scope0 {
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

     object ApiDocs2_Scope1 {
import models.users.UserInfo

class ApiDocs2 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[UserInfo,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(userInfo: UserInfo):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.22*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<!--
This is a starter templateImplGalting page. Use this page to start your new project from
scratch. This page gets rid of all links and provides the needed markup only.
-->
<html ng-app="ApiDocsApp2">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>APIDocs</title>
            <!-- Tell the browser to be responsive to screen width -->
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
            <!-- Bootstrap 3.3.5 -->
        <link rel="stylesheet" href=""""),_display_(/*16.39*/routes/*16.45*/.Assets.versioned("bootstrap/css/bootstrap.min.css")),format.raw/*16.97*/("""">
            <!-- Font Awesome -->
        <link rel="stylesheet" href=""""),_display_(/*18.39*/routes/*18.45*/.Assets.versioned("awesome/css/font-awesome.min.css")),format.raw/*18.98*/("""">

            <!-- Ionicons -->
        <link rel="stylesheet" href=""""),_display_(/*21.39*/routes/*21.45*/.Assets.versioned("ionicons/css/ionicons.min.css")),format.raw/*21.95*/("""">

            <!-- Theme style -->
        <link rel="stylesheet" href=""""),_display_(/*24.39*/routes/*24.45*/.Assets.versioned("dist/css/AdminLTE.min.css")),format.raw/*24.91*/("""">
        <link rel="stylesheet" href=""""),_display_(/*25.39*/routes/*25.45*/.Assets.versioned("dist/css/docmd.css")),format.raw/*25.84*/("""">
        <link rel="stylesheet" href=""""),_display_(/*26.39*/routes/*26.45*/.Assets.versioned("stylesheets/docs.css")),format.raw/*26.86*/("""">

        <script src=""""),_display_(/*28.23*/routes/*28.29*/.Assets.versioned("angular/angular.min.js")),format.raw/*28.72*/(""""></script>
        <script src=""""),_display_(/*29.23*/routes/*29.29*/.Assets.versioned("custom/angular/ApiDocsApp2.js")),format.raw/*29.79*/(""""></script>
        <script src=""""),_display_(/*30.23*/routes/*30.29*/.Assets.versioned("custom/swagger/swagger-parser.js")),format.raw/*30.82*/(""""></script>
        <script src=""""),_display_(/*31.23*/routes/*31.29*/.Assets.versioned("custom/swagger/swagger-client.min.js")),format.raw/*31.86*/(""""></script>
        <script src=""""),_display_(/*32.23*/routes/*32.29*/.Assets.versioned("jsoneditor/jsoneditor.min.js")),format.raw/*32.78*/(""""></script>
        <script src=""""),_display_(/*33.23*/routes/*33.29*/.Assets.versioned("jsoneditor/ng-jsoneditor.js")),format.raw/*33.77*/(""""></script>
        <script src=""""),_display_(/*34.23*/routes/*34.29*/.Assets.versioned("angular/angular-filter.min.js")),format.raw/*34.79*/(""""></script>


            <!-- AdminLTE Skins. We have chosen the skin-blue for this starter
          page. However, you can choose any other skin. Make sure you
          apply the skin class to the body tag so the changes take effect.
    -->
        <link rel="stylesheet" href=""""),_display_(/*41.39*/routes/*41.45*/.Assets.versioned("stylesheets/skins/skin-blue.min.css")),format.raw/*41.101*/("""">

            <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
            <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
            <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>

    <![endif]-->
    </head>
        <!--
  BODY TAG OPTIONS:
  =================
  Apply one or more of the following classes to get the
  desired effect
  |---------------------------------------------------------|
  | SKINS         | skin-blue                               |
  |               | skin-black                              |
  |               | skin-purple                             |
  |               | skin-yellow                             |
  |               | skin-red                                |
  |               | skin-green                              |
  |---------------------------------------------------------|
  |LAYOUT OPTIONS | fixed                                   |
  |               | layout-boxed                            |
  |               | layout-top-nav                          |
  |               | sidebar-collapse                        |
  |               | sidebar-mini                            |
  |---------------------------------------------------------|
  -->
        <!-- <body class="hold-transition skin-blue sidebar-mini"> -->
    <body class="skin-blue sidebar-mini sidebar-collapse" data-spy="scroll" data-target="#scrollspy" ng-controller="ApiDocsContentController2">
    """),format.raw/*73.111*/("""
        """),format.raw/*74.9*/("""<div class="wrapper">

                <!-- Main Header -->
            <header class="main-header">
            """),_display_(/*78.14*/views/*78.19*/.html.commons.head(userInfo, "Docs", "/apiDocPage")),format.raw/*78.70*/("""
            """),format.raw/*79.13*/("""</header>
                <!-- Left side column. contains the logo and sidebar -->
            <aside class="main-sidebar">
            """),_display_(/*82.14*/views/*82.19*/.html.apis.doc.left()),format.raw/*82.40*/("""
            """),format.raw/*83.13*/("""</aside>

                <!-- Content Wrapper. Contains page content -->
            <div class="content-wrapper">
            """),_display_(/*87.14*/views/*87.19*/.html.apis.doc.content_apiinfo()),format.raw/*87.51*/("""
            """),format.raw/*88.13*/("""</div><!-- /.content-wrapper -->

        """),_display_(/*90.10*/views/*90.15*/.html.commons.foot()),format.raw/*90.35*/("""

            """),format.raw/*92.13*/("""<!-- Control Sidebar -->
            <!-- /.control-sidebar -->
            <!-- Add the sidebar's background. This div must be placed
           immediately after the control sidebar -->
            <div class="control-sidebar-bg"></div>
        </div><!-- ./wrapper -->

        <!-- REQUIRED JS SCRIPTS -->

        <!-- jQuery 2.1.4 -->
        <script src=""""),_display_(/*102.23*/routes/*102.29*/.Assets.versioned("plugins/jQuery/jQuery-2.1.4.min.js")),format.raw/*102.84*/(""""></script>
            <!-- Bootstrap 3.3.5 -->
        <script src=""""),_display_(/*104.23*/routes/*104.29*/.Assets.versioned("bootstrap/js/bootstrap.min.js")),format.raw/*104.79*/(""""></script>
            <!-- AdminLTE App -->
        <script src=""""),_display_(/*106.23*/routes/*106.29*/.Assets.versioned("dist/js/app.min.js")),format.raw/*106.68*/(""""></script>

            <!-- Optionally, you can add Slimscroll and FastClick plugins.
         Both of these plugins are recommended to enhance the
         user experience. Slimscroll is required when using the
         fixed layout. -->
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
object ApiDocs2 extends ApiDocs2_Scope0.ApiDocs2_Scope1.ApiDocs2
              /*
                  -- GENERATED --
                  DATE: Mon Jun 13 15:17:35 CST 2016
                  SOURCE: /Users/apple/Documents/PRO/ApiIntelligenceRobot/app/views/apis/doc/ApiDocs2.scala.html
                  HASH: a8a35e804013e744ae3f19d474d349c76fd99a93
                  MATRIX: 822->31|937->51|964->52|1604->665|1619->671|1692->723|1794->798|1809->804|1883->857|1982->929|1997->935|2068->985|2170->1060|2185->1066|2252->1112|2320->1153|2335->1159|2395->1198|2463->1239|2478->1245|2540->1286|2593->1312|2608->1318|2672->1361|2733->1395|2748->1401|2819->1451|2880->1485|2895->1491|2969->1544|3030->1578|3045->1584|3123->1641|3184->1675|3199->1681|3269->1730|3330->1764|3345->1770|3414->1818|3475->1852|3490->1858|3561->1908|3872->2192|3887->2198|3965->2254|5623->3989|5659->3998|5800->4112|5814->4117|5886->4168|5927->4181|6091->4318|6105->4323|6147->4344|6188->4357|6344->4486|6358->4491|6411->4523|6452->4536|6522->4579|6536->4584|6577->4604|6619->4618|7010->4981|7026->4987|7103->5042|7202->5113|7218->5119|7290->5169|7386->5237|7402->5243|7463->5282
                  LINES: 30->2|35->2|36->3|49->16|49->16|49->16|51->18|51->18|51->18|54->21|54->21|54->21|57->24|57->24|57->24|58->25|58->25|58->25|59->26|59->26|59->26|61->28|61->28|61->28|62->29|62->29|62->29|63->30|63->30|63->30|64->31|64->31|64->31|65->32|65->32|65->32|66->33|66->33|66->33|67->34|67->34|67->34|74->41|74->41|74->41|106->73|107->74|111->78|111->78|111->78|112->79|115->82|115->82|115->82|116->83|120->87|120->87|120->87|121->88|123->90|123->90|123->90|125->92|135->102|135->102|135->102|137->104|137->104|137->104|139->106|139->106|139->106
                  -- GENERATED --
              */
          