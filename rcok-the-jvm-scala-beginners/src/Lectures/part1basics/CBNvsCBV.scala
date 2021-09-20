package Lectures.part1basics

object CBNvsCBV extends App {

  def calledByValue(x: Long): Unit = {
    println("by value" + x)
    println("by value" + x)
  }

  //using => for binding call value of function is evaluated. useful in lazy streams
  def calledByName(x: => Long): Unit = {
    println("by name" + x)
    println("by name" + x)
  }


  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())


  def infinite(): Int = 1 + infinite()

  def printFirst(x: Int, y: => Int) = println(x)

  //  printFirst(infinite(),34)
  //Question - can this only work for parameter less function calls or can I apply and pass parameters to the variable being called by name
  printFirst(34, infinite())
}
