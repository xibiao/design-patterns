package com.design.mode.singleton;

/**
 * @Author: Xibiao Cao
 * @Date: 2022/12/11 9:55
 * @Description: 枚举单例
 * 不仅可以解决线程同步问题，还可以解决反射攻击和反序列化攻击。
 * java语言规定枚举类没有构造方法，所以无法通过反射创建枚举实例对象。
 * 通过反序列化创建枚举类对象时，与枚举单例对象是同一个对象，所以可以解决反序列化攻击。
 * 参考：https://blog.csdn.net/weixin_45679480/article/details/121581999
 */
public enum Singleton04 {
    /**
     * 单例对象
     */
    INSTANCE;

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
