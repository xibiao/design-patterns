package com.design.mode.strategy.strategy01;

import java.util.Arrays;

/**
 * @Author: Xibiao Cao
 * @Date: 2022/12/11 13:30
 * @Description:
 */
public class StrategyTest01 {

    public static void main(String[] args) {
        Person[] p = {new Person(10.0,20.0),new Person(15.0,15.0),new Person(20.0,10.0)};
        //CustomizedComparator<Person> comparator = new HeightComparator();
        CustomizedComparator<Person> comparator = new WeightComparator();
        SortContext<Person> context = new SortContext<Person>(comparator);
        context.sort(p);
        System.out.println(Arrays.toString(p));
    }

}
