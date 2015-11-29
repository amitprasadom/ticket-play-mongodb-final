
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/amit/Assessment/ticket-play-mongo-final/conf/routes
// @DATE:Sat Nov 28 10:35:06 IST 2015

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:5
  Application_2: controllers.Application,
  // @LINE:22
  Assets_1: controllers.Assets,
  // @LINE:25
  WebJarAssets_0: controllers.WebJarAssets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    Application_2: controllers.Application,
    // @LINE:22
    Assets_1: controllers.Assets,
    // @LINE:25
    WebJarAssets_0: controllers.WebJarAssets
  ) = this(errorHandler, Application_2, Assets_1, WebJarAssets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_2, Assets_1, WebJarAssets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ticket""", """controllers.Application.list(p:Int ?= 0, s:Int ?= 2, f:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ticket/new""", """controllers.Application.create"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ticket/save""", """controllers.Application.save"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ticket/$id<[^/]+>""", """controllers.Application.edit(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ticket/$id<[^/]+>""", """controllers.Application.update(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """webjars/$file<.+>""", """controllers.WebJarAssets.at(file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:5
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_2.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Application_list1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ticket")))
  )
  private[this] lazy val controllers_Application_list1_invoker = createInvoker(
    Application_2.list(fakeValue[Int], fakeValue[Int], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "list",
      Seq(classOf[Int], classOf[Int], classOf[String]),
      "GET",
      """ ticket list (look at the default values for pagination parameters)""",
      this.prefix + """ticket"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Application_create2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ticket/new")))
  )
  private[this] lazy val controllers_Application_create2_invoker = createInvoker(
    Application_2.create,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "create",
      Nil,
      "GET",
      """ Add ticket""",
      this.prefix + """ticket/new"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Application_save3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ticket/save")))
  )
  private[this] lazy val controllers_Application_save3_invoker = createInvoker(
    Application_2.save,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """ticket/save"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Application_edit4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ticket/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_edit4_invoker = createInvoker(
    Application_2.edit(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "edit",
      Seq(classOf[String]),
      "GET",
      """ Edit existing ticket""",
      this.prefix + """ticket/$id<[^/]+>"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Application_update5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ticket/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_update5_invoker = createInvoker(
    Application_2.update(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "update",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """ticket/$id<[^/]+>"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Assets_at6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at6_invoker = createInvoker(
    Assets_1.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_WebJarAssets_at7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("webjars/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_WebJarAssets_at7_invoker = createInvoker(
    WebJarAssets_0.at(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WebJarAssets",
      "at",
      Seq(classOf[String]),
      "GET",
      """ Map the webjar static assets to the /webjars URL""",
      this.prefix + """webjars/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:5
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_2.index)
      }
  
    // @LINE:8
    case controllers_Application_list1_route(params) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[Int]("s", Some(2)), params.fromQuery[String]("f", Some(""))) { (p, s, f) =>
        controllers_Application_list1_invoker.call(Application_2.list(p, s, f))
      }
  
    // @LINE:11
    case controllers_Application_create2_route(params) =>
      call { 
        controllers_Application_create2_invoker.call(Application_2.create)
      }
  
    // @LINE:12
    case controllers_Application_save3_route(params) =>
      call { 
        controllers_Application_save3_invoker.call(Application_2.save)
      }
  
    // @LINE:15
    case controllers_Application_edit4_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Application_edit4_invoker.call(Application_2.edit(id))
      }
  
    // @LINE:16
    case controllers_Application_update5_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Application_update5_invoker.call(Application_2.update(id))
      }
  
    // @LINE:22
    case controllers_Assets_at6_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at6_invoker.call(Assets_1.at(path, file))
      }
  
    // @LINE:25
    case controllers_WebJarAssets_at7_route(params) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_WebJarAssets_at7_invoker.call(WebJarAssets_0.at(file))
      }
  }
}