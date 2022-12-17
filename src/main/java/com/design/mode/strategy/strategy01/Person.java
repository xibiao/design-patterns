package com.design.mode.strategy.strategy01;

/**
 * @Author: Xibiao Cao
 * @Date: 2022/12/11 12:07
 * @Description:
 */
public class Person {

    private Double height;

    private Double weight;

    public Person() {
    }

    public Person(Double height, Double weight) {
        this.height = height;
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }
}
