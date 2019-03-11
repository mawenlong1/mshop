## 微服务商城

### 服务简介：

- mshop-provider
    - mshop-provider-consume  7071 
    - mshop-provider-demo   7070 
    - [mshop-provider](./mshop-prodider/mshop-provider-cmc/README.md)     7072 商品管理中心
- mshop-provider-api
    - mshop-provider-demo-api 
- mshop-server
    - mshop-config   6062 配置中心
    - mshop-eureka-server  8761 erueka服务器
    - mshop-gateway   5050   网关
    - mshop-hystrix-dashboard  2020  
- 启动顺序：eureka->config->其他

### 中间件：

1. rabbitmq docker形式启动
  5672  http://localhost:15672/
2. zipkin(服务调用监控):(mshop-server/mshop-zipkin)
  docker run -d -p 9411:9411 openzipkin/zipkin

