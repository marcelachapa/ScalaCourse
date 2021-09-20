package Lectures.part1basics

object Functions extends App {
  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  // Compilet can figure out return type on their own in this case but its better to specify regardless
  //  def aFunction(a: String, b: Int) = {
  //    a + " " + b
  //  }

  println(aFunction("hello", 3))

  def aParameterLessFunction(): Int = 42

  println(aParameterLessFunction())
  println(aParameterLessFunction)


  //RECURSIVE FUNCTION
  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction("hello", 3))



  //WHEN YOU NEED LOOPS, USE RECURSION


  def aFunctionWithSideEfects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n - 1)
  }

  /*
  1. A greeting function (name, age) => "Hi. my name is $name nad I am $age years old"
  2. Factorial Function compute the product of all int numbers up to n 1 * 2 *3 ...
  3. A fibonnaci Function
        f(1) = 1
        f(2) = 1
        f(n) = f(n-1) + f(n -2)
  4. Tests if a number is prime

   */
  //GREETING
  def aGreeting(name: String, age: Int): String = {
    "Hello my name is " + name + " my age is " + age
  }

  println(aGreeting("Marcela", 24))

  //  FACTORIAL
  def aComputationalFunction(n: Int): Int = {
    if (n <= 0) 1
    else n * aComputationalFunction(n - 1)
  }

  println(aComputationalFunction(4))

  //FIBONACCI
  def fibonacci(n: Int): Int = {
    if (n <= 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
  }

  println(fibonacci(8))

  //  CHECK if Prime
  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)
    }

    isPrimeUntil(n / 2)
  }

  println(isPrime(37))
  println(isPrime(37 * 17))

}
