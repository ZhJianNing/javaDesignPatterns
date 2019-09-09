package com.zjn.designpattern.struct.proxy;

/**
 * HammerStaticProxy
 *
 * @author zjn
 * @date 2019/9/9
 **/
public class HammerStaticProxy implements ISomeUtil {

    //要代理哪个实现类
    private ISomeUtil iSomeUtil;

    public HammerStaticProxy(ISomeUtil iSomeUtil){
        this.iSomeUtil = iSomeUtil;
    }
    @Override
    public void doSomeThing() {
        this.before();
        this.iSomeUtil.doSomeThing();
        this.after();
    }
    private void before(){
        System.out.println("静态代理预处理.......");
    }

    private void after(){
        System.out.println("静态代理后处理.......");
    }
}
