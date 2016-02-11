package org.scalacourse

import akka.event.Logging
import spray.routing.HttpService

import spray.http.StatusCodes._

/**
  * Created by saul on 2/10/16.
  */
trait MainService extends HttpService {

  def route = {
    complete(OK, "Hello world!")
  }

  def loggedRoute = (logRequest("request", Logging.InfoLevel) & logResponse("response", Logging.InfoLevel)) {
    route
  }

}

