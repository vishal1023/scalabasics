val xs = List(1, 2, 3, 4)

xs.map(x => x + 1)
xs.map(x => x * x)

xs.map(_ + 1)
xs.map(_ * 2)

xs.map(_ % 2)

xs.foldLeft(0)((acc, elm) => acc + elm)
xs.sum

xs.foldLeft(1)((acc, elm) => acc + elm)
xs.product

xs.foldLeft("")((acc, elm) => acc + elm)
xs.foldLeft("")(_ + _)

import data.Data._

books.foreach(book => println(book))
books.foreach(println)

books.map(book => book.basePrice)
books.map(_.basePrice)

books.filter(_.author == "odersky").foreach(println)

books.filter(_.author == "odersky").map(_.basePrice).sum

books.filter(_.author == "odersky").foldLeft(0.0)(_ + _.basePrice)

books.groupBy(_.author)
     .map(pair => (pair._1, pair._2.map(_.basePrice).sum))
     .foreach(println)

books.groupBy(_.author)
     .mapValues(_.map(_.basePrice).sum)
     .foreach(println)

val t = (1, "abc", 9.87)

val m = Map(1 → "a", 2 → "b")

m.mapValues(x ⇒ s"hello $x")

val s = Set(1, 2, 2, 1)
