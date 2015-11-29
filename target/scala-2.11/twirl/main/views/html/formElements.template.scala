
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object formElements_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class formElements extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[TicketModel],play.api.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(ticketForm: Form[TicketModel])(implicit msg: play.api.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.f) }};
Seq[Any](format.raw/*1.71*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.75*/("""


"""),_display_(/*8.2*/inputText(ticketForm("custname"), '_label -> "Cust Name*", 'class -> "form-control")),format.raw/*8.86*/("""
"""),_display_(/*9.2*/inputText(ticketForm("custmobile"), '_label -> "Cust Mobile*", 'class -> "form-control",'type->"number", '_showConstraints -> true,
'_error -> "Force an error",'_showErrors -> true)),format.raw/*10.50*/("""
"""),_display_(/*11.2*/textarea(ticketForm("custaddress"), '_label -> "Address*", 'class -> "form-control")),format.raw/*11.86*/("""
"""),_display_(/*12.2*/inputText(ticketForm("pincode"), '_label -> "Pincode*", 'class -> "form-control",'type->"number",'size->"6")),format.raw/*12.110*/("""
"""),_display_(/*13.2*/inputText(ticketForm("createdby"), '_label -> "Created By*", 'class -> "form-control")),format.raw/*13.88*/("""
"""),_display_(/*14.2*/inputText(ticketForm("assignedto"), '_label -> "Assigned To", 'class -> "form-control",'id->"id-assignto")),format.raw/*14.108*/("""
"""),_display_(/*15.2*/inputText(ticketForm("status"), '_label -> "status", 'class -> "form-control",'readonly->true,'id->"status",'value->"new")),format.raw/*15.124*/("""
"""),_display_(/*16.2*/textarea(ticketForm("remark"), '_label -> "Remarks", 'class -> "form-control")),format.raw/*16.80*/("""
"""))
      }
    }
  }

  def render(ticketForm:Form[TicketModel],msg:play.api.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(ticketForm)(msg)

  def f:((Form[TicketModel]) => (play.api.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (ticketForm) => (msg) => apply(ticketForm)(msg)

  def ref: this.type = this

}


}

/**/
object formElements extends formElements_Scope0.formElements
              /*
                  -- GENERATED --
                  DATE: Sun Nov 29 06:10:44 IST 2015
                  SOURCE: /home/amit/Assessment/ticket-play-mongo-final/app/views/formElements.scala.html
                  HASH: 243b7a0fe7d06d53a1980a592b378e155a0a1d51
                  MATRIX: 575->1|746->91|778->115|857->70|885->89|913->164|942->168|1046->252|1073->254|1275->435|1303->437|1408->521|1436->523|1566->631|1594->633|1701->719|1729->721|1857->827|1885->829|2029->951|2057->953|2156->1031
                  LINES: 20->1|24->5|24->5|25->1|27->4|28->5|31->8|31->8|32->9|33->10|34->11|34->11|35->12|35->12|36->13|36->13|37->14|37->14|38->15|38->15|39->16|39->16
                  -- GENERATED --
              */
          