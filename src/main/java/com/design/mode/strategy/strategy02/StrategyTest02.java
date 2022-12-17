package com.design.mode.strategy.strategy02;

/**
 * @Author: Xibiao Cao
 * @Date: 2022/12/11 15:08
 * @Description:
 */
public class StrategyTest02 {

    public static void main(String[] args) {
        //客户端无需知道有哪些具体的策略，而是通过上下文与具体策略交互
        Goods goods = new Goods(50,1);
        //Goods goods = new Goods(50,3);
        //Goods goods = new Goods(50,4);
        ManJianContext context = new ManJianContext();
        Integer money = context.fuKuan(goods);
        System.out.println("购买商品付款金额======" + money);
    }
    
}
