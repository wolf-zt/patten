package com.moshi.mediator;

/**
 * Created by 56498838@qq.com 张涛 on 2018/6/30.
 *
 * @version 2.0.0
 */
public class Development implements Department {
    Mediator mediator;

    public Development(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("development",this);
    }

    @Override
    public void selfAction() {
        System.out.println("开发软件");
    }

    @Override
    public void outAction() {
        System.out.println("没钱了需要支持");
        mediator.command("finacel");
    }
}
class Finacel implements Department{
    Mediator mediator;

    public Finacel(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("finacel",this);
    }


    @Override
    public void selfAction() {
        System.out.println("数钱");
    }

    @Override
    public void outAction() {
        System.out.println("需要开发一个财务软件");
        mediator.command("development");
    }
}
