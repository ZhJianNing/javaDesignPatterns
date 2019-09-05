package com.zjn.designpattern.struct.decorate;

/**
 * FlySuperCar 飞行装饰器类   装饰器中为: 具体装饰角色
 *
 * @author zjn
 * @date 2019/9/5
 **/
public class FlySuperCar extends SuperCar {

    public FlySuperCar(ICar car){
        super(car);
    }
    @Override
    public void move() {
      //  super.move();
        fly();
    }

    /**
     * 飞行
     *  @param
     *  @return
     *  @exception
     */
    private void fly(){
        System.out.println("飞行前进");
    }
}
