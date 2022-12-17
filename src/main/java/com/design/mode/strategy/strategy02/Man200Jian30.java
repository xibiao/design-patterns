package com.design.mode.strategy.strategy02;

/**
 * @Author: Xibiao Cao
 * @Date: 2022/12/11 14:35
 * @Description: 具体策略类
 */
public class Man200Jian30 implements ManJian {

    @Override
    public Integer minus(Goods goods) {
        return goods.getPrice() * goods.getNumber() - 30;
    }

}
