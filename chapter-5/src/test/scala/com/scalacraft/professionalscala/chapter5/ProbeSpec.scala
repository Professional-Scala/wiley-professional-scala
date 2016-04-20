package com.scalacraft.professionalscala.chapter5

import org.scalatest.{FlatSpec, Matchers}

class ProbeSpec extends FlatSpec with Matchers {

  behavior of "A Probe"

  it should "touchdown without puffing out smoke" in {
    new Probe touchdown
  }
}