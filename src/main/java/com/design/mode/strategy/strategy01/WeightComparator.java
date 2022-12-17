package com.design.mode.strategy.strategy01;

/**
 * @Author: Xibiao Cao
 * @Date: 2022/12/11 12:14
 * @Description: 具体策略类
 */
public class WeightComparator implements CustomizedComparator<Person> {

    /**
     * 根据体重从重到轻排序
     * @param o1 待排序的新元素
     * @param o2 已排好序的旧元素
     * @return -1：交换o1和o2的位置，0和1：不交换o1和o2的位置
     */
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getWeight() > o2.getWeight()){
            return -1;
        } else if (o1.getWeight() < o2.getWeight()){
            return 1;
        } else {
            return 0;
        }
        //return o2.getWeight().compareTo(o1.getWeight());
    }

}
