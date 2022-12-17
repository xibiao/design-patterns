package com.design.mode.responsibilityChain.responsibility02;

/**
 * @Author: Xibiao Cao
 * @Date: 2022/12/11 23:04
 * @Description: 一个具体处理器，部门主管，可以批准4天内的假期
 */
public class DepartmentHead implements Ratify {

    @Override
    public Result handle(LeaveRequest request, Result result, MyChain chain) {
        Integer days = request.getDays();
        if (days <= 4){
            result.setRatify(true);
            result.setInfo("主管同意，路上注意安全。");
        } else {
            //result.setRatify(true);
            chain.doFilter(request,result,chain);
        }
        return result;
    }
}
