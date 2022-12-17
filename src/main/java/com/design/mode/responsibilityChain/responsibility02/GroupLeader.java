package com.design.mode.responsibilityChain.responsibility02;

/**
 * @Author: Xibiao Cao
 * @Date: 2022/12/11 22:55
 * @Description: 一个具体处理器，组长实体类，只能批准两天内的假期
 */
public class GroupLeader implements Ratify {

    @Override
    public Result handle(LeaveRequest request, Result result, MyChain chain) {
        Integer days = request.getDays();
        if (days <= 2){
            result.setRatify(true);
            result.setInfo("组长同意，早去早回。");
        } else {
            //result.setRatify(true);
            chain.doFilter(request,result,chain);
        }
        return result;
    }
}
