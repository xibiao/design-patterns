package com.design.mode.responsibilityChain.responsibility02;

/**
 * @Author: Xibiao Cao
 * @Date: 2022/12/11 22:49
 * @Description: 请假请求实体类
 * 参考：https://blog.csdn.net/u012810020/article/details/71194853
 */
public class LeaveRequest {

    private Integer days;

    private String reason;

    public LeaveRequest() {
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "Leave{" +
                "days=" + days +
                ", reason='" + reason + '\'' +
                '}';
    }
}
