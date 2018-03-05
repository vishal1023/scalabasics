var list: List[Int] = List(1, 2, 3, 5)

list(1)
//list(20)

list.apply(1)

list: List[Int]

list: Int => Int

val s: Set[Int] = Set(1, 2, 3, 4, 4, 3, 2)

s.contains(2)
s.contains(20)
s.apply(2)
s.apply(1)

s(2)
s(20)

s: Set[Int]
s: Int => Boolean

val m = Map(1 -> "a", 2 -> "b")
m.mapValues(_.toUpperCase)

m.map(x => x._2.toUpperCase + x._1)

m(1)

m.apply(2)

//m(20)

m: Map[Int, String]
m: Int => String

list.reduce((b, a) => b + a)

list.filterNot(_ % 2 == 0)
list.head