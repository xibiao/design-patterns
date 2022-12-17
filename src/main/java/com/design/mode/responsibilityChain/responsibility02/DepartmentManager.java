package com.design.mode.responsibilityChain.responsibility02;

/**
 * @Author: Xibiao Cao
 * @Date: 2022/12/11 23:06
 * @Description: 一个具体处理器，部门经理，可以批准7天内的假期，超过7天不批准
 */
public class DepartmentManager implements Ratify {

    @Override
    public Result handle(LeaveRequest request, Result result, MyChain chain) {
        Integer days = request.getDays();
        if (days <= 7){
            result.setRatify(true);
            result.setInfo("经理同意，回去安心办事。");
            //chain.doFilter(request,result,chain);
        } else {
            result.setRatify(false);
            result.setInfo("经理不同意，时间太久。");
        }
        return result;
    }
}
