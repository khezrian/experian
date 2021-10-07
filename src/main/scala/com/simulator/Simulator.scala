package com.simulator

import com.simulator.model.{Floor, Slot}

class Simulator(elevators: Set[IElevator], floors: Set[Floor]) extends IFloorHandler with IElevatorHandler {
  def status(): List[IElevator]

  override def requestElevator(floor: Floor): Slot = ???

  override def goDestination(level: Int): Boolean = ???
}
