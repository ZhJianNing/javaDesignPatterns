package com.zjn.designpattern.creative.abstractfactory;

/**
 * FactoryB
 *
 * @author zjn
 * @date 2019/8/28
 **/
public class FactoryB implements Factory {
    @Override
    public Product createProduct() {
        return new ProductB();
    }

    @Override
    public Gift createGift() {
        return new GiftB();
    }
}
