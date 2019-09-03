package com.zjn.designpattern.creative.singleton;

/**
 * DoubleCheckLockSingleton  双重锁判断机制（由于JVM底层模型原因，偶尔会出问题，不建议使用）
 *
 * @author zjn
 * @date 2019/6/28
 **/
public class DoubleCheckLockSingleton {

    //禁用cpu缓存、指令重排
    private volatile static DoubleCheckLockSingleton instance;

    private DoubleCheckLockSingleton() {
    }

    public static DoubleCheckLockSingleton newInstance() {
        if (instance == null) {
            synchronized (DoubleCheckLockSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckLockSingleton();
                }
            }
        }
        return instance;
    }
}

