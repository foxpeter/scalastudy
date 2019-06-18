package com.mhw.test1

/*
 * msxf.com Inc.
 * Copyright (c) 2017-2017 All Rights Reserved.
 */
object PrintDemo {
  def main(args: Array[String]): Unit = {
    var name1:String = "hee"
    var name2:String = "sss"

    println(name1 + name2)
    // 根java其实一样
    printf("asf name=%s qwer name=%s\n", name1, name2)
    println(s"aaa name=$name1 bbb=$name2")
  }
}
