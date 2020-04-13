package com.zjn.designpattern.action.responsibilitychain;

import com.zjn.designpattern.action.responsibilitychain.dto.FilterChain;
import com.zjn.designpattern.action.responsibilitychain.dto.Request;
import com.zjn.designpattern.action.responsibilitychain.dto.Response;

/**
 * Filter
 *
 * @author zjn
 * @date 2020/4/13
 **/
public interface Filter {

    void doFilter(Request request, Response response, FilterChain filterChain);
}
