




Category construct


      
# spring-boot-rest-architecture
===============

A web service architecture offer rest API.
Based on Spring boot.
Use hibernate for persistence layer.

Building
--------

Type `mvn package` in the project root. And use java -jar "your.jar" to run the project

TODO
----

* Optimize performance.
* Add RBAC part.
* Add token.

Structure
---------
app     contain Application for project start    

aspect  contain AOP class for request log  

auth    not finished request authorize  

error   contain customized error code  

configure    contain configure from spring-boot-security refer to   
                    http://spring.io/guides/topicals/spring-security-architecture/   

controller   contain url actions  

pojo         Plain Ordinary Java Object  

repository   extends CURDRepository contain basic curd operation  

service      service for action IoC and do the business here  

resouces     contain application properties for dependencies and system settings    
