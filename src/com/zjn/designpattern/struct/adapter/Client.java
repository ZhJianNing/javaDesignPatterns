package com.zjn.designpattern.struct.adapter;

/**
 * Client
 * 意图：将一个类的接口转换成客户希望的另外一个接口。适配器模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
 *
 * 主要解决：主要解决在软件系统中，常常要将一些"现存的对象"放到新的环境中，而新环境要求的接口是现对象不能满足的
 *
 * @author zjn
 * @date 2019/9/3
 **/
public class Client {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // 我们首先 生成一个220V电源对象！
        Power220 power220 = new Power220();
        power220.output220v();
        // 接下来，我们在生成一个12V电源对象！
        IPower12 power12 = new Power12();
        power12.output12v();
        // 最后，我们使用电源适配器 将220V电源转换为12V电源！
        System.out.println("\n----电源适配器转换中...");
        IPower12 adapterPower12 = new AdapterPower12(power220);
        adapterPower12.output12v();
        System.out.println("----电源适配器转换结束！");
        // 类适配器实现
        System.out.println("\n----类适配器 电源适配器转换中...");
        IPower12 adapterPower12Ext = new AdapterPower12Ext(power220);
        adapterPower12Ext.output12v();
        System.out.println("----类适配器 电源适配器转换结束！");
    }
}
