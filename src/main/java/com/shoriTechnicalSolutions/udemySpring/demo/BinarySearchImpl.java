package com.shoriTechnicalSolutions.udemySpring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {
	// here using autowiring by Name
	@Autowired

	private SortAlgo sortAlgo;
	



	public int search(int [] numbers,int Search)
	{

		sortAlgo.sort();
		
		return 3;
	}
	
}
