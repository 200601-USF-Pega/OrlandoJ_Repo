package com.revature.calculator.models;


import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;


public class BasicCalculatorTest {
	CalculatorFactory<Integer> calcFactory;
    ICalculator<Integer> myCalculator;
    
	@Before
	public void setDummyData() {
		calcFactory = new CalculatorFactory<Integer>();
        myCalculator = calcFactory.getCalculator("basic");
	}
	
	@Test
	public void calculatorFactoryShouldReturnCorrectType() {
		assertThat(myCalculator, instanceOf(BasicCalculator.class));
	}

}
