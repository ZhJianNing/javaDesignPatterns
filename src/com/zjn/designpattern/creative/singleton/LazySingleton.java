package com.zjn.designpattern.creative.singleton;

/**
 * LazySingleton       懒汉式(线程安全，调用效率不高，但是能延时加载)
 *
 * @author zjn
 * @date 2019/6/28
 **/
public class LazySingleton {

    /**
     *类初始化时，不初始化这个对象(延时加载，真正用的时候再创建)
     */
    private static LazySingleton instance;

    private LazySingleton(){}

    /**
     * 方法同步，调用效率低
     */
    public static synchronized LazySingleton getInstance(){
        if(instance==null){
            instance=new LazySingleton();
        }
        return instance;
    }
}
