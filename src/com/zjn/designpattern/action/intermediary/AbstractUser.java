package com.zjn.designpattern.action.intermediary;

/**
 * AbstractUser 抽象用户
 *
 * @author zjn
 * @date 2019/9/9
 **/
public abstract  class AbstractUser implements IUser{
    //中介者
    protected IMediator iMediator;
    //姓名
    protected String name;
    //消息内容
    protected String message;
    public AbstractUser(IMediator mediator,String name){
        this.iMediator = mediator;
        this.name = name;
    }

    /**
     *  发送消息
     *  @param 消息
     *  @return void
     *  @exception
     */
    @Override
    public void sendMessage(String message) {
        this.message = message;
        System.out.println(this.name+"说："+this.message);
        iMediator.notifyAllMessage(this);
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
