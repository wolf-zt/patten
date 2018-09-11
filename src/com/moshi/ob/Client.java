package com.moshi.ob;

/**
 * Created by 56498838@qq.com 张涛 on 2018/7/2.
 *
 * @version 2.0.0
 */
public class Client {
    public static void main(String[] args) {
        IObserver observerB = new ObserverB();
        IObserver observerA = new ObserverMsgA();
        Subject subject = new MsgSubject();
        subject.add(observerA);
        subject.add(observerB);
        subject.setMsg("改变消息试试");
    }
}
