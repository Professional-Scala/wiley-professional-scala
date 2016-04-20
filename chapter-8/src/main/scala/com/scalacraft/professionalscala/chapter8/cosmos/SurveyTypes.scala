package com.scalacraft.professionalscala.chapter8.cosmos

/**
  * Examples of local configuration of template expansion
  */
object SurveyTypes {

  /**
    * A [[Galaxy]] to avoid.
    */
  type ForbiddenGalaxy = Galaxy

  /**
    * A [[Galaxy]] on the itinerary
    * @template
    */
  type WaypointGalaxy = Galaxy

  /**
    * The destination [[Galaxy]]
    * @template
    */
  type TargetGalaxy = Galaxy
}
