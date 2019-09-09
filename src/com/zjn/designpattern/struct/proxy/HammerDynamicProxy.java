package com.zjn.designpattern.struct.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * HammerDynamicProxy
 *
 * @author zjn
 * @date 2019/9/9
 **/
public class HammerDynamicProxy implements InvocationHandler {

    private Object target;

    public HammerDynamicProxy(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.before();
        Object result = method.invoke(target,args);
        this.after();
        return result;
    }

    private void before(){
        System.out.println("动态代理预处理.......");
    }

    private void after(){
        System.out.println("动态代理后处理.......");
    }
}
