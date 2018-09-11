package com.moshi.memeto;

/**
 * Created by 56498838@qq.com 张涛 on 2018/7/1.
 *
 * @version 2.0.0
 */
public class Client {
    public static void main(String[] args) throws InterruptedException {
        CareTaker careTaker = new CareTaker();
        Emp emp = new Emp();
        emp.setName("张涛");
        emp.setAge(38);
        EmpMemeto memeto = emp.Memeto();
        careTaker.add(memeto);
        System.out.println("第一次初始化 名字："+emp.getName()+" 年级:"+emp.getAge());
        emp.setName("马潇潇");
        emp.setAge(36);
        careTaker.add(emp.Memeto());

        System.out.println("第二次初始化 名字："+emp.getName()+" 年级:"+emp.getAge());

        emp.setName("张弛");
        emp.setAge(6);
        careTaker.add(emp.Memeto());

        emp.recovery(careTaker.get());
        System.out.println("后退一步 名字："+emp.getName()+"  年级:"+emp.getAge());
        emp.recovery(careTaker.get());
        System.out.println("后退二步 名字："+emp.getName()+"  年级:"+emp.getAge());
        emp.recovery(careTaker.get());
        System.out.println("后退三步 名字："+emp.getName()+"  年级:"+emp.getAge());
        emp.recovery(careTaker.get());
        System.out.println("后退四步 名字："+emp.getName()+"  年级:"+emp.getAge());



    }
}
