package org.scalacourse

import com.synergygb.zordon.core.ServiceBoot
import com.synergygb.zordon.gen.routes.ApplicationRoutesConsolidated

object Boot extends App with ServiceBoot with ApplicationRoutesConsolidated {

  implicit val context = Context

  protected def apiResourceClass = getClass

}
