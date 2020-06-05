package com.revature.calculator.models;

public class CalculatorFactory<T extends Number> {
	public ICalculator<T> getCalculator(String calculatorType) {
		switch (calculatorType) {
		case "basic":
			return new BasicCalculator<T>();
		case "scientific":
			return new ScientificCalculator<T>();
		default:
			System.out.println("Invalid option chosen...choosing basic calculator");
			return new BasicCalculator<T>();
		}
	}
}
