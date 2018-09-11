package com.moshi.state;

/**
 * Created by 56498838@qq.com 张涛 on 2018/7/1.
 *
 * @version 2.0.0
 */
public interface State {
    public void handle();
}
class FreeState implements State{
    @Override
    public void handle() {
        System.out.println("房间空闲可以入住");
    }
}
class BusyState implements State{
    @Override
    public void handle() {
        System.out.println("房间已满，不接受预定");
    }
}