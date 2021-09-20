package Lectures.part2oop

object OOBasics extends App {

  val person = new Person("John", 23)
  println(person)
  println(person.x)
  println(person.age)
  person.greet("Danni")

  val author = new Writer("Marcela","Chapa" ,1812)
  val novel = new Novel("Great Expectations", 1861, author )

  //  println(novel.authorAge)
  //  println(novel.isWrittenBy(author))

  val counter = new Counter
  counter.inc.print
  counter.inc.inc.inc.print
  counter.inc(10).print
}

//A class organized data and behavior that is code
//Instantiation -
//Constructor- says every single instance of person must be constructed by passing in a name and age
//class Person(name: String, age: Int)

//Class parameters are NOT FIELDS

/* now it is : class Person(name: String, val age: Int) BECAUSE I ADDED val */


//Default parameter works for constructors as well
class Person(name: String, val age: Int = 0) {
  //body
  val x = 2
  println(1 + 3)

  //Method - is a function defined inside a class definition
  def greet(name: String): Unit = {
    println(s"TESTING ${this.name} $x says: Hi, $name")

  }

  //overloading - same name, different but different signatures
  def greet(): Unit = println(s"Hi, I am $name")


  // Multiple constructors OR overloading constructor
  // The frustration with auxillary constructors is that the implementation of a secondary constructor
  // has to be another constructor and nothing else
  def this(name: String) = this(name, 0)

  def this() = this("John Doe")
}

/*
* Novel and a Writer
*
* Writer: first name, surname, year
*   -method fullname
*
* Novel: name, year of release, author
*   - authorAge
*   -isWrittenBy(author)
* -copy (receives new year of release) new instance of Novel
*
* */


// val so year can be referenced in method call
class Writer(fName: String, surName: String,val year: Int) {
  //My function - I see where I was going but there are simpler ways
  //        def fullName(): Unit = println(s"${this.fName} ${this.surName}")
  def fullName: String = fName + " " + surName
}

class Novel(name: String, year:Int, author: Writer){
  def authorAge = year - author.year
  def isWrittenBy(author:Writer) = author == this.author
  def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}
/*
* Counter Class
*   -Receives an int value
*   - method current count
*   - method to increment.decrement => new Counter
*   - Overload inc/dec to receive an amount
*
* An object whose state cannot change after it has been constructed is called immutable
* */

class Counter(val count: Int = 0) {
  // The fact that we are returning a new counter rather than modifying the current count in this instance is calles immutibility
  def inc = {
    println("incrementing")
    new Counter(count + 1)
  }
  def dec = {
    println("decrementing")
    new Counter(count - 1)
  }

  //OverLoads
  def inc(n: Int): Counter = {
    if (n <= 0 ) this
    else inc.inc(n-1)
  }
  def dec(n: Int) : Counter = {
    if (n <= 0 ) this
    else dec.dec(n-1)
  }
  def print = println(count)
}