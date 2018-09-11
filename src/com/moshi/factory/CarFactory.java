package com.moshi.factory;

/**
 * Created by 56498838@qq.com 张涛 on 2018/6/25.
 *
 * @version 2.0.0
 */
public class CarFactory {
    public static Car createCar(String type){
        if(type == null){
            return null;
        }
        if(type.equals("audi")){
            return new Audi();
        }else if(type.equals("bmw")){
            return new BMW();
        }else{
            return  null;
        }
    }
}
