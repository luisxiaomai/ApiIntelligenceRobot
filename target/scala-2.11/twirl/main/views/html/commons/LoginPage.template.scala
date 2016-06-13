
package views.html.commons

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object LoginPage_Scope0 {
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

class LoginPage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html ng-app="UserApp">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Log in</title>
            <!-- Tell the browser to be responsive to screen width -->
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
            <!-- Bootstrap 3.3.5 -->
        <link rel="stylesheet" href=""""),_display_(/*10.39*/routes/*10.45*/.Assets.versioned("bootstrap/css/bootstrap.min.css")),format.raw/*10.97*/("""">

            <!-- Font Awesome -->
        <link rel="stylesheet" href=""""),_display_(/*13.39*/routes/*13.45*/.Assets.versioned("awesome/css/font-awesome.min.css")),format.raw/*13.98*/("""">
            <!-- Ionicons -->
        <link rel="stylesheet" href=""""),_display_(/*15.39*/routes/*15.45*/.Assets.versioned("ionicons/css/ionicons.min.css")),format.raw/*15.95*/("""">
            <!-- Theme style -->
        <link rel="stylesheet" href=""""),_display_(/*17.39*/routes/*17.45*/.Assets.versioned("dist/css/AdminLTE.min.css")),format.raw/*17.91*/("""">
            <!-- iCheck -->
        <link rel="stylesheet" href=""""),_display_(/*19.39*/routes/*19.45*/.Assets.versioned("plugins/iCheck/square/blue.css")),format.raw/*19.96*/("""">

            <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
            <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
            <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

        <script src=""""),_display_(/*28.23*/routes/*28.29*/.Assets.versioned("angular/angular.min.js")),format.raw/*28.72*/(""""></script>
        <script src=""""),_display_(/*29.23*/routes/*29.29*/.Assets.versioned("custom/angular/UserApp.js")),format.raw/*29.75*/(""""></script>
    </head>
    <body class="hold-transition login-page" ng-controller="UserLoginController">
        <div class="login-box">
            <div class="login-logo">
                <a href="/"><b>Api</b>Robot</a>
            </div><!-- /.login-logo -->
            <div class="login-box-body">
                <p class="login-box-msg">"""),format.raw/*37.42*/("""{"""),format.raw/*37.43*/("""{"""),format.raw/*37.44*/("""msg"""),format.raw/*37.47*/("""}"""),format.raw/*37.48*/("""}"""),format.raw/*37.49*/("""</p>
                    <div class="form-group has-feedback">
                        <input type="email" class="form-control" placeholder="Email" name="emailUser" id="emailUser">
                        <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
                    </div>
                    <div class="form-group has-feedback">
                        <input type="password" class="form-control" placeholder="Password" name="pwdUser" id="pwdUser">
                        <span class="glyphicon glyphicon-lock form-control-feedback"></span>
                    </div>
                    <div class="row">
                        <div class="col-xs-8">
                            <div class="checkbox icheck">
                                <label>
                                    <input type="checkbox"> Remember Me
                                </label>
                            </div>
                        </div><!-- /.col -->
                        <div class="col-xs-4">
                            <button type="button" class="btn btn-primary btn-block btn-flat" ng-click="userLogin()">Sign In</button>
                        </div><!-- /.col -->
                    </div>
                <div class="social-auth-links text-center">
                    <p>- OR -</p>
                    <a href="/registerPage" class="btn btn-block btn-social btn-facebook btn-flat"><i class="fa fa-registered"></i> Register</a>
                    """),format.raw/*61.149*/("""
                """),format.raw/*62.17*/("""</div><!-- /.social-auth-links -->

                """),format.raw/*64.61*/("""
                """),format.raw/*65.100*/("""

            """),format.raw/*67.13*/("""</div><!-- /.login-box-body -->
        </div><!-- /.login-box -->

        <!-- jQuery 2.1.4 -->
        <script src=""""),_display_(/*71.23*/routes/*71.29*/.Assets.versioned("plugins/jQuery/jQuery-2.1.4.min.js")),format.raw/*71.84*/(""""></script>
            <!-- Bootstrap 3.3.5 -->
        <script src=""""),_display_(/*73.23*/routes/*73.29*/.Assets.versioned("bootstrap/js/bootstrap.min.js")),format.raw/*73.79*/(""""></script>
            <!-- iCheck -->
        <script src=""""),_display_(/*75.23*/routes/*75.29*/.Assets.versioned("plugins/iCheck/icheck.min.js")),format.raw/*75.78*/(""""></script>

        <script>
      $(function () """),format.raw/*78.21*/("""{"""),format.raw/*78.22*/("""
          """),format.raw/*79.11*/("""$('input').iCheck("""),format.raw/*79.29*/("""{"""),format.raw/*79.30*/("""
              """),format.raw/*80.15*/("""checkboxClass: 'icheckbox_square-blue',
              radioClass: 'iradio_square-blue',
              increaseArea: '20%' // optional
          """),format.raw/*83.11*/("""}"""),format.raw/*83.12*/(""");
      """),format.raw/*84.7*/("""}"""),format.raw/*84.8*/(""");
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
object LoginPage extends LoginPage_Scope0.LoginPage
              /*
                  -- GENERATED --
                  DATE: Mon Jun 06 14:22:16 CST 2016
                  SOURCE: /Users/apple/Documents/PRO/ApiIntelligenceRobot/app/views/commons/LoginPage.scala.html
                  HASH: 39ad8678ba72178ab7a2086c7befb785067371b5
                  MATRIX: 843->0|1302->432|1317->438|1390->490|1493->566|1508->572|1582->625|1680->696|1695->702|1766->752|1867->826|1882->832|1949->878|2045->947|2060->953|2132->1004|2587->1432|2602->1438|2666->1481|2727->1515|2742->1521|2809->1567|3182->1912|3211->1913|3240->1914|3271->1917|3300->1918|3329->1919|4848->3537|4893->3554|4973->3650|5019->3750|5061->3764|5208->3884|5223->3890|5299->3945|5397->4016|5412->4022|5483->4072|5572->4134|5587->4140|5657->4189|5735->4239|5764->4240|5803->4251|5849->4269|5878->4270|5921->4285|6093->4429|6122->4430|6158->4439|6186->4440
                  LINES: 32->1|41->10|41->10|41->10|44->13|44->13|44->13|46->15|46->15|46->15|48->17|48->17|48->17|50->19|50->19|50->19|59->28|59->28|59->28|60->29|60->29|60->29|68->37|68->37|68->37|68->37|68->37|68->37|92->61|93->62|95->64|96->65|98->67|102->71|102->71|102->71|104->73|104->73|104->73|106->75|106->75|106->75|109->78|109->78|110->79|110->79|110->79|111->80|114->83|114->83|115->84|115->84
                  -- GENERATED --
              */
          