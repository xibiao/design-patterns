package com.design.mode.builder.builder01;

/**
 * @Author: Xibiao Cao
 * @Date: 2022/12/12 21:44
 * @Description: 构造器接口
 */
public interface WebpageBuilder {

    WebpageBuilder buildWebHead();

    WebpageBuilder buildWebBody();

    WebpageBuilder buildWebFoot();

    Webpage build();

}
