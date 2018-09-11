package com.moshi.compsite;

/**
 * Created by 56498838@qq.com 张涛 on 2018/7/3.
 *
 * @version 2.0.0
 */
public class Client {
    public static void main(String[] args) {
        Composite leaf = new Leaf("视频.avi");
        Composite leaf2 = new Leaf("文本.txt");
        Root root = new Root("c盘");
        leaf.operate();
        leaf2.operate();
        root.add(leaf);
        root.add(leaf2);
        root.operate();
    }
}
