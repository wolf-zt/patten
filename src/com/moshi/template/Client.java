package com.moshi.template;

/**
 * Created by 56498838@qq.com 张涛 on 2018/6/30.
 *
 * @version 2.0.0
 */
public class Client {
    public static void main(String[] args) {
        Bank bank = new BrawMoney();
        bank.transaction();
        Bank bank1 = new Bank() {
            @Override
            public void doSomething() {
                System.out.println("我要取钱");
            }
        };
        bank1.transaction();
    }
}
