package com.zjn.designpattern.action.intermediary;

/**
 * UserC
 *
 * @author zjn
 * @date 2019/9/9
 **/
public class UserC extends AbstractUser {
    /**
     *  接收消息方法（其实可写在抽象类中）
     *  @param
     *  @return
     *  @exception
     */
    @Override
    public void receiveMessage(String messages) {
        System.out.println(name+"收到消息："+messages);
    }
    public UserC(IMediator mediator, String name){
        super(mediator,name);
        mediator.regist(this);
    }
    
}
