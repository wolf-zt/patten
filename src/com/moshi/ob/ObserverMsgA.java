package com.moshi.ob;

/**
 * Created by 56498838@qq.com 张涛 on 2018/7/2.
 *
 * @version 2.0.0
 */
public class ObserverMsgA  implements IObserver{

    @Override
    public void update(Subject subject) {
        System.out.println("观察者A获取到了消息："+subject.getMsg());
    }
}
