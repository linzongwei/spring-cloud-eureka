# spring-cloud-eureka
eureka的简单应用；eureka集群

# 模块说明
- cloud-server-single模块是单点eureka-server服务
- cloud-server-cluster是eureka-server集群
- cloud-client是eureke客户端服务。

# 启动说明
- 本机的hosts文件需设置：
  - 127.0.0.1       eureka-server
  - 127.0.0.1     eureka-server-peer2
  - 127.0.0.1    eureka-server-peer1
- 单点eureka模块：
  - 启动单点eureka模块，客户端模块连接此eureka服务时，应启用cloud-client模块的application-single配置文件；
- eureka集群模块：
  - 启动eureka集群模块，应分别使用application-peer1.yml和application-peer2.yml两个配置文件开启两个eurake-server服务；
  - 启动eureka集群模块，客户端模块连接此eureka服务时，应启用cloud-client模块的application-cluster配置文件；


