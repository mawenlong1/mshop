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
 
