package com.design.mode.strategy.strategy01;

/**
 * @Author: Xibiao Cao
 * @Date: 2022/12/11 12:22
 * @Description: 上下文环境
 * 与具体策略类交互，调用具体策略类方法
 * 这种写法的优缺点：
 * 优点：利于扩展，如果后期需要新增一个比较策略，在客户端创建新增的具体策略对象，
 * 作为参数传递给此处的上下文SortContext构造器即可。
 * 缺点：客户端与具体策略耦合，需要在客户端创建具体策略对象，作为参数传递给SortContext构造器。
 * 客户端需要知道所有的具体策略，并根据需求判断使用哪一个策略。
 */
public class SortContext<T> {

    private CustomizedComparator<T> comparator;

    public SortContext(CustomizedComparator<T> comparator) {
        this.comparator = comparator;
    }

    /**
     * 选择排序
     */
    public void sort(T[] a){
        for (int i = 0; i < a.length-1; i++) {
            int minIdx = i;
            for (int j = i+1; j < a.length; j++) {
                if (this.comparator.compare(a[j],a[j-1]) == -1){
                    minIdx = j;
                }
                swap(a,i,minIdx);
            }
        }
    }

    private void swap(T[] a, int i, int j){
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
