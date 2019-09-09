package com.zjn.designpattern.action.intermediary;

/**
 * IMediator 中介者接口
 *
 * @author zjn
 * @date 2019/9/9
 **/
public interface IMediator {

    /**
     *  加入到聊天室
     *  @param 
     *  @return 
     *  @exception 
     */
    void regist(IUser user);


    /**
     *  发送消息到聊天室
     *  @param  发送消息的人
     *  @return
     *  @exception
     */
    void notifyAllMessage(IUser user);
}
