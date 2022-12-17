package com.design.mode.observer.observer01;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Xibiao Cao
 * @Date: 2022/12/12 14:12
 * @Description:
 */
public class ObserverTest01 {

    public static void main(String[] args) {
        //创建被观察者
        AbstractSubject javaDevSubject = new JavaDevSubject();
        //创建观察者，并添加到被观察者中，以便被观察者发生变更时通知观察者
        MyObserver userOne = new UserOne();
        MyObserver userTwo = new UserTwo();
        javaDevSubject.addObserver(userOne);
        javaDevSubject.addObserver(userTwo);
        //发布信息，通知观察者
        OfficialAccount javaAccount = buildJavaAccount();
        javaDevSubject.publish(javaAccount);
    }

    private static OfficialAccount buildJavaAccount(){
        OfficialAccount account = new OfficialAccount();
        account.setAccountId(1);
        account.setAccountName("Java开发");
        String article = "java开发公众号发布了一篇文章，推送给各个订阅用户。";
        List<String> articles = new ArrayList<>();
        articles.add(article);
        account.setArticles(articles);
        return account;
    }

    private static OfficialAccount buildHealthAccount(){
        OfficialAccount account = new OfficialAccount();
        account.setAccountId(2);
        account.setAccountName("健康养生");
        String article = "健康养生公众号发布了一篇文章，推送给各个订阅用户。";
        List<String> healthArticles = new ArrayList<>();
        healthArticles.add(article);
        account.setArticles(healthArticles);
        return account;
    }

}
