package com.moshi.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CountDownLatch;

/**
 * Created by 56498838@qq.com 张涛 on 2018/6/24.
 *
 * @version 2.0.0
 */
public class Client {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, InterruptedException {
        Class<OuterClass>   outer = (Class<OuterClass>)Class.forName("com.moshi.singleton.OuterClass");
        Constructor[] ct = outer.getConstructors();
        Constructor<OuterClass> cst = outer.getDeclaredConstructor(null);
       // cst.setAccessible(true);
       // OuterClass ou = cst.newInstance(null);
      //  OuterClass ou2 = cst.newInstance(null);
        int count = 100;
        final CountDownLatch countDownLatch = new CountDownLatch(count);
        long start=System.currentTimeMillis();
        for(int i=0;i<count;i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 1000000; i++) {
                        //OuterClass.getInstance();
                        Singleton2.getInstance();
                    }
                    countDownLatch.countDown();
                }
            }).start();
        }
        countDownLatch.await();
        long end = System.currentTimeMillis();
        System.out.println("总耗时："+(end-start));

     //  ou.prt();
    }
}
