下载
=================================

`Activator` <https://www.playframework.com/downloadad>   

`swagger-codegen` <https://github.com/swagger-api/swagger-codegen>

`swagger-editor` <https://github.com/swagger-api/swagger-editor>  

`java` <http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html>

`mongodb` <https://www.mongodb.com/download-center#community>

部署
===========

`swagger-codegen`  
 
* 命令行：mvn package;
* 修改tomcat confg server.xml 8080端口改为9090；
* 修改swagger-codegen/modules/swagger-generator/target/swagger-generator-2.2.0-SNAPSHOT.war为ROOT.war;
* 删除tomcat webapps中的ROOT目录；
* 移动ROOT.war到tomcat webapps中；
* 启动tomcat；

`swagger-editor`  

* http-server swagger-editor 部署，参考<https://github.com/swagger-api/swagger-editor>
* 修改swagger-editor/config/defaults.json

```
 "codegen": {
    "servers": "http://swagger_generator_ip:9090/api/gen/servers",
    "clients": "http://swagger_generator_ip:9090/api/gen/clients",
    "server": "http://swagger_generator_ip:9090/api/gen/servers/{language}",
    "client": "http://swagger_generator_ip:9090/api/gen/clients/{language}"
  }
```

`mongodb` 

* 修改 mongod.conf  bindIp 为 127.0.0.1 
* 创建数据库apidata 
* 创建数据集合apidocs、userinfos、scenarioinfos

`Activator`  

* 修改ApiIntelligenceRobot/app/views/APIEdit.scala.html 中iframe 标签中的src="http://swagger-editor:8080"
* 设置环境变量:export PATH=/activator_path:）PH；
* 根目录 ./activator run  http://127.0.0.1:9000访问