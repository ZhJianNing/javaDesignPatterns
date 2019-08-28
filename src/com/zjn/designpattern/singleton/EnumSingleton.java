package com.zjn.designpattern.singleton;

/**
 * EnumSingleton    枚举类（线程安全，调用效率高，不能延时加载，可以天然的防止反射和反序列化调用）
 *
 * @author       zjn
 * @date         2019/6/28
 *
 **/
public enum EnumSingleton {
	//枚举元素本身就是单例
	INSTANCE;

	public void  singletonHandler(){
		//处理业务逻辑
		System.out.println("处理业务");
	}
}
