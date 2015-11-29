
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object info_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class info extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<div class="panel panel-primary">
	<div class="panel-heading">
		<h3 class="panel-title">Api Info</h3>
	</div>
	<div class="panel-body">
		<p>	# ticket list</p>

		<p>	GET         /ticket</p>
		<p>	# Add ticket</p>
		<p>	GET         /ticket/new</p>
		<p>	POST        /ticket/save</p>

		<p>	# Edit existing ticket</p>
		<p>	GET         /ticket/:id</p>
		<p>	POST        /ticket/:id</p>


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
object info extends info_Scope0.info
              /*
                  -- GENERATED --
                  DATE: Sat Nov 28 10:35:12 IST 2015
                  SOURCE: /home/amit/Assessment/ticket-play-mongo-final/app/views/info.scala.html
                  HASH: 3515c50f554922e14f685f8ed1964781a320e8ba
                  MATRIX: 607->0
                  LINES: 25->1
                  -- GENERATED --
              */
          