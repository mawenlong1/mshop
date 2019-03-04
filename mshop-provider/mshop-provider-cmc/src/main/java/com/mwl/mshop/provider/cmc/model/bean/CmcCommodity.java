package com.mwl.mshop.provider.cmc.model.bean;

import java.math.BigDecimal;

public class CmcCommodity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cmc_commodity.id
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cmc_commodity.brand_id
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    private Long brandId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cmc_commodity.commodity_category_id
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    private Long commodityCategoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cmc_commodity.name
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cmc_commodity.description
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cmc_commodity.detail_title
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    private String detailTitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cmc_commodity.sub_title
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    private String subTitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cmc_commodity.pic
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    private String pic;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cmc_commodity.status
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cmc_commodity.sale
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    private Integer sale;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cmc_commodity.price
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    private BigDecimal price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cmc_commodity.gift_growth
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    private Integer giftGrowth;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cmc_commodity.gift_point
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    private Integer giftPoint;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cmc_commodity.stock
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    private Integer stock;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cmc_commodity.low_stock
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    private Integer lowStock;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cmc_commodity.unit
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    private String unit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cmc_commodity.weight
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    private BigDecimal weight;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cmc_commodity.keywords
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    private String keywords;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cmc_commodity.album_pics
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    private String albumPics;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cmc_commodity.detail_html
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    private String detailHtml;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cmc_commodity.id
     *
     * @return the value of cmc_commodity.id
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cmc_commodity.id
     *
     * @param id the value for cmc_commodity.id
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cmc_commodity.brand_id
     *
     * @return the value of cmc_commodity.brand_id
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    public Long getBrandId() {
        return brandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cmc_commodity.brand_id
     *
     * @param brandId the value for cmc_commodity.brand_id
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cmc_commodity.commodity_category_id
     *
     * @return the value of cmc_commodity.commodity_category_id
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    public Long getCommodityCategoryId() {
        return commodityCategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cmc_commodity.commodity_category_id
     *
     * @param commodityCategoryId the value for cmc_commodity.commodity_category_id
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    public void setCommodityCategoryId(Long commodityCategoryId) {
        this.commodityCategoryId = commodityCategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cmc_commodity.name
     *
     * @return the value of cmc_commodity.name
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cmc_commodity.name
     *
     * @param name the value for cmc_commodity.name
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cmc_commodity.description
     *
     * @return the value of cmc_commodity.description
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cmc_commodity.description
     *
     * @param description the value for cmc_commodity.description
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cmc_commodity.detail_title
     *
     * @return the value of cmc_commodity.detail_title
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    public String getDetailTitle() {
        return detailTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cmc_commodity.detail_title
     *
     * @param detailTitle the value for cmc_commodity.detail_title
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    public void setDetailTitle(String detailTitle) {
        this.detailTitle = detailTitle == null ? null : detailTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cmc_commodity.sub_title
     *
     * @return the value of cmc_commodity.sub_title
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    public String getSubTitle() {
        return subTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cmc_commodity.sub_title
     *
     * @param subTitle the value for cmc_commodity.sub_title
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle == null ? null : subTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cmc_commodity.pic
     *
     * @return the value of cmc_commodity.pic
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    public String getPic() {
        return pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cmc_commodity.pic
     *
     * @param pic the value for cmc_commodity.pic
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cmc_commodity.status
     *
     * @return the value of cmc_commodity.status
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cmc_commodity.status
     *
     * @param status the value for cmc_commodity.status
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cmc_commodity.sale
     *
     * @return the value of cmc_commodity.sale
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    public Integer getSale() {
        return sale;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cmc_commodity.sale
     *
     * @param sale the value for cmc_commodity.sale
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    public void setSale(Integer sale) {
        this.sale = sale;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cmc_commodity.price
     *
     * @return the value of cmc_commodity.price
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cmc_commodity.price
     *
     * @param price the value for cmc_commodity.price
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cmc_commodity.gift_growth
     *
     * @return the value of cmc_commodity.gift_growth
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    public Integer getGiftGrowth() {
        return giftGrowth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cmc_commodity.gift_growth
     *
     * @param giftGrowth the value for cmc_commodity.gift_growth
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    public void setGiftGrowth(Integer giftGrowth) {
        this.giftGrowth = giftGrowth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cmc_commodity.gift_point
     *
     * @return the value of cmc_commodity.gift_point
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    public Integer getGiftPoint() {
        return giftPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cmc_commodity.gift_point
     *
     * @param giftPoint the value for cmc_commodity.gift_point
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    public void setGiftPoint(Integer giftPoint) {
        this.giftPoint = giftPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cmc_commodity.stock
     *
     * @return the value of cmc_commodity.stock
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cmc_commodity.stock
     *
     * @param stock the value for cmc_commodity.stock
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cmc_commodity.low_stock
     *
     * @return the value of cmc_commodity.low_stock
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    public Integer getLowStock() {
        return lowStock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cmc_commodity.low_stock
     *
     * @param lowStock the value for cmc_commodity.low_stock
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    public void setLowStock(Integer lowStock) {
        this.lowStock = lowStock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cmc_commodity.unit
     *
     * @return the value of cmc_commodity.unit
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    public String getUnit() {
        return unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cmc_commodity.unit
     *
     * @param unit the value for cmc_commodity.unit
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cmc_commodity.weight
     *
     * @return the value of cmc_commodity.weight
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cmc_commodity.weight
     *
     * @param weight the value for cmc_commodity.weight
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cmc_commodity.keywords
     *
     * @return the value of cmc_commodity.keywords
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cmc_commodity.keywords
     *
     * @param keywords the value for cmc_commodity.keywords
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cmc_commodity.album_pics
     *
     * @return the value of cmc_commodity.album_pics
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    public String getAlbumPics() {
        return albumPics;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cmc_commodity.album_pics
     *
     * @param albumPics the value for cmc_commodity.album_pics
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    public void setAlbumPics(String albumPics) {
        this.albumPics = albumPics == null ? null : albumPics.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cmc_commodity.detail_html
     *
     * @return the value of cmc_commodity.detail_html
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    public String getDetailHtml() {
        return detailHtml;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cmc_commodity.detail_html
     *
     * @param detailHtml the value for cmc_commodity.detail_html
     *
     * @mbg.generated Mon Mar 04 22:32:49 CST 2019
     */
    public void setDetailHtml(String detailHtml) {
        this.detailHtml = detailHtml == null ? null : detailHtml.trim();
    }
}