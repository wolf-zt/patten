package com.moshi.template;

/**
 * Created by 56498838@qq.com 张涛 on 2018/6/30.
 *
 * @version 2.0.0
 */
public abstract class Bank {
    public void  takeNum(){
        System.out.println("取出编号");
    }
    public abstract void doSomething();
    public void comment(){
        System.out.println("进行打分");
    }

    public void transaction(){
        takeNum();
        doSomething();
        comment();
    }
}
