package com.moshi.singleton;

/**
 * Created by 56498838@qq.com 张涛 on 2018/6/24.
 *
 * @version 2.0.0
 */
public class Singleton2 {
    private static Singleton2 singleton2 =null;
    static  final  byte[] arr;
    static {
      singleton2 = new Singleton2();
        System.out.println("执行了初始化");
        arr = new byte[100000000];
    }

    private Singleton2(){}
    public static Singleton2 getInstance(){
        return singleton2;
    }
}
