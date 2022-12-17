package com.design.mode.strategy.strategy02;

/**
 * @Author: Xibiao Cao
 * @Date: 2022/12/11 14:40
 * @Description: 上下文环境
 * 与具体策略类交互，调用具体策略类方法
 */
public class ManJianContext {

    private ManJian manJian;

    public ManJianContext() {
    }

    public ManJianContext(ManJian manJian){
        this.manJian = manJian;
    }

    /**
     * 这种写法的优缺点：
     * 优点：类似于简单工厂模式，使得客户端与具体策略类隔离，上下文与具体策略类交互
     * 缺点：不利于扩展，如果后期新增一种满减策略，例如满500减100，
     * 就需要修改此处上下文的代码，违反了开闭原则。
     */
    public Integer fuKuan(Goods goods){
        int price = goods.getPrice() * goods.getNumber();
        if (price < 100){
            this.manJian = new DefaultManJian();
        } else if (price < 200){
            this.manJian = new Man100Jian10();
        } else {
            this.manJian = new Man200Jian30();
        }
        return this.manJian.minus(goods);
    }

    /**
     * 这种写法的优缺点：
     * 优点：利于扩展，由客户端创建具体的策略对象，通过参数传递即可。
     * 缺点：客户端需要知道所有的策略，客户端与具体策略对象之间耦合度较高。
     */
    public Integer fuKuan(ManJian manJian, Goods goods){
        return manJian.minus(goods);
    }

}
