/* Copyright (C) 2016 Synergy-GB LLC.
 * All rights reserved.
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE', which is part of this source code package.
 */
package org.scalacourse

import spray.json.DefaultJsonProtocol

/**
  * Created by saul on 2/10/16.
  */
object DataModel extends DefaultJsonProtocol {

  implicit val itemFormat = jsonFormat2(Item)

  case class Item(name : String, value : Int)

  implicit val myRequestFormat = jsonFormat3(MyRequest)

  case class MyRequest(itemId : Int, name : String, description : Option[String])

  implicit  val myResponseFormat = jsonFormat2(MyResponse)

  case class MyResponse(message : String, items : Seq[Item])

}
