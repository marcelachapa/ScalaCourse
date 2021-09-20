package Lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {

  //  Stack overflow occurs when the recursive depth is too big
  def factorial(n: Int): Int =
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " + (n - 1))
      val result = n * factorial(n - 1)
      println("Computed factorial of " + n)
      result
    }

  println(factorial(10))

  // This function allows scala to preserve the SAME static frame and not use additinoal static frames for recursive calls
  //Scala does not need to save intermediate results to be used later
  def anotherFactorial(n: Int): BigInt = {
    @tailrec //Auxirialy function
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator) //TAIL RECURSION - use recursive call as last expression

    factHelper(n, 1)
  }

  //WHEN YOU NEED LOOPS, USE TAIL RECURSION
  /*
  1.Concatenate a string n times
  2. IsPrime function tail recursive
  3. Fibonacci function, tail recursive
   */


  //  CONCATENATE
  @tailrec
  def concatenateTailrec(aString: String, n: Int, accumulator: String): String =
    if (n <= 0) accumulator
    else concatenateTailrec(aString, n - 1, aString + accumulator)

  println(concatenateTailrec("hello", 3, ""))

  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean =
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailrec(t - 1, n % t != 0 && isStillPrime)

    isPrimeTailrec(n / 2, true)
  }

  println(isPrime(2003))
  println(isPrime(44))


  def fibonacci(n: Int): Int = {
    def fiboTailrec(i: Int, last: Int, nextToLast: Int): Int =
      if (i >= n) last
      else fiboTailrec(i + 1, nextToLast, last)

    if (n <= 2) 1
    else fiboTailrec(2, 1, 1)
  }

  println(fibonacci(8))


}
