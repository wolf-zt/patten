package com.moshi.memeto;

/**
 * 原发器，保存要对象信息，也就是原始对象
 * Created by 56498838@qq.com 张涛 on 2018/7/1.
 *
 * @version 2.0.0
 */
public class Emp {
    private String name;
    private int age;

    public EmpMemeto Memeto(){
        return new EmpMemeto(this);
    }
    public void recovery(EmpMemeto memeto){
        if(memeto != null) {
            this.setAge(memeto.getAge());
            this.setName(memeto.getName());
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
