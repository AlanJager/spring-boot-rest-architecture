# spring-boot-rest-architecture

make by AlanJager 2016.10.20

A web service architecture offer rest API.
Based on Spring boot.
Use hibernate for persistence layer.
Category construct

      app            contain Application for project start  
       
      aspect  contain AOP class for request log  
          
      auth    not finished request authorize  
          
      error   contain customized error code  
          
      configure      contain configure from spring-boot-security refer to   
                          http://spring.io/guides/topicals/spring-security-architecture/   
                                                
      controller     contain url actions  
      
      pojo           Plain Ordinary Java Object  
      
      repository     extends CURDRepository contain basic curd operation  
      
      service        service for action IoC and do the business here  
      
      resouces        contain application properties for dependencies and system settings    
  
  
        
