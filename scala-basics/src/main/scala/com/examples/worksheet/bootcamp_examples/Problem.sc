//This problem was asked by Airbnb.
//Given a list of integers, write a function that returns the largest
// sum of non-adjacent numbers. Numbers can be 0 or negative.
//For example, [2, 4, 6, 8] should return 12, since we pick 4 and 8.
// [5, 1, 1, 5] should return 10, since we pick 5 and 5.


import scala.math.max

def findLargestSum(arr: Array[Int]): Int = {

  if (arr.length == 0) return 0
  if (arr.length == 1) return arr(0)
  if (arr.length == 2) return max(arr(0), arr(1))

  var i = 0
  var j = i + 2
  var sum: Int = Int.MinValue

  while (i < arr.length - 1) {
    if (j < arr.length) {
      sum = max(sum, arr(i) + arr(j))
      j = j + 1
    } else {
      i = i + 1
      j = i + 2
    }
  }
  sum
}

var sum: Int = Int.MinValue

val arr = Array(2, 4, 6, 8, 11, 1, 1, 5, 3, 11, 12)
print(findLargestSum(arr))

//print(sum)

val s: String = "hello"

val sa = s.charAt(0).toUpper + s.substring(1)






