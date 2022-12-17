package com.design.mode.observer.observer02;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author: Xibiao Cao
 * @Date: 2022/12/12 15:08
 * @Description: 原油期货多方实体类，一个具体观察者角色
 */
public class BullObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        Integer price = (Integer) arg;
        if (price > 0) {
            System.out.println("油价上涨" + price + "元，多方高兴了！");
        } else {
            System.out.println("油价下跌" + (-price) + "元，多方伤心了！");
        }
    }
}
