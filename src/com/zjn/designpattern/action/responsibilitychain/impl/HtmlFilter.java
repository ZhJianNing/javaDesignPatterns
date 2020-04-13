package com.zjn.designpattern.action.responsibilitychain.impl;

import com.zjn.designpattern.action.responsibilitychain.Filter;
import com.zjn.designpattern.action.responsibilitychain.dto.FilterChain;
import com.zjn.designpattern.action.responsibilitychain.dto.Request;
import com.zjn.designpattern.action.responsibilitychain.dto.Response;

/**
 * HtmlFilter
 *
 * @author zjn
 * @date 2020/4/13
 **/
public class HtmlFilter implements Filter {
    private final static String HTML_SCRIPT = "script";
    private final static String HTML_SCRIPT_ENCODE = "@@@@@@@";

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        if (request.getRequestStr().contains(HTML_SCRIPT)) {
            request.setRequestStr(request.getRequestStr().replace(HTML_SCRIPT, HTML_SCRIPT_ENCODE));
        }
        System.out.println("HtmlFilter处理request结果：" + request.getRequestStr());
        filterChain.doFilter(request, response, filterChain);
        //处理response
        String newResponseStr = response.getResponseStr() + "(HtmlFilter)";
        response.setResponseStr(newResponseStr);
        System.out.println("HtmlFilter处理response结果：" + response.getResponseStr());

    }
}
