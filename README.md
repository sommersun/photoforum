# Social network
This is a simple social network that users can post image and issues on it with topics and follow someone or sometopics. They also can like or cancle like some posts and cancel like and search someone they like as well as topics. The Social network also support comments and see the hot posts.

##Tools & Devleopment environment
- Jdk 1.11
- Maven 3.2
- Spring Boot 2.0
- ThymeLeaf 4.0
- Mybaits + Mysql8.0 +JDBC

## Get Started

- set your database configuration in application.properties file
```javascript
spring.datasource.druid.url= jdbc:mysql://localhost:3306/${database name}?useUnicode=true&characterEncoding=UTF-8&userSSL=false&serverTimezone=GMT%2B8
spring.datasource.druid.username= root
spring.datasource.druid.password= ${your password}
spring.datasource.druid.driver-class-name=com.mysql.cj.jdbc.Driver

```
- mvn springboot: run (open the project by IDEA and run Application.java file) 
- go to <http://localhost:8080> 
## Demo
the whole demo is in our video.
