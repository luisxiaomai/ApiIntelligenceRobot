
package views.html.commons

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object RegisterPage_Scope0 {
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

class RegisterPage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html ng-app="UserApp">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Register Page</title>
      <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
      <!-- Bootstrap 3.3.5 -->
      <!-- Bootstrap 3.3.5 -->
    <link rel="stylesheet" href=""""),_display_(/*11.35*/routes/*11.41*/.Assets.versioned("bootstrap/css/bootstrap.min.css")),format.raw/*11.93*/("""">

      <!-- Font Awesome -->
    <link rel="stylesheet" href=""""),_display_(/*14.35*/routes/*14.41*/.Assets.versioned("awesome/css/font-awesome.min.css")),format.raw/*14.94*/("""">
      <!-- Ionicons -->
    <link rel="stylesheet" href=""""),_display_(/*16.35*/routes/*16.41*/.Assets.versioned("ionicons/css/ionicons.min.css")),format.raw/*16.91*/("""">
      <!-- Theme style -->
    <link rel="stylesheet" href=""""),_display_(/*18.35*/routes/*18.41*/.Assets.versioned("dist/css/AdminLTE.min.css")),format.raw/*18.87*/("""">

    <link rel="stylesheet" href=""""),_display_(/*20.35*/routes/*20.41*/.Assets.versioned("plugins/iCheck/square/blue.css")),format.raw/*20.92*/("""">

      <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
      <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
      <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

    <script src=""""),_display_(/*29.19*/routes/*29.25*/.Assets.versioned("angular/angular.min.js")),format.raw/*29.68*/(""""></script>
    <script src=""""),_display_(/*30.19*/routes/*30.25*/.Assets.versioned("custom/angular/UserApp.js")),format.raw/*30.71*/(""""></script>

  </head>
  <body class="hold-transition register-page" ng-controller="UserRegisterController">
    <div class="register-box">
      <div class="login-logo">
        <a href="/"><b>Api</b>Robot</a>
      </div><!-- /.login-logo -->

      <div class="register-box-body">
        <p class="login-box-msg">"""),format.raw/*40.34*/("""{"""),format.raw/*40.35*/("""{"""),format.raw/*40.36*/("""msg"""),format.raw/*40.39*/("""}"""),format.raw/*40.40*/("""}"""),format.raw/*40.41*/("""</p>
        <div class="form-group has-feedback">
          <input type="text" class="form-control" placeholder="NickName"  name="nameZhUser" id="nameZhUser">
          <span class="glyphicon glyphicon-user form-control-feedback"></span>
        </div>
        <div class="form-group has-feedback">
          <input type="email" class="form-control" placeholder="Email"  name="emailUser" id="emailUser">
          <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
        </div>
        <div class="form-group has-feedback">
          <input type="password" class="form-control" placeholder="Password"  name="pwdUser" id="pwdUser">
          <span class="glyphicon glyphicon-lock form-control-feedback"></span>
        </div>
        <div class="form-group has-feedback">
          <input type="text" class="form-control" placeholder="phoneUser" name="phoneUser" id="phoneUser">
          <span class="glyphicon glyphicon-phone form-control-feedback"></span>
        </div>
        <div class="form-group has-feedback">
          <input type="text" class="form-control" placeholder="telUser" name="telUser" id="telUser">
          <span class="glyphicon glyphicon-earphone form-control-feedback"></span>
        </div>
        <div class="row">
          <div class="col-xs-8">
            """),format.raw/*63.46*/("""
            """),format.raw/*64.24*/("""
            """),format.raw/*65.77*/("""
            """),format.raw/*66.25*/("""
            """),format.raw/*67.23*/("""
          """),format.raw/*68.11*/("""</div><!-- /.col -->
          <div class="col-xs-4">
            <button type="button" class="btn btn-primary btn-block btn-flat" ng-click="userRegister()">Register</button>
          </div><!-- /.col -->
        </div>

        <a href="/" class="text-center">I already have a membership</a>
      </div><!-- /.form-box -->
    </div><!-- /.register-box -->

    <!-- jQuery 2.1.4 -->
    <script src=""""),_display_(/*79.19*/routes/*79.25*/.Assets.versioned("plugins/jQuery/jQuery-2.1.4.min.js")),format.raw/*79.80*/(""""></script>
      <!-- Bootstrap 3.3.5 -->
    <script src=""""),_display_(/*81.19*/routes/*81.25*/.Assets.versioned("bootstrap/js/bootstrap.min.js")),format.raw/*81.75*/(""""></script>
      <!-- iCheck -->
    <script src=""""),_display_(/*83.19*/routes/*83.25*/.Assets.versioned("plugins/iCheck/icheck.min.js")),format.raw/*83.74*/(""""></script>
    <script>
      $(function () """),format.raw/*85.21*/("""{"""),format.raw/*85.22*/("""
        """),format.raw/*86.9*/("""$('input').iCheck("""),format.raw/*86.27*/("""{"""),format.raw/*86.28*/("""
          """),format.raw/*87.11*/("""checkboxClass: 'icheckbox_square-blue',
          radioClass: 'iradio_square-blue',
          increaseArea: '20%' // optional
        """),format.raw/*90.9*/("""}"""),format.raw/*90.10*/(""");
      """),format.raw/*91.7*/("""}"""),format.raw/*91.8*/(""");
    </script>
  </body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object RegisterPage extends RegisterPage_Scope0.RegisterPage
              /*
                  -- GENERATED --
                  DATE: Mon Jun 06 14:22:14 CST 2016
                  SOURCE: /Users/apple/Documents/PRO/ApiIntelligenceRobot/app/views/commons/RegisterPage.scala.html
                  HASH: 466093798bc601392c86c9468963a72272d524e4
                  MATRIX: 849->0|1312->436|1327->442|1400->494|1493->560|1508->566|1582->619|1670->680|1685->686|1756->736|1847->800|1862->806|1929->852|1994->890|2009->896|2081->947|2514->1353|2529->1359|2593->1402|2650->1432|2665->1438|2732->1484|3077->1801|3106->1802|3135->1803|3166->1806|3195->1807|3224->1808|4566->3155|4607->3179|4648->3256|4689->3281|4730->3304|4769->3315|5201->3720|5216->3726|5292->3781|5380->3842|5395->3848|5466->3898|5545->3950|5560->3956|5630->4005|5703->4050|5732->4051|5768->4060|5814->4078|5843->4079|5882->4090|6043->4224|6072->4225|6108->4234|6136->4235
                  LINES: 32->1|42->11|42->11|42->11|45->14|45->14|45->14|47->16|47->16|47->16|49->18|49->18|49->18|51->20|51->20|51->20|60->29|60->29|60->29|61->30|61->30|61->30|71->40|71->40|71->40|71->40|71->40|71->40|94->63|95->64|96->65|97->66|98->67|99->68|110->79|110->79|110->79|112->81|112->81|112->81|114->83|114->83|114->83|116->85|116->85|117->86|117->86|117->86|118->87|121->90|121->90|122->91|122->91
                  -- GENERATED --
              */
          