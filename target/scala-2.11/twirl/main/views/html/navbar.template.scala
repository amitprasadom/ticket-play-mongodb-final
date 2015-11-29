
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object navbar_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class navbar extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<div class="navbar navbar-inverse navbar-fixed-top" role="navigation" style="background-color: #EE4054">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-inverse-collapse">
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href=""""),_display_(/*9.35*/routes/*9.41*/.Application.index()),format.raw/*9.61*/("""">Ticket Generation Panel</a>
		</div>
	</div>
</div>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object navbar extends navbar_Scope0.navbar
              /*
                  -- GENERATED --
                  DATE: Sat Nov 28 10:35:12 IST 2015
                  SOURCE: /home/amit/Assessment/ticket-play-mongo-final/app/views/navbar.scala.html
                  HASH: e51f177769e86943928d20f50cbdcc77aea4190a
                  MATRIX: 611->0|1059->422|1073->428|1113->448
                  LINES: 25->1|33->9|33->9|33->9
                  -- GENERATED --
              */
          