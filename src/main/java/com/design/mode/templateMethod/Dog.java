package com.design.mode.templateMethod;

/**
 * @Author: Xibiao Cao
 * @Date: 2022/12/13 15:03
 * @Description:
 */
public class Dog extends Animal {

    @Override
    public void verify(){
        System.out.println("验证一下是不是我家的狗狗");
    }

    @Override
    public void eat() {
        System.out.println("狗狗啃骨头");
    }

    @Override
    public void guard() {
        System.out.println("狗狗看家护院，保护主人");
    }

    @Override
    public void sleep() {
        System.out.println("狗狗在狗窝里睡觉");
    }
}
