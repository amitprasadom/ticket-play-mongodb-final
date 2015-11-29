
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Play with Anorm")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""

    """),format.raw/*5.5*/("""<!-- Begin page content -->
    <div class="container">
      <div class="page-header">
        <h1></h1>
      </div>
    </div>
""")))}),format.raw/*11.2*/("""
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Sat Nov 28 10:35:12 IST 2015
                  SOURCE: /home/amit/Assessment/ticket-play-mongo-final/app/views/index.scala.html
                  HASH: f228401f78f2d3439948b49b9724eebc17c14213
                  MATRIX: 527->1|639->18|667->21|698->44|737->46|769->52|930->183
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5|35->11
                  -- GENERATED --
              */
          