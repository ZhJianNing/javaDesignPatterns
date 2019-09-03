package com.zjn.designpattern.creative.factorymethod;

/**
 * Client
 *
 * @author zjn
 * @date 2019/8/28
 **/
public class Client {
    public static void main(String[] args) {
        Factory factory;
        factory = new FactoryA();
        factory.createProduct();
        factory = new FactoryB();
        factory.createProduct();
    }
}
