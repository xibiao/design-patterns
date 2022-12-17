package com.design.mode.responsibilityChain.responsibility02;

/**
 * @Author: Xibiao Cao
 * @Date: 2022/12/11 22:51
 * @Description: 批准接口，抽象处理器
 */
public interface Ratify {

    Result handle(LeaveRequest request, Result result, MyChain chain);

}
