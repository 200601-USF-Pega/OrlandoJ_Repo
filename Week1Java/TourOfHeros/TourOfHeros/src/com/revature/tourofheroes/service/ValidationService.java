package com.revature.tourofheroes.service;

import java.util.Scanner;

//This service takes in prompts and prompts the user continuously till a valid input is achieved

public class ValidationService {
	Scanner input = new Scanner(System.in);
	boolean invalid = true;
	//prompts the user for a non empty string, could be improved
	public String getValidStringInput(String prompt) {
		String userInput;
		do {
			System.out.println(prompt);
			 userInput = input.nextLine();
			if(!userInput.isEmpty()) break;
			System.out.println("Please input non empty string");
		} while (invalid);
		return userInput;
	}
	//prompts user for a valid integer
	public int getValidInt(String prompt) {
		int userInput = 0;
		do {
			System.out.println(prompt);
			try {
				userInput = Integer.parseInt(input.nextLine());
				break;
			} catch (NumberFormatException ex) {
				System.out.println("Please input valid integers");
			}
		} while(invalid);
		return userInput;
	}
	//prompts the user for a valid boolean
	//can be improved if you only want the answer true or false
	public boolean getValidBoolean(String prompt) {
		invalid = true;
		String userInput;
		do {
			System.out.println(prompt);
			userInput = input.nextLine();
			if(userInput.equalsIgnoreCase("true") || userInput.equalsIgnoreCase("false")) break;
			System.out.println("Please input either true or false");
		} while (invalid);
		return Boolean.parseBoolean(userInput);
		
	}
}
