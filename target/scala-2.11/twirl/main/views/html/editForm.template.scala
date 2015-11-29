
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object editForm_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class editForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Form[TicketModel],play.api.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: String, ticketForm: Form[TicketModel])(implicit msg: play.api.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.f) }};
Seq[Any](format.raw/*1.83*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.75*/("""

"""),_display_(/*7.2*/main("Ticket-Self-Service")/*7.29*/ {_display_(Seq[Any](format.raw/*7.31*/("""
    
    """),format.raw/*9.5*/("""<!-- Begin page content -->
	<div class="container">
		<div class="page-header">
			<h1>Update Ticket</h1>
		</div>
		
		<div class="row">
			<div class="col-md-8">
				"""),_display_(/*17.6*/form(routes.Application.update(id))/*17.41*/ {_display_(Seq[Any](format.raw/*17.43*/("""
					"""),format.raw/*18.6*/("""<fieldset>

						"""),_display_(/*20.8*/inputText(ticketForm("custname"), '_label -> "Cust Name*", 'class -> "form-control",'readonly->true)),format.raw/*20.108*/("""
						"""),_display_(/*21.8*/inputText(ticketForm("custmobile"), '_label -> "Cust Mobile*", 'class -> "form-control",'readonly->true)),format.raw/*21.112*/("""
						"""),_display_(/*22.8*/textarea(ticketForm("custaddress"), '_label -> "Address*", 'class -> "form-control",'readonly->true)),format.raw/*22.108*/("""
						"""),_display_(/*23.8*/inputText(ticketForm("pincode"), '_label -> "Pincode*", 'class -> "form-control",'readonly->true)),format.raw/*23.105*/("""
						"""),_display_(/*24.8*/inputText(ticketForm("createdby"), '_label -> "Created By*", 'class -> "form-control",'readonly->true)),format.raw/*24.110*/("""
						"""),_display_(/*25.8*/inputText(ticketForm("assignedto"), '_label -> "Assigned To*", 'class -> "form-control",'required->true,'id->"assigned-to",'onblur->"validateAssigned()")),format.raw/*25.161*/("""
						"""),_display_(/*26.8*/textarea(ticketForm("remark"), '_label -> "Remarks", 'class -> "form-control")),format.raw/*26.86*/("""
						"""),_display_(/*27.8*/select(ticketForm("status"), options("open"->"Open","close"->"Close"),'id->"status")),format.raw/*27.92*/("""


					"""),format.raw/*30.6*/("""</fieldset>
				
					<div class="actions">
						<input type="submit" value="Update this Ticket	"	class="btn btn-primary" onclick="validateAssigned()"> or
						<a href=""""),_display_(/*34.17*/routes/*34.23*/.Application.list()),format.raw/*34.42*/("""" class="btn btn-default">Cancel</a>
					</div>
				""")))}),format.raw/*36.6*/("""
			"""),format.raw/*37.4*/("""</div>
			<div class="col-md-4">
				"""),_display_(/*39.6*/info()),format.raw/*39.12*/("""
			"""),format.raw/*40.4*/("""</div>
		</div>

	</div>


    <script src="https://code.jquery.com/jquery-2.1.4.js"></script>
	<script type="text/javascript">



    function validateAssigned() """),format.raw/*51.33*/("""{"""),format.raw/*51.34*/("""
    """),format.raw/*52.5*/("""if ( $ ( "#assigned-to" ).val().trim().length == 0 )
    """),format.raw/*53.5*/("""{"""),format.raw/*53.6*/("""
      """),format.raw/*54.7*/("""alert ( "You must have to assign this ticket to some one since this in open state" )
     $ ( "#assigned-to" ).focus ( )
    """),format.raw/*56.5*/("""}"""),format.raw/*56.6*/("""

    """),format.raw/*58.5*/("""}"""),format.raw/*58.6*/("""
	"""),format.raw/*59.2*/("""</script>
""")))}),format.raw/*60.2*/("""
"""))
      }
    }
  }

  def render(id:String,ticketForm:Form[TicketModel],msg:play.api.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(id,ticketForm)(msg)

  def f:((String,Form[TicketModel]) => (play.api.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (id,ticketForm) => (msg) => apply(id,ticketForm)(msg)

  def ref: this.type = this

}


}

/**/
object editForm extends editForm_Scope0.editForm
              /*
                  -- GENERATED --
                  DATE: Sun Nov 29 06:59:35 IST 2015
                  SOURCE: /home/amit/Assessment/ticket-play-mongo-final/app/views/editForm.scala.html
                  HASH: 20246c4986d0a14049c837796cb7bdf9049cdb68
                  MATRIX: 574->1|757->103|789->127|868->82|896->101|924->176|952->179|987->206|1026->208|1062->218|1258->388|1302->423|1342->425|1375->431|1420->450|1542->550|1576->558|1702->662|1736->670|1858->770|1892->778|2011->875|2045->883|2169->985|2203->993|2378->1146|2412->1154|2511->1232|2545->1240|2650->1324|2685->1332|2884->1504|2899->1510|2939->1529|3023->1583|3054->1587|3118->1625|3145->1631|3176->1635|3367->1798|3396->1799|3428->1804|3512->1861|3540->1862|3574->1869|3726->1994|3754->1995|3787->2001|3815->2002|3844->2004|3885->2015
                  LINES: 20->1|24->5|24->5|25->1|27->4|28->5|30->7|30->7|30->7|32->9|40->17|40->17|40->17|41->18|43->20|43->20|44->21|44->21|45->22|45->22|46->23|46->23|47->24|47->24|48->25|48->25|49->26|49->26|50->27|50->27|53->30|57->34|57->34|57->34|59->36|60->37|62->39|62->39|63->40|74->51|74->51|75->52|76->53|76->53|77->54|79->56|79->56|81->58|81->58|82->59|83->60
                  -- GENERATED --
              */
          