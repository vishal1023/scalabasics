
class Car(val year: Int, var name: String, var miles: Int) {

  println("In constructor")

  def drive(dist: Int) = {
    miles += dist
  }

  def driveAndModify(newName: String, dist: Int) = {
    name = newName
    miles += dist
  }
}

val car = new Car(2018, "BMW", 0)
car.drive(10)
car drive 10

println(car.miles)

car.driveAndModify("Volksvagen", 10)

println(car.toString)