package com.zjn.designpattern.struct.decorate;

/**
 * Client
 *
 * @author zjn
 * @date 2019/9/5
 **/
public class Client {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();

        System.out.println("增加飞行功能-----------------------");
        FlySuperCar flySuperCar = new FlySuperCar(car);
        flySuperCar.move();

        System.out.println("增加水中游功能----------------------");
        WaterSuperCar waterSuperCar = new WaterSuperCar(car);
        waterSuperCar.move();
    }
}
