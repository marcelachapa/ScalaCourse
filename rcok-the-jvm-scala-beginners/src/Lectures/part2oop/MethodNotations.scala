package Lectures.part2oop

import scala.language.postfixOps

object MethodNotations extends App {

  class Person(val name: String, favoriteMovie: String, val age: Int = 0){
    def likes(movie: String): Boolean = movie == favoriteMovie
    def +(person: Person): String = s"${this.name} is haning out with ${person.name}"
    def unary_! : String = s"$name, what the heck?!"
    def isAlive: Boolean = true
    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"

    //Exercises
    def +(nickname: String): Person = new Person(s"$name ($nickname)", favoriteMovie)
    def unary_+ : Person = new Person(name, favoriteMovie, age + 1)
    def learns(thing: String) = s"$name is leaning $thing"
    def learnsScala = this learns "Scala"
    def apply(n: Int): String = s"$name watched $favoriteMovie $n times"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") //infix notation || operator notation only works with methods with one parameter

  //Operators in scala
  val tom = new Person("Tom", "Fight Club")
  println(mary + tom)
  println(mary.+(tom))

  // ALL OPERATORS ARE METHODS
  // Akka actors have ! ? operators - these are the asked patterns of tail patterns between asynchronous actors


  //PREFIX NOTATION
  val x = -1
  val y = 1.unary_-
  //UNARY_ PREFIX ONLY WORKS WITH - + ~ !

  println(!mary)
  println(mary unary_!)

  //POSTFIX NOTATION
  //Methods that do not receive any parameters have the property that they can be used in a postfix notation
  println(mary.isAlive)
  println(mary isAlive)

  //apply - all have same result
  println(mary.apply())
  println(mary apply)
  println(mary())


  /*
  1. Overload the + operator
    mary + "the rockstar" => new person "Mary (the rockstar)"

  2. Add an age tot he Person class
     Add a unary + operator -> new person witht he age + 1
     +mary -> mary with the age incrementer

  3. Add a "learns" method in the Person class => class => "Mary learns Scala"
     Add a learnScala method, calls learns method with "Scala".
     Use it in postfix notation

  4. Overload the apply method
     mary.apply(2) => "Mary watched Inception 2 times"
   */
//applied method apply to print
  println((mary + "the rockstar")())
  println((mary + "the rockstar").apply())

  println((+mary).age)

  println(mary learnsScala)

  println(mary(10))

}
