
val string = "Hello"

val s: String = "World"

val full = string + s

val name = "Bob"

//s Interpolator
println(s"Hello, ${name}")

println(s" 1 + 1 = ${1 + 1}")



//f Interpolator
val height = 1.9d

val firstName = "Joe"

println(f"${firstName} is ${height}%.2f meters tall")


//‘raw’ Interpolator
//The ‘raw’ interpolator is similar to ‘s’ interpolator
// except that it performs no escaping of literals within a string.
// The following code snippets in a table will differ the usage of ‘s’
// and ‘raw’ interpolators. In outputs of ‘s’ usage ‘\n’ effects as new line
// and in output of ‘raw’ usage the ‘\n’ will not effect.
// It will print the complete string with escape letters.

println(s"Hello \n this text will be on new line \n\t this is new line + tab ")

println(raw"Hello there is no effect of \n \t as it is a raw Interpolator")