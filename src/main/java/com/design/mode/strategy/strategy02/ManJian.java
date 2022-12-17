package com.design.mode.strategy.strategy02;

/**
 * @Author: Xibiao Cao
 * @Date: 2022/12/11 14:25
 * @Description: 抽象策略接口
 * 模拟商品满减活动，有三种不同的策略：
 * 1.不满100元，按照商品原价
 * 2.满100元，减10元
 * 3.满200元，减30元
 */
public interface ManJian {

    Integer minus(Goods goods);

}
