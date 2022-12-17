package com.design.mode.responsibilityChain.responsibility02;

/**
 * @Author: Xibiao Cao
 * @Date: 2022/12/11 22:53
 * @Description: 请假结果实体类
 */
public class Result {
    /**
     * 是否批准
     */
    private boolean isRatify;

    private String info;

    public boolean isRatify() {
        return isRatify;
    }

    public void setRatify(boolean ratify) {
        isRatify = ratify;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Result{" +
                "isRatify=" + isRatify +
                ", info='" + info + '\'' +
                '}';
    }
}
