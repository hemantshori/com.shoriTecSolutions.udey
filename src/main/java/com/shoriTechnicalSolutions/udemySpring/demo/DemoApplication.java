package com.shoriTechnicalSolutions.udemySpring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main (String args[])
	
	{
		// n BinarySearchImpl xx = new BinarySearchImpl(new QuickSort());
		
		ApplicationContext ac = SpringApplication.run(DemoApplication.class, args);
	BinarySearchImpl binarySearch = ac.getBean(BinarySearchImpl.class);
	BinarySearchImpl binarySearch2 = ac.getBean(BinarySearchImpl.class);
	System.out.println(binarySearch);
	System.out.println(binarySearch2);

    binarySearch.search(new int[] {23,44,4},3);
	

	}
}
