package com.moshi.strategy;

/**
 * Created by 56498838@qq.com 张涛 on 2018/6/30.
 *
 * @version 2.0.0
 */
public interface Strategy {
    double getPrice(double d);
}
class Customer implements  Strategy{
    @Override
    public double getPrice(double d) {
        return d;
    }
}

class BigCustomer implements Strategy{
    @Override
    public double getPrice(double d) {
        return d*0.8;
    }
}