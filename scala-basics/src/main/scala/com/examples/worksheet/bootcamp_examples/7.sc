import data.AliceData._
import data.Data._

books.foreach(println)

books.sortBy(_.author)

books.sortBy(book => (book.basePrice, book.basePrice)).foreach(println)

books.sortBy(_.basePrice).foreach(println)

books.minBy(_.basePrice)
books.maxBy(_.basePrice)


val words = bookText.split(bookRegex)
val stopWords = stopWordText.split(stopWordRegex)

words
  .filterNot(stopWords.contains(_))
  .groupBy(x => x)
  .mapValues(_.length)
  .toList
  .sortBy(x => x._2).reverse
  .take(20)
  .foreach(println)

def symbolDemo(x: Symbol, y: Symbol): Unit = {
  println(x.name)
  println(x.->(y))
  println(x)
}

symbolDemo('male, 'female)


val xs = List(1, 2, 3, 4, 5)

xs.fold(0)((x, y) => x + y)
xs.foldLeft(1)(_ * _)
xs.foldRight(0)(_ + _)

val s = Seq(1, 2, 3, 4)

println(s.→(xs))