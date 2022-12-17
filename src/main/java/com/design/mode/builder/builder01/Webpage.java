package com.design.mode.builder.builder01;

/**
 * @Author: Xibiao Cao
 * @Date: 2022/12/12 21:36
 * @Description: 一个网页包括网页头部、网页体、网页底部，
 * 不通过构造方法或setter方法创建一个网页对象，尝试通过构造器模式创建Webpage对象
 */
public class Webpage {

    private WebHead head;

    private WebBody body;

    private WebFoot foot;

    public void setHead(WebHead head) {
        this.head = head;
    }

    public void setBody(WebBody body) {
        this.body = body;
    }

    public void setFoot(WebFoot foot) {
        this.foot = foot;
    }

    static class WebHead{
        //网页头部的长度
        private Integer length;
        //网页头部的高度
        private Integer height;
        //网页头部的内容
        private String content;

        public WebHead() {
        }

        public WebHead(Integer length, Integer height, String content) {
            this.length = length;
            this.height = height;
            this.content = content;
        }

        @Override
        public String toString() {
            return "WebHead{" +
                    "length=" + length +
                    ", height=" + height +
                    ", content='" + content + '\'' +
                    '}';
        }
    }

    static class WebBody{
        //网页中部的长度
        private Integer length;
        //网页中部的高度
        private Integer height;
        //网页中部的内容
        private String content;

        public WebBody() {
        }

        public WebBody(Integer length, Integer height, String content) {
            this.length = length;
            this.height = height;
            this.content = content;
        }

        @Override
        public String toString() {
            return "WebBody{" +
                    "length=" + length +
                    ", height=" + height +
                    ", content='" + content + '\'' +
                    '}';
        }
    }

    static class WebFoot{
        //网页底部的长度
        private Integer length;
        //网页底部的高度
        private Integer height;
        //网页底部的内容
        private String content;

        public WebFoot() {
        }

        public WebFoot(Integer length, Integer height, String content) {
            this.length = length;
            this.height = height;
            this.content = content;
        }

        @Override
        public String toString() {
            return "WebFoot{" +
                    "length=" + length +
                    ", height=" + height +
                    ", content='" + content + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Webpage{" +
                "head=" + head +
                ", body=" + body +
                ", foot=" + foot +
                '}';
    }
}
