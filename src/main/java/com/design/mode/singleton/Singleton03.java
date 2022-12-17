package com.design.mode.singleton;

/**
 * @Author: Xibiao Cao
 * @Date: 2022/12/11 9:23
 * @Description: 静态内部类的方式创建单例对象
 * 静态内部类被加载时创建外部类的实例对象，由JVM保证单例
 * 服务启动时不会加载内部类，只有调用外部类的getInstance方法时才会加载内部类，
 * 从而才会创建外部类对象。
 */
public class Singleton03 {

    private Singleton03(){}

    private static class SingleInner{
        private static final Singleton03 INSTANCE = new Singleton03();
    }

    public static Singleton03 getInstance(){
        return SingleInner.INSTANCE;
    }

    public void method(){
        //todo 根据实际需要编写相应的代码
        System.out.println("需要执行的方法");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + "======" + Singleton03.getInstance().hashCode());
        }
    }

}
