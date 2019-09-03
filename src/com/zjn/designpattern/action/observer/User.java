package com.zjn.designpattern.action.observer;

// 在JAVA语言的API中，提供了一个Observable抽象类以及一个Observer接口，构成JAVA语言对观察者模式的支持。
import java.util.Observable;
import java.util.Observer;

/**
 * java.util.Observable   -able一般可能...的单词后缀，Observable就是可以被观察的，程序中的被观察者类，需要继承这个类。
 *
 * java.util.Observer    这个是观察者，是接口。程序中的观察者类，需要实现这个接口中的update()方法。
 *
 * User  微信用户是具体观察对象
 *
 * @author zjn
 * @date 2019/9/3
 **/
public class User implements Observer {

    private String name;



    public User(String name){
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("微信用户："+name+"，您的微信公众号更新这些内容："+arg);
    }
}
