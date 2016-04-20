package com.scalacraft.professionalscala.chapter5

import org.scalatest.{FlatSpec, Matchers}

class CoreProbeSpec extends FlatSpec with Matchers {

  behavior of "A Probe"

  it should "touchdown without puffing out smoke" in {
    new CoreProbe touchdown
  }
}