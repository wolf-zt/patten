package com.moshi.AbstactFactory;

/**
 * Created by 56498838@qq.com 张涛 on 2018/6/26.
 *
 * @version 2.0.0
 */
public interface Engin {
    void run();
    void start();
}
class BestEngin implements Engin{

    @Override
    public void run() {
        System.out.println("run very fast");
    }

    @Override
    public void start() {
        System.out.println("start very fast");
    }
}
class LowestEngin implements Engin{

    @Override
    public void run() {
        System.out.println("run not fast");
    }

    @Override
    public void start() {
        System.out.println("start not fast");
    }
}