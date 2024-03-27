package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ProgrammerConfiguration.class);
		Programmer junior = context.getBean(Junior.class);
		Programmer middle = context.getBean(Middle.class);
		Programmer senior = context.getBean(Senior.class);
		junior.doCoding();
		middle.doCoding();
		senior.doCoding();
	}

}
