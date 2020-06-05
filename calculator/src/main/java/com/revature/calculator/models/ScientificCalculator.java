package com.revature.calculator.models;

public class ScientificCalculator<T extends Number> extends BasicCalculator<T> implements ICalculator<T> {
	public Number addMultiple(T a, T b, T c, T d) {
		return (Number) (a.doubleValue() + b.doubleValue() + c.doubleValue() + d.doubleValue());
	}
}
