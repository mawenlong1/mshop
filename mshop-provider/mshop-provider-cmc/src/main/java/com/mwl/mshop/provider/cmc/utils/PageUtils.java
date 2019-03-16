package com.mwl.mshop.provider.cmc.utils;

import com.github.pagehelper.PageInfo;
import com.mwl.mshop.provider.cmc.model.vo.PageResult;

import java.util.List;

/**
 * @author mawenlong
 * @date 2019-03-10 22:37
 * 
 */
public class PageUtils {
    public static PageResult convertPageData(List pageData,List data) {
        PageInfo pageInfo = new PageInfo(pageData);
        PageResult pageResult = new PageResult();
        pageResult.setList(data);
        pageResult.setPageNum(pageInfo.getPageNum());
        pageResult.setPageSize(pageInfo.getPageSize());
        pageResult.setTotal(pageInfo.getTotal());
        pageResult.setTotalPage(pageInfo.getPages());
        return pageResult;
    }
}
