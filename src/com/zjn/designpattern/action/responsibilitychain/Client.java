package com.zjn.designpattern.action.responsibilitychain;

import com.zjn.designpattern.action.responsibilitychain.dto.FilterChain;
import com.zjn.designpattern.action.responsibilitychain.dto.Request;
import com.zjn.designpattern.action.responsibilitychain.dto.Response;
import com.zjn.designpattern.action.responsibilitychain.impl.EncryptionFilter;
import com.zjn.designpattern.action.responsibilitychain.impl.HtmlFilter;

/**
 * Client
 * tomcat 中的engine、context、wrapper、serverlet就是用了责任链模式
 *
 * @author zjn
 * @date 2020/4/13
 **/
public class Client {
    public static void main(String[] args) {
        Request request = new Request();
        request.setRequestStr("pwd:123456;html:script,css,png");
        Response response = new Response();
        response.setResponseStr("Handler Sucess");
        FilterChain filterChain = new FilterChain();
        //添加责任链
        filterChain.addFilter(new HtmlFilter()).addFilter(new EncryptionFilter());
        System.out.println("开始   request："+request.getRequestStr()+",response："+response.getResponseStr());
        //开始处理
        filterChain.doFilter(request,response,filterChain);
        System.out.println("最终结果  request:"+request.getRequestStr()+"response:"+response.getResponseStr());

    }
}
