DROP DATABASE IF EXISTS `mshop_cmc`;
CREATE DATABASE  IF NOT EXISTS `mshop_cmc`;
use mshop_cmc;

-- 商品详情  commodity
DROP TABLE IF EXISTS `cmc_commodity`;

DROP TABLE IF EXISTS `cmc_commodity`;
CREATE TABLE `cmc_commodity` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `brand_id` bigint(20) DEFAULT NULL,
  `commodity_category_id` bigint(20) DEFAULT NULL,
  `commodity_attribute_category_id` bigint(20) DEFAULT NULL,
  `name` varchar(64) NOT NULL,
  `pic` varchar(255) DEFAULT NULL,
  `status` tinyint(3) DEFAULT 0 ,
  `sale` int(11) DEFAULT 0 COMMENT '销量',
  `price` decimal(10,2) DEFAULT NULL,
  `gift_growth` int(11) DEFAULT '0' COMMENT '赠送的成长值',
  `gift_point` int(11) DEFAULT '0' COMMENT '赠送的积分',
  `sub_title` varchar(255) DEFAULT NULL COMMENT '副标题',
  `description` text COMMENT '商品描述',
  `stock` int(11) DEFAULT 0 COMMENT '库存',
  `low_stock` int(11) DEFAULT 0 COMMENT '库存预警值',
  `unit` varchar(16) DEFAULT NULL COMMENT '单位',
  `weight` decimal(10,2) DEFAULT 0 COMMENT '商品重量，默认为克',
  `keywords` varchar(255) DEFAULT NULL,
  `album_pics` varchar(255) DEFAULT NULL COMMENT '画册图片，连产品图片限制为5张，以逗号分割',
  `detail_title` varchar(255) DEFAULT NULL,
  `detail_html` text COMMENT '产品详情网页内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 COMMENT='商品信息';


INSERT INTO `cmc_commodity` VALUES ('1', '49', '7', '0', '银色星芒刺绣网纱底裤', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180522/web.png', '1', '0', '100.00', '0', '100', '111', '111', '100', '20', '件', '1000.00', '银色星芒刺绣网纱底裤', null, '银色星芒刺绣网纱底裤', '银色星芒刺绣网纱底裤');
INSERT INTO `cmc_commodity` VALUES ('2', '49', '7', '0', '银色星芒刺绣网纱底裤2', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180522/web.png', '1', '0', '100.00', '0', '100', '111', '111', '100', '20', '件', '1000.00', '银色星芒刺绣网纱底裤2', null, '银色星芒刺绣网纱底裤', '<p>银色星芒刺绣网纱底裤</p>');
INSERT INTO `cmc_commodity` VALUES ('3', '1', '7', '0', '银色星芒刺绣网纱底裤3', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180522/web.png', '1', '0', '100.00', '0', '100', '111', '111', '100', '20', '件', '1000.00', '银色星芒刺绣网纱底裤3', null, '银色星芒刺绣网纱底裤', '银色星芒刺绣网纱底裤');
INSERT INTO `cmc_commodity` VALUES ('4', '1', '7', '0', '银色星芒刺绣网纱底裤4', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180522/web.png', '1', '0', '100.00', '0', '100', '111', '111', '100', '20', '件', '1000.00', '银色星芒刺绣网纱底裤4', null, '银色星芒刺绣网纱底裤', '银色星芒刺绣网纱底裤');
INSERT INTO `cmc_commodity` VALUES ('5', '1', '7', '0', '银色星芒刺绣网纱底裤5', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180522/web.png', '1', '0', '100.00', '0', '100', '111', '111', '100', '20', '件', '1000.00', '银色星芒刺绣网纱底裤5', null, '银色星芒刺绣网纱底裤', '银色星芒刺绣网纱底裤');
INSERT INTO `cmc_commodity` VALUES ('6', '1', '7', '0', '银色星芒刺绣网纱底裤6', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180522/web.png', '1', '0', '100.00', '0', '100', '111', '111', '100', '20', '件', '1000.00', '银色星芒刺绣网纱底裤6', null, '银色星芒刺绣网纱底裤', '银色星芒刺绣网纱底裤');
INSERT INTO `cmc_commodity` VALUES ('7', '1', '7', '1', '女式超柔软拉毛运动开衫', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180522/web.png', '0', '0', '249.00', '0', '100', '匠心剪裁，垂感质地', '匠心剪裁，垂感质地', '100', '0', '件', '0.00', '女式超柔软拉毛运动开衫', 'string', 'string', 'string');
INSERT INTO `cmc_commodity` VALUES ('8', '1', '7', '1', '女式超柔软拉毛运动开衫1', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180522/web.png', '0', '0', '249.00', '0', '100', '匠心剪裁，垂感质地', '匠心剪裁，垂感质地', '100', '0', '件', '0.00', '女式超柔软拉毛运动开衫', 'string', 'string', 'string');
INSERT INTO `cmc_commodity` VALUES ('9', '1', '7', '1', '女式超柔软拉毛运动开衫1', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180522/web.png', '0', '0', '249.00', '0', '100', '匠心剪裁，垂感质地', '匠心剪裁，垂感质地', '100', '0', '件', '0.00', '女式超柔软拉毛运动开衫', 'string', 'string', 'string');
INSERT INTO `cmc_commodity` VALUES ('10', '1', '7', '1', '女式超柔软拉毛运动开衫1', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180522/web.png', '0', '0', '249.00', '0', '100', '匠心剪裁，垂感质地', '匠心剪裁，垂感质地', '100', '0', '件', '0.00', '女式超柔软拉毛运动开衫', 'string', 'string', 'string');
INSERT INTO `cmc_commodity` VALUES ('11', '1', '7', '1', '女式超柔软拉毛运动开衫1', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180522/web.png', '0', '0', '249.00', '0', '100', '匠心剪裁，垂感质地', '匠心剪裁，垂感质地', '100', '0', '件', '0.00', '女式超柔软拉毛运动开衫', 'string', 'string', 'string');
INSERT INTO `cmc_commodity` VALUES ('12', '1', '7', '1', '女式超柔软拉毛运动开衫2', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180522/web.png', '0', '0', '249.00', '0', '100', '匠心剪裁，垂感质地', '匠心剪裁，垂感质地', '100', '0', '件', '0.00', '女式超柔软拉毛运动开衫', 'string', 'string', 'string');
INSERT INTO `cmc_commodity` VALUES ('13', '1', '7', '1', '女式超柔软拉毛运动开衫3', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180522/web.png', '0', '0', '249.00', '0', '100', '匠心剪裁，垂感质地', '匠心剪裁，垂感质地', '100', '0', '件', '0.00', '女式超柔软拉毛运动开衫', 'string', 'string', 'string');
INSERT INTO `cmc_commodity` VALUES ('14', '1', '7', '1', '女式超柔软拉毛运动开衫3', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180522/web.png', '0', '0', '249.00', '0', '100', '匠心剪裁，垂感质地', '匠心剪裁，垂感质地', '100', '0', '件', '0.00', '女式超柔软拉毛运动开衫', 'string', 'string', 'string');
INSERT INTO `cmc_commodity` VALUES ('18', '1', '7', '1', '女式超柔软拉毛运动开衫3', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180522/web.png', '0', '0', '249.00', '0', '100', '匠心剪裁，垂感质地', '匠心剪裁，垂感质地', '100', '0', '件', '0.00', '女式超柔软拉毛运动开衫', 'string', 'string', 'string');
INSERT INTO `cmc_commodity` VALUES ('22', '6', '7', '1', 'test', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180604/1522738681.jpg', '0', '0', '0.00', '0', '0', 'test', '', '100', '0', '', '0.00', '', '', '', '');
INSERT INTO `cmc_commodity` VALUES ('23', '6', '19', '1', '毛衫测试', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180604/1522738681.jpg', '0', '0', '99.00', '99', '99', '毛衫测试11', 'xxx', '100', '0', '件', '1000.00', '毛衫测试', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180604/1522738681.jpg,http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180604/1522738681.jpg', '毛衫测试', '<p><img class=\"wscnph\" src=\"http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180604/155x54.bmp\" /><img class=\"wscnph\" src=\"http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180604/APP登录bg1080.jpg\" width=\"500\" height=\"500\" /><img class=\"wscnph\" src=\"http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180604/APP登录界面.jpg\" width=\"500\" height=\"500\" /></p>');
INSERT INTO `cmc_commodity` VALUES ('24', '6', '7', null, 'xxx', '', '0', '0', '0.00', '0', '0', 'xxx', '', '100', '0', '', '0.00', '', '', '', '');
INSERT INTO `cmc_commodity` VALUES ('26', '3', '19', '3', '华为 HUAWEI P20 ', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180607/5ac1bf58Ndefaac16.jpg', '0', '0', '3788.00', '3788', '3788', 'AI智慧全面屏 6GB +64GB 亮黑色 全网通版 移动联通电信4G手机 双卡双待手机 双卡双待', '', '1000', '0', '件', '0.00', '', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180607/5ab46a3cN616bdc41.jpg,http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180607/5ac1bf5fN2522b9dc.jpg', '', '<p><img class=\"wscnph\" src=\"http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180607/5ad44f1cNf51f3bb0.jpg\" /><img class=\"wscnph\" src=\"http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180607/5ad44fa8Nfcf71c10.jpg\" /><img class=\"wscnph\" src=\"http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180607/5ad44fa9N40e78ee0.jpg\" /><img class=\"wscnph\" src=\"http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180607/5ad457f4N1c94bdda.jpg\" /><img class=\"wscnph\" src=\"http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180607/5ad457f5Nd30de41d.jpg\" /><img class=\"wscnph\" src=\"http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180607/5b10fb0eN0eb053fb.jpg\" /></p>');
INSERT INTO `cmc_commodity` VALUES ('27', '6', '19', '3', '小米8 全面屏游戏智能手机 6GB+64GB 黑色 全网通4G 双卡双待', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180615/xiaomi.jpg', '0', '0', '2699.00', '2699', '2699', '骁龙845处理器，红外人脸解锁，AI变焦双摄，AI语音助手小米6X低至1299，点击抢购', '小米8 全面屏游戏智能手机 6GB+64GB 黑色 全网通4G 双卡双待', '100', '0', '', '0.00', '', '', '', '<p><img class=\"wscnph\" src=\"http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180615/5b2254e8N414e6d3a.jpg\" width=\"500\" /></p>');
INSERT INTO `cmc_commodity` VALUES ('28', '6', '19', '3', '小米 红米5A 全网通版 3GB+32GB 香槟金 移动联通电信4G手机 双卡双待', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180615/5a9d248cN071f4959.jpg', '0', '0', '649.00', '649', '649', '8天超长待机，137g轻巧机身，高通骁龙处理器小米6X低至1299，点击抢购', '', '100', '0', '', '0.00', '', '', '', '');
INSERT INTO `cmc_commodity` VALUES ('29', '51', '19', '3', 'Apple iPhone 8 Plus 64GB 红色特别版 移动联通电信4G手机', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180615/5acc5248N6a5f81cd.jpg', '0', '0', '5499.00', '5499', '5499', '【限时限量抢购】Apple产品年中狂欢节，好物尽享，美在智慧！速来 >> 勾选[保障服务][原厂保2年]，获得AppleCare+全方位服务计划，原厂延保售后无忧。', '', '100', '0', '', '0.00', '', '', '', '');
INSERT INTO `cmc_commodity` VALUES ('30', '50', '8', '1', 'HLA海澜之家简约动物印花短袖T恤', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180615/5ad83a4fN6ff67ecd.jpg!cc_350x449.jpg', '0', '0', '98.00', '0', '0', '2018夏季新品微弹舒适新款短T男生 6月6日-6月20日，满300减30，参与互动赢百元礼券，立即分享赢大奖', '', '100', '0', '', '0.00', '', '', '', '');
INSERT INTO `cmc_commodity` VALUES ('31', '50', '8', '1', 'HLA海澜之家蓝灰花纹圆领针织布短袖T恤', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180615/5ac98b64N70acd82f.jpg!cc_350x449.jpg', '0', '0', '98.00', '0', '0', '2018夏季新品短袖T恤男HNTBJ2E080A 蓝灰花纹80 175/92A/L80A 蓝灰花纹80 175/92A/L', '', '100', '0', '', '0.00', '', '', '', '');
INSERT INTO `cmc_commodity` VALUES ('32', '50', '8', null, 'HLA海澜之家短袖T恤男基础款', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180615/5a51eb88Na4797877.jpg', '0', '0', '68.00', '0', '0', 'HLA海澜之家短袖T恤男基础款简约圆领HNTBJ2E153A藏青(F3)175/92A(50)', '', '100', '0', '', '0.00', '', '', '', '');
INSERT INTO `cmc_commodity` VALUES ('33', '6', '35', null, '小米（MI）小米电视4A ', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180615/5b02804dN66004d73.jpg', '0', '0', '2499.00', '0', '0', '小米（MI）小米电视4A 55英寸 L55M5-AZ/L55M5-AD 2GB+8GB HDR 4K超高清 人工智能网络液晶平板电视', '', '100', '0', '', '0.00', '', '', '', '');
INSERT INTO `cmc_commodity` VALUES ('34', '6', '35', null, '小米（MI）小米电视4A 65英寸', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180615/5b028530N51eee7d4.jpg', '0', '0', '3999.00', '0', '0', ' L65M5-AZ/L65M5-AD 2GB+8GB HDR 4K超高清 人工智能网络液晶平板电视', '', '100', '0', '', '0.00', '', '', '', '');
INSERT INTO `cmc_commodity` VALUES ('35', '58', '29', null, '耐克NIKE 男子 休闲鞋 ROSHE RUN 运动鞋 511881-010黑色41码', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180615/5b235bb9Nf606460b.jpg', '0', '0', '369.00', '0', '0', '耐克NIKE 男子 休闲鞋 ROSHE RUN 运动鞋 511881-010黑色41码', '', '100', '0', '', '0.00', '', '', '', '');
INSERT INTO `cmc_commodity` VALUES ('36', '58', '29', null, '耐克NIKE 男子 气垫 休闲鞋 AIR MAX 90 ESSENTIAL 运动鞋 AJ1285-101白色41码', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180615/5b19403eN9f0b3cb8.jpg', '0', '0', '499.00', '0', '0', '耐克NIKE 男子 气垫 休闲鞋 AIR MAX 90 ESSENTIAL 运动鞋 AJ1285-101白色41码', '', '100', '0', '', '0.00', '', '', '', '');

DROP TABLE IF EXISTS `cmc_commodity_category`;
CREATE TABLE `cmc_commodity_category` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `parent_id` bigint(20) DEFAULT NULL COMMENT '上级分类的编号：0表示一级分类',
  `name` varchar(64) DEFAULT NULL,
  `level` int(1) DEFAULT NULL COMMENT '分类级别：0->1级；1->2级',
  `commodity_count` int(11) DEFAULT NULL,
  `commodity_unit` varchar(64) DEFAULT NULL,
  `nav_status` int(1) DEFAULT NULL COMMENT '是否显示在导航栏：0->不显示；1->显示',
  `show_status` int(1) DEFAULT NULL COMMENT '显示状态：0->不显示；1->显示',
  `sort` int(11) DEFAULT NULL,
  `icon` varchar(255) DEFAULT NULL COMMENT '图标',
  `keywords` varchar(255) DEFAULT NULL,
  `description` text COMMENT '描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=utf8 COMMENT='商品分类';


INSERT INTO `cmc_commodity_category` VALUES ('1', '0', '服装', '0', '100', '件', '1', '1', '1', null, '服装', '服装分类');
INSERT INTO `cmc_commodity_category` VALUES ('2', '0', '手机数码', '0', '100', '件', '1', '1', '1', null, '手机数码', '手机数码');
INSERT INTO `cmc_commodity_category` VALUES ('3', '0', '家用电器', '0', '100', '件', '1', '1', '1', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20190129/subject_cate_jiadian.png', '家用电器', '家用电器');
INSERT INTO `cmc_commodity_category` VALUES ('4', '0', '家具家装', '0', '100', '件', '1', '1', '1', null, '家具家装', '家具家装');
INSERT INTO `cmc_commodity_category` VALUES ('5', '0', '汽车用品', '0', '100', '件', '1', '1', '1', null, '汽车用品', '汽车用品');
INSERT INTO `cmc_commodity_category` VALUES ('7', '1', '外套', '1', '100', '件', '1', '1', '0', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20190129/product_cate_waitao.png', '外套', '外套');
INSERT INTO `cmc_commodity_category` VALUES ('8', '1', 'T恤', '1', '100', '件', '1', '1', '0', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20190129/product_cate_tshirt.png', 'T恤', 'T恤');
INSERT INTO `cmc_commodity_category` VALUES ('9', '1', '休闲裤', '1', '100', '件', '1', '1', '0', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20190129/product_cate_xiuxianku.png', '休闲裤', '休闲裤');
INSERT INTO `cmc_commodity_category` VALUES ('10', '1', '牛仔裤', '1', '100', '件', '1', '1', '0', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20190129/product_cate_niuzaiku.png', '牛仔裤', '牛仔裤');
INSERT INTO `cmc_commodity_category` VALUES ('11', '1', '衬衫', '1', '100', '件', '1', '1', '0', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20190129/product_cate_chenshan.png', '衬衫', '衬衫分类');
INSERT INTO `cmc_commodity_category` VALUES ('13', '12', '家电子分类1', '1', '1', 'string', '0', '1', '0', 'string', 'string', 'string');
INSERT INTO `cmc_commodity_category` VALUES ('14', '12', '家电子分类2', '1', '1', 'string', '0', '1', '0', 'string', 'string', 'string');
INSERT INTO `cmc_commodity_category` VALUES ('19', '2', '手机通讯', '1', '0', '件', '1', '1', '0', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20190129/product_cate_shouji.png', '手机通讯', '手机通讯');
INSERT INTO `cmc_commodity_category` VALUES ('29', '1', '男鞋', '1', '0', '', '0', '0', '0', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20190129/product_cate_xie.png', '', '');
INSERT INTO `cmc_commodity_category` VALUES ('30', '2', '手机配件', '1', '0', '', '1', '1', '0', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20190129/product_cate_peijian.png', '手机配件', '手机配件');
INSERT INTO `cmc_commodity_category` VALUES ('31', '2', '摄影摄像', '1', '0', '', '1', '1', '0', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20190129/product_cate_sheying.png', '', '');
INSERT INTO `cmc_commodity_category` VALUES ('32', '2', '影音娱乐', '1', '0', '', '1', '1', '0', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20190129/product_cate_yule.png', '', '');
INSERT INTO `cmc_commodity_category` VALUES ('33', '2', '数码配件', '1', '0', '', '1', '1', '0', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20190129/product_cate_yule.png', '', '');
INSERT INTO `cmc_commodity_category` VALUES ('34', '2', '智能设备', '1', '0', '', '1', '1', '0', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20190129/product_cate_zhineng.png', '', '');
INSERT INTO `cmc_commodity_category` VALUES ('35', '3', '电视', '1', '0', '', '1', '1', '0', '', '', '');
INSERT INTO `cmc_commodity_category` VALUES ('36', '3', '空调', '1', '0', '', '1', '1', '0', '', '', '');
INSERT INTO `cmc_commodity_category` VALUES ('37', '3', '洗衣机', '1', '0', '', '1', '1', '0', '', '', '');
INSERT INTO `cmc_commodity_category` VALUES ('38', '3', '冰箱', '1', '0', '', '1', '1', '0', '', '', '');
INSERT INTO `cmc_commodity_category` VALUES ('39', '3', '厨卫大电', '1', '0', '', '1', '1', '0', '', '', '');
INSERT INTO `cmc_commodity_category` VALUES ('40', '3', '厨房小电', '1', '0', '', '0', '0', '0', '', '', '');
INSERT INTO `cmc_commodity_category` VALUES ('41', '3', '生活电器', '1', '0', '', '0', '0', '0', '', '', '');
INSERT INTO `cmc_commodity_category` VALUES ('42', '3', '个护健康', '1', '0', '', '0', '0', '0', '', '', '');
INSERT INTO `cmc_commodity_category` VALUES ('43', '4', '厨房卫浴', '1', '0', '', '1', '1', '0', '', '', '');
INSERT INTO `cmc_commodity_category` VALUES ('44', '4', '灯饰照明', '1', '0', '', '1', '1', '0', '', '', '');
INSERT INTO `cmc_commodity_category` VALUES ('45', '4', '五金工具', '1', '0', '', '1', '1', '0', '', '', '');
INSERT INTO `cmc_commodity_category` VALUES ('46', '4', '卧室家具', '1', '0', '', '1', '1', '0', '', '', '');
INSERT INTO `cmc_commodity_category` VALUES ('47', '4', '客厅家具', '1', '0', '', '1', '1', '0', '', '', '');
INSERT INTO `cmc_commodity_category` VALUES ('48', '5', '全新整车', '1', '0', '', '1', '1', '0', '', '', '');
INSERT INTO `cmc_commodity_category` VALUES ('49', '5', '车载电器', '1', '0', '', '1', '1', '0', '', '', '');
INSERT INTO `cmc_commodity_category` VALUES ('50', '5', '维修保养', '1', '0', '', '1', '1', '0', '', '', '');
INSERT INTO `cmc_commodity_category` VALUES ('51', '5', '汽车装饰', '1', '0', '', '1', '1', '0', '', '', '');



-- 品牌信息
DROP TABLE IF EXISTS `cmc_brand`;
CREATE TABLE `cmc_brand` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(64) DEFAULT NULL,
  `first_letter` varchar(8) DEFAULT NULL COMMENT '首字母',
  `sort` int(11) DEFAULT NULL,
  `factory_status` int(1) DEFAULT NULL COMMENT '是否为品牌制造商：0->不是；1->是',
  `show_status` int(1) DEFAULT NULL,
  `commodity_count` int(11) DEFAULT NULL COMMENT '产品数量',
  `commodity_comment_count` int(11) DEFAULT NULL COMMENT '产品评论数量',
  `logo` varchar(255) DEFAULT NULL COMMENT '品牌logo',
  `big_pic` varchar(255) DEFAULT NULL COMMENT '专区大图',
  `brand_story` text COMMENT '品牌故事',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=59 DEFAULT CHARSET=utf8 COMMENT='品牌表';

INSERT INTO `cmc_brand` VALUES ('1', '万和', 'W', '0', '1', '1', '100', '100', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180607/timg(5).jpg', '', 'Victoria\'s Secret的故事');
INSERT INTO `cmc_brand` VALUES ('2', '三星', 'S', '100', '1', '1', '100', '100', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180607/timg (1).jpg', null, '三星的故事');
INSERT INTO `cmc_brand` VALUES ('3', '华为', 'H', '100', '1', '1', '100', '100', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20190129/17f2dd9756d9d333bee8e60ce8c03e4c_222_222.jpg', null, 'Victoria\'s Secret的故事');
INSERT INTO `cmc_brand` VALUES ('4', '格力', 'G', '30', '1', '1', '100', '100', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20190129/dc794e7e74121272bbe3ce9bc41ec8c3_222_222.jpg', null, 'Victoria\'s Secret的故事');
INSERT INTO `cmc_brand` VALUES ('5', '方太', 'F', '20', '1', '1', '100', '100', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180607/timg (4).jpg', null, 'Victoria\'s Secret的故事');
INSERT INTO `cmc_brand` VALUES ('6', '小米', 'M', '500', '1', '1', '100', '100', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20190129/1e34aef2a409119018a4c6258e39ecfb_222_222.png', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180518/5afd7778Nf7800b75.jpg', '小米手机的故事');
INSERT INTO `cmc_brand` VALUES ('21', 'OPPO', 'O', '0', '1', '1', '88', '500', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180607/timg(6).jpg', '', 'string');
INSERT INTO `cmc_brand` VALUES ('49', '七匹狼', 'S', '200', '1', '1', '77', '400', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20190129/18d8bc3eb13533fab466d702a0d3fd1f40345bcd.jpg', null, 'BOOB的故事');
INSERT INTO `cmc_brand` VALUES ('50', '海澜之家', 'H', '200', '1', '1', '66', '300', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20190129/99d3279f1029d32b929343b09d3c72de_222_222.jpg', '', '海澜之家的故事');
INSERT INTO `cmc_brand` VALUES ('51', '苹果', 'A', '200', '1', '1', '55', '200', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180607/timg.jpg', null, '苹果的故事');
INSERT INTO `cmc_brand` VALUES ('58', 'NIKE', 'N', '0', '1', '1', '33', '100', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180615/timg (51).jpg', '', 'NIKE的故事');




DROP TABLE IF EXISTS `cmc_commodity_attribute`;
CREATE TABLE `cmc_commodity_attribute` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `commodity_attribute_category_id` bigint(20) DEFAULT NULL,
  `name` varchar(64) DEFAULT NULL,
  `select_type` int(1) DEFAULT NULL COMMENT '属性选择类型：0->唯一；1->单选；2->多选',
  `input_type` int(1) DEFAULT NULL COMMENT '属性录入方式：0->手工录入；1->从列表中选取',
  `input_list` varchar(255) DEFAULT NULL COMMENT '可选值列表，以逗号隔开',
  `sort` int(11) DEFAULT NULL COMMENT '排序字段：最高的可以单独上传图片',
  `filter_type` int(1) DEFAULT NULL COMMENT '分类筛选样式：1->普通；1->颜色',
  `search_type` int(1) DEFAULT NULL COMMENT '检索类型；0->不需要进行检索；1->关键字检索；2->范围检索',
  `related_status` int(1) DEFAULT NULL COMMENT '相同属性产品是否关联；0->不关联；1->关联',
  `hand_add_status` int(1) DEFAULT NULL COMMENT '是否支持手动新增；0->不支持；1->支持',
  `type` int(1) DEFAULT NULL COMMENT '属性的类型；0->规格；1->参数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8 COMMENT='商品属性参数表';

INSERT INTO `cmc_commodity_attribute` VALUES ('1', '1', '尺寸', '2', '1', 'M,X,XL,2XL,3XL,4XL', '0', '0', '0', '0', '0', '0');
INSERT INTO `cmc_commodity_attribute` VALUES ('7', '1', '颜色', '2', '1', '黑色,红色,白色,粉色', '100', '0', '0', '0', '1', '0');
INSERT INTO `cmc_commodity_attribute` VALUES ('13', '0', '上市年份', '1', '1', '2013年,2014年,2015年,2016年,2017年', '0', '0', '0', '0', '0', '1');
INSERT INTO `cmc_commodity_attribute` VALUES ('14', '0', '上市年份1', '1', '1', '2013年,2014年,2015年,2016年,2017年', '0', '0', '0', '0', '0', '1');
INSERT INTO `cmc_commodity_attribute` VALUES ('15', '0', '上市年份2', '1', '1', '2013年,2014年,2015年,2016年,2017年', '0', '0', '0', '0', '0', '1');
INSERT INTO `cmc_commodity_attribute` VALUES ('16', '0', '上市年份3', '1', '1', '2013年,2014年,2015年,2016年,2017年', '0', '0', '0', '0', '0', '1');
INSERT INTO `cmc_commodity_attribute` VALUES ('17', '0', '上市年份4', '1', '1', '2013年,2014年,2015年,2016年,2017年', '0', '0', '0', '0', '0', '1');
INSERT INTO `cmc_commodity_attribute` VALUES ('18', '0', '上市年份5', '1', '1', '2013年,2014年,2015年,2016年,2017年', '0', '0', '0', '0', '0', '1');
INSERT INTO `cmc_commodity_attribute` VALUES ('19', '0', '适用对象', '1', '1', '青年女性,中年女性', '0', '0', '0', '0', '0', '1');
INSERT INTO `cmc_commodity_attribute` VALUES ('20', '0', '适用对象1', '2', '1', '青年女性,中年女性', '0', '0', '0', '0', '0', '1');
INSERT INTO `cmc_commodity_attribute` VALUES ('21', '0', '适用对象3', '2', '1', '青年女性,中年女性', '0', '0', '0', '0', '0', '1');
INSERT INTO `cmc_commodity_attribute` VALUES ('24', '1', '商品编号', '1', '0', '', '0', '0', '0', '0', '0', '1');
INSERT INTO `cmc_commodity_attribute` VALUES ('25', '1', '适用季节', '1', '1', '春季,夏季,秋季,冬季', '0', '0', '0', '0', '0', '1');
INSERT INTO `cmc_commodity_attribute` VALUES ('32', '2', '适用人群', '0', '1', '老年,青年,中年', '0', '0', '0', '0', '0', '1');
INSERT INTO `cmc_commodity_attribute` VALUES ('33', '2', '风格', '0', '1', '嘻哈风格,基础大众,商务正装', '0', '0', '0', '0', '0', '1');
INSERT INTO `cmc_commodity_attribute` VALUES ('35', '2', '颜色', '0', '0', '', '100', '0', '0', '0', '1', '0');
INSERT INTO `cmc_commodity_attribute` VALUES ('37', '1', '适用人群', '1', '1', '儿童,青年,中年,老年', '0', '0', '0', '0', '0', '1');
INSERT INTO `cmc_commodity_attribute` VALUES ('38', '1', '上市时间', '1', '1', '2017年秋,2017年冬,2018年春,2018年夏', '0', '0', '0', '0', '0', '1');
INSERT INTO `cmc_commodity_attribute` VALUES ('39', '1', '袖长', '1', '1', '短袖,长袖,中袖', '0', '0', '0', '0', '0', '1');
INSERT INTO `cmc_commodity_attribute` VALUES ('40', '2', '尺码', '0', '1', '29,30,31,32,33,34', '0', '0', '0', '0', '0', '0');
INSERT INTO `cmc_commodity_attribute` VALUES ('41', '2', '适用场景', '0', '1', '居家,运动,正装', '0', '0', '0', '0', '0', '1');
INSERT INTO `cmc_commodity_attribute` VALUES ('42', '2', '上市时间', '0', '1', '2018年春,2018年夏', '0', '0', '0', '0', '0', '1');
INSERT INTO `cmc_commodity_attribute` VALUES ('43', '3', '颜色', '0', '0', '', '100', '0', '0', '0', '1', '0');
INSERT INTO `cmc_commodity_attribute` VALUES ('44', '3', '容量', '0', '1', '16G,32G,64G,128G', '0', '0', '0', '0', '0', '0');
INSERT INTO `cmc_commodity_attribute` VALUES ('45', '3', '屏幕尺寸', '0', '0', '', '0', '0', '0', '0', '0', '1');
INSERT INTO `cmc_commodity_attribute` VALUES ('46', '3', '网络', '0', '1', '3G,4G', '0', '0', '0', '0', '0', '1');
INSERT INTO `cmc_commodity_attribute` VALUES ('47', '3', '系统', '0', '1', 'Android,IOS', '0', '0', '0', '0', '0', '1');
INSERT INTO `cmc_commodity_attribute` VALUES ('48', '3', '电池容量', '0', '0', '', '0', '0', '0', '0', '0', '1');


DROP TABLE IF EXISTS `cmc_commodity_attribute_category`;
CREATE TABLE `cmc_commodity_attribute_category` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(64) DEFAULT NULL,
  `attribute_count` int(11) DEFAULT '0' COMMENT '属性数量',
  `param_count` int(11) DEFAULT '0' COMMENT '参数数量',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COMMENT='商品属性分类表';


INSERT INTO `cmc_commodity_attribute_category` VALUES ('1', '服装-T恤', '2', '5');
INSERT INTO `cmc_commodity_attribute_category` VALUES ('2', '服装-裤装', '2', '4');
INSERT INTO `cmc_commodity_attribute_category` VALUES ('3', '手机数码-手机通讯', '2', '4');
INSERT INTO `cmc_commodity_attribute_category` VALUES ('4', '配件', '0', '0');
INSERT INTO `cmc_commodity_attribute_category` VALUES ('5', '居家', '0', '0');
INSERT INTO `cmc_commodity_attribute_category` VALUES ('6', '洗护', '0', '0');
INSERT INTO `cmc_commodity_attribute_category` VALUES ('10', '测试分类', '0', '0');


DROP TABLE IF EXISTS `cmc_commodity_attribute_value`;
CREATE TABLE `cmc_commodity_attribute_value` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `commodity_id` bigint(20) DEFAULT NULL,
  `commodity_attribute_id` bigint(20) DEFAULT NULL,
  `value` varchar(64) DEFAULT NULL COMMENT '手动添加规格或参数的值，参数单值，规格有多个时以逗号隔开',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=228 DEFAULT CHARSET=utf8 COMMENT='存储产品参数信息的表';


INSERT INTO `cmc_commodity_attribute_value` VALUES ('1', '9', '1', 'X');
INSERT INTO `cmc_commodity_attribute_value` VALUES ('2', '10', '1', 'X');
INSERT INTO `cmc_commodity_attribute_value` VALUES ('3', '11', '1', 'X');
INSERT INTO `cmc_commodity_attribute_value` VALUES ('4', '12', '1', 'X');
INSERT INTO `cmc_commodity_attribute_value` VALUES ('5', '13', '1', 'X');
INSERT INTO `cmc_commodity_attribute_value` VALUES ('6', '14', '1', 'X');
INSERT INTO `cmc_commodity_attribute_value` VALUES ('7', '18', '1', 'X');
INSERT INTO `cmc_commodity_attribute_value` VALUES ('8', '7', '1', 'X');
INSERT INTO `cmc_commodity_attribute_value` VALUES ('9', '7', '1', 'XL');
INSERT INTO `cmc_commodity_attribute_value` VALUES ('10', '7', '1', 'XXL');
INSERT INTO `cmc_commodity_attribute_value` VALUES ('11', '22', '7', 'x,xx');
INSERT INTO `cmc_commodity_attribute_value` VALUES ('12', '22', '24', 'no110');
INSERT INTO `cmc_commodity_attribute_value` VALUES ('13', '22', '25', '春季');
INSERT INTO `cmc_commodity_attribute_value` VALUES ('14', '22', '37', '青年');
INSERT INTO `cmc_commodity_attribute_value` VALUES ('15', '22', '38', '2018年春');
INSERT INTO `cmc_commodity_attribute_value` VALUES ('16', '22', '39', '长袖');
INSERT INTO `cmc_commodity_attribute_value` VALUES ('124', '23', '7', '米白色,浅黄色');
INSERT INTO `cmc_commodity_attribute_value` VALUES ('125', '23', '24', 'no1098');
INSERT INTO `cmc_commodity_attribute_value` VALUES ('126', '23', '25', '春季');
INSERT INTO `cmc_commodity_attribute_value` VALUES ('127', '23', '37', '青年');
INSERT INTO `cmc_commodity_attribute_value` VALUES ('128', '23', '38', '2018年春');
INSERT INTO `cmc_commodity_attribute_value` VALUES ('129', '23', '39', '长袖');
INSERT INTO `cmc_commodity_attribute_value` VALUES ('130', '1', '13', null);
INSERT INTO `cmc_commodity_attribute_value` VALUES ('131', '1', '14', null);
INSERT INTO `cmc_commodity_attribute_value` VALUES ('132', '1', '15', null);
INSERT INTO `cmc_commodity_attribute_value` VALUES ('133', '1', '16', null);
INSERT INTO `cmc_commodity_attribute_value` VALUES ('134', '1', '17', null);
INSERT INTO `cmc_commodity_attribute_value` VALUES ('135', '1', '18', null);
INSERT INTO `cmc_commodity_attribute_value` VALUES ('136', '1', '19', null);
INSERT INTO `cmc_commodity_attribute_value` VALUES ('137', '1', '20', null);
INSERT INTO `cmc_commodity_attribute_value` VALUES ('138', '1', '21', null);
INSERT INTO `cmc_commodity_attribute_value` VALUES ('139', '2', '13', null);
INSERT INTO `cmc_commodity_attribute_value` VALUES ('140', '2', '14', null);
INSERT INTO `cmc_commodity_attribute_value` VALUES ('141', '2', '15', null);
INSERT INTO `cmc_commodity_attribute_value` VALUES ('142', '2', '16', null);
INSERT INTO `cmc_commodity_attribute_value` VALUES ('143', '2', '17', null);
INSERT INTO `cmc_commodity_attribute_value` VALUES ('144', '2', '18', null);
INSERT INTO `cmc_commodity_attribute_value` VALUES ('145', '2', '19', null);
INSERT INTO `cmc_commodity_attribute_value` VALUES ('146', '2', '20', null);
INSERT INTO `cmc_commodity_attribute_value` VALUES ('147', '2', '21', null);
INSERT INTO `cmc_commodity_attribute_value` VALUES ('183', '31', '24', null);
INSERT INTO `cmc_commodity_attribute_value` VALUES ('184', '31', '25', '夏季');
INSERT INTO `cmc_commodity_attribute_value` VALUES ('185', '31', '37', '青年');
INSERT INTO `cmc_commodity_attribute_value` VALUES ('186', '31', '38', '2018年夏');
INSERT INTO `cmc_commodity_attribute_value` VALUES ('187', '31', '39', '短袖');
INSERT INTO `cmc_commodity_attribute_value` VALUES ('198', '30', '24', null);
INSERT INTO `cmc_commodity_attribute_value` VALUES ('199', '30', '25', '夏季');
INSERT INTO `cmc_commodity_attribute_value` VALUES ('200', '30', '37', '青年');
INSERT INTO `cmc_commodity_attribute_value` VALUES ('201', '30', '38', '2018年夏');
INSERT INTO `cmc_commodity_attribute_value` VALUES ('202', '30', '39', '短袖');
INSERT INTO `cmc_commodity_attribute_value` VALUES ('203', '26', '43', '金色,银色');
INSERT INTO `cmc_commodity_attribute_value` VALUES ('204', '26', '45', '5.0');
INSERT INTO `cmc_commodity_attribute_value` VALUES ('205', '26', '46', '4G');
INSERT INTO `cmc_commodity_attribute_value` VALUES ('206', '26', '47', 'Android');
INSERT INTO `cmc_commodity_attribute_value` VALUES ('207', '26', '48', '3000');
INSERT INTO `cmc_commodity_attribute_value` VALUES ('213', '27', '43', '黑色,蓝色');
INSERT INTO `cmc_commodity_attribute_value` VALUES ('214', '27', '45', '5.8');
INSERT INTO `cmc_commodity_attribute_value` VALUES ('215', '27', '46', '4G');
INSERT INTO `cmc_commodity_attribute_value` VALUES ('216', '27', '47', 'Android');
INSERT INTO `cmc_commodity_attribute_value` VALUES ('217', '27', '48', '3000ml');
INSERT INTO `cmc_commodity_attribute_value` VALUES ('218', '28', '43', '金色,银色');
INSERT INTO `cmc_commodity_attribute_value` VALUES ('219', '28', '45', '5.0');
INSERT INTO `cmc_commodity_attribute_value` VALUES ('220', '28', '46', '4G');
INSERT INTO `cmc_commodity_attribute_value` VALUES ('221', '28', '47', 'Android');
INSERT INTO `cmc_commodity_attribute_value` VALUES ('222', '28', '48', '2800ml');
INSERT INTO `cmc_commodity_attribute_value` VALUES ('223', '29', '43', '金色,银色');
INSERT INTO `cmc_commodity_attribute_value` VALUES ('224', '29', '45', '4.7');
INSERT INTO `cmc_commodity_attribute_value` VALUES ('225', '29', '46', '4G');
INSERT INTO `cmc_commodity_attribute_value` VALUES ('226', '29', '47', 'IOS');
INSERT INTO `cmc_commodity_attribute_value` VALUES ('227', '29', '48', '1960ml');


-- ----------------------------
-- Table structure for cmc_sku_stock
-- ----------------------------
DROP TABLE IF EXISTS `cmc_sku_stock`;
CREATE TABLE `cmc_sku_stock` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `product_id` bigint(20) DEFAULT NULL,
  `sku_code` varchar(64) NOT NULL COMMENT 'sku编码',
  `price` decimal(10,2) DEFAULT NULL,
  `stock` int(11) DEFAULT '0' COMMENT '库存',
  `low_stock` int(11) DEFAULT NULL COMMENT '预警库存',
  `sps` varchar(64) DEFAULT NULL COMMENT '销售属性',
  `pic` varchar(255) DEFAULT NULL COMMENT '展示图片',
  `sale` int(11) DEFAULT NULL COMMENT '销量',
  `promotion_price` decimal(10,2) DEFAULT NULL COMMENT '单品促销价格',
  `lock_stock` int(11) DEFAULT '0' COMMENT '锁定库存',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=110 DEFAULT CHARSET=utf8 COMMENT='sku的库存';

-- ----------------------------
-- Records of cmc_sku_stock
-- ----------------------------
INSERT INTO `cmc_sku_stock` VALUES ('1', '7', 'string', '100.00', '0', '5', 'string, string, string', 'string', '0', null, '0');
INSERT INTO `cmc_sku_stock` VALUES ('2', '8', 'string', '100.00', '0', '5', 'string, string, string', 'string', '0', null, '0');
INSERT INTO `cmc_sku_stock` VALUES ('3', '9', 'string', '100.00', '0', '5', 'string, string, string', 'string', '0', null, '0');
INSERT INTO `cmc_sku_stock` VALUES ('4', '10', 'string', '100.00', '0', '5', 'string, string, string', 'string', '0', null, '0');
INSERT INTO `cmc_sku_stock` VALUES ('5', '11', 'string', '100.00', '0', '5', 'string, string, string', 'string', '0', null, '0');
INSERT INTO `cmc_sku_stock` VALUES ('6', '12', 'string', '100.00', '0', '5', 'string, string, string', 'string', '0', null, '0');
INSERT INTO `cmc_sku_stock` VALUES ('7', '13', 'string', '100.00', '0', '5', 'string, string, string', 'string', '0', null, '0');
INSERT INTO `cmc_sku_stock` VALUES ('8', '14', 'string', '100.00', '0', '5', 'string, string, string', 'string', '0', null, '0');
INSERT INTO `cmc_sku_stock` VALUES ('9', '18', 'string', '100.00', '0', '5', 'string, string, string', 'string', '0', null, '0');
INSERT INTO `cmc_sku_stock` VALUES ('10', '7', 'string', '0.00', '0', '0', 'string, string, sp3', 'string', '0', null, '0');
INSERT INTO `cmc_sku_stock` VALUES ('11', '7', 'string', '0.00', '0', '0', 'string, string, sp33', 'string', '0', null, '0');
INSERT INTO `cmc_sku_stock` VALUES ('12', '22', '111', '99.00', '0', null, 'x, M', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180604/1522738681.jpg', null, null, '0');
INSERT INTO `cmc_sku_stock` VALUES ('13', '22', '112', '99.00', '0', null, 'xx,M', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180604/2018032614134591_20180326141345650 (4).png', null, null, '0');
INSERT INTO `cmc_sku_stock` VALUES ('78', '23', '201806070023001', '99.00', '0', null, '米白色, M', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180604/1522738681.jpg', null, null, '0');
INSERT INTO `cmc_sku_stock` VALUES ('79', '23', '201806070023002', '99.00', '0', null, '米白色, X', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180604/1522738681.jpg', null, null, '0');
INSERT INTO `cmc_sku_stock` VALUES ('80', '23', '201806070023003', '99.00', '0', null, '浅黄色, M', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180604/2017091716493787_20170917164937650 (1).png', null, null, '0');
INSERT INTO `cmc_sku_stock` VALUES ('81', '23', '201806070023004', '99.00', '0', null, '浅黄色, X', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180604/2017091716493787_20170917164937650 (1).png', null, null, '0');
INSERT INTO `cmc_sku_stock` VALUES ('90', '26', '201806070026001', '3788.00', '499', null, '金色, 16G', null, null, '3588.00', '-8');
INSERT INTO `cmc_sku_stock` VALUES ('91', '26', '201806070026002', '3999.00', '500', null, '金色, 32G', null, null, '3799.00', '0');
INSERT INTO `cmc_sku_stock` VALUES ('92', '26', '201806070026003', '3788.00', '500', null, '银色, 16G', null, null, '3588.00', '0');
INSERT INTO `cmc_sku_stock` VALUES ('93', '26', '201806070026004', '3999.00', '500', null, '银色, 32G', null, null, '3799.00', '0');
INSERT INTO `cmc_sku_stock` VALUES ('98', '27', '201808270027001', '2699.00', '97', null, '黑色, 32G', null, null, null, '-24');
INSERT INTO `cmc_sku_stock` VALUES ('99', '27', '201808270027002', '2999.00', '100', null, '黑色, 64G',  null, null, null, '0');
INSERT INTO `cmc_sku_stock` VALUES ('100', '27', '201808270027003', '2699.00', '100', null, '蓝色, 32G', null, null, null, '0');
INSERT INTO `cmc_sku_stock` VALUES ('101', '27', '201808270027004', '2999.00', '100', null, '蓝色, 64G', null, null, null, '0');
INSERT INTO `cmc_sku_stock` VALUES ('102', '28', '201808270028001', '649.00', '99', null, '金色, 16G', null, null, null, '-8');
INSERT INTO `cmc_sku_stock` VALUES ('103', '28', '201808270028002', '699.00', '99', null, '金色, 32G',  null, null, null, '-8');
INSERT INTO `cmc_sku_stock` VALUES ('104', '28', '201808270028003', '649.00', '100', null, '银色, 16G', null, null, null, '0');
INSERT INTO `cmc_sku_stock` VALUES ('105', '28', '201808270028004', '699.00', '100', null, '银色, 32G', null, null, null, '0');
INSERT INTO `cmc_sku_stock` VALUES ('106', '29', '201808270029001', '5499.00', '99', null, '金色, 32G',  null, null, null, '-8');
INSERT INTO `cmc_sku_stock` VALUES ('107', '29', '201808270029002', '6299.00', '100', null, '金色, 64G', null, null, null, '0');
INSERT INTO `cmc_sku_stock` VALUES ('108', '29', '201808270029003', '5499.00', '100', null, '银色, 32G',  null, null, null, '0');
INSERT INTO `cmc_sku_stock` VALUES ('109', '29', '201808270029004', '6299.00', '100', null, '银色, 64G', null, null, null, '0');
