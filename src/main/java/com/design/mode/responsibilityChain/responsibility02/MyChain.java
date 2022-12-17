package com.design.mode.responsibilityChain.responsibility02;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Xibiao Cao
 * @Date: 2022/12/11 22:20
 * @Description: 处理器链，责任链模式
 */
public class MyChain {

    private int index = 0;

    private List<Ratify> filterList = new ArrayList<Ratify>();

    public MyChain addFilter(Ratify ratify){
        filterList.add(ratify);
        return this;
    }

    public void doFilter(LeaveRequest request, Result result, MyChain chain){
        if (index == filterList.size()){
            return;
        }
        Ratify ratify = filterList.get(index);
        index++;
        ratify.handle(request, result, chain);
    }

}
