
sealed abstract class Day(day: String) {

}

object Day {

  case object Weekday extends Day("WD") {

  }

  case object Weekend extends Day("WW")

}

def m(day: Day) = {
  println(day)
}

m(Day.Weekend)
m(Day.Weekday)

Day.Weekday
Day.Weekend

Day.Weekend.##
Day.Weekend.hashCode()

