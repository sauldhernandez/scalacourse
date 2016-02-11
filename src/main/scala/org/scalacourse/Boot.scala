package org.scalacourse

import akka.actor.{Props, ActorLogging, Actor, ActorSystem}
import akka.io.IO
import akka.pattern._
import akka.util.Timeout
import spray.can.Http
import spray.can.Http.Bind

import scala.concurrent.duration._

/**
  * Created by saul on 1/14/16.
  */
object Boot extends App {

  implicit val system = ActorSystem("hello-world")

  implicit val timeout : Timeout = 10 seconds

  val service = system.actorOf(Props[MainServiceActor], "main-service")

  IO(Http) ? Bind(port = 8080, listener = service, interface = "localhost")
}

class MainServiceActor extends Actor with MainService with ActorLogging {

  def receive = runRoute(route)

  implicit def actorRefFactory = context
}