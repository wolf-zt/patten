package com.moshi.compsite;

/**
 * Created by 56498838@qq.com 张涛 on 2018/7/3.
 *
 * @version 2.0.0
 */
public class Leaf implements  Composite {
    String name = "";

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void operate() {
        System.out.println("一个叶子"+name);
    }
}
