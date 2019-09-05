package com.zjn.designpattern.struct.decorate;

/**
 * SuperCar
 *
 * @author zjn
 * @date 2019/9/5
 **/
public class SuperCar implements ICar {

    /**
     *  持有对真实car的引用     子类使用到它, 必须声明protected
     */
    protected ICar car;

    /**
     * 构造器(传入真实car)
     */
    public SuperCar(ICar car){
        this.car = car;
    }
    @Override
    public void move() {
        car.move();
    }
}
