package Lectures.part2oop

import Playground.{Cinderella => Princess , PrinceCharming}
//import Playground._ for everything being imported
object PackagesAndImports extends App{

  //package members are accessible by their simple class Name
  val writer = new Writer("Daniel","RockTheJVm",2018)

  //import the package
  // val princess = new Playground.Cinderella // fully qualified name
  val princess = new Princess

  //packages are in hierarchy

  //matching folder structure

  //package object
  sayHello


  //IMPORTS
  val prince = new PrinceCharming


  //default imports
  //
}
