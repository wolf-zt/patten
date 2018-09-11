package com.moshi.strategy;

/**
 * Created by 56498838@qq.com 张涛 on 2018/6/30.
 *
 * @version 2.0.0
 */
public class Client {
    public static void main(String[] args) {
        Strategy customer = new  Customer();
        Strategy oldCustomer = new BigCustomer();
        Context ctx = new Context(customer);
        System.out.println(ctx.getPrice(200));

    }
}
