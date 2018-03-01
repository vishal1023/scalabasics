class Foo(val name: String, val age: Int, val sex: Symbol)

object Foo {
  def apply(name: String, age: Int, sex: Symbol) = new Foo(name, age, sex)
}

val fooList = Foo("Hugh Jass", 25, 'male) ::
  Foo("Biggus Dickus", 43, 'male) ::
  Foo("Incontinentia Buttocks", 37, 'female) ::
  Nil


val stringListFoldLeft = fooList.foldLeft(List[String]()) { (z, f) =>

  val title = f.sex match {
    case 'male => "Mr."
    case 'female => "Ms."
  }

  z :+ s"$title ${f.name}, ${f.age}"
}

val stringListFoldRight = fooList.foldRight(List[String]()) { (z, f) =>

  val title = z.sex match {
    case 'male => "Mr."
    case 'female => "Ms."
  }
  f :+ s"$title ${z.name}, ${z.age}"
}

stringListFoldLeft.foreach(println)


stringListFoldRight.foreach(println)