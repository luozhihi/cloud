package com.lzh.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@Component
public class TokenFilter extends ZuulFilter {
    @Override
    public String filterType() {
        // pre  路由之前
        // routing 路由时
        // post 路由之后
        // error 发送错误
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request =requestContext.getRequest();
        HttpServletResponse response = requestContext.getResponse();
        response.setContentType("text/html;charset=utf8");

        String token = request.getParameter("token");
        if(token == null){
            requestContext.setSendZuulResponse(false);
            try {
                response.getWriter().print("请先登录");
                response.getWriter().close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return null;
    }
}
