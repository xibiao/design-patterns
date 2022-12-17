package com.design.mode.observer.observer01;

import java.util.List;

/**
 * @Author: Xibiao Cao
 * @Date: 2022/12/12 11:49
 * @Description: 用户1，一个具体观察者
 */
public class UserOne implements MyObserver {

    @Override
    public void update(OfficialAccount account) {
        String name = this.getClass().getName();
        List<String> articles = account.getArticles();
        String article = articles.get(articles.size() - 1);
        if ("Java开发".equals(account.getAccountName())){
            System.out.println(String.format("用户[%s]收到一篇Java开发公众号的文章，内容是：%s", name,article));
        } else if ("健康养生".equals(account.getAccountName())){
            System.out.println(String.format("用户[%s]收到一篇健康养生公众号的文章，内容是：%s", name,article));
        }
    }
}
