package com.zjn.designpattern.struct.adapter;

/**
 * AdapterPower12  12v电源适配器 （实现目标对象接口 即：12V电源接口） 对象适配器 模式
 *
 * @author zjn
 * @date 2019/9/3
 **/
public class AdapterPower12 implements IPower12 {
    //待转换对象
    private final AbsBasePower absBasePower;
    //适配器构造方法  将待转换对象传入
    public AdapterPower12(AbsBasePower absBasePower){
        this.absBasePower=absBasePower;
    }
    //实现目标对象方法
    @Override
    public void output12v(){
        float powerFloat = this.absBasePower.getPower();
        //进行电源转换
        if (powerFloat == 380){
            powerFloat = powerFloat/31.67f;
        }else if (powerFloat == 220){
            powerFloat = powerFloat/18.33f;
        }else if(powerFloat == 110){
            powerFloat = powerFloat/9.17f;
        }else {
            System.out.println("---不能适配电源---");
            return;
        }
        powerFloat = (int)(powerFloat*10)/10.0f;
        System.out.println("----这是【"+powerFloat+this.absBasePower.getUnit()+"】电源----");
    }
}
