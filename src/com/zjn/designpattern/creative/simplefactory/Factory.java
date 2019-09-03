package com.zjn.designpattern.creative.simplefactory;

/**
 * Factory
 *
 * @author zjn
 * @date 2019/8/28
 **/
public class Factory {


    public static Product create(String str)
    {
        //可以在工厂类中添加任何你所需要的逻辑
        //生成ProductA
        if(str.equalsIgnoreCase("ProductA"))
        {
            return new ProductA();
        }
        //生成ProductB
        if(str.equalsIgnoreCase("ProductB"))
        {
            return new ProductB();
        }
        return null;
    }
}
