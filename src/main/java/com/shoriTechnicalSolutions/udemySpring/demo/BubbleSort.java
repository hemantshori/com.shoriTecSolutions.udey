package com.shoriTechnicalSolutions.udemySpring.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class BubbleSort implements SortAlgo{
	


	@Override
	public void sort() {
		System.out.println("BS");
		
	}

}
