package com.design.mode.responsibilityChain.responsibility01;

/**
 * @Author: Xibiao Cao
 * @Date: 2022/12/11 22:18
 * @Description: 抽象处理器
 */
public interface MyFilter {

    boolean doFilter(MyRequest request, MyResponse response, MyFilterChain chain);

}
