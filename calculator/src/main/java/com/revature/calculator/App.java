package com.revature.calculator;

import java.util.Scanner;

import com.revature.calculator.models.CalculatorFactory;
import com.revature.calculator.models.ICalculator;

public class App {
    public static void main( String[] args ) {
    	Scanner input = new Scanner(System.in);
    	
        System.out.println("Which type of calculator do you want to use?" );
        System.out.println("\tBasic");
        System.out.println("\tScientific");
        
        String option = input.nextLine().toLowerCase();
        
    	CalculatorFactory<Number> calcFactory = new CalculatorFactory<Number>();
        ICalculator<Number> myCalculator = calcFactory.getCalculator(option);
        
        if (option != "scientific") {
        	System.out.println("Options: add, subtract, multiply, divide");
        	String operationType = input.nextLine().toLowerCase();
        	switch(operationType) {
        	case "add":
        		System.out.println(myCalculator.add(17, 3));
                break;
        	case "subtract":
        		System.out.println(myCalculator.subtract(17, 3));
                break;
        	case "multiply":
        		System.out.println(myCalculator.multiply(17, 3));
                break;
        	case "divide":
        		System.out.println(myCalculator.divide(17, 3));
                break;
        	}
        } else {
        	System.out.println("Options: add, subtract, multiply, divide, addMultiple");
        	String operationType = input.nextLine().toLowerCase();
        	switch(operationType) {
        	case "add":
        		System.out.println(myCalculator.add(17, 3));
                break;
        	case "subtract":
        		System.out.println(myCalculator.subtract(17, 3));
                break;
        	case "multiply":
        		System.out.println(myCalculator.multiply(17, 3));
                break;
        	case "divide":
        		System.out.println(myCalculator.divide(17, 3));
                break;
        	case "addmultiple":
        		//doesnt work bc not in interface, would need to make scientific calc interface
        		//System.out.println(myCalculator.addMultiple(4, 17, 3, 2));
        		break;
        	}
        	
        }
   

    }
}
