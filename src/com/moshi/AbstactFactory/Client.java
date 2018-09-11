package com.moshi.AbstactFactory;

import javax.swing.text.html.HTMLDocument;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by 56498838@qq.com 张涛 on 2018/6/26.
 *
 * @version 2.0.0
 */
public class Client {
    public static void main(String[] args){
        CarFactory best = new BestCarFactory();
        Engin engin = best.createEngin();
        engin.run();
        engin.start();
        Seat seat = best.createSeet();
        seat.msg();

        CarFactory lowFactory = new LowCarFactory();
        Engin lengin = lowFactory.createEngin();
        lengin.run();
        lengin.start();
        Map map = new HashMap<String,String>();
        Map<String,String> curmap = new ConcurrentHashMap();
        curmap.put(null,"空");
        curmap.put("姓","张");
        Iterator cit = curmap.keySet().iterator();
        while (cit.hasNext()){
            String key =(String) cit.next();
            System.out.println(curmap.get(key));
        }
        map.put(null,"aaaaaa");
        map.put("a","a");
        Set set = map.keySet();
        Iterator it = set.iterator();
        while (it.hasNext()){
            String key = (String)it.next();
            System.out.println(map.get(key));

        }

    }
}
