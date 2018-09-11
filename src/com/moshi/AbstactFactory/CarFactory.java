package com.moshi.AbstactFactory;

/**
 * Created by 56498838@qq.com 张涛 on 2018/6/26.
 *
 * @version 2.0.0
 */
public interface CarFactory {
    Engin createEngin();
    Seat createSeet();
}
