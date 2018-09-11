package com.moshi.strategy;

/**
 * Created by 56498838@qq.com 张涛 on 2018/6/30.
 *
 * @version 2.0.0
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public double getPrice(double d){
        return strategy.getPrice(d);
    }
}
