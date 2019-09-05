package com.zjn.designpattern.struct.decorate;


/**
 * WaterSuperCar
 *
 * @author zjn
 * @date 2019/9/5
 **/
public class WaterSuperCar extends SuperCar {
    public WaterSuperCar(ICar car){
        super(car);
    }

    @Override
    public void move() {
        //super.move();
        swim();

    }

    private void swim(){
        System.out.println("水上前进");
    }
}
