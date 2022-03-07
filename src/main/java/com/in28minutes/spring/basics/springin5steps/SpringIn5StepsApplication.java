package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	
	// what are the beans? add comp
	// what are the dependencies of a bean? add autowired
	// where to search for beans?
	
	
	public static void main(String[] args) {
//		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
				
		ApplicationContext applicationContext = 
				SpringApplication.run(SpringIn5StepsApplication.class, args);
		
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] {123,4,5}, 3);
		
		System.out.print(result);
	}

}
