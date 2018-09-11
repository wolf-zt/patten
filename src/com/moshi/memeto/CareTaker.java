package com.moshi.memeto;

import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Created by 56498838@qq.com 张涛 on 2018/7/1.
 *
 * @version 2.0.0
 */
public class CareTaker {
    private Stack<EmpMemeto> queue;
    public CareTaker(){
        queue = new Stack<>();
    }
    public void add(EmpMemeto memeto){
        queue.add(memeto);
    }
    public EmpMemeto get() throws InterruptedException {
        if(queue.size()>0){
            return queue.pop();
        }
       return null;

    }
}
