package com.design.mode.responsibilityChain.responsibility02;

/**
 * @Author: Xibiao Cao
 * @Date: 2022/12/11 23:10
 * @Description:
 */
public class RespChainTest02 {

    public static void main(String[] args) {
        LeaveRequest request = new LeaveRequest();
        request.setDays(3);
        Result result = new Result();

        MyChain chain = new MyChain();
        Ratify leader = new GroupLeader();
        Ratify head = new DepartmentHead();
        Ratify manager = new DepartmentManager();
        chain.addFilter(leader).addFilter(head).addFilter(manager);
        chain.doFilter(request,result,chain);
        System.out.println("请假结果======" + result);
    }

}
