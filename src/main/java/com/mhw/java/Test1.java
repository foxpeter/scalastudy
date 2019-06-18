/*
 * msxf.com Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package com.mhw.java;

/**
 * 类说明
 *
 * @author hanwen.mei@msxf.com
 * @version Test1.java, 2019/6/12 16:56
 */
public class Test1 {
    public static void main(String[] paramArrayOfString) {
        Test1$.MODULE$.main(paramArrayOfString);
    }
}



final class Test1$ {
    public static final Test1$ MODULE$;
    static {
        MODULE$ = new Test1$();
    }

    public void main(String[] args) { // Byte code:
        System.out.println("heelc");
    }
}