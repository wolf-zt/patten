package com.moshi.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 56498838@qq.com 张涛 on 2018/8/6.
 *
 * @version 2.0.0
 */
public class Clients {
    public static void main(String[] args) {
        List<Food> list =new ArrayList<Food>(10);
        Apples apple = new Apples();
        list.add(apple);
        list.contains(apple);

    }
}
