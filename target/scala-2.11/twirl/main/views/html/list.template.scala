
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object list_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class list extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[Page[TicketModel],Int,String,play.api.mvc.Flash,play.api.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentPage: Page[TicketModel], currentOrderBy: Int, currentFilter: String)(implicit flash: play.api.mvc.Flash, msg: play.api.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*16.2*/header/*16.8*/(orderBy: Int, title: String):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*16.41*/("""
    """),format.raw/*17.5*/("""<th  class="col"""),_display_(/*17.21*/orderBy),format.raw/*17.28*/(""" """),format.raw/*17.29*/("""header """),_display_(/*17.37*/if(scala.math.abs(currentOrderBy) == orderBy){/*17.84*/{if(currentOrderBy < 0) "glyphicon glyphicon-chevron-down" else "glyphicon glyphicon-chevron-up"}}),format.raw/*17.181*/("""">
        <a href=""""),_display_(/*18.19*/link(0, Some(orderBy))),format.raw/*18.41*/("""">"""),_display_(/*18.44*/title),format.raw/*18.49*/("""</a>
    </th>
""")))};def /*7.2*/link/*7.6*/(newPage: Int, newOrderBy: Option[Int] = None) = {{
    routes.Application.list(newPage, newOrderBy.map { orderBy =>
        if(orderBy == scala.math.abs(currentOrderBy)) -currentOrderBy else orderBy
    }.getOrElse(currentOrderBy), currentFilter)
}};
Seq[Any](format.raw/*1.143*/("""

"""),format.raw/*5.42*/("""

"""),format.raw/*11.2*/("""

"""),format.raw/*15.37*/("""
"""),format.raw/*20.2*/("""


"""),_display_(/*23.2*/main("ticket issue")/*23.22*/ {_display_(Seq[Any](format.raw/*23.24*/("""
"""),format.raw/*24.1*/("""<style type="text/css">
table """),format.raw/*25.7*/("""{"""),format.raw/*25.8*/("""
"""),format.raw/*26.1*/("""width: 40em;
margin: 2em auto;
"""),format.raw/*28.1*/("""}"""),format.raw/*28.2*/("""

"""),format.raw/*30.1*/("""thead """),format.raw/*30.7*/("""{"""),format.raw/*30.8*/("""
"""),format.raw/*31.1*/("""background: #fff;
color: #000;
"""),format.raw/*33.1*/("""}"""),format.raw/*33.2*/("""
"""),format.raw/*34.1*/("""thead tr"""),format.raw/*34.9*/("""{"""),format.raw/*34.10*/("""
	"""),format.raw/*35.2*/("""color:#000
"""),format.raw/*36.1*/("""}"""),format.raw/*36.2*/("""
"""),format.raw/*37.1*/("""td """),format.raw/*37.4*/("""{"""),format.raw/*37.5*/("""
"""),format.raw/*38.1*/("""width: 10em;
padding: 0.3em;
"""),format.raw/*40.1*/("""}"""),format.raw/*40.2*/("""

"""),format.raw/*42.1*/("""tbody """),format.raw/*42.7*/("""{"""),format.raw/*42.8*/("""
"""),format.raw/*43.1*/("""background: #ccc;
"""),format.raw/*44.1*/("""}"""),format.raw/*44.2*/("""

"""),format.raw/*46.1*/("""div.pager """),format.raw/*46.11*/("""{"""),format.raw/*46.12*/("""
"""),format.raw/*47.1*/("""text-align: center;
margin: 1em 0;
"""),format.raw/*49.1*/("""}"""),format.raw/*49.2*/("""

"""),format.raw/*51.1*/("""div.pager span """),format.raw/*51.16*/("""{"""),format.raw/*51.17*/("""
"""),format.raw/*52.1*/("""display: inline-block;
width: 1.8em;
height: 1.8em;
line-height: 1.8;
text-align: center;
cursor: pointer;
background: #fff;
color: #000;
margin-right: 0.5em;
"""),format.raw/*61.1*/("""}"""),format.raw/*61.2*/("""

"""),format.raw/*63.1*/("""div.pager span.active """),format.raw/*63.23*/("""{"""),format.raw/*63.24*/("""
"""),format.raw/*64.1*/("""background: #c00;
"""),format.raw/*65.1*/("""}"""),format.raw/*65.2*/("""

"""),format.raw/*67.1*/("""</style>
	<!-- Begin page content -->
	<div class="container">
		<div class="page-header">
			<h3>

			</h3>
		</div>
	
		"""),_display_(/*76.4*/flash/*76.9*/.get("success").map/*76.28*/ { message =>_display_(Seq[Any](format.raw/*76.41*/("""
			"""),format.raw/*77.4*/("""<div class="alert alert-dismissable alert-success">
				<button type="button" class="close" data-dismiss="alert">×</button>
				<strong></strong> <span style="color:green">"""),_display_(/*79.50*/message),format.raw/*79.57*/("""</span>
			</div>
            <!-- Modal -->

		""")))}),format.raw/*83.4*/("""

		"""),format.raw/*85.3*/("""<div id="actions">
	

				<input type="search" id="searchbox" name="f" value=""""),_display_(/*88.58*/currentFilter),format.raw/*88.71*/("""" placeholder="Search here.." >


			<a class="btn btn-success btn-sm pull-right" id="add" href=""""),_display_(/*91.65*/routes/*91.71*/.Application.create()),format.raw/*91.92*/("""">Generate New Ticket</a>


		</div>

		"""),_display_(/*96.4*/Option(currentPage.items)/*96.29*/.filterNot(_.isEmpty).map/*96.54*/ { ticket =>_display_(Seq[Any](format.raw/*96.66*/("""
			"""),format.raw/*97.4*/("""<table class="table table-striped" id="data-table" >
				<thead >
					<tr>
						"""),_display_(/*100.8*/header(2, "TICKET NO.")),format.raw/*100.31*/("""
					 	"""),_display_(/*101.9*/header(3, "NAME")),format.raw/*101.26*/("""
					 	"""),_display_(/*102.9*/header(4, "ADDRESS")),format.raw/*102.29*/("""
						"""),_display_(/*103.8*/header(5, "PINCODE")),format.raw/*103.28*/("""
						"""),_display_(/*104.8*/header(6, "MOBILE")),format.raw/*104.27*/("""
						"""),_display_(/*105.8*/header(7, "ASSIGNED TO")),format.raw/*105.32*/("""
						"""),_display_(/*106.8*/header(8, "CREATED BY")),format.raw/*106.31*/("""
						"""),_display_(/*107.8*/header(9, "REMARK")),format.raw/*107.27*/("""
						"""),_display_(/*108.8*/header(10, "STATUS")),format.raw/*108.28*/("""
						"""),_display_(/*109.8*/header(11, "CREATED ON")),format.raw/*109.32*/("""
						"""),_display_(/*110.8*/header(12, "LAST UPDATED")),format.raw/*110.34*/("""

					"""),format.raw/*112.6*/("""</tr>
				</thead>
				<tbody class="searchable" id="seachData">
		
					"""),_display_(/*116.7*/ticket/*116.13*/.map/*116.17*/ { ticket =>_display_(Seq[Any](format.raw/*116.29*/("""
					"""),format.raw/*117.6*/("""<tr>
						<td>

							"""),_display_(/*120.9*/if(!ticket.status.equalsIgnoreCase("close"))/*120.53*/ {_display_(Seq[Any](format.raw/*120.55*/("""
								"""),format.raw/*121.9*/("""<a href=""""),_display_(/*121.19*/routes/*121.25*/.Application.edit(ticket._id.stringify)),format.raw/*121.64*/("""" title="click here to edit">"""),_display_(/*121.94*/ticket/*121.100*/._id.stringify.substring(0,10)),format.raw/*121.130*/("""</a>
							""")))}/*122.10*/else/*122.15*/{_display_(Seq[Any](format.raw/*122.16*/("""
								"""),_display_(/*123.10*/ticket/*123.16*/._id.stringify.substring(0,10)),format.raw/*123.46*/("""
							""")))}),format.raw/*124.9*/("""


						"""),format.raw/*127.7*/("""</td>
						<td>"""),_display_(/*128.12*/ticket/*128.18*/.custname.toUpperCase),format.raw/*128.39*/("""</td>
						<td>"""),_display_(/*129.12*/ticket/*129.18*/.custaddress.toUpperCase),format.raw/*129.42*/("""</td>
						<td>"""),_display_(/*130.12*/ticket/*130.18*/.pincode),format.raw/*130.26*/("""</td>
						<td>"""),_display_(/*131.12*/ticket/*131.18*/.custmobile),format.raw/*131.29*/("""</td>
						<td>"""),_display_(/*132.12*/ticket/*132.18*/.assignedto.toUpperCase),format.raw/*132.41*/("""</td>
						<td>"""),_display_(/*133.12*/ticket/*133.18*/.createdby.toUpperCase),format.raw/*133.40*/("""</td>
						<td>"""),_display_(/*134.12*/ticket/*134.18*/.remark.toUpperCase),format.raw/*134.37*/("""</td>
						<td>"""),_display_(/*135.12*/ticket/*135.18*/.status.toUpperCase),format.raw/*135.37*/("""</td>
						<td>"""),_display_(/*136.12*/ticket/*136.18*/.createddate.format("dd MMM yyyy ")),format.raw/*136.53*/("""</td>
						<td>

						   """),_display_(/*139.11*/ticket/*139.17*/.closeddate.format("dd MMM yyy ")),format.raw/*139.50*/("""



						"""),format.raw/*143.7*/("""</td>




					</tr>
					""")))}),format.raw/*149.7*/("""
		
				"""),format.raw/*151.5*/("""</tbody>
			</table>
			<hr/>


		""")))}/*156.4*/.getOrElse/*156.14*/ {_display_(Seq[Any](format.raw/*156.16*/("""
			"""),format.raw/*157.4*/("""<div class="panel panel-default">
			  <div class="panel-body">
			    <em>Nothing to display</em>
			  </div>
			</div>	
		""")))}),format.raw/*162.4*/("""
	"""),format.raw/*163.2*/("""</div>




	<script src="https://code.jquery.com/jquery-2.1.4.js"></script>
	<script src=https://cdn.datatables.net/1.10.10/js/jquery.dataTables.min.js></script>
	<script type="text/javascript">

	$('table#data-table').each(function() """),format.raw/*172.40*/("""{"""),format.raw/*172.41*/("""
		"""),format.raw/*173.3*/("""var currentPage = 0;
		var numPerPage = 5;
		var $table = $(this);
		$table.bind('repaginate', function() """),format.raw/*176.40*/("""{"""),format.raw/*176.41*/("""
			"""),format.raw/*177.4*/("""$table.find('tbody tr').hide().slice(currentPage * numPerPage, (currentPage + 1) * numPerPage).show();
		"""),format.raw/*178.3*/("""}"""),format.raw/*178.4*/(""");
		$table.trigger('repaginate');
		var numRows = $table.find('tbody tr').length;
		var numPages = Math.ceil(numRows / numPerPage);
		var $pager = $('<div class="pager"></div>');
		for (var page = 0; page < numPages; page++) """),format.raw/*183.47*/("""{"""),format.raw/*183.48*/("""
			"""),format.raw/*184.4*/("""$('<span class="page-number"></span>').text(page + 1).bind('click', """),format.raw/*184.72*/("""{"""),format.raw/*184.73*/("""
				"""),format.raw/*185.5*/("""newPage: page
			"""),format.raw/*186.4*/("""}"""),format.raw/*186.5*/(""", function(event) """),format.raw/*186.23*/("""{"""),format.raw/*186.24*/("""
				"""),format.raw/*187.5*/("""currentPage = event.data['newPage'];
				$table.trigger('repaginate');
				$(this).addClass('active').siblings().removeClass('active');
			"""),format.raw/*190.4*/("""}"""),format.raw/*190.5*/(""").appendTo($pager).addClass('clickable');
		"""),format.raw/*191.3*/("""}"""),format.raw/*191.4*/("""
		"""),format.raw/*192.3*/("""$pager.insertAfter($table).find('span.page-number:first').addClass('active');
"""),format.raw/*193.1*/("""}"""),format.raw/*193.2*/(""");


    $("#searchbox").keyup(function () """),format.raw/*196.39*/("""{"""),format.raw/*196.40*/("""

    """),format.raw/*198.5*/("""//split the current value of searchInput
    var data = this.value.split(" ");
    //create a jquery object of the rows
    var jo = $("#seachData").find("tr");
    if (this.value == "") """),format.raw/*202.27*/("""{"""),format.raw/*202.28*/("""
        """),format.raw/*203.9*/("""jo.show();
        return;
    """),format.raw/*205.5*/("""}"""),format.raw/*205.6*/("""
    """),format.raw/*206.5*/("""//hide all the rows
    jo.hide();

    //Recusively filter the jquery object to get results.
    jo.filter(function (i, v) """),format.raw/*210.31*/("""{"""),format.raw/*210.32*/("""
        """),format.raw/*211.9*/("""var $t = $(this);
        for (var d = 0; d < data.length; ++d) """),format.raw/*212.47*/("""{"""),format.raw/*212.48*/("""
            """),format.raw/*213.13*/("""if ($t.text().toLowerCase().indexOf(data[d].toLowerCase()) > -1) """),format.raw/*213.78*/("""{"""),format.raw/*213.79*/("""
           """),format.raw/*214.12*/("""return true;
         """),format.raw/*215.10*/("""}"""),format.raw/*215.11*/("""
        """),format.raw/*216.9*/("""}"""),format.raw/*216.10*/("""
        """),format.raw/*217.9*/("""return false;
    """),format.raw/*218.5*/("""}"""),format.raw/*218.6*/(""")
    //show the rows that match.
    .show();
"""),format.raw/*221.1*/("""}"""),format.raw/*221.2*/(""").focus(function () """),format.raw/*221.22*/("""{"""),format.raw/*221.23*/("""
    """),format.raw/*222.5*/("""this.value = "";
    $(this).css("""),format.raw/*223.17*/("""{"""),format.raw/*223.18*/("""
        """),format.raw/*224.9*/(""""color": "black"
    """),format.raw/*225.5*/("""}"""),format.raw/*225.6*/(""");
    $(this).unbind('focus');
"""),format.raw/*227.1*/("""}"""),format.raw/*227.2*/(""").css("""),format.raw/*227.8*/("""{"""),format.raw/*227.9*/("""
    """),format.raw/*228.5*/(""""color": "#C0C0C0"
"""),format.raw/*229.1*/("""}"""),format.raw/*229.2*/(""");
$(document).ready(function() """),format.raw/*230.30*/("""{"""),format.raw/*230.31*/("""
			"""),format.raw/*231.4*/("""$('#data-table').DataTable();
		"""),format.raw/*232.3*/("""}"""),format.raw/*232.4*/(""");
    </script>


""")))}),format.raw/*236.2*/("""



"""))
      }
    }
  }

  def render(currentPage:Page[TicketModel],currentOrderBy:Int,currentFilter:String,flash:play.api.mvc.Flash,msg:play.api.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(currentPage,currentOrderBy,currentFilter)(flash,msg)

  def f:((Page[TicketModel],Int,String) => (play.api.mvc.Flash,play.api.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (currentPage,currentOrderBy,currentFilter) => (flash,msg) => apply(currentPage,currentOrderBy,currentFilter)(flash,msg)

  def ref: this.type = this

}


}

/**/
object list extends list_Scope0.list
              /*
                  -- GENERATED --
                  DATE: Sun Nov 29 05:38:08 IST 2015
                  SOURCE: /home/amit/Assessment/ticket-play-mongo-final/app/views/list.scala.html
                  HASH: d99e5ced2fee8c66d281d17f8758fb005f0148a0
                  MATRIX: 589->1|809->637|823->643|933->676|965->681|1008->697|1036->704|1065->705|1100->713|1155->760|1275->857|1323->878|1366->900|1396->903|1422->908|1460->272|1471->276|1751->142|1780->269|1809->525|1839->635|1867->924|1897->928|1926->948|1966->950|1994->951|2051->981|2079->982|2107->983|2165->1014|2193->1015|2222->1017|2255->1023|2283->1024|2311->1025|2369->1056|2397->1057|2425->1058|2460->1066|2489->1067|2518->1069|2556->1080|2584->1081|2612->1082|2642->1085|2670->1086|2698->1087|2754->1116|2782->1117|2811->1119|2844->1125|2872->1126|2900->1127|2945->1145|2973->1146|3002->1148|3040->1158|3069->1159|3097->1160|3159->1195|3187->1196|3216->1198|3259->1213|3288->1214|3316->1215|3502->1374|3530->1375|3559->1377|3609->1399|3638->1400|3666->1401|3711->1419|3739->1420|3768->1422|3917->1545|3930->1550|3958->1569|4009->1582|4040->1586|4240->1759|4268->1766|4347->1815|4378->1819|4484->1898|4518->1911|4643->2009|4658->2015|4700->2036|4767->2077|4801->2102|4835->2127|4885->2139|4916->2143|5026->2226|5071->2249|5107->2258|5146->2275|5182->2284|5224->2304|5259->2312|5301->2332|5336->2340|5377->2359|5412->2367|5458->2391|5493->2399|5538->2422|5573->2430|5614->2449|5649->2457|5691->2477|5726->2485|5772->2509|5807->2517|5855->2543|5890->2550|5991->2624|6007->2630|6021->2634|6072->2646|6106->2652|6158->2677|6212->2721|6253->2723|6290->2732|6328->2742|6344->2748|6405->2787|6463->2817|6480->2823|6533->2853|6566->2867|6580->2872|6620->2873|6658->2883|6674->2889|6726->2919|6766->2928|6803->2937|6848->2954|6864->2960|6907->2981|6952->2998|6968->3004|7014->3028|7059->3045|7075->3051|7105->3059|7150->3076|7166->3082|7199->3093|7244->3110|7260->3116|7305->3139|7350->3156|7366->3162|7410->3184|7455->3201|7471->3207|7512->3226|7557->3243|7573->3249|7614->3268|7659->3285|7675->3291|7732->3326|7788->3354|7804->3360|7859->3393|7897->3403|7955->3430|7991->3438|8045->3473|8065->3483|8106->3485|8138->3489|8294->3614|8324->3616|8588->3851|8618->3852|8649->3855|8784->3961|8814->3962|8846->3966|8979->4071|9008->4072|9263->4298|9293->4299|9325->4303|9422->4371|9452->4372|9485->4377|9530->4394|9559->4395|9606->4413|9636->4414|9669->4419|9836->4558|9865->4559|9937->4603|9966->4604|9997->4607|10103->4685|10132->4686|10204->4729|10234->4730|10268->4736|10484->4923|10514->4924|10551->4933|10610->4964|10639->4965|10672->4970|10825->5094|10855->5095|10892->5104|10985->5168|11015->5169|11057->5182|11151->5247|11181->5248|11222->5260|11273->5282|11303->5283|11340->5292|11370->5293|11407->5302|11453->5320|11482->5321|11557->5368|11586->5369|11635->5389|11665->5390|11698->5395|11760->5428|11790->5429|11827->5438|11876->5459|11905->5460|11965->5492|11994->5493|12028->5499|12057->5500|12090->5505|12137->5524|12166->5525|12227->5557|12257->5558|12289->5562|12349->5594|12378->5595|12429->5615
                  LINES: 20->1|24->16|24->16|26->16|27->17|27->17|27->17|27->17|27->17|27->17|27->17|28->18|28->18|28->18|28->18|30->7|30->7|35->1|37->5|39->11|41->15|42->20|45->23|45->23|45->23|46->24|47->25|47->25|48->26|50->28|50->28|52->30|52->30|52->30|53->31|55->33|55->33|56->34|56->34|56->34|57->35|58->36|58->36|59->37|59->37|59->37|60->38|62->40|62->40|64->42|64->42|64->42|65->43|66->44|66->44|68->46|68->46|68->46|69->47|71->49|71->49|73->51|73->51|73->51|74->52|83->61|83->61|85->63|85->63|85->63|86->64|87->65|87->65|89->67|98->76|98->76|98->76|98->76|99->77|101->79|101->79|105->83|107->85|110->88|110->88|113->91|113->91|113->91|118->96|118->96|118->96|118->96|119->97|122->100|122->100|123->101|123->101|124->102|124->102|125->103|125->103|126->104|126->104|127->105|127->105|128->106|128->106|129->107|129->107|130->108|130->108|131->109|131->109|132->110|132->110|134->112|138->116|138->116|138->116|138->116|139->117|142->120|142->120|142->120|143->121|143->121|143->121|143->121|143->121|143->121|143->121|144->122|144->122|144->122|145->123|145->123|145->123|146->124|149->127|150->128|150->128|150->128|151->129|151->129|151->129|152->130|152->130|152->130|153->131|153->131|153->131|154->132|154->132|154->132|155->133|155->133|155->133|156->134|156->134|156->134|157->135|157->135|157->135|158->136|158->136|158->136|161->139|161->139|161->139|165->143|171->149|173->151|178->156|178->156|178->156|179->157|184->162|185->163|194->172|194->172|195->173|198->176|198->176|199->177|200->178|200->178|205->183|205->183|206->184|206->184|206->184|207->185|208->186|208->186|208->186|208->186|209->187|212->190|212->190|213->191|213->191|214->192|215->193|215->193|218->196|218->196|220->198|224->202|224->202|225->203|227->205|227->205|228->206|232->210|232->210|233->211|234->212|234->212|235->213|235->213|235->213|236->214|237->215|237->215|238->216|238->216|239->217|240->218|240->218|243->221|243->221|243->221|243->221|244->222|245->223|245->223|246->224|247->225|247->225|249->227|249->227|249->227|249->227|250->228|251->229|251->229|252->230|252->230|253->231|254->232|254->232|258->236
                  -- GENERATED --
              */
          