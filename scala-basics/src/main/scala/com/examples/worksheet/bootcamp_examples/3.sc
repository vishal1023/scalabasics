List.empty[Int]

//without using buffer

def map(xs: List[Int], f: Int => Int): List[Int] = {

  var result: List[Int] = Nil
  val iterator = xs.iterator

  while (iterator.hasNext) {
    result = f(iterator.next()) :: result
  }

  result.reverse
}

val xs: List[Int] = List(1, 2, 3)

map(xs, x => x * x)


val ints = 3 :: Nil
1 :: 2 :: ints

val xs1 = List(1, 2, 3, 4, 5)

xs1.head
xs1.tail