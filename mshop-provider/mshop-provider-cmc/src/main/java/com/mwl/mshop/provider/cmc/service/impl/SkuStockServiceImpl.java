package com.mwl.mshop.provider.cmc.service.impl;

import com.mwl.mshop.provider.cmc.mapper.CmcSkuStockMapper;
import com.mwl.mshop.provider.cmc.model.bean.CmcSkuStock;
import com.mwl.mshop.provider.cmc.model.bean.CmcSkuStockExample;
import com.mwl.mshop.provider.cmc.model.vo.SkuStockVO;
import com.mwl.mshop.provider.cmc.service.SkuStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author mawenlong
 * @date 2019-03-10 19:22
 */
@Service
public class SkuStockServiceImpl implements SkuStockService {

    @Autowired
    private CmcSkuStockMapper skuStockMapper;

    @Override
    public List<SkuStockVO> getList(Long pid, String keyword) {
        CmcSkuStockExample example = new CmcSkuStockExample();
        CmcSkuStockExample.Criteria criteria = example.createCriteria().andProductIdEqualTo(pid);
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andSkuCodeLike("%" + keyword + "%");
        }
        List<CmcSkuStock> cmcSkuStocks = skuStockMapper.selectByExample(example);
        List<SkuStockVO> result = new ArrayList<>();
        for (CmcSkuStock skuStock : cmcSkuStocks) {
            SkuStockVO res = new SkuStockVO();
            res.setId(skuStock.getId());
            res.setLockStock(skuStock.getLockStock());
            res.setPic(skuStock.getPic());
            res.setPrice(skuStock.getPrice());
            res.setSkuCode(skuStock.getSkuCode());
            res.setSale(skuStock.getSale());
            res.setProductId(skuStock.getProductId());
            res.setLowStock(skuStock.getLowStock());
            res.setStock(skuStock.getStock());
            res.setSps(Arrays.asList(skuStock.getSps().split(",")));
            result.add(res);
        }
        return result;
    }
}
