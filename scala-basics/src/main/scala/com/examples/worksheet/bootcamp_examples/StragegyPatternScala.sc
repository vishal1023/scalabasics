
def totalPrices(prices: List[Int]) = {
  var total = 0

  for (price <- prices) {
    total += price
  }

  total
}


val prices = List(10, 15, 20, 25, 30, 40, 45)
println(totalPrices(prices))


//now you want to have a function which returns the total of all values > 25
//also you want total of all values < 25 separately


def totalPricesNew(prices: List[Int], selector: Int => Boolean) = {

  var total = 0
  for (price <- prices) {
    if (selector(price)) total += price
  }

  total
}

println(totalPricesNew(prices, price => price > 25))
println(totalPricesNew(prices, price => price < 25))

val multilineString =
  """" asdfasdfasfd
asdfasdfasdfasdf
asdfasdfasdfasf """"


multilineString.toUpperCase()