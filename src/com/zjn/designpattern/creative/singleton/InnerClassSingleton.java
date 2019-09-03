package com.zjn.designpattern.creative.singleton;

/**
 * InnerClassSingleton    静态内部类实现模式（线程安全，调用效率高，可以延时加载）
 *
 * @author zjn
 * @date 2019/6/29
 **/
public class InnerClassSingleton {

    private static class InnerClass{
        private static final InnerClassSingleton instance=new InnerClassSingleton();
    }

    private InnerClassSingleton(){}

    public static InnerClassSingleton getInstance(){
        return InnerClass.instance;
    }
}
