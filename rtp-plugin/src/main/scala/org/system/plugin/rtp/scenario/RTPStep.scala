package org.system.plugin.rtp.scenario

import org.system.{Description, StepId}
import org.system.scenario.ScenarioStep

/**
 * Created by evgeniikorniichuk on 19/04/15.
 */
class RTPStep extends ScenarioStep[RTPStep]{

  override type Action = RTPAction

  override def action: Action = ???

  override def description: Description = ???

  override def id: StepId = ???
}
