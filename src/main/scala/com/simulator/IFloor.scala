package com.simulator

import com.simulator.model.Slot

trait IFloor {
  def level(): Int
  def slots(): List[Slot]
  def indicator(): IElevator
  def button(): IButton
}
