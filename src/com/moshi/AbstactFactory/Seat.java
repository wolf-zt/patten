package com.moshi.AbstactFactory;

/**
 * Created by 56498838@qq.com 张涛 on 2018/6/26.
 *
 * @version 2.0.0
 */
public interface Seat {
    void msg();
}
class BestSeat implements Seat{

    @Override
    public void msg() {
        System.out.println("最好的椅子");
    }
}
class LowestSeat implements Seat{

    @Override
    public void msg() {
        System.out.println("最差的椅子");
    }
}
