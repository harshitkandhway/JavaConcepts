# Chapter 4 - Annotations

1. $$\color{blue}{\text{What does @Component signify?}}$$
   - Something is a bean
   - Should be managed by spring

2. $$\color{blue}{\text{What does @Autowired signify?}}$$
   - Spring should find a matching dependency
   - Then wire the dependency

3. $$\color{blue}{\text{What is the difference between @component, @service, @Repository and @Controller?}}$$
   - When we work on a web application, it has several layers namely web/controller, business/service and data/repository.
   - We can use **@Component** to any of the components in any of the layers, it is very generic.
   - Whereas when we use **@Controller** , this signifies we are working with a MVC approach and this is used in the Web layer.
   - **@Service** is used in the business layer where we work with transaction management.
   - **@Repository** is used in the data layer where we work around the DAO(Data Access Object) object.
   
