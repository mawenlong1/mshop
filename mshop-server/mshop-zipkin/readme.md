## zipkin 启动（默认端口9411）

- docker方式
docker run -d -p 9411:9411 openzipkin/zipkin
- jar包方式
java -jar zipkin.jar
- 使用消息总线RabbitMQ（参考：https://windmt.com/2018/04/24/spring-cloud-12-sleuth-zipkin/）
RABBIT_ADDRESSES=localhost java -jar zipkin.jar

