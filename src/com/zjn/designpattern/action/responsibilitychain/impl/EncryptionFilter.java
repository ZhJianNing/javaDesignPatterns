package com.zjn.designpattern.action.responsibilitychain.impl;

import com.zjn.designpattern.action.responsibilitychain.Filter;
import com.zjn.designpattern.action.responsibilitychain.dto.FilterChain;
import com.zjn.designpattern.action.responsibilitychain.dto.Request;
import com.zjn.designpattern.action.responsibilitychain.dto.Response;

/**
 * TextFilter
 *
 * @author zjn
 * @date 2020/4/13
 **/
public class EncryptionFilter implements Filter {
    private final static String PWD = "123456";
    private final static String PWD_ENC = "******";
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        if(request.getRequestStr().contains(PWD)){
            request.setRequestStr(request.getRequestStr().replace(PWD,PWD_ENC));
        }
        System.out.println("EncryptionFilter处理request结果：" + request.getRequestStr());
        filterChain.doFilter(request,response,filterChain);
        //处理response
        String newResponseStr = response.getResponseStr() + "(EncryptionFilter)";
        response.setResponseStr(newResponseStr);
        System.out.println("EncryptionFilter处理response结果：" + response.getResponseStr());

    }
}
