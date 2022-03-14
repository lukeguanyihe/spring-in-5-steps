package com.in28minutes.spring.basics.springin5steps;

//import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;

@Configuration
@ComponentScan("com.in28minutes.spring.basics.springin5steps")
public class SpringIn5StepsBasicApplication {

	
	// what are the beans? add comp
	// what are the dependencies of a bean? add autowired
	// where to search for beans?
	
	
	public static void main(String[] args) {
				
		try(AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class)){
			
			BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
			int result = binarySearch.binarySearch(new int[] {123,4,5}, 3);
			
			System.out.print(result);
		}
		

	}

}
