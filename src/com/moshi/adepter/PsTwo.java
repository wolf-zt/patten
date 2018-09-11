package com.moshi.adepter;

/**
 * Created by 56498838@qq.com 张涛 on 2018/6/28.
 *
 * @version 2.0.0
 */
public interface PsTwo {
    void userPsTwo();
}
interface Usb{
    void useUsb();
}
class Usber implements Usb{
    @Override
    public void useUsb() {
        System.out.println("使用usb");
    }
}
class  Adapter extends Usber implements PsTwo{

    @Override
    public void userPsTwo() {
        useUsb();
    }
}

class Client{
    public static void main(String[] args) {
        Usb usb = new Usber();
        PsTwo adapter = new Adapter();
        adapter.userPsTwo();
    }
}