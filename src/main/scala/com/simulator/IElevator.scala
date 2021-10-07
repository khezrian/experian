package com.simulator

import com.simulator.model.Floor

trait IElevator {
  def number(): Int
  def next(): Floor
  def current(): Floor
  def setDestination(level: Int): Unit
}
