package com.moshi.state;

/**
 * Created by 56498838@qq.com 张涛 on 2018/7/1.
 *
 * @version 2.0.0
 */
public class HomeContext {
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void bookRoom(){
        System.out.println("预定房间");
        state.handle();
    }
}
