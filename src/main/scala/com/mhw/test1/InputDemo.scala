package com.mhw.test1

import scala.io.StdIn

/*
 * msxf.com Inc.
 * Copyright (c) 2017-2017 All Rights Reserved.
 */
object InputDemo {
  def main(args: Array[String]): Unit = {
    // stdin trait 特质 等价于Java的interface+abstract
    val name = StdIn.readLine()
    println(s"input name=$name")

    val t = new Cat222()
    println(t.age)
    print(t.color)
  }
}

class Cat222{
  var name:String = ""
  var age:Int = _
  var color:String = _
}