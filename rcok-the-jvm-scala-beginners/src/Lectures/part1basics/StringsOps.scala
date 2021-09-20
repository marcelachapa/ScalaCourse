package Lectures.part1basics

object StringsOps extends App {

  val str: String = "Hello I am learning Scala"

  println(str.charAt(2))

  println(str.substring(2, 11))

  println(str.split(" ").toList)

  println(str.startsWith("Hello"))

  println(str.replace(" ", "-"))

  println(str.toLowerCase())

  println(str.toUpperCase())

  println(str.length)


  val aNumString = "45"
  val aNumber = aNumString.toInt

  println('a' +: aNumString :+ 'z')
  println(str.reverse)
  println(str.take(2))

  // S- interpolators (string intepolators) Avoids string being interpreset literally
  val name = "David"
  val age = 12
  val greeting = s"Hello, my name is $name and I am $age years old "
  val anotherGreeting = s"Hello, my name is $name and I will be turning ${age + 1}  years old "
  println(greeting)
  println(anotherGreeting)

  // F- interpolators (for format such as amount of decimal points etc.)
  val speed = 1.2f
  val myth = f"$name%s can eat $speed%2.2f burgers per min"
  println(myth)

  // raw-interpolator
  print(raw"This is a \n newline - does not work")

  val escaped = " \n This is a \n newline"
  print(raw"$escaped")
}
