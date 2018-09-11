package com.moshi.singleton;

/**
 * Created by 56498838@qq.com 张涛 on 2018/6/23.
 *
 * @version 2.0.0
 */
public class Singletons {
    private static Singletons singleton;

    private Singletons(){}
    public static Singletons getInstance(){
        return new Singletons();
    }
}

class OuterClass{
    private  static class InnerClass {
            static {
                System.out.println("静态代码块被执行");
            }
            static final OuterClass instance = new OuterClass();

        public static OuterClass getInstance(){
            return  instance;
        }


    }
    private OuterClass(){
        if(InnerClass.instance != null){
            throw new RuntimeException("不能调用了");
        }
    }

    public static OuterClass getInstance(){
        return InnerClass.getInstance();
    }
    public void prt(){
        System.out.println("输出一个字符串");
    }
}