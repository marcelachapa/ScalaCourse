package Lectures.part1basics

object DefaultArgs extends App {

  // if I do not pass an accumulator value, if will be 1 by default
  def trFact(n: Int, acc: Int = 1): Int =
    if (n <= 1) acc
    else trFact(n - 1, n * acc)

  val fact10 = trFact(10)

  def savePicture(format: String = "jpg", width: Int = 1920, height: Int = 1080): Unit = println("saving picture")

  savePicture()
  savePicture(width = 900)

  /*
  1. Pass in every leading argument
  2. Name the arguments

   */


}
