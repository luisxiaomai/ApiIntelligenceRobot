
package views.html.apis.doc

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object ApiDocs_Scope0 {
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

     object ApiDocs_Scope1 {
import models.users.UserInfo

class ApiDocs extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[UserInfo,play.twirl.api.HtmlFormat.Appendable] {

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
<html ng-app="ApiDocsApp">
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


        <script src=""""),_display_(/*29.23*/routes/*29.29*/.Assets.versioned("angular/angular.min.js")),format.raw/*29.72*/(""""></script>
        <script src=""""),_display_(/*30.23*/routes/*30.29*/.Assets.versioned("custom/angular/ApiDocsApp.js")),format.raw/*30.78*/(""""></script>
        <script src=""""),_display_(/*31.23*/routes/*31.29*/.Assets.versioned("custom/swagger/swagger-parser.js")),format.raw/*31.82*/(""""></script>
            <!-- jQuery 2.1.4 -->
        <script src=""""),_display_(/*33.23*/routes/*33.29*/.Assets.versioned("plugins/jQuery/jQuery-2.1.4.min.js")),format.raw/*33.84*/(""""></script>


            <!-- AdminLTE Skins. We have chosen the skin-blue for this starter
          page. However, you can choose any other skin. Make sure you
          apply the skin class to the body tag so the changes take effect.
    -->

            <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
            <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
            <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>

          <![endif]-->

        <link rel="stylesheet" href=""""),_display_(/*49.39*/routes/*49.45*/.Assets.versioned("swaggerui/css/typography.css")),format.raw/*49.94*/("""" media='screen' type='text/css'>
        """),format.raw/*50.126*/("""
        """),format.raw/*51.9*/("""<link rel="stylesheet" href=""""),_display_(/*51.39*/routes/*51.45*/.Assets.versioned("swaggerui/css/screen.css")),format.raw/*51.90*/("""" media='screen' type='text/css'>
        """),format.raw/*52.125*/("""
        """),format.raw/*53.9*/("""<link rel="stylesheet" href=""""),_display_(/*53.39*/routes/*53.45*/.Assets.versioned("swaggerui/css/typography.css")),format.raw/*53.94*/("""" media='print' type='text/css'>


        <script src=""""),_display_(/*56.23*/routes/*56.29*/.Assets.versioned("swaggerui/lib/object-assign-pollyfill.js")),format.raw/*56.90*/(""""></script>
        <script src=""""),_display_(/*57.23*/routes/*57.29*/.Assets.versioned("swaggerui/lib/jquery.slideto.min.js")),format.raw/*57.85*/(""""></script>
        <script src=""""),_display_(/*58.23*/routes/*58.29*/.Assets.versioned("swaggerui/lib/jquery.wiggle.min.js")),format.raw/*58.84*/(""""></script>
        <script src=""""),_display_(/*59.23*/routes/*59.29*/.Assets.versioned("swaggerui/lib/jquery.ba-bbq.min.js")),format.raw/*59.84*/(""""></script>
        <script src=""""),_display_(/*60.23*/routes/*60.29*/.Assets.versioned("swaggerui/lib/handlebars-2.0.0.js")),format.raw/*60.83*/(""""></script>
        <script src=""""),_display_(/*61.23*/routes/*61.29*/.Assets.versioned("swaggerui/lib/js-yaml.min.js")),format.raw/*61.78*/(""""></script>
        <script src=""""),_display_(/*62.23*/routes/*62.29*/.Assets.versioned("swaggerui/lib/lodash.min.js")),format.raw/*62.77*/(""""></script>
        <script src=""""),_display_(/*63.23*/routes/*63.29*/.Assets.versioned("swaggerui/lib/backbone-min.js")),format.raw/*63.79*/(""""></script>
        <script src=""""),_display_(/*64.23*/routes/*64.29*/.Assets.versioned("swaggerui/swagger-ui.min.js")),format.raw/*64.77*/(""""></script>
        <script src=""""),_display_(/*65.23*/routes/*65.29*/.Assets.versioned("swaggerui/lib/highlight.9.1.0.pack.js")),format.raw/*65.87*/(""""></script>
        <script src=""""),_display_(/*66.23*/routes/*66.29*/.Assets.versioned("swaggerui/lib/highlight.9.1.0.pack_extended.js")),format.raw/*66.96*/(""""></script>
        <script src=""""),_display_(/*67.23*/routes/*67.29*/.Assets.versioned("swaggerui/lib/jsoneditor.min.js")),format.raw/*67.81*/(""""></script>
        <script src=""""),_display_(/*68.23*/routes/*68.29*/.Assets.versioned("swaggerui/lib/marked.js")),format.raw/*68.73*/(""""></script>
        <script src=""""),_display_(/*69.23*/routes/*69.29*/.Assets.versioned("swaggerui/lib/swagger-oauth.js")),format.raw/*69.80*/(""""></script>

        <link rel="stylesheet" href=""""),_display_(/*71.39*/routes/*71.45*/.Assets.versioned("stylesheets/skins/skin-blue.min.css")),format.raw/*71.101*/("""">


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
    <body class="skin-blue sidebar-mini sidebar-collapse" data-spy="scroll" data-target="#scrollspy" ng-controller="ApiDocsContentController">
        """),format.raw/*97.115*/("""
        """),format.raw/*98.9*/("""<div class="wrapper">

                <!-- Main Header -->
            <header class="main-header">
            """),_display_(/*102.14*/views/*102.19*/.html.commons.head(userInfo, "Docs", "/apiDocPage")),format.raw/*102.70*/("""
            """),format.raw/*103.13*/("""</header>
                <!-- Left side column. contains the logo and sidebar -->
            <aside class="main-sidebar">
            """),_display_(/*106.14*/views/*106.19*/.html.apis.doc.left()),format.raw/*106.40*/("""
            """),format.raw/*107.13*/("""</aside>

                <!-- Content Wrapper. Contains page content -->
            <div class="content-wrapper">
            """),_display_(/*111.14*/views/*111.19*/.html.apis.doc.content()),format.raw/*111.43*/("""

            """),format.raw/*113.13*/("""</div><!-- /.content-wrapper -->

        """),_display_(/*115.10*/views/*115.15*/.html.commons.foot()),format.raw/*115.35*/("""

            """),format.raw/*117.13*/("""<!-- Control Sidebar -->
        views.html.commons.control_sidebar()
            <!-- /.control-sidebar -->
            <!-- Add the sidebar's background. This div must be placed
           immediately after the control sidebar -->
            <div class="control-sidebar-bg"></div>
        </div><!-- ./wrapper -->

        <!-- REQUIRED JS SCRIPTS -->


        <!-- Bootstrap 3.3.5 -->
        <script src=""""),_display_(/*129.23*/routes/*129.29*/.Assets.versioned("bootstrap/js/bootstrap.min.js")),format.raw/*129.79*/(""""></script>
            <!-- AdminLTE App -->
        <script src=""""),_display_(/*131.23*/routes/*131.29*/.Assets.versioned("dist/js/app.min.js")),format.raw/*131.68*/(""""></script>

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
object ApiDocs extends ApiDocs_Scope0.ApiDocs_Scope1.ApiDocs
              /*
                  -- GENERATED --
                  DATE: Mon Jun 13 10:17:13 CST 2016
                  SOURCE: /Users/apple/Documents/PRO/ApiIntelligenceRobot/app/views/apis/doc/ApiDocs.scala.html
                  HASH: 569ded2005119a390d4e143a1a24e9e5cb8da49f
                  MATRIX: 819->31|934->51|961->52|1600->664|1615->670|1688->722|1790->797|1805->803|1879->856|1978->928|1993->934|2064->984|2166->1059|2181->1065|2248->1111|2316->1152|2331->1158|2391->1197|2459->1238|2474->1244|2536->1285|2590->1312|2605->1318|2669->1361|2730->1395|2745->1401|2815->1450|2876->1484|2891->1490|2965->1543|3060->1611|3075->1617|3151->1672|3872->2366|3887->2372|3957->2421|4028->2580|4064->2589|4121->2619|4136->2625|4202->2670|4273->2828|4309->2837|4366->2867|4381->2873|4451->2922|4535->2979|4550->2985|4632->3046|4693->3080|4708->3086|4785->3142|4846->3176|4861->3182|4937->3237|4998->3271|5013->3277|5089->3332|5150->3366|5165->3372|5240->3426|5301->3460|5316->3466|5386->3515|5447->3549|5462->3555|5531->3603|5592->3637|5607->3643|5678->3693|5739->3727|5754->3733|5823->3781|5884->3815|5899->3821|5978->3879|6039->3913|6054->3919|6142->3986|6203->4020|6218->4026|6291->4078|6352->4112|6367->4118|6432->4162|6493->4196|6508->4202|6580->4253|6658->4304|6673->4310|6751->4366|8019->5711|8055->5720|8197->5834|8212->5839|8285->5890|8327->5903|8492->6040|8507->6045|8550->6066|8592->6079|8749->6208|8764->6213|8810->6237|8853->6251|8924->6294|8939->6299|8981->6319|9024->6333|9464->6745|9480->6751|9552->6801|9648->6869|9664->6875|9725->6914
                  LINES: 30->2|35->2|36->3|49->16|49->16|49->16|51->18|51->18|51->18|54->21|54->21|54->21|57->24|57->24|57->24|58->25|58->25|58->25|59->26|59->26|59->26|62->29|62->29|62->29|63->30|63->30|63->30|64->31|64->31|64->31|66->33|66->33|66->33|82->49|82->49|82->49|83->50|84->51|84->51|84->51|84->51|85->52|86->53|86->53|86->53|86->53|89->56|89->56|89->56|90->57|90->57|90->57|91->58|91->58|91->58|92->59|92->59|92->59|93->60|93->60|93->60|94->61|94->61|94->61|95->62|95->62|95->62|96->63|96->63|96->63|97->64|97->64|97->64|98->65|98->65|98->65|99->66|99->66|99->66|100->67|100->67|100->67|101->68|101->68|101->68|102->69|102->69|102->69|104->71|104->71|104->71|130->97|131->98|135->102|135->102|135->102|136->103|139->106|139->106|139->106|140->107|144->111|144->111|144->111|146->113|148->115|148->115|148->115|150->117|162->129|162->129|162->129|164->131|164->131|164->131
                  -- GENERATED --
              */
          