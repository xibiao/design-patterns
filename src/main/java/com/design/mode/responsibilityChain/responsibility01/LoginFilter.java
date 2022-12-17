package com.design.mode.responsibilityChain.responsibility01;

/**
 * @Author: Xibiao Cao
 * @Date: 2022/12/11 22:21
 * @Description: 一个具体处理器，登录过滤器
 */
public class LoginFilter implements MyFilter {

    @Override
    public boolean doFilter(MyRequest request, MyResponse response, MyFilterChain chain) {
        String reqMsg = request.getReqMsg();
        if (!reqMsg.contains("username") || !reqMsg.contains("password")){
            System.out.println("登录失败，请重新登录");
            return false;
        }
        //chain.doFilter(request,response,chain);
        String resMsg = response.getResMsg();
        resMsg += "--登录过滤器返回响应消息";
        response.setResMsg(resMsg);
        return true;
    }
}
