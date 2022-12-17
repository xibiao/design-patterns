package com.design.mode.observer.observer01;

/**
 * @Author: Xibiao Cao
 * @Date: 2022/12/12 11:32
 * @Description: 健康养生公众号，一个具体目标类
 */
public class HealthSubject extends AbstractSubject {

    @Override
    public void publish(OfficialAccount account){
        super.notifyObserver(account);
    }

}
