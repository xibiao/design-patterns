package com.design.mode.observer.observer01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author: Xibiao Cao
 * @Date: 2022/12/12 11:24
 * @Description: 观察者模式（Observer），又叫发布-订阅模式（Publish/Subscribe），定义对象间一种一对多的依赖关系（注册），
 * 使得每当一个对象改变状态，则所有依赖于它的对象都会得到通知并自动更新（通知）。说白了就是个注册，通知的过程。
 * 实现观察者模式时要注意具体目标对象和具体观察者对象之间不能直接调用，否则将使两者之间紧密耦合起来，这违反了面向对象的设计原则。
 * 观察者模式的主要角色如下：
 * 抽象主题（Subject）角色：也叫抽象目标类，它提供了一个用于保存观察者对象的聚集类和增加、删除观察者对象的方法，以及通知所有观察者的抽象方法。
 * 具体主题（Concrete Subject）角色：也叫具体目标类，它实现抽象目标中的通知方法，当具体主题的内部状态发生改变时，
 *      通知所有注册过的观察者对象。继承Subject类，在这里实现具体业务，在具体项目中，该类会有很多变种。
 * 抽象观察者（Observer）角色：它是一个抽象类或接口，它包含了一个更新自己的抽象方法，当接到具体主题的更改通知时被调用。
 * 具体观察者（Concrete Observer）角色：实现抽象观察者中定义的抽象方法，以便在得到目标的更改通知时更新自身的状态。
 * 原文链接：https://blog.csdn.net/CSDN2497242041/article/details/120403205
 */
public abstract class AbstractSubject implements Subject {

    private List<MyObserver> observerList = Collections.synchronizedList(new ArrayList<MyObserver>());

    @Override
    public void addObserver(MyObserver observer){
        observerList.add(observer);
    }

    @Override
    public void removeObserver(MyObserver observer){
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver(OfficialAccount account){
        for (MyObserver observer : observerList){
            observer.update(account);
        }
    }

    public abstract void publish(OfficialAccount account);

}
