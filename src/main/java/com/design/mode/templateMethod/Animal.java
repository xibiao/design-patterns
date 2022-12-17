package com.design.mode.templateMethod;

/**
 * @Author: Xibiao Cao
 * @Date: 2022/12/13 14:58
 * @Description:
 */
public abstract class Animal {

    /**
     * 模板方法，将公共的逻辑放到父类的模板方法中，
     * 使用final修饰，禁止子类重写
     */
    public final void templateMethod(){
        //用于子类扩展
        verify();
        eat();
        guard();
        sleep();
        hook();
    }

    /**
     * 空方法，用于子类扩展
     */
    public void verify(){}

    public abstract void eat();

    public abstract void guard();

    public abstract void sleep();

    /**
     * 钩子方法，用于子类扩展
     */
    public void hook(){}

}
