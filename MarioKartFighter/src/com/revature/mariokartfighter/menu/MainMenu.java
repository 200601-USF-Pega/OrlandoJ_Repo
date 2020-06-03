package com.revature.mariokartfighter.menu;

import java.util.Scanner;

public class MainMenu {
	public void mainMenu() {
		System.out.println("WELCOME TO MARIO KART FIGHTER!");
		System.out.println("Please choose an option:");
		System.out.println("[1] New Player");
		System.out.println("[1] Returning Player");
		System.out.println("[0] Exit the program");
		
		Scanner input = new Scanner(System.in);
		
		int optionNumber = input.nextInt();
		input.nextLine();
		
		if (optionNumber == 1) {
			//create player and add to database
			
		} else if (optionNumber == 2) {
			//find player in database and create object using that data
			
		} else if (optionNumber == 0) {
			System.exit(0);
		} else {
			System.out.println("Invalid option number");
		}
		
	}
}
