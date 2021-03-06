package com.in28minutes.spring.basics.springin5steps.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	@Autowired // tell binary search impl depends on sort algorithm
	private SortAlgorithm quickSortAlgorithm;
	
//	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//		super();
//		this.sortAlgorithm = sortAlgorithm;
//	}

	public int binarySearch(int[] numbers, int numberToSearchFor) {
		
		int[] sortedNumbers = quickSortAlgorithm.sort(numbers);
		System.out.println(quickSortAlgorithm);
		
		return 3;
	}
	
	@PostConstruct
	public void postConstruct() {
		logger.info("postConstruct");
	}
	
	@PreDestroy
	public void preDestroy() {
		logger.info("@PreDestroy");
	}
}
