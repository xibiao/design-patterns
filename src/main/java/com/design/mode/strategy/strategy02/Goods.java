package com.design.mode.strategy.strategy02;

/**
 * @Author: Xibiao Cao
 * @Date: 2022/12/11 14:31
 * @Description:
 */
public class Goods {
    /**
     * 商品单价
     */
    private Integer price;
    /**
     * 商品数量
     */
    private Integer number;

    public Goods() {
    }

    public Goods(Integer price, Integer number) {
        this.price = price;
        this.number = number;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "price=" + price +
                ", number=" + number +
                '}';
    }
}
