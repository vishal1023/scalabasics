
def add(a: Int = 10, b: Int = 23): Int = a + b

add(10)
add()
add(b = 10)
add(1, 2)
add(a = 23)

case class Person(name: String, age: Int) {
  def grow(by: Int): Person = copy(age = age + by)
}

val person1 = Person("Vishal", 29)
val person2 = Person("Vishal", 29)

val person1Grown = person1.grow(10)

person1 == person1Grown
person1 == person2
person1 eq person2
person1 eq person1
person1 eq person1Grown


person1.hashCode()
person1.##

person2.hashCode()
person2.##

person1Grown.hashCode()
person1Grown.##

person1.age
person1.name

person2
val person3 = person2.copy(age = 100)
person2 == person3

val s = "Test"

