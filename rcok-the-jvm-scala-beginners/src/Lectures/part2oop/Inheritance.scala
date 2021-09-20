package Lectures.part2oop

object Inheritance extends App {

  //Scala offers single class inheritance - extends one class a time
  class Animal {
    val creatureType = "wild"
    // private modifier - only usable in class (no subclass)
    // private  def eat = println("nomnom")
    //no-modified which means "public" and anyone can access
    def eat = println("nomnom")
    //protected modifier - means usable in class & subclass
    // protected  def eat = println("nomnom")
  }

  //Extending a class means Inheriting from a class means inheriting all the non private fields and methods
  //In this context, we call Cat a subclass of Animal and Animal is a super class of cat

  class Cat extends Animal {
    def crunch = {
      eat
      println("crunch, crunch")
    }
  }
  val cat = new Cat
  cat.eat
  cat.crunch


  //Constructor
  class Person(name: String, age: Int){
    def this(name:String) = this(name, 0)
  }
  class Adult(name: String,age: Int, idCard: String) extends Person(name)

  //overriding
//  class Dog extends Animal {
//    override val creatureType = "domestic"
//    override def eat = println("crunch, crunch")
//  }
//  val dog = new Dog
//  dog.eat
//
//  println(dog.creatureType)

  class Dog (override val creatureType: String) extends Animal {
    override def eat ={
      super.eat // this refers to the method in the super class Animal
      println("crunch, crunch")

    }
  }
    val dog = new Dog("k9")
    dog.eat
   println(dog.creatureType)


  //TYPE SUBSTITUTION ( broad: POLYMORPHISM)
  // Although declared an animal, is actually an instance of Dog so it will use Dog's method
  //Keep in mind: a method call will always go to the most overridded version whenever possible
  //Main powers of polymorphism
  val unknownAnimal: Animal = new Dog("K9")
  unknownAnimal.eat

  //overRIDING - supplying a different implementation in derived classes
  //overLOADING - supplying multiple methods with different signatures but with the same name in the same class


  //super - used when you want to reference a method of a field from parent class LINE 48


  //PREVENTING (LIMITING) OVERRIDES
  //1 - USE KEYWORD FINAL ON MEMBER
  //2 - USE FINAL ON SUPER CLASS MAKES IT ILLEGAL TO EXTEND
  //3 - SEALED THE CLASS can extend classes in THIS file, and NOT OTHER FILES

}
