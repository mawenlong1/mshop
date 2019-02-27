## 微服务商城
- mshop-provider
    - mshop-provider-consume  7071 
    - mshop-provider-demo   7070
- mshop-provider-api
    - mshop-provider-demo-api
- mshop-server
    - mshop-config  6062
    - mshop-eureka-server  8761
    - mshop-gateway   5050
    - mshop-hystrix-dashboard  2020
 
中间件：
rabbitmq：5672  http://localhost:15672/
 启动顺序：erureka->config->**
 