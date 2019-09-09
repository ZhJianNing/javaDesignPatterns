package com.zjn.designpattern.action.intermediary;

/**
 * IUser 用户接口
 *
 * @author zjn
 * @date 2019/9/9
 **/
public interface IUser {

    /**
     *  接收消息
     *  @param ""
     *  @return
     *  @exception
     */
    void receiveMessage(String message);


    /**
     *  发送消息
     *  @param 
     *  @return 
     *  @exception 
     */
    void sendMessage(String message);
    
    /**
     *  获得发送到消息
     *  @param 
     *  @return 
     *  @exception 
     */
    String getMessage();
}
