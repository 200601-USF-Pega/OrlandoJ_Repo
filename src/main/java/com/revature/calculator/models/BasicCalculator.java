package com.revature.calculator.models;

public class BasicCalculator<T extends Number> implements ICalculator<T> {

	@Override
	public Number add(T a, T b) {
		return (Number) (a.doubleValue() + b.doubleValue());		
	}

	@Override
	public Number subtract(T a, T b) {
		// TODO Auto-generated method stub
		return a.doubleValue() - b.doubleValue();
	}

	@Override
	public Number multiply(T a, T b) {
		// TODO Auto-generated method stub
		return  a.doubleValue() * b.doubleValue();
	}

	@Override
	public Number divide(T a, T b) {
		// TODO Auto-generated method stub
		return  a.doubleValue() / b.doubleValue();
	}
	
}
