package com.design.mode.observer.observer02;

import java.util.Observable;

/**
 * @Author: Xibiao Cao
 * @Date: 2022/12/12 14:56
 * @Description: 使用Java提供的观察者模式
 * 在 Java 中，通过 java.util.Observable 类和 java.util.Observer 接口定义了观察者模式，
 * 只要实现它们的子类就可以编写观察者模式实例。
 * 1、Observable类
 * Observable 类是抽象目标类，它有一个 Vector 向量，用于保存所有要通知的观察者对象，下面来介绍它最重要的 3 个方法。
 * void addObserver(Observer o) 方法：用于将新的观察者对象添加到向量中。
 * void notifyObservers(Object arg) 方法：调用向量中的所有观察者对象的 update() 方法，通知它们数据发生改变。通常越晚加入向量的观察者越先得到通知。
 * void setChange() 方法：用来设置一个 boolean 类型的内部标志位，注明目标对象发生了变化。当它为真时，notifyObservers() 才会通知观察者。
 * 2、Observer 接口
 * Observer 接口是抽象观察者，它监视目标对象的变化，当目标对象发生变化时，观察者得到通知，
 * 并调用 void update(Observable o,Object arg) 方法，进行相应的工作。
 * 原文链接：https://blog.csdn.net/CSDN2497242041/article/details/120403205
 *
 * 下面以原油期货价格上涨或下跌来模拟多头和空头双方观察者的行为
 * 需求：当原油价格上涨时，空方伤心，多方局兴；当油价下跌时，空方局兴，多方伤心。
 */
public class OilFuturesObservable extends Observable {

    public void adjustPrice(Integer price){
        //在发生变化之后，必须调用这个方法告诉父类Observable发生了改变，
        //否则调用父类的notifyObservers方法是不会通知观察者的
        super.setChanged();
        //通知观察者
        super.notifyObservers(price);
    }

}
