package com.moshi.bridge;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by 56498838@qq.com 张涛 on 2018/7/10.
 *
 * @version 2.0.0
 */
public class Handler {
}

interface  Person{
    void  sing();
}
class  Star implements Person{
    @Override
    public void sing() {
        System.out.println("明星唱支歌");
    }

    public static void main(String[] args) {



        Person star = new Star();
        MyProxy myProxy = new MyProxy(star);
        Person p = (Person) Proxy.newProxyInstance(Star.class.getClassLoader(),new Class[]{Person.class},myProxy);
        p.sing();
    }
}
class MyProxy implements InvocationHandler{
    private Object obj;
    public MyProxy(Object obj){
        this.obj = obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("执行之前");
        Object   result =  method.invoke(obj,args);
        System.out.println("执行之后");
        return result;
    }
}