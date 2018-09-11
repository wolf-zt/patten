package com.moshi.memeto;

/**
 * Created by 56498838@qq.com 张涛 on 2018/7/1.
 *
 * @version 2.0.0
 */
public class EmpMemeto {
    private String name;
    private int age;

    public EmpMemeto(Emp emp) {
        this.name = emp.getName();
        this.age = emp.getAge();
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
