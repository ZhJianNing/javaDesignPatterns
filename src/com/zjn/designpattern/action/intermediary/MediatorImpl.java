package com.zjn.designpattern.action.intermediary;

import java.awt.image.ImageConsumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * MediatorImpl
 *
 * @author zjn
 * @date 2019/9/9
 **/
public class MediatorImpl implements IMediator {

    private List<IUser> users = new ArrayList<IUser>();
    @Override
    public void regist(IUser user) {
        if(user != null && !users.contains(user)){
            users.add(user);
        }
    }

    @Override
    public void notifyAllMessage(IUser user) {
        Iterator<IUser> iUserIterator = users.iterator();
        IUser tempUser = null;
        while (iUserIterator.hasNext()){
            tempUser = iUserIterator.next();
            //排除发送消息用户
            if(tempUser != null && !tempUser.equals(user)){
                tempUser.receiveMessage(user.getMessage());
            }
        }
    }
}
