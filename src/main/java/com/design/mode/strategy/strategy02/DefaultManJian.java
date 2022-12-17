package com.design.mode.strategy.strategy02;

/**
 * @Author: Xibiao Cao
 * @Date: 2022/12/11 14:29
 * @Description: 具体策略类
 */
public class DefaultManJian implements ManJian {

    @Override
    public Integer minus(Goods goods) {
        //todo 按照商品原价付款
        return goods.getPrice() * goods.getNumber();
    }
}
