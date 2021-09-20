package Lectures.part2oop

object AbstractDataTypes extends App {

  //Abstract members- There are situations where you need to leve some fields or methods blank or unimplemented
  //Classes whi9ch contain unimplemented or abstract fields or methods are called abstract classes and aredefined by keyword abstract
  // Abstract class cannot be instantiated
  abstract class Animal {
    val creatorType: String = "wild"
    def eat: Unit
  }

  class Dog extends Animal{
    override val creatorType: String = "Canine"
    override def eat: Unit = println("Crunch Crunch")
  }


  //Traits - keyword trait
  trait Carnivore {
    def eat(animal: Animal): Unit
    val preferredMeal: String = "Meat"
  }

  //This means that this class inherits members from bot Animal and Carnivore
  class Crocodile extends Animal with Carnivore {
    override val creatorType: String = "croc"
    def eat: Unit = println("nomnom")
    def eat(animal: Animal): Unit = println(s"I'm a croc and I'm eating ${animal.creatorType}")
  }


  val dog = new Dog
  val croc = new Crocodile

  croc.eat(dog)


  //Traits vs Abstract
  //Abstract classes can have both abstract and non abstract and so can traits


  /*How are traits different from abstract
   1 -  Traits cannot have constructor parameters
   2 -  Multiple traits may be inherited by the same class
   3 -  Traits = behavior, abstract class = type of thing
  */






}
