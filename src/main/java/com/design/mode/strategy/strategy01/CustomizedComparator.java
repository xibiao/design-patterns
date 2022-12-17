package com.design.mode.strategy.strategy01;

/**
 * @Author: Xibiao Cao
 * @Date: 2022/12/11 12:02
 * @Description: 抽象策略接口
 */
public interface CustomizedComparator<T> {

    int compare(T o1, T o2);

}
