
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object twitterBootstrapInput_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class twitterBootstrapInput extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[helper.FieldElements,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(elements: helper.FieldElements):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""

    """),format.raw/*5.56*/("""
"""),format.raw/*6.1*/("""<div class="form-group """),_display_(/*6.25*/if(elements.hasErrors)/*6.47*/ {_display_(Seq[Any](format.raw/*6.49*/("""has-error""")))}),format.raw/*6.59*/("""">
    <label for=""""),_display_(/*7.18*/elements/*7.26*/.id),format.raw/*7.29*/("""" class="col-sm-2 control-label">"""),_display_(/*7.63*/elements/*7.71*/.label),format.raw/*7.77*/("""</label>
    <div class="col-sm-10">
        """),_display_(/*9.10*/elements/*9.18*/.input),format.raw/*9.24*/("""

        """),format.raw/*11.9*/("""<span class="help-block">"""),_display_(/*11.35*/elements/*11.43*/.infos.mkString(", ")),format.raw/*11.64*/("""</span>

    </div>
</div>"""))
      }
    }
  }

  def render(elements:helper.FieldElements): play.twirl.api.HtmlFormat.Appendable = apply(elements)

  def f:((helper.FieldElements) => play.twirl.api.HtmlFormat.Appendable) = (elements) => apply(elements)

  def ref: this.type = this

}


}

/**/
object twitterBootstrapInput extends twitterBootstrapInput_Scope0.twitterBootstrapInput
              /*
                  -- GENERATED --
                  DATE: Sun Nov 29 06:43:41 IST 2015
                  SOURCE: /home/amit/Assessment/ticket-play-mongo-final/app/views/twitterBootstrapInput.scala.html
                  HASH: 3205872407c120b420ec8a666ac906e8cf1f6f01
                  MATRIX: 573->1|700->33|733->202|760->203|810->227|840->249|879->251|919->261|965->281|981->289|1004->292|1064->326|1080->334|1106->340|1178->386|1194->394|1220->400|1257->410|1310->436|1327->444|1369->465
                  LINES: 20->1|25->1|27->5|28->6|28->6|28->6|28->6|28->6|29->7|29->7|29->7|29->7|29->7|29->7|31->9|31->9|31->9|33->11|33->11|33->11|33->11
                  -- GENERATED --
              */
          