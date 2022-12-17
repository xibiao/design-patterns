package com.design.mode.observer.observer01;

import java.util.List;

/**
 * @Author: Xibiao Cao
 * @Date: 2022/12/12 11:51
 * @Description: 公众号实体类
 */
public class OfficialAccount {
    /**
     * 公众号id
     */
    private Integer accountId;
    /**
     * 公众号名称
     */
    private String accountName;
    /**
     * 公众号中发布的文章（应该将文章定义成一个对象，此处简写为字符串类型）
     */
    private List<String> articles;

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public List<String> getArticles() {
        return articles;
    }

    public void setArticles(List<String> articles) {
        this.articles = articles;
    }

    @Override
    public String toString() {
        return "OfficialAccount{" +
                "accountId=" + accountId +
                ", accountName='" + accountName + '\'' +
                '}';
    }
}
