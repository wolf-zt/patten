package com.moshi.Teacher;



/**
 * 消息主题，会发布消息
 * Created by 56498838@qq.com 张涛 on 2018/7/2.
 *
 * @version 2.0.0
 */
public interface Subject {
    void addObserver(Observer observer);
    void notifyObserver();
}
