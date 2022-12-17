package com.design.mode.adapter.adapter01;

/**
 * @Author: Xibiao Cao
 * @Date: 2022/12/13 10:36
 * @Description: 适配器角色
 */
public class ChargerAdapter implements HongKongCharger {

    private ChineseSocket socket;

    public ChargerAdapter() {
    }

    public ChargerAdapter(ChineseSocket socket) {
        this.socket = socket;
    }

    @Override
    public void charge() {
        System.out.println("通过港式插头给手机或电脑充电，通过适配器将港式插头与国标插座关联使用");
        socket.powerSupply();
    }
}
