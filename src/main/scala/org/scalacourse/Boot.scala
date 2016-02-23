package org.scalacourse

import com.synergygb.zordon.core.ServiceBoot
import com.synergygb.zordon.gen.routes.ApplicationRoutesConsolidated

/**
  * Created by saul on 1/14/16.
  */
object Boot extends App with ServiceBoot with ApplicationRoutesConsolidated {

  protected def apiResourceClass = getClass

  def handleGetWeatherCityCityName(cityName: String)() = ?
}
