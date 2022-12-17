package com.design.mode.responsibilityChain.responsibility01;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Xibiao Cao
 * @Date: 2022/12/11 22:20
 * @Description: 责任链模式，模拟javax.servlet.Filter和FilterChain
 */
public class MyFilterChain {

    //private int index = 0;

    private List<MyFilter> filterList = new ArrayList<MyFilter>();

    /**
     * 将处理器添加到处理器链中
     */
    public MyFilterChain addFilter(MyFilter filter){
        filterList.add(filter);
        return this;
    }

    public void doFilter(MyRequest request, MyResponse response, MyFilterChain chain){
        for (MyFilter filter : filterList){
            if (!filter.doFilter(request, response, chain)){
                break;
            }
        }
    }

    /*public void doFilter(MyRequest request, MyResponse response, MyFilterChain chain){
        if (index == filterList.size()){
            return;
        }
        MyFilter filter = filterList.get(index);
        index++;
        //调用处理器的方法
        filter.doFilter(request, response, chain);
    }*/

}
