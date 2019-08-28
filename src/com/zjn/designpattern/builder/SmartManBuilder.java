package com.zjn.designpattern.builder;

/**
 * SmartManBuilder  高智商人制作流程
 *
 * @author zjn
 * @date 2019/8/28
 **/
public class SmartManBuilder implements IBuildHuman {
    Human human;

    public SmartManBuilder(){
        human = new Human();
    }
    @Override
    public void buildHead() {
        human.setHead("智商200");
    }

    @Override
    public void buildBody() {
        human.setBody("一般身体");
    }

    @Override
    public void buildHand() {
        human.setHand("一般手");

    }

    @Override
    public void buildFoot() {
        human.setFoot("一般脚");
    }

    @Override
    public Human createHuman() {
        return human;
    }
}
