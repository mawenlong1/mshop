## 微服务商城
- mshop-provider
    - mshop-provider-consume  7071 
    - mshop-provider-demo   7070
    - mshop-provider-cmc     7072商品管理中心
- mshop-provider-api
    - mshop-provider-demo-api
- mshop-server
    - mshop-config  6062
    - mshop-eureka-server  8761
    - mshop-gateway   5050
    - mshop-hystrix-dashboard  2020
启动顺序：eureka->config->**

中间件：
rabbitmq docker形式启动
5672  http://localhost:15672/

zipkin(服务调用监控):(mshop-server/mshop-zipkin)
docker run -d -p 9411:9411 openzipkin/zipkin
 
 
 docker run -p 3306:3306 --name mshop-mysql -e MYSQL_ROOT_PASSWORD=123456 -d mysql:5.6
 
 CREATE DATABASE mshop DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
 
 DROP TABLE IF EXISTS `cmc_commodity`;
 CREATE TABLE `cmc_commodity` (
   `id` bigint(20) NOT NULL AUTO_INCREMENT,
   `brand_id` bigint(20) DEFAULT NULL ,
   `commodity_category_id` bigint(20) DEFAULT 0,
   `name` varchar(64) NOT NULL,
   `description` text DEFAULT NULL,
   `detail_title` varchar(255) DEFAULT NULL,
   `sub_title` varchar(255) DEFAULT NULL,
   `pic` varchar(255) DEFAULT NULL ,
   `status` varchar(20) DEFAULT NULL ,
   `sale` int(11) DEFAULT NULL ,
   `price` decimal(10,2) DEFAULT NULL ,
   `gift_growth` int(11) DEFAULT '0',
   `gift_point` int(11) DEFAULT '0' ,
   `stock` int(11) DEFAULT NULL,
   `low_stock` int(11) DEFAULT NULL ,
   `unit` varchar(16) DEFAULT NULL ,
   `weight` decimal(10,2) DEFAULT NULL ,
   `keywords` varchar(255) DEFAULT NULL,
   `album_pics` varchar(255) DEFAULT NULL,
   `detail_html` text,
   PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8;
 
  CREATE TABLE `teacher` (
    `id` bigint(20) NOT NULL AUTO_INCREMENT,
     PRIMARY KEY (`id`)
   )