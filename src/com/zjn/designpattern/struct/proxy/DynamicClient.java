package com.zjn.designpattern.struct.proxy;

import java.lang.reflect.Proxy;

/**
 * DynamicClient
 *
 * java中代理有三种方式
 *
 * 静态代理
 * JDK动态代理，也叫做接口代理
 * CGLIB动态代理，子类代理
 *
 * @author zjn
 * @date 2019/9/9
 **/
public class DynamicClient {
    public static void main(String[] args) {
        Hammer hammer = new Hammer();
        HammerDynamicProxy hammerDynamicProxy = new HammerDynamicProxy(hammer);
        ClassLoader classLoader = Hammer.class.getClassLoader();
        //面向接口代理ISomeUtil
        ISomeUtil iSomeUtil =(ISomeUtil) Proxy.newProxyInstance(classLoader,new Class[]{ISomeUtil.class},hammerDynamicProxy);
        iSomeUtil.doSomeThing();
    }
}
