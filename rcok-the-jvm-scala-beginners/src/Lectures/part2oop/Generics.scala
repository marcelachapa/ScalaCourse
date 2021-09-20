package Lectures.part2oop

object Generics extends App {

  class MyList[A] {
    //Use the type A
  }

  class MyMap[Key, Value] {

  }

  val listOfIntegers = new MyList[Int]
  val listOfStrings = new MyList[String]


  //generic methods
  object MyList {
    def empty[A] : MyList[A] = ???

  }
  val emptyListOfIntegers = MyList.empty[Int]

  //variance problem
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  //List[Cat] extends List[Animal] = COVArIANCE
  class ConvariantList[+A]
  val animal: Animal = new Cat
  val animalList: ConvariantList[Animal] = new ConvariantList[Cat]


  //INVARIANCE
  class InvariantList[A]
  val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]

  //CONTRAVARIANCE
//  class Contravariant[-A]
//  val contravariantList: Contravariant[Cat] = new  ConvariantList[Animal]


  //Bounded types

}
