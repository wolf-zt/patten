package com.moshi.observer;

/**
 * Created by 56498838@qq.com 张涛 on 2018/7/2.
 *
 * @version 2.0.0
 */
public class MsgObserver implements Observer {
    @Override
    public void update(Subject subject) {
        System.out.println("信息观察者一:"+subject.getMsg());
    }
}
