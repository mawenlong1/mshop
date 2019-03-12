package com.mwl.mshop.provider.cmc.mapper;

import com.mwl.mshop.provider.cmc.model.bean.CmcBrand;
import com.mwl.mshop.provider.cmc.model.bean.CmcBrandExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CmcBrandMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cmc_brand
     *
     * @mbg.generated Sun Mar 10 15:17:45 CST 2019
     */
    long countByExample(CmcBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cmc_brand
     *
     * @mbg.generated Sun Mar 10 15:17:45 CST 2019
     */
    int deleteByExample(CmcBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cmc_brand
     *
     * @mbg.generated Sun Mar 10 15:17:45 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cmc_brand
     *
     * @mbg.generated Sun Mar 10 15:17:45 CST 2019
     */
    int insert(CmcBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cmc_brand
     *
     * @mbg.generated Sun Mar 10 15:17:45 CST 2019
     */
    int insertSelective(CmcBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cmc_brand
     *
     * @mbg.generated Sun Mar 10 15:17:45 CST 2019
     */
    List<CmcBrand> selectByExampleWithBLOBs(CmcBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cmc_brand
     *
     * @mbg.generated Sun Mar 10 15:17:45 CST 2019
     */
    List<CmcBrand> selectByExample(CmcBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cmc_brand
     *
     * @mbg.generated Sun Mar 10 15:17:45 CST 2019
     */
    CmcBrand selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cmc_brand
     *
     * @mbg.generated Sun Mar 10 15:17:45 CST 2019
     */
    int updateByExampleSelective(@Param("record") CmcBrand record, @Param("example") CmcBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cmc_brand
     *
     * @mbg.generated Sun Mar 10 15:17:45 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") CmcBrand record, @Param("example") CmcBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cmc_brand
     *
     * @mbg.generated Sun Mar 10 15:17:45 CST 2019
     */
    int updateByExample(@Param("record") CmcBrand record, @Param("example") CmcBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cmc_brand
     *
     * @mbg.generated Sun Mar 10 15:17:45 CST 2019
     */
    int updateByPrimaryKeySelective(CmcBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cmc_brand
     *
     * @mbg.generated Sun Mar 10 15:17:45 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(CmcBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cmc_brand
     *
     * @mbg.generated Sun Mar 10 15:17:45 CST 2019
     */
    int updateByPrimaryKey(CmcBrand record);
}