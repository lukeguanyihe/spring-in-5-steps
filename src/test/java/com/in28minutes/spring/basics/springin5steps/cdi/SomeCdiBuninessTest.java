package com.in28minutes.spring.basics.springin5steps.cdi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import com.in28minutes.spring.basics.springin5steps.SpringIn5StepsBasicApplication;

//load the context
@ExtendWith(MockitoExtension.class)
public class SomeCdiBuninessTest {

	//inject mock
	@InjectMocks
	SomeCdiBusiness business;
	
	
	//create mock
	@Mock
	SomeCdiDao daoMock;
	
	
	
	@Test
	public void testBasicScenario() {
		
		Mockito.when(daoMock.getData()).thenReturn(new int[]{2,4});
		// when daoMock.getData() method is called return int[]{2,4}
		
		
		//call method on binarySearch
		int actualResult = business.findGreatest();
		
		//check if the value is correct
		assertEquals(4, actualResult);
	}
}
