package com.moshi.mediator;

/**
 * Created by 56498838@qq.com 张涛 on 2018/6/30.
 *
 * @version 2.0.0
 */
public interface Mediator {
    void register(String name,Department dp);
    void command(String name);
}
