package com.revature.tourofheroes.menu;

import java.util.Scanner;

import com.revature.tourofheroes.service.HeroService;

public class MainMenu {
	public void mainMenu() {
		System.out.println("Welcome to my Tour Of Heroes app");
		System.out.println("What would you like to do?");
		System.out.println("1) Create a hero?");
		System.out.println("2) Exit");
		
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		input.nextLine();
		
		if (number == 1) {
			System.out.println("Enter hero name: ");
	        String heroName = input.nextLine();
	        
	        //StringBuilder specialMovesSB = new StringBuilder(100);
	        System.out.println("Enter special moves (seperated by commas): ");
	        String specialMovesStr = input.nextLine();
	        String[] specialMoves = specialMovesStr.split(",");
	        
	        input.close();
	        
	        HeroService heroServicer = new HeroService();
	        
	        boolean heroCreated = heroServicer.createHero(heroName, specialMoves, 100, true);
	        System.out.println("Hero created = " + heroCreated);
	        
		} else if (number == 2) {
			input.close();
			return;
		} else {
			System.out.println("That's not an option");
		}
		
	}
}
