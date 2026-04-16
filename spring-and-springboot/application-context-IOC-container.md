1. what are the important roles of IOC Containers?
   IOC container is an important engine in spring which is responsible for:
    - Finding a bean
    - Wiring the dependency
    - Managing the lifecycle of bean

2. What are bean factory and Application Context?
   Bean Factory is an interface responsible for providing all the basic functionalities of the IOC container.
   With Spring 4 this will be deprecated as this was used long back with with XML configurations
   Application Context is the latest Interface which provides all the features of Bean Factory but also provides support of Spring AOP,
   Internationalization etc.
   
3. Can you compare bean factory with Application Context?
   Application context provides support to SpringAOP
   Bean Factory provides basic dependency injection whereas application context Includes all BeanFactory features plus advanced functions like AOP , Internationalization and WebApplicationContext for web applications.

4. How do you create application context with Spring? 
   In standalone Spring applications, you create the application context programmatically using specific implementation classes. The choice depends on whether you are using XML or Java-based configuration. In Spring Boot applications, the application context is typically created and managed automatically by the framework.
   - For XML Based : ClassPathXMLApplicationContext(new String[]{abc.xml,xyz.xml});
   - For Java Annotation based : ApplicationContext atx = new AnnotationConfigApplicationContext(SpringContext.class);
