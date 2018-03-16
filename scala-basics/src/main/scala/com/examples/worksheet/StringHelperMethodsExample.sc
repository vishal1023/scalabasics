
val s: String = "This is test string    "

print("char at 1st index =f " + s.charAt(1))

println(s.codePointAt(8)) // returns an ASCII code

println(s.codePointBefore(1)) // returns an ASCII code for previous char

println(s.intern())

println(s.trim)

println(String.copyValueOf(Array[Char]('a', 'b', 'c')))

println(s.regionMatches(false, 5, "is", 0, 1))
