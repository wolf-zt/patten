package com.moshi.factory;

/**
 * Created by 56498838@qq.com 张涛 on 2018/6/25.
 *
 * @version 2.0.0
 */
public class CarUser {
    public static void main(String[] args){
        Car audi = new Audi();
        audi.run();
        CarFactory factory = new CarFactory();
        Car bmw = CarFactory.createCar("bmw");
        bmw.run();
    }
}
