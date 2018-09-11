package com.moshi.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by 56498838@qq.com 张涛 on 2018/6/28.
 *
 * @version 2.0.0
 */
public interface Star {
    void link();
    void sign();
    void sing();
    void money();
}

class RealStar implements Star{
    @Override
    public void link() {
        System.out.println("聯係演出事宜");
    }

    @Override
    public void sign() {

    }

    @Override
    public void sing() {
        System.out.println("star sing a song");
    }

    @Override
    public void money() {

    }
}

class Client {
    public static void main(String[] args) {
      //  Proxy.newProxyInstance(Client.getClass().getClassLoader(),Class[] {Star},)
        Star star = new RealStar();
        StartHandler startHandler = new StartHandler(star);
        Star hstar = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{Star.class},startHandler);
        hstar.sing();
        hstar.link();
    }
}

class StartHandler implements InvocationHandler{
    private  Star realStar;
    public StartHandler(Star realStar){
        this.realStar = realStar;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if("sing".equals(method.getName())) {
            System.out.println("唱歌前的所有准备");
        }else if("link".equals(method.getName())){
            System.out.println("做練習前的準備");
        }
        return method.invoke(realStar,args);
    }
}