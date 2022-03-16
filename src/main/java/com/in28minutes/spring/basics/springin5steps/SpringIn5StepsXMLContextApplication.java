package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28minutes.spring.basics.springin5steps.xml.XmlPersonDAO;

public class SpringIn5StepsXMLContextApplication {

	public static void main(String[] args) {
		
		Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsXMLContextApplication.class);
		
		try(ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml")){
			
			LOGGER.info("Bean loaded -> {}", 
			(Object)applicationContext.getBeanDefinitionNames());
			// [xmlJdbcConnection, xmlPersonDAO]
			XmlPersonDAO personDao = applicationContext.getBean(XmlPersonDAO.class);
			
			System.out.print(personDao);
			System.out.print(personDao.getXmlJdbcConnection());

		}
		

	}

}
