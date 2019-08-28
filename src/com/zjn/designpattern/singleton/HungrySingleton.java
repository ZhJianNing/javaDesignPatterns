package com.zjn.designpattern.singleton;
/**
 * HungrySingleton  饿汉式(线程安全，调用效率高，但是不能延时加载)
 *
 * @author       zjn
 * @date         2019/6/28
 *
 **/
public class HungrySingleton {
	private static HungrySingleton instance = new HungrySingleton();
	private HungrySingleton(){

	}
	public static HungrySingleton getInstance(){
		return instance;
	}
}
