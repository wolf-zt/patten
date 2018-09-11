package com.moshi.AbstactFactory;

/**
 * Created by 56498838@qq.com 张涛 on 2018/6/26.
 *
 * @version 2.0.0
 */
 class BestCarFactory implements CarFactory {
    @Override
    public Engin createEngin() {
        return  new BestEngin();
    }

    @Override
    public Seat createSeet() {
        return new BestSeat();
    }
}
class  LowCarFactory implements CarFactory{

    @Override
    public Engin createEngin() {
        return new LowestEngin();
    }

    @Override
    public Seat createSeet() {
        return new LowestSeat();
    }
}