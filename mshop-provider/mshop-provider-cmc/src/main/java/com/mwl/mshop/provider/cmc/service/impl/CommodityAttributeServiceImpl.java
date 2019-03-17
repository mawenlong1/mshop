package com.mwl.mshop.provider.cmc.service.impl;

import com.github.pagehelper.PageHelper;
import com.mwl.mshop.provider.cmc.mapper.CmcCommodityAttributeCategoryMapper;
import com.mwl.mshop.provider.cmc.mapper.CmcCommodityAttributeMapper;
import com.mwl.mshop.provider.cmc.model.bean.CmcCommodityAttribute;
import com.mwl.mshop.provider.cmc.model.bean.CmcCommodityAttributeCategory;
import com.mwl.mshop.provider.cmc.model.bean.CmcCommodityAttributeExample;
import com.mwl.mshop.provider.cmc.model.request.CommodityAttributeRequest;
import com.mwl.mshop.provider.cmc.model.vo.CommodityAttributeVO;
import com.mwl.mshop.provider.cmc.service.CommodityAttributeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mawenlong
 * @date 2019-03-10 19:06
 */
@Service
public class CommodityAttributeServiceImpl implements CommodityAttributeService {

    @Autowired
    private CmcCommodityAttributeMapper commodityAttributeMapper;
    @Autowired
    private CmcCommodityAttributeCategoryMapper categoryMapper;

    @Override
    public List<CmcCommodityAttribute> getList(Long cid, Integer type, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        CmcCommodityAttributeExample example = new CmcCommodityAttributeExample();
        example.setOrderByClause("sort desc");
        example.createCriteria().andCommodityAttributeCategoryIdEqualTo(cid).andTypeEqualTo(type);
        return commodityAttributeMapper.selectByExample(example);
    }

    @Override
    public boolean update(Long id, CommodityAttributeRequest commodityAttributeRequest) {
        CmcCommodityAttribute attribute = new CmcCommodityAttribute();
        attribute.setId(id);
        BeanUtils.copyProperties(commodityAttributeRequest, attribute);
        return commodityAttributeMapper.updateByPrimaryKeySelective(attribute) == 1;
    }

    @Override
    public CommodityAttributeVO getById(Long id) {
        CmcCommodityAttribute attribute = commodityAttributeMapper.selectByPrimaryKey(id);
        CommodityAttributeVO result = new CommodityAttributeVO();
        BeanUtils.copyProperties(attribute, result);
        return result;
    }

    @Override
    public boolean create(CommodityAttributeRequest commodityAttributeRequest) {
        CmcCommodityAttribute attribute = new CmcCommodityAttribute();
        BeanUtils.copyProperties(commodityAttributeRequest, attribute);
        if (commodityAttributeMapper.insertSelective(attribute) != 1) {
            return false;
        }
        //更新商品属性分类
        CmcCommodityAttributeCategory attributeCategory =
                categoryMapper.selectByPrimaryKey(attribute.getCommodityAttributeCategoryId());
        if (attribute.getType() == 0) {
            attributeCategory.setAttributeCount(attributeCategory.getAttributeCount() + 1);
        } else {
            attributeCategory.setParamCount(attributeCategory.getParamCount() + 1);
        }
        categoryMapper.updateByPrimaryKey(attributeCategory);
        return true;
    }

    @Override
    public boolean delete(Long id) {
        CmcCommodityAttribute attribute = commodityAttributeMapper.selectByPrimaryKey(id);
        // 删除属性
        commodityAttributeMapper.deleteByPrimaryKey(id);
        CmcCommodityAttributeCategory category =
                categoryMapper.selectByPrimaryKey(attribute.getCommodityAttributeCategoryId());
        if (attribute.getType() == 0) {
            category.setAttributeCount(category.getAttributeCount() - 1);
        } else if (attribute.getType() == 1) {
            category.setParamCount(category.getParamCount() - 1);
        } else {
            return false;
        }
        categoryMapper.updateByPrimaryKey(category);
        return true;
    }
}
