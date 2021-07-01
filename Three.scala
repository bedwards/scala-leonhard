/* The prime factors of 13195 are 5, 7, 13 and 29. What is the largest prime
factor of the number 600851475143? */

import java.lang.NumberFormatException

object Three {
  def main(args: Array[String]): Unit = {

    if (args.length != 1) {
      println("Requires 1 arg: an integer.")
      return
    }

    var n = 0L

    try {
      n = args(0).toLong
    } catch {
      case _: NumberFormatException => {
        println("The arg must be an integer"); return
      }
    }

    println(s"${largestPrimeFactor(n)}")
  }

  def largestPrimeFactor(number: Long): Option[Long] = {
    var n = number
    var lastFactor: Option[Long] = None

    def divideOut(factor: Long): Unit = {
      lastFactor = Option(factor)
      println(s"n=$n, factor=$factor")
      do {
        n = n / factor
      } while (n % factor == 0)
    }

    if (number % 2 == 0) {
      divideOut(2L)
    }

    var candidate = 3L
    while (n > 1) {
      if (n % candidate == 0) {
        divideOut(candidate)
      }
      candidate += 2
    }

    return lastFactor
  }
}
