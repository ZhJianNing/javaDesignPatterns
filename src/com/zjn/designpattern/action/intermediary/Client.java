package com.zjn.designpattern.action.intermediary;

/**
 * Client
 *
 * @author zjn
 * @date 2019/9/9
 **/
public class Client {
    public static void main(String[] args) {
        //创建聊天室（中介）
        IMediator iMediator = new MediatorImpl();
        IUser userA = new UserA(iMediator,"张三");
        IUser userB = new UserB(iMediator,"李四");
        IUser userC = new UserC(iMediator,"王五");

        userA.sendMessage("大家好，我叫张三，很荣幸加入这个大家庭！！！");

        userB.sendMessage("你好，我叫李四，欢迎加入");

        userC.sendMessage("我是王五，欢迎欢迎！");

    }
}
