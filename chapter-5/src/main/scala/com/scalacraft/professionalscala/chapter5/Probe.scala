package com.scalacraft.professionalscala.chapter5

class Probe extends Transmitter {
  def touchdown: Unit = println("Hello, New World!")
  override def transmit(): Array[Byte] = (0xda7a * 0xfeed).toString getBytes
}
