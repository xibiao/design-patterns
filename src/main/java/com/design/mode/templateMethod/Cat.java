package com.design.mode.templateMethod;

/**
 * @Author: Xibiao Cao
 * @Date: 2022/12/13 15:09
 * @Description:
 */
public class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("猫咪喜欢吃小鱼");
    }

    @Override
    public void guard() {
        System.out.println("猫咪捉老鼠，守家不被老鼠骚扰");
    }

    @Override
    public void sleep() {
        System.out.println("猫咪喜欢跑到主人的床上睡觉");
    }
}
