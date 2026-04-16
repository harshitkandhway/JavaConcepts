# Chapter 3 - Component Scan

1. $$\color{blue}{\text{How does spring know where to search for components or beans?}}$$
   - Spring does not know that by itself.
   - We have to tell spring to search for components on the basis of packages where beans can be present
   - We use @ComponentScan annotation for the same.


2. $$\color{blue}{\text{What is Component Scan?}}$$
   - This is the process in which spring looks for the beans/ components.

3. $$\color{blue}{\text{How do you define a component scan in XML and java annotations?}}$$
```java
@Component
@ComponentScan(basePackages = {
    "org.something.example.service",
    "org.something.example.dataservice"})
Class SpringContext{
}
```
```xml
<beans>
<context:component-scan
  base-packages="org.something.example" />
</beans>
```
4. $$\color{blue}{\text{How it is done in springboot?}}$$
   - In spring boot we use @SpringBootApplication annotation, this annotation tells springboot to run a component scan on the package of the class.
   - As a result this will search for the root directory and all the sub directory of the class where @SpringBootApplication is used.
   - Normally we create all the folders like services, controller etc and place the components respectively as a result this can be ignored nowadays in springboot.
   - This is also true for @SpringBootTests annotation which are used in springboot test class.  
   
