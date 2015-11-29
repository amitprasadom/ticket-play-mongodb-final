package models

import reactivemongo.bson.BSONObjectID
import java.util.Date

case class TicketModel(_id: BSONObjectID,
                    custname: String,
                    custmobile: String,
                    custaddress: String,
                    pincode: String,
                    createdby: String,
                    assignedto: String,
                    remark:String,
                    status: String,
                    createddate:Date,
                    closeddate:Date
                    )

/**
 * Helper for pagination.
 */
case class Page[A](items: Seq[A], page: Int, offset: Long, total: Long) {
  lazy val prev = Option(page - 1).filter(_ >= 0)
  lazy val next = Option(page + 1).filter(_ => (offset + items.size) < total)
}

object JsonFormats {
  import play.api.libs.json.Json
  import play.api.data._
  import play.api.data.Forms._
  import play.modules.reactivemongo.json.BSONFormats._

  // Generates Writes and Reads for Feed and User thanks to Json Macros
  implicit val ticketFormat = Json.format[TicketModel]
}

