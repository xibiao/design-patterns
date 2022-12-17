package com.design.mode.responsibilityChain.responsibility01;

/**
 * @Author: Xibiao Cao
 * @Date: 2022/12/11 22:31
 * @Description:
 */
public class BusinessFilter implements MyFilter {

    @Override
    public boolean doFilter(MyRequest request, MyResponse response, MyFilterChain chain) {
        String reqMsg = request.getReqMsg();
        if (!reqMsg.contains("/filter")){
            System.out.println("请求的接口路径不存在");
            return false;
        }
        //chain.doFilter(request,response,chain);
        String resMsg = response.getResMsg();
        resMsg += "--业务逻辑处理完返回响应消息";
        response.setResMsg(resMsg);
        return true;
    }
}
