package code

trait Ord[A] {
  def lt(a: A, b: A): Boolean
}

object Ord {
  implicit val intOrd: Ord[Int] = (a: Int, b: Int) => a < b
  val intOrd2: Ord[Int] = (a: Int, b: Int) => a > b

  implicit val strOrd: Ord[String] = (a: String, b: String) => a < b

  implicit def optOrd[A](implicit ord: Ord[A]): Ord[Option[A]] = (a: Option[A], b: Option[A]) => (a, b) match {
    case (Some(x), Some(y)) => ord.lt(x, y)
    case (None, _)          => true
    case (_, None)          => false
  }

  implicit def pairOrd[A, B](implicit ord1: Ord[A], ord2: Ord[B]): Ord[(A, B)] = (a: (A, B), b: (A, B)) => {
    if (ord1.lt(a._1, b._1)) true
    else if (ord1.lt(b._1, a._1)) false
    else ord2.lt(a._2, b._2)
  }

}
