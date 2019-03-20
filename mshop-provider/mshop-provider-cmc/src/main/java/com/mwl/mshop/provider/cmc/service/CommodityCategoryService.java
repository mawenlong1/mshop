package com.mwl.mshop.provider.cmc.service;

import com.mwl.mshop.provider.cmc.model.bean.CmcCommodityCategoryWithChildren;
import com.mwl.mshop.provider.cmc.model.vo.CommodityCategoryVO;
import com.mwl.mshop.provider.cmc.model.vo.PageResult;

import java.util.List;

/**
 * @author mawenlong
 * @date 2019-03-10 23:10
 */
public interface CommodityCategoryService {

    List<CmcCommodityCategoryWithChildren> listWithChildren();

    PageResult getList(Long parentId, Integer pageSize, Integer pageNum);

    boolean updateNavStatus(List<Long> ids, Integer navStatus);

    boolean updateShowStatus(List<Long> ids, Integer showStatus);

    boolean delete(Long id);

    CommodityCategoryVO getById(Long id);

    boolean update(Long id, CommodityCategoryVO commodityCategoryVO);
}
