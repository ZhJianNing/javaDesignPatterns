package com.zjn.designpattern.struct.decorate;

/**
 * Car 车实现类
 * 装饰器中为: 具体构建角色, 也叫真实对象或被装饰对象也可以对此类进行扩展, 与装饰器行为互不影响
 * @author zjn
 * @date 2019/9/5
 **/
public class Car implements ICar {
    
    /**
     *  移动
     *  @param 
     *  @return 
     *  @exception 
     */
    @Override
    public void move() {
        System.out.println("陆地上移动");
    }
}
