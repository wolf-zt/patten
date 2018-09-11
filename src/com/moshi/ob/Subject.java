package com.moshi.ob;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 56498838@qq.com 张涛 on 2018/7/2.
 *
 * @version 2.0.0
 */
public class Subject {
    protected List<IObserver> list;
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Subject() {
        this.list = new ArrayList<>(10);
    }

    public void add(IObserver observer){
        list.add(observer);
    }
    public void notifyAllObserver(){
        for (IObserver ob:list
             ) {
            ob.update(this);
        }
    }

}
