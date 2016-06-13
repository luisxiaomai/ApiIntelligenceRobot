
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object APIEdit_Scope0 {
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

     object APIEdit_Scope1 {
import models.users.UserInfo

class APIEdit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[UserInfo,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(userInfo:UserInfo):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.21*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<!--
This is a starter templateImplGalting page. Use this page to start your new project from
scratch. This page gets rid of all links and provides the needed markup only.
-->
<html xmlns="http://www.w3.org/1999/html">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>APIDocs</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <!-- Bootstrap 3.3.5 -->
    <link rel="stylesheet" href=""""),_display_(/*16.35*/routes/*16.41*/.Assets.versioned("bootstrap/css/bootstrap.min.css")),format.raw/*16.93*/("""">
    <!-- Font Awesome -->
    <link rel="stylesheet" href=""""),_display_(/*18.35*/routes/*18.41*/.Assets.versioned("awesome/css/font-awesome.min.css")),format.raw/*18.94*/("""">

    <!-- Ionicons -->
    <link rel="stylesheet" href=""""),_display_(/*21.35*/routes/*21.41*/.Assets.versioned("ionicons/css/ionicons.min.css")),format.raw/*21.91*/("""">

    <!-- Theme style -->
    <link rel="stylesheet" href=""""),_display_(/*24.35*/routes/*24.41*/.Assets.versioned("dist/css/AdminLTE.min.css")),format.raw/*24.87*/("""">
    <link rel="stylesheet" href=""""),_display_(/*25.35*/routes/*25.41*/.Assets.versioned("dist/css/docmd.css")),format.raw/*25.80*/("""">
    <link rel="stylesheet" href=""""),_display_(/*26.35*/routes/*26.41*/.Assets.versioned("stylesheets/docs.css")),format.raw/*26.82*/("""">


    <!-- AdminLTE Skins. We have chosen the skin-blue for this starter
          page. However, you can choose any other skin. Make sure you
          apply the skin class to the body tag so the changes take effect.
    -->
    <link rel="stylesheet" href=""""),_display_(/*33.35*/routes/*33.41*/.Assets.versioned("stylesheets/skins/skin-blue.min.css")),format.raw/*33.97*/("""">

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
  """),format.raw/*64.104*/("""

  """),format.raw/*66.3*/("""<body class="fixed skin-blue sidebar-mini sidebar-collapse" data-spy="scroll" data-target="#scrollspy">
    <div class="wrapper">

      <!-- Main Header -->
      <header class="main-header">
      """),_display_(/*71.8*/views/*71.13*/.html.commons.head(userInfo,"ApiDoc","/apiDocPage")),format.raw/*71.64*/("""
      """),format.raw/*72.7*/("""</header>

      <!-- Content Wrapper. Contains page content -->
      """),format.raw/*75.86*/("""
        """),format.raw/*76.9*/("""<div style="background:RGB(34,45,50);margin-top:50px">
        <!-- Main content -->
        """),format.raw/*78.66*/("""
        """),format.raw/*79.9*/("""<section>
        <iframe src="http://10.28.156.12:8080" frameBorder="0" width="100%" scrolling="no" height="900px"></iframe>
        </section><!-- /.content -->
      </div><!-- /.content-wrapper -->

      <!-- Control Sidebar -->

      <!-- Add the sidebar's background. This div must be placed
           immediately after the control sidebar -->
      <div class="control-sidebar-bg"></div>
    </div><!-- ./wrapper -->

    <!-- REQUIRED JS SCRIPTS -->

    <!-- jQuery 2.1.4 -->
    <script src=""""),_display_(/*94.19*/routes/*94.25*/.Assets.versioned("plugins/jQuery/jQuery-2.1.4.min.js")),format.raw/*94.80*/(""""></script>
    <!-- Bootstrap 3.3.5 -->
    <script src=""""),_display_(/*96.19*/routes/*96.25*/.Assets.versioned("bootstrap/js/bootstrap.min.js")),format.raw/*96.75*/(""""></script>
    <!-- AdminLTE App -->
    <script src=""""),_display_(/*98.19*/routes/*98.25*/.Assets.versioned("dist/js/app.min.js")),format.raw/*98.64*/(""""></script>

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
object APIEdit extends APIEdit_Scope0.APIEdit_Scope1.APIEdit
              /*
                  -- GENERATED --
                  DATE: Mon Jun 13 18:03:02 CST 2016
                  SOURCE: /Users/apple/Documents/PRO/ApiIntelligenceRobot/app/views/APIEdit.scala.html
                  HASH: 0f551acfcf95c5bea17f8c338df0997b4cd01f60
                  MATRIX: 810->31|924->50|951->51|1568->641|1583->647|1656->699|1746->762|1761->768|1835->821|1922->881|1937->887|2008->937|2098->1000|2113->1006|2180->1052|2244->1089|2259->1095|2319->1134|2383->1171|2398->1177|2460->1218|2750->1481|2765->1487|2842->1543|4316->3089|4347->3093|4573->3293|4587->3298|4659->3349|4693->3356|4792->3506|4828->3515|4949->3665|4985->3674|5518->4180|5533->4186|5609->4241|5695->4300|5710->4306|5781->4356|5864->4412|5879->4418|5939->4457
                  LINES: 30->2|35->2|36->3|49->16|49->16|49->16|51->18|51->18|51->18|54->21|54->21|54->21|57->24|57->24|57->24|58->25|58->25|58->25|59->26|59->26|59->26|66->33|66->33|66->33|97->64|99->66|104->71|104->71|104->71|105->72|108->75|109->76|111->78|112->79|127->94|127->94|127->94|129->96|129->96|129->96|131->98|131->98|131->98
                  -- GENERATED --
              */
          