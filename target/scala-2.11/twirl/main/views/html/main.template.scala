
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css")),format.raw/*8.94*/("""">
        
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" media="screen" href=""""),_display_(/*11.54*/routes/*11.60*/.WebJarAssets.at(WebJarAssets.locate("bootswatch-united", "bootstrap.min.css"))),format.raw/*11.139*/("""">
		
		"""),format.raw/*13.23*/("""
		"""),format.raw/*14.139*/("""
        
        """),format.raw/*16.9*/("""<link rel="shortcut icon" type="image/png" href=""""),_display_(/*16.59*/routes/*16.65*/.Assets.at("images/favicon.png")),format.raw/*16.97*/("""">
        
		<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
	    <!--[if lt IE 9]>
	      <script src=""""),_display_(/*20.22*/routes/*20.28*/.WebJarAssets.at(WebJarAssets.locate("html5shiv.js"))),format.raw/*20.81*/(""""></script>
	      <script src=""""),_display_(/*21.22*/routes/*21.28*/.WebJarAssets.at(WebJarAssets.locate("respond.min.js"))),format.raw/*21.83*/(""""></script>
	    <![endif]-->
		
    </head>
    <body>
    
    	<!-- Fixed navbar -->
	    """),_display_(/*28.7*/navbar()),format.raw/*28.15*/("""
	    
        """),_display_(/*30.10*/content),format.raw/*30.17*/("""


	    """),format.raw/*33.6*/("""</div>
        
        <!-- Bootstrap core JavaScript
	    ================================================== -->
	    <!-- Placed at the end of the document so the pages load faster -->
	    <script src="https://code.jquery.com/jquery-2.1.4.js"></script>
	    
	    <!-- Latest compiled and minified JavaScript -->
		<script src=""""),_display_(/*41.17*/routes/*41.23*/.WebJarAssets.at(WebJarAssets.locate("bootswatch-united", "bootstrap.min.js"))),format.raw/*41.101*/(""""></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Sat Nov 28 10:35:12 IST 2015
                  SOURCE: /home/amit/Assessment/ticket-play-mongo-final/app/views/main.scala.html
                  HASH: 17175492d57276643947299e7790c80ba64f1018
                  MATRIX: 530->1|655->31|683->33|760->84|785->89|873->151|887->157|941->191|1083->306|1098->312|1199->391|1235->419|1267->558|1312->576|1389->626|1404->632|1457->664|1625->805|1640->811|1714->864|1774->897|1789->903|1865->958|1985->1052|2014->1060|2057->1076|2085->1083|2120->1091|2480->1424|2495->1430|2595->1508
                  LINES: 20->1|25->1|27->3|31->7|31->7|32->8|32->8|32->8|35->11|35->11|35->11|37->13|38->14|40->16|40->16|40->16|40->16|44->20|44->20|44->20|45->21|45->21|45->21|52->28|52->28|54->30|54->30|57->33|65->41|65->41|65->41
                  -- GENERATED --
              */
          