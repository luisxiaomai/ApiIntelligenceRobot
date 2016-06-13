
package views.html.commons

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object head_Scope0 {
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

     object head_Scope1 {
import models.users.UserInfo

class head extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[UserInfo,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(userInfo:UserInfo,logo:String,homeUrl:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.48*/("""
"""),format.raw/*3.1*/("""<!-- Logo -->
<a href=""""),_display_(/*4.11*/homeUrl),format.raw/*4.18*/("""" class="logo">
        <!-- mini logo for sidebar mini 50x50 pixels -->
    <span class="logo-mini"><b>A</b>PI</span>
        <!-- logo for regular state and mobile devices -->
    <span class="logo-lg"><b>"""),_display_(/*8.31*/logo),format.raw/*8.35*/("""</b>Info</span>
</a>

    <!-- Header Navbar -->
<nav class="navbar navbar-static-top" role="navigation">
        <!-- Sidebar toggle button-->
    <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
        <span class="sr-only">Toggle navigation</span>
    </a>

        <!-- Navbar Right Menu -->
    <div class="navbar-custom-menu">
        <ul class="nav navbar-nav">
                <!-- Docs: style can be found in dropdown.less -->
            <li class="dropdown">
                <a href="/apiDocPage">
                    <i class="glyphicon glyphicon-info-sign"></i>
                </a>
            </li>
                <!-- design: style can be found in dropdown.less -->
            <li class="dropdown">
                <a href="/apiDesignPage">
                    <i class="glyphicon glyphicon-pencil"></i>
                </a>
            </li>
                <!-- scenario: style can be found in dropdown.less -->
            <li class="dropdown">
                <a href="/scenariosPage">
                    <i class="glyphicon glyphicon-th"></i>
                </a>
            </li>

                <!-- User Account Menu -->
            <li class="dropdown user user-menu">
                    <!-- Menu Toggle Button -->
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        <!-- The user image in the navbar-->
                    <img src=""""),_display_(/*45.32*/routes/*45.38*/.Assets.versioned("dist/img/avatar.png")),format.raw/*45.78*/("""" class="user-image" alt="User Image">
                        <!-- hidden-xs hides the username on small devices so only the image appears. -->
                    <span class="hidden-xs">"""),_display_(/*47.46*/userInfo/*47.54*/.getEmailUser),format.raw/*47.67*/("""</span>
                </a>
                <ul class="dropdown-menu">
                        <!-- The user image in the menu -->
                    <li class="user-header">
                        <img src=""""),_display_(/*52.36*/routes/*52.42*/.Assets.versioned("dist/img/avatar.png")),format.raw/*52.82*/("""" class="img-circle" alt="User Image">
                        <p>
                            """),_display_(/*54.30*/userInfo/*54.38*/.getCodeUser),format.raw/*54.50*/(""" """),format.raw/*54.51*/("""- TESTER Developer
                            <small>Member since Nov. 2016</small>
                        </p>
                    </li>
                        <!-- Menu Body -->
                    <li class="user-body">
                        <div class="col-xs-4 text-center">
                            <a href="#">Followers</a>
                        </div>
                        <div class="col-xs-4 text-center">
                            <a href="#">Sales</a>
                        </div>
                        <div class="col-xs-4 text-center">
                            <a href="#">Friends</a>
                        </div>
                    </li>
                        <!-- Menu Footer-->
                    <li class="user-footer">
                        <div class="pull-left">
                            <a href="#" class="btn btn-default btn-flat">Profile</a>
                        </div>
                        <div class="pull-right">
                            <a href="/userSignout" class="btn btn-default btn-flat">Sign out</a>
                        </div>
                    </li>
                </ul>
            </li>
                <!-- Control Sidebar Toggle Button -->
            <li>
                <a href="/userloginout">
                    <i class="glyphicon glyphicon-log-out"></i>
                </a>
            </li>
            """),format.raw/*87.21*/("""
                """),format.raw/*88.94*/("""
            """),format.raw/*89.22*/("""
        """),format.raw/*90.9*/("""</ul>
    </div>
</nav>"""))
      }
    }
  }

  def render(userInfo:UserInfo,logo:String,homeUrl:String): play.twirl.api.HtmlFormat.Appendable = apply(userInfo,logo,homeUrl)

  def f:((UserInfo,String,String) => play.twirl.api.HtmlFormat.Appendable) = (userInfo,logo,homeUrl) => apply(userInfo,logo,homeUrl)

  def ref: this.type = this

}


}
}

/**/
object head extends head_Scope0.head_Scope1.head
              /*
                  -- GENERATED --
                  DATE: Tue Jun 07 16:18:30 CST 2016
                  SOURCE: /Users/apple/Documents/PRO/ApiIntelligenceRobot/app/views/commons/head.scala.html
                  HASH: fd9f80b592d57c454cbc823752e9ae4cbc4ba21e
                  MATRIX: 823->31|964->77|991->78|1041->102|1068->109|1302->317|1326->321|2794->1762|2809->1768|2870->1808|3087->1998|3104->2006|3138->2019|3377->2231|3392->2237|3453->2277|3576->2373|3593->2381|3626->2393|3655->2394|5085->3804|5130->3898|5171->3920|5207->3929
                  LINES: 30->2|35->2|36->3|37->4|37->4|41->8|41->8|78->45|78->45|78->45|80->47|80->47|80->47|85->52|85->52|85->52|87->54|87->54|87->54|87->54|120->87|121->88|122->89|123->90
                  -- GENERATED --
              */
          