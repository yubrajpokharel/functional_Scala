package oop

object OOBasic extends App {
  val person = new Person("yubraj", 28)
  println(person)

  //curried function
  /*val adder: Function1[Int, Function1[Int, Int]] = new Function1[Int, Function1[Int, Int]]{
    override def apply(x:Int) : Function1[Int, Int] = new Function1[Int, Int] {
      override def apply(y: Int): Int = x + y;
    }
  }*/

  //simpler form
  val adder: (Int) => ((Int) => Int) = (x: Int) => (y: Int) => x + y

  println(adder(3)(4)
}


case class Person(name: String, age:Int)