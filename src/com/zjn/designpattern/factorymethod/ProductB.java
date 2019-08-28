package com.zjn.designpattern.factorymethod;


/**
 * ProductB    借用简单工厂包中Product
 *
 * @author zjn
 * @date 2019/8/28
 **/
public class ProductB implements Product {

    public ProductB(){
        System.out.println("生产产品B");
    }
}
