package com.moshi.mediator;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by 56498838@qq.com 张涛 on 2018/6/30.
 *
 * @version 2.0.0
 */
public class Manager implements Mediator {
    private ConcurrentHashMap<String,Department> map;

    public Manager() {
        map = new ConcurrentHashMap<String,Department>(5);
    }

    @Override
    public void register(String name, Department dp) {
        map.put(name,dp);
    }

    @Override
    public void command(String name) {
        map.get(name).selfAction();
    }
}
