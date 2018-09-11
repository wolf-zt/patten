package com.moshi.prototype;

import java.io.*;

/**
 * Created by 56498838@qq.com 张涛 on 2018/6/27.
 *
 * @version 2.0.0
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        //通过实现Cloneable接口实现
//        Engin engin = new Engin();
//        engin.setEnginName("六缸增压");
//        Car bmw = new Car();
//        bmw.setEngin(engin);
//        bmw.setName("宝马X5");
//        Car audi = (Car)bmw.clone();
//        engin.setEnginName("12缸增压");
//
//        System.out.println(bmw.getEngin().getEnginName());
//        System.out.println(audi.getEngin().getEnginName());
        //通过序列化反序列化实现
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(os);
        Engin engin = new Engin();
        engin.setEnginName("六缸增压");
        Car bmw = new Car();
        bmw.setEngin(engin);
        bmw.setName("宝马X5");
        oos.writeObject(bmw);

        byte[] bytes = os.toByteArray();
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);

        Car audi = (Car)ois.readObject();
        engin.setEnginName("12缸增加");
        System.out.println(audi.getName());
        System.out.println(audi.getEngin().getEnginName());
        System.out.println(bmw.getEngin().getEnginName());

    }
}
