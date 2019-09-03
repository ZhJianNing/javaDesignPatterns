package com.zjn.designpattern.struct.adapter;

/**
 * Power12
 *
 * @author zjn
 * @date 2019/9/3
 **/
public class Power12 extends AbsBasePower implements IPower12 {

    // 12V电源构造方法
    public Power12() {
        super(12);
    }
    // 12V电源输出
    @Override
    public void output12v() {
        System.out.println("----这是[" + this.getPower() + this.getUnit() + "]电源！...");
    }
}
