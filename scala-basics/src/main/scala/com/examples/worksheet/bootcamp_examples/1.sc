import scala.collection.mutable


def square(a: Int) = a * a

square(10)

def squareAll(xs: List[Int]): List[Int] = {

  var buff = mutable.Buffer.empty[Int]
  val iterator = xs.iterator
  while (iterator.hasNext) {
    val e = iterator.next()
    buff += e * e
  }
  return buff.toList
}


val xs: List[Int] = List(1, 2, 3)
squareAll(xs)