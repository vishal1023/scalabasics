import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.4",
      version := "0.1.0"
    )),
    name := "scala-basics",
    libraryDependencies += `play-json`,
    libraryDependencies += `cats`,
    libraryDependencies += scalaTest % Test
  )