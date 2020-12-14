package com.delalama.AOP;

import com.delalama.AOP.beans.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@SpringBootApplication
@EnableAspectJAutoProxy
public class AspectOrientedProgrammingApplication {

	public static void main(String[] args) {
		SpringApplication.run(AspectOrientedProgrammingApplication.class, args);
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/delalama/AOP/beans.xml");
		Employee employee = (Employee) context.getBean("employee");
		employee.getMessage();
	}

}