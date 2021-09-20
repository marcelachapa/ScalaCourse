package Lectures.part2oop

object AnonymousClasses extends App {

  abstract class Animal {
    def eat: Unit
  }

  //This is called an anonymous class
  val funnyAnimal: Animal = new Animal {
    override def eat: Unit = println("hahahahhahaha")
  }

  println(funnyAnimal.getClass)

  class Person(name: String) {
    def sayHi: Unit = println(s"Hi, my name is $name, how can I help?")
  }

  val jim = new Person("Jim") {
    override def sayHi: Unit = println(s"Hi, my name is Jom, how can I be of service?")
  }


  /*
  1. Create a Generic trait MyPredicate[T]  with a little method test(T) => boolean
  2. Generic trait MyTransformer[A,B]
  3. MyList:
       - map(transformer) => MyList
       - filter(predicate) => MyList
       - flatMap(transformer from A to MyList[B]) => MyList[B]

       class EvenPredicate extends MyPredicate[Int]
       class StringToTransformer extends MyTransformer[String, Int]

       [1,2,3].map(n * 2) = [2,4,6]

   */

}
