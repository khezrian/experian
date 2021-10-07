package com.simulator

import com.simulator.model.{Floor, Slot}

trait IFloorHandler {
  def requestElevator(floor: Floor): Slot
}
