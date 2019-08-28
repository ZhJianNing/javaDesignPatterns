package com.zjn.designpattern.builder;

/**
 * IBuildHuman   制定造人标准，统一装配流程
 *
 * @author zjn
 * @date 2019/8/28
 **/
public interface IBuildHuman {
     void buildHead();
     void buildBody();
     void buildHand();
     void buildFoot();
     Human createHuman();
}
