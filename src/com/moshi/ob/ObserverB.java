package com.moshi.ob;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

/**
 * Created by 56498838@qq.com 张涛 on 2018/7/2.
 *
 * @version 2.0.0
 */
public class ObserverB implements IObserver {
    @Override
    public void update(Subject subject) {
        System.out.println("观察者B获取到了消息："+subject.getMsg());
    }
}
