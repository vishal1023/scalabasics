package data

import scala.io.Source

object AliceData {
  val bookText = Source.fromFile("/Users/vishala/Desktop/study/scalabasics/scala-basics/src/main/resources/aliceInWonderland.txt").mkString.toLowerCase
  val stopWordText = Source.fromFile("/Users/vishala/Desktop/study/scalabasics/scala-basics/src/main/resources/stopWords.txt").mkString.toLowerCase

  val bookRegex = """[\s|:|.|,|\d|"]+"""
  val stopWordRegex = "\\s+"
}
