package com.design.mode.singleton;

/**
 * @Author: Xibiao Cao
 * @Date: 2022/12/11 8:53
 * @Description: 饿汉式
 * 类加载到内存时，会对静态变量进行初始化，
 * 类只被加载一次，所以静态变量只会初始化一次，由JVM保证单例
 * 缺点：无论使用与否，都会进行初始化
 */
public class Singleton01 {

    private static final Singleton01 INSTANCE = new Singleton01();

    private Singleton01(){}

    public static Singleton01 getInstance(){
        return INSTANCE;
    }

    public void method(){
        //todo 根据实际需要编写相应的代码
        System.out.println("需要执行的方法");
    }

    public static void main(String[] args) {
        Singleton01 instance1 = Singleton01.getInstance();
        Singleton01 instance2 = Singleton01.getInstance();
        System.out.println(instance1 == instance2);
        instance1.method();
    }

}
