package com.moshi.bridge;

import sun.java2d.cmm.kcms.CMM;

/**
 * Created by 56498838@qq.com 张涛 on 2018/7/12.
 *
 * @version 2.0.0
 */
public interface Message {
    void send(String msg);
}

abstract class CommonMsg{
    Message msg;
    public CommonMsg(Message msg){
        this.msg = msg;
    }
    public abstract void send(String msg);
}
class HurryMsg extends CommonMsg{
    public HurryMsg(Message msg) {
        super(msg);
    }
    public void send(String msg){
        System.out.println("加急");
        this.msg.send(msg);
    }
}
class huriestMsg extends CommonMsg{
    public huriestMsg(Message msg) {

        super(msg);
    }
    public void  send(String msg){
        System.out.println("发送特级消息");
        this.msg.send(msg);
    }
}
class EmailMessage implements Message{
    @Override
    public void send(String msg) {
        System.out.println("发送邮件信息");
    }
}
class SMSMessage implements Message{
    @Override
    public void send(String msg) {
        System.out.println("发送短信消息");
    }
}
class Clients{
    public static void main(String[] args) {
        Message msg = new SMSMessage();

        CommonMsg huryMsg = new HurryMsg(msg);
        CommonMsg hmsg = new huriestMsg(msg);
        huryMsg.send("你好");
        hmsg.send("这是特级消息");
    }
}