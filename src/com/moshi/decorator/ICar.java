package com.moshi.decorator;

/**
 * Created by 56498838@qq.com 张涛 on 2018/6/29.
 *
 * @version 2.0.0
 */
public interface ICar {
    public void move();
    public float price();
}
class Car implements ICar{
    @Override
    public void move() {
        System.out.println("汽车开动！");
    }
    @Override
    public float price(){
        return 200.00f;
    }
}
abstract class SuperCar implements ICar{

    protected ICar car;
    public SuperCar(ICar car){
        super();
        this.car = car;
    }

    @Override
    public void move() {
        car.move();

    }

    @Override
    public float price() {
        return car.price();
    }
}

class WaterCar extends SuperCar{

    public WaterCar(ICar car) {
        super(car);
    }
    public void swim(){
        System.out.println("在水里游");
    }
    @Override
    public void move() {
        super.move();
        swim();
    }

    @Override
    public float price() {
        return super.price()+100;
    }
}

class FlyCar extends SuperCar{

    public FlyCar(ICar car) {
        super(car);
    }
    public void fly(){
        System.out.println("在空中飞行");
    }
    @Override
    public void move() {
        super.move();
        fly();
    }

    @Override
    public float price() {
        return super.price()+200;
    }
}

class Client{
    public static void main(String[] args) {
        ICar car = new Car();
        FlyCar flyCar = new FlyCar(car);
       // car.move();
        //flyCar.move();

        WaterCar waterCar = new WaterCar(flyCar);
        waterCar.move();
        System.out.println(waterCar.price());
    }
}