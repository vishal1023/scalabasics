
import scala.collection.mutable

//using buffer
def map(xs: List[Int], op: Int => Int): List[Int] = {

  val buffer = mutable.Buffer.empty[Int]

  val iterator = xs.iterator
  while (iterator.hasNext) {
    val e = iterator.next()
    buffer += op(e)
  }
  buffer.toList
}

def square(a: Int) = a * a
val square1: Int => Int = a => a * a
val square2 = square1

val xs: List[Int] = List(1, 2, 3)



square1.apply(10)

map(xs, square)
map(xs, square1)

map(xs, x => x * 5)