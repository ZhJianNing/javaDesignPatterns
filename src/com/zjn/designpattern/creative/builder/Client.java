package com.zjn.designpattern.creative.builder;

/**
 * Client
 *
 * @author zjn
 * @date 2019/8/28
 **/
public class Client {

    public static void main(String[] args){
        BuildMachine buildMachine = new BuildMachine();
        //制造 智商高的人
        Human smartHuman = buildMachine.createHumanByDirecotr(new SmartManBuilder());
        System.out.println(smartHuman.getHead());
        System.out.println(smartHuman.getBody());
        System.out.println(smartHuman.getHand());
        System.out.println(smartHuman.getFoot());

        //制造身体强壮的人
        Human strongHuman = buildMachine.createHumanByDirecotr(new StrongHumanBuilder());
        System.out.println(strongHuman.getHead());
        System.out.println(strongHuman.getBody());
        System.out.println(strongHuman.getHand());
        System.out.println(strongHuman.getFoot());
    }
}
