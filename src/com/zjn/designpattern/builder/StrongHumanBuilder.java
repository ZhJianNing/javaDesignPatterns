package com.zjn.designpattern.builder;

/**
 * StrongHumanBuilder  身体强壮制作流程
 *
 * @author zjn
 * @date 2019/8/28
 **/
public class StrongHumanBuilder implements IBuildHuman {
    Human human;

    public StrongHumanBuilder(){
        human = new Human();
    }
    @Override
    public void buildHead() {
        human.setHead("智商正常");
    }

    @Override
    public void buildBody() {
        human.setBody("强壮身体");
    }

    @Override
    public void buildHand() {
        human.setHand("强壮手");
    }

    @Override
    public void buildFoot() {
        human.setFoot("强壮脚");
    }

    @Override
    public Human createHuman() {
        return human;
    }
}
