package com.zjn.designpattern.struct.proxy;

/**
 * StaticClient 静态代理
 *
 * @author zjn
 * @date 2019/9/9
 **/
public class StaticClient {
    public static void main(String[] args) {
        HammerStaticProxy hammerStaticProxy = new HammerStaticProxy(new Hammer());
        hammerStaticProxy.doSomeThing();
    }


}
