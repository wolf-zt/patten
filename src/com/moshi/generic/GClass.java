package com.moshi.generic;

/**
 * Created by 56498838@qq.com 张涛 on 2018/8/6.
 *
 * @version 2.0.0
 */
public class GClass<T extends Food> {
    public  void show(T t){
        t.show();
    }

    public static void main(String[] args) {
        GClass gc = new GClass();
        Apples apples = new Apples();
        gc.show(apples);
    }
}
