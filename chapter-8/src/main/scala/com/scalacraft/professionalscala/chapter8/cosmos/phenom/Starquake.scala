package com.scalacraft.professionalscala.chapter8.cosmos.phenom

import com.scalacraft.professionalscala.chapter8.cosmos.Magnetar
import Starquake.QuakeMagnitude

class Starquake(val magnitude: QuakeMagnitude) {
  def triggerStarquake(magnetar: Magnetar): Starquake = new Starquake(1)
}

object Starquake {
  /** The magnitude of a quake. */
  type QuakeMagnitude = Int
  def triggerStarquake(magnetar: Magnetar): Starquake = new Starquake(1)
  def triggerStarquake(magnetar: Magnetar, magnitude: QuakeMagnitude): Starquake =
    new Starquake(magnitude)
}