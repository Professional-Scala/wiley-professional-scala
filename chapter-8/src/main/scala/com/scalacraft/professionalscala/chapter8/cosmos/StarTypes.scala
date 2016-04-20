package com.scalacraft.professionalscala.chapter8.cosmos

/**
  * Star Types with examples.
  *
  * @groupname Type-O Star Type 0
  * @groupdesc Type-O Blue, average solar mass: 60
  * @groupprio Type-O 10
  *
  * @groupname Type-B Star Type B
  * @groupdesc Type-B Blue, average solar mass: 18
  * @groupprio Type-B 20
  *
  * @groupname Type-K Star Type K
  * @groupdesc Type-K Orange to red, average solar mass: 0.8
  * @groupprio Type-K 30
  */
trait StarTypes {

  /** @group Type-O */
  val `10 Lacertra`: Star

  /** @group Type-B */
  val Rigel: Star

  /** @group Type-B */
  val Spica: Star

  /** @group Type-K */
  val Arcturus: Star

  /** @group Type-K */
  val Aldebaran: Star
}
