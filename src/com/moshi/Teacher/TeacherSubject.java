package com.moshi.Teacher;

import net.sourceforge.plantuml.preproc.Sub;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 56498838@qq.com 张涛 on 2018/7/2.
 *
 * @version 2.0.0
 */
public class TeacherSubject  implements Subject {
    private List<Observer> list = new ArrayList<>(10);

    private String info;

    @Override
    public void addObserver(Observer observer) {
            list.add(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer ob:list
             ){
            ob.update(info);
        }
    }

    public void  setHomeWork(String homeWork){
        this.info = homeWork;
        this.notifyObserver();
    }
}
