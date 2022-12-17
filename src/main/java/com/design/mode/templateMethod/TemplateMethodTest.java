package com.design.mode.templateMethod;

/**
 * @Author: Xibiao Cao
 * @Date: 2022/12/13 15:17
 * @Description:
 */
public class TemplateMethodTest {

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.templateMethod();
        Animal cat = new Cat();
        cat.templateMethod();
    }

}
