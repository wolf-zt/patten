package com.moshi.observer;

/**
 * Created by 56498838@qq.com 张涛 on 2018/7/2.
 *
 * @version 2.0.0
 */
public class Client {
    public static void main(String[] args) {
        Observer msgObserver = new MsgObserver();
        Subject subject = new Subject();
        subject.add(msgObserver);

        Observer msgTOb = new MsgTObserver();
        subject.add(msgTOb);
        subject.setMsg("测试两个");
        subject.setMsg("信息变化");

    }
}
