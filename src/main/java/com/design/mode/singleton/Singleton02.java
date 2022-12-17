package com.design.mode.singleton;

/**
 * @Author: Xibiao Cao
 * @Date: 2022/12/11 9:05
 * @Description: 懒汉式
 */
public class Singleton02 {

    //使用volatile禁止指令重排序
    private static volatile Singleton02 instance;

    private Singleton02(){}

    public static Singleton02 getInstance(){
        if (instance == null){
            synchronized (Singleton02.class){
                if (instance == null){
                    //1.在堆内存中给对象分配空间，并将实例变量赋予默认值
                    //2.给对象进行初始化，为实例变量赋予初始值
                    //3.将对象引用指向堆中对象的内存空间
                    instance = new Singleton02();
                }
            }
        }
        return instance;
    }

    public void method(){
        //todo 根据实际需要编写相应的代码
        System.out.println("需要执行的方法");
    }

    public static void main(String[] args) {
        Singleton02 instance1 = Singleton02.getInstance();
        Singleton02 instance2 = Singleton02.getInstance();
        System.out.println(instance1 == instance2);
    }

}
