package com.scalacraft.professionalscala.chapter8.cosmos

///**
//  * @define Body Terraformable
//  */
//trait Terraformable[T] {
//
//  /**
//    * Create a terraformed copy of this $Body.
//    * @param tfs A collection of [[Terraformer]]s to apply in order
//    * @return A terraformed copy of this $Body
//    */
//  def terraform[P1 >: T, P2 <: T](implicit tfs: Seq[Terraformer[P1, P2]]): T
//}
//
//trait Terraformer[T, U] {
//  def terraform[U <: T](body: T): U
//}
//
//class Planet extends Terraformable[Planet] {
//
//  /**
//    * A specialised kind of [[Planet]]
//    **/
//  type SpecialisedPlanet <: Planet
//
//  /**
//    * Create a new world from this planet.
//    * @note May result in mass extinction of existing life
//    */
//  def terraform[P1 >: Planet, SpecialisedPlanet](implicit tfs: Seq[Terraformer[P1, SpecialisedPlanet]]): Planet = ???
//}

/**
  * @define Body Terraformable
  */
trait Terraformable[T] {

  /**
    * Create a terraformed copy of this $Body.
    * @param tfs A collection of [[Terraformer]]s to apply in order
    * @return A terraformed copy of this $Body
    */
  def terraform[P1 >: T, P2 <: T](implicit tfs: Seq[Terraformer[P1, P2]]): T
}

trait Terraformer[T, U] {
  def terraform[U <: T](body: T): U
}

/**
  * @define Body ''candidate'' colony world
  */
class Planet extends Terraformable[Planet] {

  /**
    * A specialised kind of [[Planet]]
    * @documentable
    **/
  type SpecialisedPlanet <: Planet

  /**
    * @inheritdoc
    * @usecase def terraform: Planet
    * Create a new world from this planet.
    * @inheritdoc
    * @note May result in mass extinction of existing life
    */
  def terraform[P1 >: Planet, SpecialisedPlanet](implicit tfs: Seq[Terraformer[P1, SpecialisedPlanet]]): Planet = ???
}

// There are some nuances related to @inheritdoc. The following comments have been left
// in place for the interested reader to review at leisure.

// This is the second part of advanced tagging.
///**
//  * @inheritdoc
//    * Create a new world from this planet.
//  * @note May result in mass extinction of existing life
//  */


// Simplifies sig, include both method comments, does not include param descriptions.
///**
//  * @inheritdoc
//  * @usecase def terraform: Planet
//  * Create a new world from this planet.
//  * @inheritdoc
//  * @note May result in mass extinction of existing life
//  */

// Simplifies sig, include method comment, does not include trait comment, does not include param descriptions (as no parameters)
///**
//  * @usecase def terraform: Planet
//  * Create a new world from this planet.
//  * @inheritdoc
//  * @note May result in mass extinction of existing life
//  */

// Adding @usecase in this position removes the @note, both method comments and the param documentation
///**
//  * Create a new world from this planet.
//  * @inheritdoc
//  * @note May result in mass extinction of existing life
//  * @usecase def terraform: Planet
//  */

// This works. Both trait and class comments are shown.
///**
//  * Create a new world from this planet.
//  * @inheritdoc
//  * @note May result in mass extinction of existing life
//  *
//  */

// This works. Both trait and class comments are shown.
///**
//  * Create a new world from this planet.
//  * @inheritdoc
//  *
//  * @note May result in mass extinction of existing life
//  *
//  */
//def terraform[P1 >: Planet, SpecialisedPlanet](implicit tfs: Seq[Terraformer[P1, SpecialisedPlanet]]): Planet = ???

//* @usecase def terraform: Planet
