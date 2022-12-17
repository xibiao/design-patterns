package com.design.mode.builder.builder02;

/**
 * @Author: Xibiao Cao
 * @Date: 2022/12/12 22:06
 * @Description:
 */
public class BuilderTest02 {

    public static void main(String[] args) {
        Person person = new Person.Builder()
                .setId(1)
                .setName("andy")
                .setAge(20)
                .setSex("M")
                .setAddress("shanghai")
                .build();
        System.out.println(person);
    }

}
