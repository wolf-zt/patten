package com.moshi.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 56498838@qq.com 张涛 on 2018/7/2.
 *
 * @version 2.0.0
 */
public class Subject {
    private List<Observer> list;

    public Subject() {
        this.list = new ArrayList<>(10);
    }
    private String msg;
    public void add(Observer observer){
        list.add(observer);
    }
    public void remove(Observer observer){
        list.remove(observer);
    }

    public void notifyAllObserver(){
        for (Observer ob:list) {
            ob.update(this);
        }
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
        this.notifyAllObserver();
    }
}
