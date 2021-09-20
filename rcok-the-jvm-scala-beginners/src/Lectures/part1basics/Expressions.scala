package Lectures.part1basics

//Extends app make the application runnable in intellij
object Expressions extends App {

  val x = 1 + 2 //Expression
  println(x)
  // + -  * / & | ^ << >> >>>(right shift with 0 extension)


  println(1 == x)
  //  == != > >= < <=

  println(!(1 == x))
  //  ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /=
  //  changing a variable is a side effects

  //  Instructions (Tell the computer to DO, ex: print a variable, add, etc.)
  //  vs Expressions (VALUE or a TYPE)

  //  IF expression = if in scala is an expression
  val aCondition = true
  val aConditionValue = if (aCondition) 5 else 3
  print(aConditionValue)


  //  NEVER WRITE THIS AGAIN
  //  var i = 0
  //  while (i < 10) {
  //    println(i)
  //    i+=1
  //  }

  //  EVERYTHING IN SCALA IS AN EXPRESSIONS!

  val aWerirdValue = (aVariable = 3) //Unit === void

  //  side effects: println(), whiles, reassigning - side effects returning units

  //  Code Blocks
  //  This is an expression = value type is the type of the last expresion, in this case it is a string
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (x > 2) "hello" else "goodbye"
  }


  //  QUESTIONS
  //  1. What is the difference between "hello world" and println("Hello World")
  // 2.
  val someValue = {
    2 < 3
  }
  val someOtherValue = {
    if (someValue) 239 else 986
    42
  }


}
