package com.mhw.test1

/*
 * msxf.com Inc.
 * Copyright (c) 2017-2017 All Rights Reserved.
 */
object VariableTest {
  def main(args: Array[String]): Unit = {
    var age:Int = 18
    var name:String = "hh"
    var sal:Double = 999999
    var score:Float = 70.8F
    var isPass:Boolean = true
    println(s"$age $name $isPass")

    // 强制类型转换， 不能用java的 （int) scala 都是对象
    var i:Int = 2.7 toInt

    println(s"aaa $i")

    // 特殊字符 必须至少跟两个才行 单独+ 不行 必须++。。 也不能跟其他字服 比如 ++q错误
    var +++- = 90
    println(+++-)
  }
}
