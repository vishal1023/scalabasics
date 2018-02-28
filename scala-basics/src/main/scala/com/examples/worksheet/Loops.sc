
// range
(1 to 10)

//for loop

for (i <- 1 to 10) {
  print(i + " ")
}

//for loop with guard condition

for (i <- 1 to 5; j <- 1 to 5; if i == j) {
  print(s"($i $j) ")
}

var count = 0
while (count < 10) {
  print(count + " ")
  count = count + 1
}

