package com.simulator.model

import com.simulator.{IButton, IElevator, IFloor, IFloorHandler}

class Floor(val level: Int, val slots: List[Slot], val button: IButton, handler: IFloorHandler) extends IFloor{
  override def indicator(): IElevator = ???
}
