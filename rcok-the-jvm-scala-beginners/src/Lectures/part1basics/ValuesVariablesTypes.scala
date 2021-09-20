package Lectures.part1basics

object ValuesVariablesTypes extends App {

  //  What is the purpose of object and extends App
  val x: Int = 42
  println(x)

  //  VALS ARE IMMUTABLE  (cannot be reassigned) SO THE LINE BELOW WOULD UPSET THE COMPILER
  //  x=2

  //  This line below does not need to specify type, compiler can infer types
  //val x= 42


  //  semicolons are valid in scala but not required also discouraged
  //  val aString: String = "Hello";val anotherString: String = "Another"
  val aString: String = "Hello"
  val anotherString: String = "Another"

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  //  Represented in 4Bytes
  val anInt: Int = x
  //  represent in 2 bytes instead of 4
  val aShort: Short = 324
  //  represent in 8 bytes, if too long compiler will complain
  //  If number is too big for type int, scala will complain int number is oor ,
  //  Represent as long with L at end
  val aLong: Long = 342424234L
  //  Represent as Float with f at end
  val aFloat: Float = 2.2f
  val adouble: Double = 4.23


  //  Variables
  var aVariable: Int = 4
  //  CAN BE REASSIGNED
  aVariable = 5 //side effects allows us to see what our program is doing

}
