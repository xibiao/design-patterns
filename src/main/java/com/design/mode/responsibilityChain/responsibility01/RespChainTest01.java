package com.design.mode.responsibilityChain.responsibility01;

/**
 * @Author: Xibiao Cao
 * @Date: 2022/12/11 22:37
 * @Description:
 */
public class RespChainTest01 {

    public static void main(String[] args) {
        String reqMsg = "{username:andy,password:123456,url:\"http://ip:port/filter\"}";
        MyRequest request = new MyRequest();
        request.setReqMsg(reqMsg);
        MyResponse response = new MyResponse();
        //创建具体的处理器和处理器链
        MyFilterChain chain = new MyFilterChain();
        MyFilter loginFilter = new LoginFilter();
        MyFilter businessFilter = new BusinessFilter();
        //将处理器添加到处理器链中
        chain.addFilter(loginFilter).addFilter(businessFilter);
        chain.doFilter(request,response,chain);
        String resMsg = response.getResMsg();
        System.out.println("得到响应结果=======" + resMsg);
    }

}
