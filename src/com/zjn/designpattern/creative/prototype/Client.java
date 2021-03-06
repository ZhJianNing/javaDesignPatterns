package com.zjn.designpattern.creative.prototype;

/**
 * Client
 * （1）优点：
 * ①如果创建新的对象比较复杂时，可以利用原型模式简化对象的创建过程，同时也能够提高效率。
 * ②可以使用深克隆保持对象的状态。
 * ③原型模式提供了简化的创建结构。
 * （2）缺点：
 * ①需要为每一个类配备一个克隆方法，而且这个克隆方法需要对类的功能进行通盘考虑，这对全新的类来说不是很难，
 * 但对已有的类进行改造时，不一定是件容易的事，必须修改其源代码，违背了“开闭原则”。
 *
 * （3）应用场景：
 * ①如果创建新对象成本较大，我们可以利用已有的对象进行复制来获得。
 *
 * ②如果系统要保存对象的状态，而对象的状态变化很小，或者对象本身占内存不大的时候，也可以使用原型模式配
 * 合备忘录模式来应用。相反，如果对象的状态变化很大，或者对象占用的内存很大，那么采用状态模式会比原型模式更好。
 *
 * @author zjn
 * @date 2019/8/28
 **/
public class Client {
    public static void main(String[] args) {
        //原型A对象
        Resume a = new Resume("小李子");
        a.setPersonInfo("2.16", "男", "XX大学");
        a.setWorkExperience("2012.09.05", "XX科技有限公司");

        //克隆B对象
        Resume b = (Resume) a.clone();

        //输出A和B对象
        System.out.println("----------------A--------------");
        a.display();
        System.out.println("----------------B--------------");
        b.display();

    }
}
