package com.zjn.designpattern.creative.factorymethod;


/**
 * FactoryA
 *
 * @author zjn
 * @date 2019/8/28
 **/
public class FactoryA implements Factory {

    //实现工厂类的方法生成产品类A
    @Override
    public Product createProduct(){
        return new ProductA();
    }
}
