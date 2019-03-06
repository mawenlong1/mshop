package com.mwl.mshop.provider.cmc.mapper;

import com.mwl.mshop.provider.cmc.model.dto.BrandVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface CmcBrandMapper {
    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table cmc_brand
     *
     * @mbg.generated Tue Mar 05 13:17:59 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table cmc_brand
     *
     * @mbg.generated Tue Mar 05 13:17:59 CST 2019
     */
    int insert(BrandVO record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table cmc_brand
     *
     * @mbg.generated Tue Mar 05 13:17:59 CST 2019
     */
    int insertSelective(BrandVO record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table cmc_brand
     *
     * @mbg.generated Tue Mar 05 13:17:59 CST 2019
     */
    BrandVO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table cmc_brand
     *
     * @mbg.generated Tue Mar 05 13:17:59 CST 2019
     */
    int updateByPrimaryKeySelective(BrandVO record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table cmc_brand
     *
     * @mbg.generated Tue Mar 05 13:17:59 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(BrandVO record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table cmc_brand
     *
     * @mbg.generated Tue Mar 05 13:17:59 CST 2019
     */
    int updateByPrimaryKey(BrandVO record);
}