package com.zjn.designpattern.struct.proxy;

/**
 * Hammer   工具：锤子
 *
 * @author zjn
 * @date 2019/9/9
 **/
public class Hammer implements ISomeUtil {

    private  String name = "大铁锤";
    @Override
    public void doSomeThing() {
        System.out.println(name+"砸钉子");
    }
}
