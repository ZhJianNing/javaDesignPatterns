package com.zjn.designpattern.factorymethod;


/**
 * FactoryB
 *
 * @author zjn
 * @date 2019/8/28
 **/
public class FactoryB implements Factory{
    //实现工厂类的方法生成产品类B
    @Override
    public Product createProduct(){
        return new ProductB();
    }
}
