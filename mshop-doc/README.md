

## 数据库设计

### 商品管理中心数据库初始化
- 建立docker镜像
    - docker run -p 3306:3306 --name mshop-cmc -e MYSQL_ROOT_PASSWORD=123456 -d mysql:5.6
- 进入容器或者通过客户端连接，然后执行cmc.sql的sql语句
    - 进入容器的命令：docker exec -it 321s /bin/bash