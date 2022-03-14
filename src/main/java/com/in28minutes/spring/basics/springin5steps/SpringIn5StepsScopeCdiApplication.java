package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;
import com.in28minutes.spring.basics.springin5steps.cdi.SomeCdiBusiness;
import com.in28minutes.spring.basics.springin5steps.scope.PersonDAO;

@SpringBootApplication
public class SpringIn5StepsScopeCdiApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeCdiApplication.class);
	
	public static void main(String[] args) {
				
		ApplicationContext applicationContext = 
				SpringApplication.run(SpringIn5StepsScopeCdiApplication.class, args);
		
		SomeCdiBusiness business = applicationContext.getBean(SomeCdiBusiness.class);

	}

}
