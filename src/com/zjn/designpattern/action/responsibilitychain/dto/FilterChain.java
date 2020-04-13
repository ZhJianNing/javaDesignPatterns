package com.zjn.designpattern.action.responsibilitychain.dto;

import com.zjn.designpattern.action.responsibilitychain.Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * FilterChain
 *
 * @author zjn
 * @date 2020/4/13
 **/
public class FilterChain implements Filter {

    private List<Filter> filters = new ArrayList<>();

    private int filterIndex = 0;

    public FilterChain addFilter(Filter filter) {
        filters.add(filter);
        return this;
    }

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        if (filterIndex == filters.size()) {
            return;
        }
        this.filterIndex++;
        Filter nextFilter = this.filters.get(this.filterIndex - 1);
        nextFilter.doFilter(request, response, this);

    }
}
