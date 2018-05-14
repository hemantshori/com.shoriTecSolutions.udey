package com.shoriTechnicalSolutions.udemySpring.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSort implements SortAlgo {


	@Override
	public void sort() {
		System.out.println("QS");
		
	}
}
