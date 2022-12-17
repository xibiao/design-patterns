package com.design.mode.builder.builder01;

/**
 * @Author: Xibiao Cao
 * @Date: 2022/12/12 21:52
 * @Description:
 */
public class BuilderTest01 {

    public static void main(String[] args) {
        //客户端根据实际需求自定义具体建造者，通过具体建造者创建产品
        WebpageBuilder builder = new SimpleWebpageBuilder();
        WebpageDirector director = new WebpageDirector(builder);
        Webpage webpage = director.buildWebpage();
        System.out.println(webpage);
    }

}
