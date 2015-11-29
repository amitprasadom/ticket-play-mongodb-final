
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/amit/Assessment/ticket-play-mongo-final/conf/routes
// @DATE:Sat Nov 28 10:35:06 IST 2015


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
