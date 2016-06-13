name := """ApiIntelligenceRobot"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  "de.undercouch" % "bson4jackson" % "2.7.0",
  "org.jongo" % "jongo" % "1.3.0",
  //  "org.mongodb.morphia" % "morphia" % "1.0.1",
  "com.alibaba" % "fastjson" % "1.2.12" ,
  "com.esotericsoftware.reflectasm" % "reflectasm" % "1.09",
  "com.fasterxml.jackson.core" % "jackson-annotations" % "2.7.3",
  "com.fasterxml.jackson.core" % "jackson-databind" % "2.7.3",
  "com.fasterxml.jackson.core" % "jackson-core" % "2.7.3",
  "com.fasterxml.jackson.jaxrs" % "jackson-jaxrs-json-provider" % "2.7.3",
  "com.fasterxml.jackson.dataformat" % "jackson-dataformat-yaml" % "2.7.4",
  "org.mongodb" % "mongo-java-driver" % "3.2.2",
//  "org.mongojack" % "mongojack" % "2.6.0",
  "org.slf4j" % "slf4j-api" % "1.7.19",
  //  "io.swagger" % "swagger-core" % "1.5.8",
  //  "io.swagger" % "swagger-annotations" % "1.5.8",
  //  "io.swagger" % "swagger-models" % "1.5.8",
  //  "io.swagger" % "swagger-parser" % "1.0.19",
  //  "io.swagger" % "swagger-codegen" % "2.1.6",
  "org.testng" % "testng" % "6.9.4",
  "org.powermock" % "powermock-api-mockito" % "1.6.4",
  "org.mockito" % "mockito-core" % "2.0.44-beta",
  "com.typesafe.play" % "filters-helpers_2.11" % "2.5.0",
  "com.typesafe.play" % "play_2.11" % "2.5.0",
  "com.offbytwo.jenkins" % "jenkins-client" % "0.3.4",
  "com.jayway.restassured"  % "rest-assured" % "2.9.0",
  "com.jayway.jsonpath"  % "json-path" % "2.2.0",
//  "com.alibaba" % "fastjson" % "1.2.12"
  "org.json" % "json" % "20160212"
)
