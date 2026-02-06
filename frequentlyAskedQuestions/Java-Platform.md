# Java Platform
## 1 . Why is Java so popular?
Java is popular because it is platform independent, it has a larger community support, and every 6 months there are upgrades coming out to keep things updated.
## 2 . What is platform independence?
Platform Independence means you can write java code from a different system running on different OS and still run the program on a different machine.
## 3 . What is bytecode?
The Java compiler compiles a .java file to a .class file which is often termed as bytecode, this is intermediate state which helps or instructs JVM to run a java program.
## 4 . Compare JDK vs JVM vs JRE
- JDK - JRE + Compiler + interpreters, debuggers ,etc (development components)
- JRE - JVM + core libraries
## 5 . What are the important differences between C++ and Java?
- Pointers are present in c++ not in java
- c++ is procedural + object oriented language, where as java is a pure object oriented language
- operator overloading is allowed in c++ not in java.
- multiple inheritance is allowed in c++ not in java.
- Memory management is taken care manually in c++ whereas it is automatically done in java using the garbage collector.
- c++ is a low level language which is faster as it is directly compiled whereas java is a high level language and the compilation envolves an intermediary step of conversion to bytecode, hence is slower.
- c++ is platform dependedent where as java is not.
## 6 . What is the role for a classloader in Java?
ClassLoader is a critical runtime component of JVM responsible for dynamic loading java class files as and when required.
### Main responsibilities of a class loader:
- Dynamic Loading : Loads class only when required improving efficiency.
- Locating Class Files : Translates class names to real physical file and reads the required byte.
- Security & Integrity : Ensures important java runtime classes are not replaced by malicious code.
- Delegation Model : It follows a hierarchy(Bootstrap, Extension, Application) where classloader delegates request to parents ensuring consistent loading.
### Types of classloaders :
- Bootstrap Classloader : Loads the core java APIs like java.lang.* from $JAVA_HOME/bin.
- Platform/ Extension Classloader : Loads classes from Extension directories.
- Application/ System Classloader : Loads classes from the application classpath.
### Class Loading process :
- Loading : Locates and imports binary data for a type
- Linking : a) Verification : checks bytecode
            b) Preparation : allocates memory for static fields
            c) Resolution : replaces symbolic references
- Initialization : Executes static initializers and assigns static variables their initial values.
