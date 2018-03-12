
//a problem of chocolate

def numberOfChocolatesSomeCanBy(rupee: Int, costForOneChocolate: Int, numberOfRappersForOneChocolate: Int): Int = {

  var numberOfChocolatesCanBy = rupee / costForOneChocolate
  var numberOfWrappers = numberOfChocolatesCanBy

  while (numberOfWrappers > 2) {

    val additionalChocolates = numberOfWrappers / numberOfRappersForOneChocolate
    numberOfChocolatesCanBy += additionalChocolates
    numberOfWrappers = additionalChocolates + (numberOfWrappers % numberOfRappersForOneChocolate)
  }

  println(numberOfChocolatesCanBy)

  numberOfChocolatesCanBy
}


//val rupee = 21
//val costForOneChocolate = 1
//val numberOfRappersForOneChocolate = 3

numberOfChocolatesSomeCanBy(15, 1, 3)