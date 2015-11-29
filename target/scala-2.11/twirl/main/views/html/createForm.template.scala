
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object createForm_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class createForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[TicketModel],play.api.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(TicketForm: Form[TicketModel])(implicit msg: play.api.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.f)}};
Seq[Any](format.raw/*1.71*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.74*/("""

"""),_display_(/*7.2*/main("Ticket-Self-Service")/*7.29*/ {_display_(Seq[Any](format.raw/*7.31*/("""
	"""),format.raw/*8.2*/("""<!-- Begin page content -->
	<div class="container">
		<div class="page-header">
			<h1>Generate Ticket</h1>
		</div>
		
		<div class="row">
			<div class="col-md-8">
				"""),_display_(/*16.6*/form(routes.Application.save())/*16.37*/ {_display_(Seq[Any](format.raw/*16.39*/("""	
					"""),format.raw/*17.6*/("""<fieldset>"""),_display_(/*17.17*/formElements(TicketForm)),format.raw/*17.41*/("""</fieldset>
				
					<div class="actions" style="margin-right:200px">
						<input type="submit" value="Generate.." class="btn btn-primary">
						<a href=""""),_display_(/*21.17*/routes/*21.23*/.Application.list()),format.raw/*21.42*/("""" class="btn btn-default">Cancel</a>
					</div>			
				""")))}),format.raw/*23.6*/("""
			"""),format.raw/*24.4*/("""</div>
			<div class="col-md-4">
				"""),_display_(/*26.6*/info()),format.raw/*26.12*/("""
			"""),format.raw/*27.4*/("""</div>
		</div>
	</div>
	<script src="https://code.jquery.com/jquery-2.1.4.js"></script>

	<script type="text/javascript">

	    $("#created-date").hide()
	    $("#status").val("new")
	    $("#id-assignto").blur(function () """),format.raw/*36.41*/("""{"""),format.raw/*36.42*/("""
	      """),format.raw/*37.8*/("""if($("#id-assignto").val().length!=0)"""),format.raw/*37.45*/("""{"""),format.raw/*37.46*/("""
	       """),format.raw/*38.9*/("""$("#status").val("open")

	      """),format.raw/*40.8*/("""}"""),format.raw/*40.9*/("""
	      """),format.raw/*41.8*/("""else
	      """),format.raw/*42.8*/("""{"""),format.raw/*42.9*/("""
	       """),format.raw/*43.9*/("""$("#status").val("new")
	      """),format.raw/*44.8*/("""}"""),format.raw/*44.9*/("""

	   """),format.raw/*46.5*/("""}"""),format.raw/*46.6*/(""");
	</script>
""")))}),format.raw/*48.2*/("""
"""))
      }
    }
  }

  def render(TicketForm:Form[TicketModel],msg:play.api.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(TicketForm)(msg)

  def f:((Form[TicketModel]) => (play.api.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (TicketForm) => (msg) => apply(TicketForm)(msg)

  def ref: this.type = this

}


}

/**/
object createForm extends createForm_Scope0.createForm
              /*
                  -- GENERATED --
                  DATE: Sun Nov 29 06:43:41 IST 2015
                  SOURCE: /home/amit/Assessment/ticket-play-mongo-final/app/views/createForm.scala.html
                  HASH: 39357fada298043b6d01355c23768fc3cb6ab404
                  MATRIX: 571->1|742->91|774->115|852->70|880->89|908->163|936->166|971->193|1010->195|1038->197|1236->369|1276->400|1316->402|1350->409|1388->420|1433->444|1618->602|1633->608|1673->627|1760->684|1791->688|1855->726|1882->732|1913->736|2165->960|2194->961|2229->969|2294->1006|2323->1007|2359->1016|2419->1049|2447->1050|2482->1058|2521->1070|2549->1071|2585->1080|2643->1111|2671->1112|2704->1118|2732->1119|2777->1134
                  LINES: 20->1|24->5|24->5|25->1|27->4|28->5|30->7|30->7|30->7|31->8|39->16|39->16|39->16|40->17|40->17|40->17|44->21|44->21|44->21|46->23|47->24|49->26|49->26|50->27|59->36|59->36|60->37|60->37|60->37|61->38|63->40|63->40|64->41|65->42|65->42|66->43|67->44|67->44|69->46|69->46|71->48
                  -- GENERATED --
              */
          