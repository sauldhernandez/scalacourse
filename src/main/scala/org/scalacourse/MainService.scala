package org.scalacourse

import akka.event.Logging
import spray.httpx.SprayJsonSupport
import spray.routing.HttpService

import spray.http.StatusCodes._

/**
  * Created by saul on 2/10/16.
  */
trait MainService extends HttpService with SprayJsonSupport with DataModel {

  def route = {
    path("hello") {
      entity(as[MyRequest]) { request =>
       complete(MyResponse("Something with json", Seq()))
      }
    }
  }

  def loggedRoute = (logRequest("request", Logging.InfoLevel) & logResponse("response", Logging.InfoLevel)) {
    route
  }

}

