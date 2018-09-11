package com.moshi.bridge;

/**
 * Created by 56498838@qq.com 张涛 on 2018/7/14.
 *
 * @version 2.0.0
 */
public interface Computer{
    public void sale();
}
class Desktop implements Computer{
    @Override
    public void sale(){
        System.out.print("台式机");
    }
}
class Pad implements Computer{
    @Override
    public void sale(){
        System.out.print("平板电脑");
    }
}
abstract class Brand{
    Computer computer;
    public Brand(Computer computer){
        this.computer = computer;
    }

    public  void sale(){
        computer.sale();
    }
}

class Dell extends Brand{
    public Dell(Computer computer){
        super(computer);
    }
    public void sale(){
        System.out.println("dell电脑");
        super.sale();
    }
}
class lenvel extends Brand{
    public lenvel(Computer computer){
        super(computer);
    }
    public void sale(){
        System.out.println("联想电脑");
        super.sale();
    }
}

class  Client3{
    public static void main(String[] args) {
        Computer desk = new Desktop();
        Computer pad = new Pad();
        Brand brand = new Dell(desk);

        Brand lenvel = new lenvel(desk);
        brand.sale();
        lenvel.sale();
        Brand lenvelpad = new lenvel(pad);
        lenvelpad.sale();
    }
}