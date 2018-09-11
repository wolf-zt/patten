package com.moshi.compsite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 56498838@qq.com 张涛 on 2018/7/3.
 *
 * @version 2.0.0
 */
public class Root implements Composite {
    String name;
    List<Composite> list = new ArrayList<>(10);
    public Root(String name) {
        this.name = name;
    }
    public  void add(Composite composite){
        list.add(composite);
    }
    @Override
    public void operate() {
        System.out.println("开始处理"+name);
        for (Composite l:list
             ) {
            l.operate();
        }
    }
}
