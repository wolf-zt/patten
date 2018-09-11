package com.moshi.prototype;

import java.io.Serializable;

/**
 * Created by 56498838@qq.com 张涛 on 2018/6/27.
 *
 * @version 2.0.0
 */
public class Car implements Cloneable ,Serializable {
    private Engin engin;
    private String name;

    public Engin getEngin() {
        return engin;
    }

    public void setEngin(Engin engin) {
        this.engin = engin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Car car = (Car)super.clone();
        Engin engin = car.getEngin();
        car.setEngin((Engin) engin.clone());
        return car;
    }
}
