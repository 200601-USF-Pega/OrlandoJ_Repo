package com.revature.mariokartfighter.menu;

import java.util.Scanner;

import com.revature.mariokartfighter.models.Player;

public class MainMenu {
	private Player player;
	
	public void mainMenu() {
		System.out.println("WELCOME TO MARIO KART FIGHTER!");
		System.out.println("Please choose an option:");
		System.out.println("[1] New Player");
		System.out.println("[2] Returning Player");
		System.out.println("[0] Exit the program");
		
		Scanner input = new Scanner(System.in);
		
		int optionNumber = input.nextInt();
		input.nextLine();

		
		if (optionNumber == 1) {
			//create player and add to database
			player = new Player();
		} else if (optionNumber == 2) {
			//find player in database and create object using that data
			
		} else if (optionNumber == 0) {
			System.exit(0);
		} else {
			System.out.println("Invalid option number");
		}
		
		System.out.println("Welcome Player ###");
		int optionNumber2;
		do {
			System.out.println("What would you like to do?");
			System.out.println("[1] View my Level and Rank");
			System.out.println("[2] Character Menu");
			System.out.println("[3] Item Menu");
			System.out.println("[4] Fight a Bot");
			System.out.println("[5] Fight a Player");
			System.out.println("[6] View Record of my Matches");
			System.out.println("[0] Exit the program");
			
			optionNumber2 = input.nextInt();
			input.nextLine();			
			
			if (optionNumber2  == 1) {
				//print player level and rank
				System.out.println("\tLevel: " + player.getLevel());
				System.out.println("\tRank: ");
				
			} else if (optionNumber2 == 2) {
				//Character Menu
				int characterOption = input.nextInt();
				input.nextLine();

				System.out.println("---CHARACTER MENU---");
				System.out.println("[1] List All Character");
				System.out.println("[2] Get Character Info");
				System.out.println("[3] Set my Character");
				System.out.println("[4] Back to Main Menu");
				
				switch (characterOption) {
				case 1:
					//list all characters
					
					break;
				case 2:
					//ask for character name
					
					//get character info
					
					break;
				case 3:
					//ask for character name
					
					//set character
					
					break;
				default:
					System.out.println("Invalid option...Redirecting to Main Menu");
				}
				
			} else if (optionNumber2 == 3) {
				//Item Menu
				int itemOption = input.nextInt();
				input.nextLine();
				
				System.out.println("---ITEM MENU---");
				System.out.println("[1] Get Item Info");
				System.out.println("[2] Get Item Info");
				System.out.println("[3] Set my Item");
				System.out.println("[4] Back to Main Menu");
				
				switch (itemOption) {
				case 1:
					//list all items
					
					break;
				case 2:
					//ask for item name
					
					//get item info
					
					break;
				case 3:
					//ask for item name
					
					//set item
					
					break;
				default:
					System.out.println("Invalid option...Redirecting to Main Menu");
				}
				
			} else if (optionNumber2 == 4) {
				//ask for level of bot
				System.out.println("What level bot would you like to fight?");
				int botLevel = input.nextInt();
				input.nextLine();
				
				Bot newBot = new Bot(botLevel);
				
				//simulate bot fight
				
				
			} else if (optionNumber2 == 5) {
				//choose player with closest level
				
				//simulate player fight
				
			} else if (optionNumber2 == 6) {
				//print record of matches
				
			} else if (optionNumber2 == 0) {
				System.exit(0);
			} else {
				System.out.println("Invalid option number");
			}
			
		} while (optionNumber2 != 0);
	}
}
