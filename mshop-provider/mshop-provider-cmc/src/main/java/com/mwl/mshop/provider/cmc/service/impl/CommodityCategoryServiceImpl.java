package com.mwl.mshop.provider.cmc.service.impl;

import com.github.pagehelper.PageHelper;
import com.mwl.mshop.provider.cmc.mapper.CmcCommodityCategoryMapper;
import com.mwl.mshop.provider.cmc.mapper.dao.CmcCommodityCategoryDao;
import com.mwl.mshop.provider.cmc.model.bean.CmcCommodityCategory;
import com.mwl.mshop.provider.cmc.model.bean.CmcCommodityCategoryExample;
import com.mwl.mshop.provider.cmc.model.bean.CmcCommodityCategoryWithChildren;
import com.mwl.mshop.provider.cmc.model.vo.CommodityCategoryVO;
import com.mwl.mshop.provider.cmc.model.vo.PageResult;
import com.mwl.mshop.provider.cmc.service.CommodityCategoryService;
import com.mwl.mshop.provider.cmc.utils.PageUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mawenlong
 * @date 2019-03-10 23:10
 */
@Service
public class CommodityCategoryServiceImpl implements CommodityCategoryService {

    @Autowired
    private CmcCommodityCategoryDao commodityCategoryDao;
    @Autowired
    private CmcCommodityCategoryMapper categoryMapper;

    @Override
    public List<CmcCommodityCategoryWithChildren> listWithChildren() {
        return commodityCategoryDao.listWithChildren();
    }

    @Override
    public PageResult getList(Long parentId, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        CmcCommodityCategoryExample example = new CmcCommodityCategoryExample();
        example.setOrderByClause("sort desc");
        example.createCriteria().andParentIdEqualTo(parentId);
        List<CmcCommodityCategory> categories = categoryMapper.selectByExample(example);
        return PageUtils.convertPageData(categories);
    }

    @Override
    public boolean updateNavStatus(List<Long> ids, Integer navStatus) {
        CmcCommodityCategory category = new CmcCommodityCategory();
        category.setNavStatus(navStatus);
        CmcCommodityCategoryExample example = new CmcCommodityCategoryExample();
        example.createCriteria().andIdIn(ids);
        return categoryMapper.updateByExampleSelective(category, example) > 0;
    }

    @Override
    public boolean updateShowStatus(List<Long> ids, Integer showStatus) {
        CmcCommodityCategory category = new CmcCommodityCategory();
        category.setShowStatus(showStatus);
        CmcCommodityCategoryExample example = new CmcCommodityCategoryExample();
        example.createCriteria().andIdIn(ids);
        return categoryMapper.updateByExampleSelective(category, example) > 0;
    }

    @Override
    public boolean delete(Long id) {
        return categoryMapper.deleteByPrimaryKey(id) == 1;
    }

    @Override
    public CommodityCategoryVO getById(Long id) {
        CmcCommodityCategory category = categoryMapper.selectByPrimaryKey(id);
        CommodityCategoryVO result = new CommodityCategoryVO();
        BeanUtils.copyProperties(category, result);
        return result;
    }

    @Override
    public boolean update(Long id, CommodityCategoryVO commodityCategoryVO) {
        CmcCommodityCategory category = new CmcCommodityCategory();
        category.setId(id);
        BeanUtils.copyProperties(commodityCategoryVO, category);
        return categoryMapper.updateByPrimaryKeySelective(category) == 1;
    }
}
