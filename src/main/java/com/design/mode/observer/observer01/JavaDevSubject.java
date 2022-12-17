package com.design.mode.observer.observer01;

/**
 * @Author: Xibiao Cao
 * @Date: 2022/12/12 11:32
 * @Description: java开发公众号，一个具体目标类
 */
public class JavaDevSubject extends AbstractSubject {

    @Override
    public void publish(OfficialAccount account){
        super.notifyObserver(account);
    }

}
