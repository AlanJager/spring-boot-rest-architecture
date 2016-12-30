# spring-boot-rest-architecture

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/ebb41d89cdcd420e82683e1cbdba29f5)](https://www.codacy.com/app/873863981/spring-boot-rest-architecture?utm_source=github.com&utm_medium=referral&utm_content=AlanJager/spring-boot-rest-architecture&utm_campaign=badger)

===============================  

A web service architecture offer rest API.  

Based on Spring boot.  

Use hibernate for persistence layer.  

Use maven to manage dependencies.  


Building
--------

Type `mvn package` in the project root.  

And use java -jar "your.jar" to run the project.  

TODO
----

* Use redis to make requests queue
* Optimize performance.

Structure
---------
app     contain Application for project start    

aspect  contain AOP class for request log  

auth    not finished request authorize  

error   contain customized error code  

configure    contain configure from spring-boot-security refer to   
                    http://spring.io/guides/topicals/spring-security-architecture/   

controller   contain url actions  

repository   extends CURDRepository contain basic curd operation  

service      service for action IoC and do the business here  

resouces     contain application properties for dependencies and system settings    

Maven dependency
----------------  

spring-boot 1.3.3  

hibernate 4.3.7 Final   

mysql 5.1.34  

jackson 2.2.2   

spring-boot-starter-security  

spring-boot-starter-aop  

spring-session 1.2.2RELEASE  

spring-boot-starter-redis  

guava 18.0  

junit 4.0  

spring-boot-cli 0.5.0M  

springfox-swagger-ui 2.5.0  

springfox-swagger2 2.5.0  

optional:  

angularjs 1.4.3  

jquery 2.1.1  

bootstrap 3.2.0  

webjars-locator  
