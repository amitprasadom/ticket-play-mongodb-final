package controllers

import java.util.Date
import java.util.concurrent.TimeoutException

import javax.inject.Inject

import scala.concurrent.Future
import scala.concurrent.duration.DurationInt

import play.api.Logger
import play.api.i18n.MessagesApi
import play.api.mvc.{ Action, Controller }
import play.api.data.Form
import play.api.data.Forms._
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import play.api.libs.json.Json, Json.toJsFieldJsValueWrapper

import play.modules.reactivemongo.{
  MongoController, ReactiveMongoApi, ReactiveMongoComponents
}
import play.modules.reactivemongo.json._, collection.JSONCollection

import reactivemongo.bson.{BSONDocument, BSONObjectID}

import models.{TicketModel, JsonFormats, Page}, JsonFormats.ticketFormat
import views.html
class Application @Inject() (
  val reactiveMongoApi: ReactiveMongoApi,
  val messagesApi: MessagesApi)
    extends Controller with MongoController with ReactiveMongoComponents {

  implicit val timeout = 20.seconds

  /**
   * Describe the ticket form (used in both edit and create screens).
   */
  val ticketForm= Form(
    mapping(
      "id" -> ignored(BSONObjectID.generate: BSONObjectID),
      "custname" -> nonEmptyText,
      "custmobile" -> nonEmptyText(maxLength = 10),
      "custaddress" -> nonEmptyText,
      "pincode" ->nonEmptyText(maxLength = 6),
      "createdby" -> nonEmptyText,
      "assignedto" -> text,
      "remark" -> nonEmptyText,
      "status" -> nonEmptyText,
      "createddate" ->ignored(new Date():Date),
      "closeddate"->ignored((new Date():Date))
     )(TicketModel.apply)(TicketModel.unapply))


  def collection: JSONCollection = db.collection[JSONCollection]("ticketlog")

  // ------------------------------------------ //
  // Using case classes + Json Writes and Reads //
  // ------------------------------------------ //
  import play.api.data.Form
  import models._
  import models.JsonFormats._

  /**
   * Handle default path requests, redirect to ticket list
   */
  def index = Action { Home }

  /**
   * This result directly redirect to the application home.
   */
  val Home = Redirect(routes.Application.list())

  /**
   * Display the paginated list of ticket.
   *
   * @param page Current page number (starts from 0)
   * @param orderBy Column to be sorted
   * @param filter Filter applied on ticket names
   */
  def list(page: Int, orderBy: Int, filter: String) = Action.async { implicit request =>
    val futurePage = if (filter.length > 0) {
      collection.find(Json.obj("custname" -> filter.toLowerCase)).cursor[TicketModel]().collect[List]()
    } else collection.genericQueryBuilder.cursor[TicketModel]().collect[List]()

    futurePage.map({ ticket =>
      implicit val msg = messagesApi.preferred(request)

      Ok(html.list(Page(ticket, 0, 10, 20), orderBy, filter))
    }).recover {
      case t: TimeoutException =>
        Logger.error("Problem found in ticket list process")
        InternalServerError(t.getMessage)
    }
  }

  /**
   * Display the 'edit form' of a existing ticket.
   *
   * @param id Id of the ticket to edit
   */
  def edit(id: String) = Action.async { request =>
    val futureTicket = collection.find(Json.obj("_id" -> Json.obj("$oid" -> id))).cursor[TicketModel]().collect[List]()
    futureTicket.map { tickets: List[TicketModel] =>
      implicit val msg = messagesApi.preferred(request)

      Ok(html.editForm(id, ticketForm.fill(tickets.head)))
    }.recover {
      case t: TimeoutException =>
        Logger.error("Problem found in ticket edit process")
        InternalServerError(t.getMessage)
    }
  }

  /**
   * Handle the 'edit form' submission
   *
   * @param id Id of the ticket to edit
   */
  def update(id: String) = Action.async { implicit request =>
  
     ticketForm.bindFromRequest.fold(
      { formWithErrors =>
        implicit val msg = messagesApi.preferred(request)
        Future.successful(BadRequest(html.editForm(id, formWithErrors)))
      },
      ticket => {
        val newdate = new Date();
        val futureTicket = collection.update(Json.obj("_id" -> Json.obj("$oid" -> id)), ticket.copy(_id = BSONObjectID(id),closeddate = new Date))
         futureTicket.map { result =>
          Home.flashing("success" -> s"Ticket ${id.substring(0,10)} has been updated")
        }.recover {
          case t: TimeoutException =>
            Logger.error("Problem found in ticket update process")
            InternalServerError(t.getMessage)
        }
      })
  }

  /**
   * Display the 'new ticket form'.
   */
  def create = Action { request =>
    implicit val msg = messagesApi.preferred(request)
    Ok(html.createForm(ticketForm))
  }

  /**
   * Handle the 'new ticket form' submission.
   */
  def get(id:String) = Action.async {

    collection.find(BSONDocument("_id" -> id)).one[models.TicketModel].map{
      case Some(client) => Ok(Json.toJson(client))
      case None => NotFound
    }

  }
  def save = Action.async { implicit request =>


    ticketForm.bindFromRequest.fold(
      { formWithErrors =>
        implicit val msg = messagesApi.preferred(request)
        Future.successful(BadRequest(html.createForm(formWithErrors)))
      },
      ticket => {


        val futureUpdateTicket = collection.insert(ticket.copy(_id = BSONObjectID.generate))
        futureUpdateTicket.map { result =>
          Home.flashing("success" -> s"Your new ticket number is   ${ticket._id.stringify.substring(0,10)} ")
        }.recover {
          case t: TimeoutException =>

            Logger.error("Problem found in ticket insert process")
            println(t.getMessage)
            InternalServerError(t.getMessage)
          case e :Exception =>
            println(e.getMessage)
            InternalServerError(e.getMessage)
        }
      })
  }



}
