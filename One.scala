/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we
get 3, 5, 6 and 9. The sum of these multiples is 23. Find the sum of all the
multiples of 3 or 5 below 1000.
 */

import java.lang.NumberFormatException

object One {
  def main(args: Array[String]): Unit = {
    if (args.length < 3) {
      println("Requires 3 args: two factors and a ceiling.")
      return
    }
    if (args(0) == args(1)) {
      println(s"Requires two distinct factors: ${args(0)} ${args(1)}")
      return
    }

    var factors: Array[Int] = Array()
    var ceiling = 0

    try {
      factors = args.slice(0, 2).map(_.toInt).sorted
      ceiling = args(2).toInt
    } catch {
      case _: NumberFormatException => {
        println("All args must be integers"); return
      }
    }

    if (factors(0) <= 0 || factors(1) <= 0) {
      println("Factors must be positive integers")
      return
    }
    if (ceiling <= factors(1)) {
      println(
        s"Ceiling must be greater than both factors: ${ceiling} <= ${factors(1)}"
      )
      return
    }
    val sum = findSumOfMultiples(factors, ceiling)
    println(sum)
  }

  def findSumOfMultiples(factors: Array[Int], ceiling: Int): Int = {
    var sum = factors.sum
    for (i <- Range(factors(1) + 1, ceiling)) {
      if (i % factors(0) == 0 || i % factors(1) == 0) {
        sum += i
      }
    }
    return sum
  }
}
