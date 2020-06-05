package com.revature.calculator.models;

public interface ICalculator<T> {
	public Number add(T a, T b);
	public Number subtract(T a, T b);
	public Number divide(T a, T b);
	public Number multiply(T a, T b);
}
