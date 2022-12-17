package com.design.mode.builder.builder01;

/**
 * @Author: Xibiao Cao
 * @Date: 2022/12/13 21:16
 * @Description: 指挥者或调用者
 */
public class WebpageDirector {

    private WebpageBuilder builder;

    public WebpageDirector() {
    }

    public WebpageDirector(WebpageBuilder builder) {
        this.builder = builder;
    }

    public Webpage buildWebpage(){
        return builder.buildWebHead().buildWebBody().buildWebFoot().build();
    }

}
