package com.zjn.designpattern.action.observer;

/**
 * Client
 *
 * @author zjn
 * @date 2019/9/3
 **/
public class Client {
    public static void main(String[] args) {
        //被观察者角色
        WeixinAccount weixinAccount  = new WeixinAccount();
        //观察者
        User userBob = new User("WeChat User-Bob");
        User userTom = new User("WeChat User-Tom");
        User userMe = new User("WeChat User-Me");

        //将观察者注册到可观察对象的观察者列表中
        weixinAccount.addObserver(userBob);
        weixinAccount.addObserver(userTom);
        weixinAccount.addObserver(userMe);

        //发布消息
        weixinAccount.publishNewInfo("...新内容...");
        System.out.println("##########################################");
        weixinAccount.deleteObserver(userMe);
        weixinAccount.publishNewInfo("...新内容123...");

    }
}
