package com.zjn.designpattern.creative.abstractfactory;

/**
 * FactoryA
 *
 * @author zjn
 * @date 2019/8/28
 **/
public class FactoryA implements Factory {
    @Override
    public Product createProduct() {
        return new ProductA();
    }

    @Override
    public Gift createGift() {
        return new GiftA();
    }
}
