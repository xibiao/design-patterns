package com.design.mode.builder.builder01;

/**
 * @Author: Xibiao Cao
 * @Date: 2022/12/12 21:45
 * @Description: 通过构造器创建一个简单的网页
 * 客户端根据实际需求自定义具体建造者，通过具体建造者创建产品
 */
public class SimpleWebpageBuilder implements WebpageBuilder {

    private Webpage webpage;

    public SimpleWebpageBuilder() {
        this.webpage = new Webpage();
    }

    @Override
    public WebpageBuilder buildWebHead() {
        Webpage.WebHead head = new Webpage.WebHead(100, 20, "网页头");
        webpage.setHead(head);
        return this;
    }

    @Override
    public WebpageBuilder buildWebBody() {
        Webpage.WebBody body = new Webpage.WebBody(100, 50, "网页体");
        webpage.setBody(body);
        return this;
    }

    @Override
    public WebpageBuilder buildWebFoot() {
        Webpage.WebFoot foot = new Webpage.WebFoot(100, 10, "网页底");
        webpage.setFoot(foot);
        return this;
    }

    @Override
    public Webpage build() {
        return this.webpage;
    }
}
