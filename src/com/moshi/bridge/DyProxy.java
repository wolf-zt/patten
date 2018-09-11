package com.moshi.bridge;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by 56498838@qq.com 张涛 on 2018/7/12.
 *
 * @version 2.0.0
 */
public class DyProxy {

}
interface  Fruit{
    public void eat(int n);
    public void sale();
}
class Apple implements  Fruit{
    @Override
    public void eat(int n) {
        System.out.println("吃了"+n+"个苹果");
    }

    @Override
    public void sale() {
        System.out.println("卖苹果");
    }
}

class Client {
    public static void main(String[] args) {
        Fruit app = new Apple();
        Fruit pxApp = (Fruit) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Fruit.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if("sale".equals(method.getName())){
                    System.out.println("执行sale之前");
                    method.invoke(app,args);
                    System.out.println("执行sale之后");
                }else if("eat".equals(method.getName())){
                    System.out.println("吃之前洗洗");
                    method.invoke(app,args);
                    System.out.println("吃之后清理");
                }
                return null;
            }
        });
        pxApp.eat(70);
        pxApp.sale();
    }
}