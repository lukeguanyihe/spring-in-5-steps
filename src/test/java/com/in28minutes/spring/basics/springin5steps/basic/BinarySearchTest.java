package com.in28minutes.spring.basics.springin5steps.basic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import com.in28minutes.spring.basics.springin5steps.SpringIn5StepsBasicApplication;

//load the context
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes=SpringIn5StepsBasicApplication.class)
public class BinarySearchTest {
	
	//Get this bean from the context
	@Autowired
	BinarySearchImpl binarySearch;
	
	
	@Test
	public void testBasicScenario() {
		//call method on binarySearch
		int actualResult = binarySearch.binarySearch(new int[] {}, 5);
		
		//check if the value is correct
		assertEquals(3, actualResult);

	}

}
