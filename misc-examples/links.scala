package scala.test.scaladoc.links {
  import language.higherKinds
  class C

  trait Target {
    type T
    type S = String
    class C
    def foo(i: Int) = 2
    def foo(s: String) = 3
    def foo[A[_]](x: A[String]) = 5
    def foo[A[_[_]]](x: A[List]) = 6
    val bar: Boolean
    def baz(c: scala.test.scaladoc.links.C) = 7
  }

  object Target {
    type T = Int => Int
    type S = Int
    type %%[X] = ::[X]
    class C
    def foo(i: Int) = 2
    def foo(z: String) = 3
    def foo[A[_]](x: A[String]) = 5
    def foo[A[_[_]]](x: A[List]) = 6
    val bar: Boolean = false
    val onlyInObject = 1
    def baz(c: scala.test.scaladoc.links.C) = 7
  }

  /**
    * ==Linking Examples==
    *
    * ===Link to a package===
    *  - [[scala.test                                       package scala.test]]
    *
    * ===Links to a trait===
    *
    *  - [[scala.test.scaladoc.links.Target!                trait Target]]
    *  - [[scala.test.scaladoc.links.Target!.T              trait Target -> type T]]
    *  - [[test.scaladoc.links.Target!.S                    trait Target -> type S]]
    *  - [[scaladoc.links.Target!.foo(i:Int)*               trait Target -> def foo]]
    *  - [[links.Target!.bar                                trait Target -> def bar]]
    *  - [[[[Target!.foo[A[_[_]]]*                          trait Target -> def foo with 3 nested tparams]]]]
    *  - [[Target!.C                                        trait Target -> class C]] (links directly to C, not as a member)
    *  - [[Target!.baz(c:scala\.test\.scaladoc\.links\.C)*  trait Target -> def baz]] (uses dots in prefix)
    *
    * ===Links to an object===
    *
    *  - [[scala.test.scaladoc.links.Target$                object Target]]
    *  - [[Target$.T                                        object Target -> type T]]
    *  - [[Target$.S                                        object Target -> type S]]
    *  - [[Target$.%%                                       object Target -> type %%]]
    *  - [[Target$.foo(z:Str*                               object Target -> def foo(z: String)]]
    *  - [[Target$.foo(i:Int*                               object Target -> def foo(i: Int)]]
    *  - [[Target$.bar                                      object Target -> def bar]]
    *  - [[[[Target$.foo[A[_[_]]]*                          object Target -> def foo with 3 nested tparams]]]]
    *  - [[Target.onlyInObject                              object Target -> val onlyInObject]]
    *  - [[Target$.C                                        object Target -> class C]] (links directly to C, not as a member)
    *  - [[Target$.baz(c:scala\.test\.scaladoc\.links\.C)*  object Target -> def baz]] (uses dots in prefix)
    *  - [[localMethod                                      object LinkingExamples -> localMethod]]
    */
  object LinkingExamples {
    def localMethod = 3
  }
}

