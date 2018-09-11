package com.moshi.state;

/**
 * Created by 56498838@qq.com 张涛 on 2018/7/1.
 *
 * @version 2.0.0
 */
public class Client {
    public static void main(String[] args) {
        HomeContext ctx = new HomeContext();
        ctx.setState(new FreeState());
        ctx.bookRoom();
        ctx.setState(new BusyState());
        ctx.bookRoom();
    }
}
