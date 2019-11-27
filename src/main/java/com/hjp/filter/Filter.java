package com.hjp.filter;

import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author 烟消云散
 * @create 2019-11-2:36
 */
@WebFilter("/*")
public class Filter implements javax.servlet.Filter {
    public void destroy() {
    }

    public void doFilter(javax.servlet.ServletRequest req, javax.servlet.ServletResponse resp, javax.servlet.FilterChain chain) throws javax.servlet.ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        chain.doFilter(req, resp);
    }

    public void init(javax.servlet.FilterConfig config) throws javax.servlet.ServletException {

    }

}
