import scala.collection.mutable.ArrayBuffer

//Need to initialize array with element type and number of elements
val arr = new Array[Int](10)

arr(0) = 10
arr(1) = 20

arr

//array direct initialization with elements
val arr1 = Array( "Hi", "Hello", "Greetings")
arr1(2) = "bye"
arr1


//Array and ArrayBuffer

//Array -- Fixed size
//ArrayBuffer -- Mutable, this can grow no need to specify the size
// at the time of initialization

val arrayBuffer = new ArrayBuffer[Float]()

arrayBuffer += 10.23f
arrayBuffer += 1.0f

arrayBuffer.toString()


//As ArrayBuffer is empty, so we cannot set an element at index i
// to a new String - index i is not a valid index if the ArrayBuffer is empty.
// First make sure the elements exist in the ArrayBuffer by adding them:

//arrayBuffer(3) = 12.322f // this will throw IndexOutOfBoundException

val str = ArrayBuffer[String]()

str += "abc1"
str += "abc2"
//Now the ArrayBuffer has two elements and you can modify them if you want.
// Note that indices start at 0, not at 1.

str(0) = "something else"
str(1) = "hello world"
//If you want to pre-fill the ArrayBuffer you can for example use fill,
// as I showed you in my answer to your previous question.

// Fill with 10 empty strings (creates 10 elements in the ArrayBuffer)
val strings = ArrayBuffer.fill(10) { "" }

// Now you can set them (valid indices are 0...9)
strings(0) = "abc1"
strings(1) = "abc2"

