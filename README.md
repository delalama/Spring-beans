# Spring-beans
Spring beans explained

# Simple beans spring example

Simple example to understand spring beans.

In order to understand the internal spring beans manager process i want to add this example to github, cause it has been something difficult for me to understand, hope it is helpfull for someone.

# Application context
One part of the spring initialization process is the creation of the application context.
Spring will automatically manage all the classes annotated with 
- @Component
- @Service
- @Controller
- @Bean
.......

So in this example we will reproduce this process with a class that does not contain a @Foo annotation.

First we create a new class.

![__employee__](https://github.com/delalama/Spring-beans/blob/master/src/docu/employee.png)

Next , we create our beans.xml, in this case in main folder.

![__beans__](https://github.com/delalama/Spring-beans/blob/master/src/docu/beans.png)

Next , we create an ApplicationContext and instantiate our employee class.

![__main__](https://github.com/delalama/Spring-beans/blob/master/src/docu/main.png)



