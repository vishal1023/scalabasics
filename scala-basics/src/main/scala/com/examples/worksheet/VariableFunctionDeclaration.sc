val a: Int = 10 // when a variable is 'val' type it can't be reassigned
//a = 23  // will give an compile time error

var b: Int = 23 // when a variable is 'var' type it can be reassigned
b = 10

//function

//signature -- def <function_name> (<function_parameter>) : <return_type> = <body>
def add(first: Int, second: Int): Int = first + second;

//calling function
add(10, 23)


//Type inference, if you don’t specify the type of variable scala looks for the type
// depends on the value provided to variable.

val c = "Hello"

def addWithoutReturnType(first: Int, second: Int) = first + second;
addWithoutReturnType(23, 10)

//function with default argument

def subtraction(first: Int, second: Int = 10): Int = first - second

subtraction(23, 3)
subtraction(20)

