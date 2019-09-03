package com.zjn.designpattern.struct.adapter;

/**
 * Power220
 *
 * @author zjn
 * @date 2019/9/3
 **/
public class Power220 extends AbsBasePower implements IPower220 {
    // 构造方法
    public Power220(){
        super(220);
    }
    @Override
    public void output220v() {
        System.out.println("----这是[" + this.getPower() + this.getUnit() + "]电源！...");
    }
}
