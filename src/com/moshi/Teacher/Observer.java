package com.moshi.Teacher;

/**
 * 观察者，需要根据传入的参数进行跟新状态
 * Created by 56498838@qq.com 张涛 on 2018/7/2.
 *
 * @version 2.0.0
 */
public interface Observer {
    void update(String msg);
}
