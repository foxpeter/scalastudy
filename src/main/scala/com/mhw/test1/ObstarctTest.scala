package com.mhw.test1

object ObstarctTest {
  def main(args: Array[String]): Unit = {
    val animal03 = new Animal03 {
      override def sayHi(): Unit = {
        print("hello")
      }

      override var food: String = _
    }
    animal03.sayHi();
    print(animal03.food)
  }
}

abstract class Animal03 {
  def sayHi()
  var food:String
}

class Cat extends Animal03{
  override def sayHi(): Unit = ???

  override var food: String = _
}