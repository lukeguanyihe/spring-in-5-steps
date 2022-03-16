package com.in28minutes.spring.basics.springin5steps;

//import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;
import com.in28minutes.spring.basics.springin5steps.xml.XmlPersonDAO;

@Configuration
@ComponentScan("com.in28minutes.spring.basics.springin5steps")
public class SpringIn5StepsXMLContextApplication {

	public static void main(String[] args) {
				
		try(ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml")){
			
			XmlPersonDAO personDao = applicationContext.getBean(XmlPersonDAO.class);
			
			System.out.print(personDao);
			System.out.print(personDao.getXmlJdbcConnection());

		}
		

	}

}
