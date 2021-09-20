package Lectures.part3fp

object WhatsAFunction extends App {

  //Use functions as first class elements
  //problem: we come from a oo world

  val doubler = new MyFunction[Int,Int] {
    override def apply(element: Int): Int = element * 2
  }
  println(doubler(2))

  //Function types = Function1[A,B]
  val stringToIntConverter = new Function1[String,Int]{
    override def apply(string: String): Int = string.toInt
  }

  println(stringToIntConverter("3" + 4))

  val adder = new Function[Int,Int,Int] {
    override def apply(a: Int,): Int = ???
  }
}

trait MyFunction[A,B] {
  def apply(element: A): B
}
