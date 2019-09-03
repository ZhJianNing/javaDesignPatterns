package com.zjn.designpattern.creative.builder;

/**
 * BuildMachine      制造人  生产线（使用IBuildHuman的统一制作流程）
 *
 * @author zjn
 * @date 2019/8/28
 **/
public class BuildMachine {

    public Human createHumanByDirecotr(IBuildHuman bh) {
        bh.buildBody();
        bh.buildFoot();
        bh.buildHand();
        bh.buildHead();
        return bh.createHuman();
    }
}
