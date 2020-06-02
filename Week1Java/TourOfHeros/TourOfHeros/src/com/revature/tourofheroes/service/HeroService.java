package com.revature.tourofheroes.service;

import java.util.Scanner;

import com.revature.tourofheroes.exceptions.InvalidHealthException;
import com.revature.tourofheroes.models.Hero;

public class HeroService {
	Scanner input = new Scanner(System.in);
	public void createNewHero() {
		boolean success = false;
		//get user input 
		//TODO add input validation
			do {
				System.out.println("Enter hero name: ");
				String name = input.nextLine();
				StringBuilder specialmoves = new StringBuilder(); 
				do {
					
					System.out.println("Enter hero moves (input done to stop):");
					String move = input.nextLine();
					if(move.equalsIgnoreCase("done")) break;
					specialmoves.append(move);
					specialmoves.append(",");
					
				}while(true);
				
				System.out.println("Enter healthlevel: ");
				int healthLevel = Integer.parseInt(input.nextLine());
				
				System.out.println("Enter living status (true or false): ");
				boolean isAlive = Boolean.parseBoolean(input.nextLine());
				
				try {
					Hero newHero = new Hero(name, specialmoves.toString().split(","), healthLevel, isAlive);
					System.out.println("New Hero Created!");
					System.out.println(newHero);
					success = true;
				} catch (InvalidHealthException ex) {
					System.out.println("Invalid health level! Please repeat your input");
				}
				
			} while (!success);
		
		
	}
}
