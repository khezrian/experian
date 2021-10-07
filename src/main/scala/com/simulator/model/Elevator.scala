package com.simulator.model

import com.simulator.{IElevatorHandler, IElevator}

class Elevator(val handler: IElevatorHandler) extends IElevator {
  override def current(): Floor = ???

  override def next(): Floor = ???

  override def number(): Int = ???

  override def setDestination(level: Int): Unit = ???
}
