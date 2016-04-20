lazy val root = (project in file(".")).
  settings(
    name := "Cosmic Toolkit",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := "2.11.7"
  )

val copyright = "Janek Bogucki 2015"
scalacOptions in (Compile,doc) ++=
  Seq("-doc-footer", copyright, "-groups", "-doc-title", "Cosmic Toolkit")
