package Lectures.part2oop

object Objects extends App {

  //SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY (no "static")

  //THIS PATTERN OF WRITING CLASSES AND OBJECTS
  // WITH THE SAME NAME IN THE SAME SCOPE IS CALLED COMPANIONS

  object Person { // type + its only instance
    // "static" of "class level" functionality
    val N_EYES = 2
    def canFly: Boolean = false

    //Factory method
    def apply(mother: Person, father: Person): Person = new Person("Bobbie")
  }

  //Pattern used in practice classes and objects with the same name in same scode
  class Person(val name: String) {
  // instance-level functionality
  }



  println(Person.N_EYES)
  println(Person.canFly)

  //Scala object = SINGLETON INSTANCE

  //Instance of Person Type
  //Advantage of scala object is that they are singleton instances by definition without any other code needed
  val mary = new Person("Mary")
  val john = new Person("john")
  println(mary == john) // true because they both point to the same instance (the object Person)


  val bobbie = Person(mary, john)


  //Scala application = scala object with (Why we need extends App in declaration)
   //def main(args:Array[String]): Unit
}
