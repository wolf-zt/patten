package com.moshi.Teacher;

/**
 * Created by 56498838@qq.com 张涛 on 2018/7/2.
 *
 * @version 2.0.0
 */
public class Student implements Observer {
    private TeacherSubject teacher;
    private String name;

    public Student(TeacherSubject teacher, String name) {
        this.teacher = teacher;
        this.name = name;
        teacher.addObserver(this);
    }

    @Override
    public void update(String msg) {
        System.out.println(name+" 获取了消息 "+msg);
    }
}
