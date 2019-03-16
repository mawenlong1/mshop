package com.mwl.mshop.provider.cmc.model.vo;

import com.github.pagehelper.PageInfo;
import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author mawenlong
 * @date 2019-03-10 14:54
 */
@Data
public class ResultVO {

    //操作成功
    public static final int SUCCESS = 200;
    //操作失败
    public static final int FAILED = 500;

    private int code;
    private String message;
    private Object data;


    /**
     * 返回分页成功数据
     */
    public ResultVO pageSuccess(List data) {
        PageInfo pageInfo = new PageInfo(data);
        Map<String, Object> result = new HashMap<>();
        result.put("pageSize", pageInfo.getPageSize());
        result.put("totalPage", pageInfo.getPages());
        result.put("total", pageInfo.getTotal());
        result.put("pageNum", pageInfo.getPageNum());
        result.put("list", pageInfo.getList());
        code = SUCCESS;
        message = "操作成功";
        this.data = result;
        return this;
    }

    /**
     * 普通成功返回
     *
     * @param data 获取的数据
     */
    public ResultVO success(Object data) {
        code = SUCCESS;
        message = "操作成功";
        this.data = data;
        return this;
    }

    public ResultVO success() {
        code = SUCCESS;
        message = "操作成功";
        return this;
    }

    /**
     * 普通失败提示信息
     */
    public ResultVO failed() {
        this.code = FAILED;
        this.message = "操作失败";
        return this;
    }

    /**
     * 普通失败提示信息
     */
    public ResultVO failed(String message) {
        this.code = FAILED;
        this.message = "操作失败";
        data = message;
        return this;
    }
}
