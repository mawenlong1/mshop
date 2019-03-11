## 商品管理中心

### 数据库设计（表名以cmc开头）

主要介绍四个表的关系，以一个小米手机为例。

- 商品表 （commodity）

  - 商标id   小米
  - 商品分类id  手机数码---->手机，存在层级的关系
  - 商品属性分类id  

- 商品属性分类表(CommodityAttributeCategory)

  - 规格种类    2
  - 参数种类    4

- 商品属性表(CommodityAttribute)

  - 商品id    
  - 商品属性分类id  
  - 名称   
  - 可选值
  - type字段标识是规格还是参数

  参数(type为1)
  名称:屏幕尺寸，可选值:
  名称:系统，可选值:
  名称:电池容量，可选值:
  名称:网络，可选值:

  规格(type为0)
  名称:颜色，可选值: 黑色  白色
  名称:容量，可选值: 4G 8G 16G

- 商品参数值表(CommodityAttributeValue)，从type为1的属性表取名称

  - 商品id
  - 商品属性id  屏幕尺寸
  - 参数的值   5.99寸

- sku库存表

- 商品商标表

- 商品分类表

### 对外接口

swagger地址：http://localhost:7072/swagger-ui.html

### 组件的使用
