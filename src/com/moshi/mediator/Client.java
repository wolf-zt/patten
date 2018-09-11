package com.moshi.mediator;

/**
 *
 *
 * @version 2.0.0
 */
public class Client {
    public static void main(String[] args) {
        Mediator mediator = new Manager();
        Department dev = new Development(mediator);
        Department finacel = new Finacel(mediator);
        dev.selfAction();
        dev.outAction();

        finacel.selfAction();
        finacel.outAction();
        System.out.println("hello world 张弛 张涛 马潇潇 珍珍 王毅");

    }
}
