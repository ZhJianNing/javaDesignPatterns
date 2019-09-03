package com.zjn.designpattern.creative.simplefactory;

/**
 * Client
 *
 * @author zjn
 * @date 2019/8/28
 **/
public class Client {
    public static void main(String[] args) {
        //调用Factory的静态方法生成所要的类
        Factory.create("productA");
        Factory.create("ProductB");
    }
}
