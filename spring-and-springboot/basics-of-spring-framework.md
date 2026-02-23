# Basics of Spring Framework 
## 1. What is Tight coupling?
- when we instantiate an object using new keyword in the class member level.
- This means when we create the object of that class, the subsequent object will also be created and used as a dependency.
- This should be avoided.
- The control for creating the object is with the actual class itself.

## 2. What is Loose Coupling?
- Loose coupling means when we autowire a dependency in the class and provide the implementation with help of a constructor.
- The control of creating the object and providing it to actual class is with the driver/client code or with the spring framework.

## 3. What is a dependency?
- In a web application we have different layers difened for ex: web, service and data.
- The web layer is depenedent on the service layer and so on.
- This means to instantiate the web layer we would require the object of service layer to be present, this is termed as dependency.

## 4. What is IOC(Inversion Of Control)?
- IOC means the actual control of creating the object for dependency is moved from the original class in tight coupling to a driver class or spring framework in case of loose coupling.

## 5. What is dependency injection?
- Dependency Injection is the process by which we provide the implementation of a dependency using @Autowired annotation in spring framework.
- Rather than directly instantiating the object in a class we make it loosely coupled and provide the instance through constructors or by using the @Autowired annotation.

## 6. Give examples of Dependency Injection.
- Suppose you have a complex algorithm class where you need a tree traversal algorithm to be used.
- instead of having an inorderTraversal instantiated with new keyword in the class member as a tight coupling,
- it will be better to create an interface like traversal and have it autowired in the class
- with a constructor accepting the interface datatype, the driver class will be then responsible for providing the implementation object like Inorder,PreOrder or PostOrder implementing Traversal.
- This is an example of dependency injection.

## 7. What is Auto Wiring?
- When we use @Autowired, the spring framework is responsible for searching/finding the bean like Traversal, and populating the bean.
