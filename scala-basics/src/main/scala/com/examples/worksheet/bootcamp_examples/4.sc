
//fold operation


def fold(xs: List[Int], seed: Int)(op: (Int, Int) => Int): Int = {

  var result: Int = seed
  val iterator = xs.iterator

  while (iterator.hasNext) {
    result = op(result, iterator.next())
  }

  result
}

def add(xs: List[Int]): Int = fold(xs, 1)((x, y) => x * y)

add(List(1, 2, 3, 4))

//generic version of fold

def foldGeneric[A, B](xs: List[A], seed: B)(op: (B, A) => B): B = {
  val iterator = xs.iterator
  var result: B = seed

  while (iterator.hasNext) {
    result = op(result, iterator.next())
  }

  result
}

def addInt(xs: List[Int]): Int = foldGeneric(xs, 1)((x, y) => x * y)

def addDouble(xs: List[Double]): Double = foldGeneric(xs, 1.0)((x, y) => x + y)

addInt(List(1, 2, 3, 4))
addDouble(List(1.2, 2.3, 3.4))

val xs: List[Int] = List(1, 2, 3, 4)

xs.head
xs.tail

//recursion

def fold1[A, B](xs: List[A], acc: B)(op: (B, A) => B): B = {

  if (xs.isEmpty) acc else fold1(xs.tail, op(acc, xs.head))(op)
}

def add1(xs: List[Int]): Int = fold1(xs, 0)((x, y) => x + y)
add1(List(1, 2, 3, 4))



