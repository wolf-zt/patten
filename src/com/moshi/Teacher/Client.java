package com.moshi.Teacher;

import net.sourceforge.plantuml.preproc.Sub;

/**
 * Created by 56498838@qq.com 张涛 on 2018/7/2.
 *
 * @version 2.0.0
 */
public class Client {
    public static void main(String[] args) {
        TeacherSubject teacherSubject = new TeacherSubject();
        Student zs = new Student(teacherSubject,"张三");
        Student lis = new Student(teacherSubject,"李四");
        teacherSubject.setHomeWork("数学题十道");
    }
}
