package com.mwl.mshop.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author mawenlong
 * @date 2019/02/26
 */
@Slf4j
@Component
public class AuthHeaderFilter extends ZuulFilter {
    @Override
    public String filterType() {
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
        log.info("AuthHeaderFilter - 开始进行鉴权...");
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        log.info("send {} request to", request.getMethod(), request.getRequestURL().toString());
        String token = request.getParameter("token");

        //TODO 鉴权
        if ("111".equals(token)) {
            log.warn("没有权限");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            return null;
        }
        log.info("AuthHeaderFilter - 鉴权成功...");
        return null;
    }

}
