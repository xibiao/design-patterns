package com.design.mode.observer.observer02;

import java.util.Observer;

/**
 * @Author: Xibiao Cao
 * @Date: 2022/12/12 15:11
 * @Description:
 */
public class ObserverTest02 {

    public static void main(String[] args) {
        //创建具体目标类
        OilFuturesObservable observable = new OilFuturesObservable();
        //创建具体观察者类，并添加到目标类中
        Observer bullObserver = new BullObserver();
        Observer bearObserver = new BearObserver();
        observable.addObserver(bullObserver);
        observable.addObserver(bearObserver);
        //调整数据，发布通知
        observable.adjustPrice(10);
        observable.adjustPrice(-5);
    }

}
