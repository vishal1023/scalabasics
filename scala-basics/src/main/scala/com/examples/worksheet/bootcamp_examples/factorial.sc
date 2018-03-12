

//Factorial

//recursion
def fact(n: Int): Int = {
  if (n == 1)
    1
  else {
    n * fact(n - 1)
  }
}

fact(5)
//fact(50000) -- will give a stack overflow exception

//Tail Recursion

def factorialTailRecursionImpl(n: Int, fact: BigInt): BigInt = {
  if (n == 1)
    fact
  else
    factorialTailRecursionImpl(n - 1, n * fact)
}

factorialTailRecursionImpl(5, 1)


//This example shows we can have function withing function.
//When you don't want to expose a function outside you can put it in a function
//and it will be available in that function scope only.

def factorial(n: Int): BigInt = {

  def factorialTailRecursionImpl(n: Int, fact: BigInt): BigInt = {
    if (n == 1)
      fact
    else
      factorialTailRecursionImpl(n - 1, n * fact)
  }

  factorialTailRecursionImpl(n, 1)
}


factorial(50)