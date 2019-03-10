package com.mwl.mshop.provider.cmc.model.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author mawenlong
 * @date 2019-03-10 22:28
 */
@Data
public class PageResult implements Serializable {
   private List list;
    private  int pageSize;
    private int totalPage;
    private long total;
    private int pageNum;

}
