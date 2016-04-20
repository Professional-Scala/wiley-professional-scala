package com.scalacraft.professionalscala.chapter8.cosmos

/**
  * Luminous sphere of plasma held together by own gravity.
  * @see [[https://en.wikipedia.org/wiki/Plasma_(physics) Plasma (Wikipedia)]]
  * @see Found in a [[Galaxy]]
  * @author <Your Name Here>
  * @author [[https://github.com/janekdb Janek]]
  * @version 13.8
  * @since 0.7
  * @todo Add `+(other: Star)` to model stellar collisions
  * @todo Add magnetic field
  * @constructor Construct a [[Star]] with the given radius
  * @param radius Initial star radius in metres
  */
class Star(var radius: Double) {

  /** @return The mass of this star in kg */
  def mass: Long = ???

  /**
    * Trigger stellar collapse.
    * @param delay Seconds to wait until collapse
    * @param blackhole If true skip white dwarf and neutron star stages
    * @throws IllegalArgumentException if `delay` is negative
    * @throws IllegalStateException if already a blackhole
    */
  def collapse(delay: Int, blackhole: Boolean): Unit = ???

  // @formatter:off
  /**
    * Use some freezers to freeze sunspots.
    * @example
    * {{{
    *   val star = ...
    *   val freezers = List.fill(63)(new Icecube)
    *   val partiallySpentFreezers = star.freezeSunspots(freezers)
    * }}}
    * @note Do not call if collapsed
    * @note Following this the radius will be reduced
    * @tparam T A type that `freeze` can use to freeze a sunspot
    * @param freezers
    * @param freeze A function to freeze a sunspot on a star given a freezer
    * @return The freezers minus any used freezing capacity
    */
  // @formatter:on
  @deprecated("Use SolarKit instead", "14.0")
  def freezeSunspots[T](freezers: List[T], freeze: (Star, T) => T): List[T] = ???
}
