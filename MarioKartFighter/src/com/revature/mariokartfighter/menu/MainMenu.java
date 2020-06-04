package com.revature.mariokartfighter.menu;

import java.util.Scanner;

import com.revature.mariokartfighter.dao.CharacterRepoFile;
import com.revature.mariokartfighter.dao.ItemRepoFile;
import com.revature.mariokartfighter.dao.PlayerRepoFile;
import com.revature.mariokartfighter.models.Bot;
import com.revature.mariokartfighter.service.CharacterService;
import com.revature.mariokartfighter.service.ItemService;
import com.revature.mariokartfighter.service.PlayerService;
import com.revature.mariokartfighter.service.ValidationService;

public class MainMenu {
	private Scanner input = new Scanner(System.in);
	private PlayerService playerService = new PlayerService(new PlayerRepoFile());
	private CharacterService characterService = new CharacterService(new CharacterRepoFile());
	private ItemService itemService = new ItemService(new ItemRepoFile());
	private ValidationService validationService = new ValidationService();
	private String currPlayerID;
	
	public void mainMenu() {
		System.out.println("WELCOME TO MARIO KART FIGHTER!");
		System.out.println("Please choose an option:");
		System.out.println("[1] New Player");
		System.out.println("[2] Returning Player");
		System.out.println("[0] Exit the program");
		
		int optionNumber = input.nextInt();
		input.nextLine();

		boolean loggedIn = false;
		do {
			if (optionNumber == 1) {
				currPlayerID = playerService.createNewPlayer();
				loggedIn = true;
			} else if (optionNumber == 2) {
				//find player in database
				System.out.println("Enter your player ID to login:");
				String inputID = input.nextLine();
				if (validationService.validatePlayerID(inputID)) {
					loggedIn = true;
				} else {
					System.out.println("ID does not exist");
				}
			} else if (optionNumber == 0) {
				System.exit(0);
			} else {
				System.out.println("Invalid option number");
			}
		} while (!loggedIn);
		
		System.out.println("Welcome Player " + currPlayerID);
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
				playerService.getPlayerInfo(currPlayerID);				
			} else if (optionNumber2 == 2) {
				int characterOption = input.nextInt();
				input.nextLine();

				System.out.println("---CHARACTER MENU---");
				System.out.println("[1] List All Character");
				System.out.println("[2] Get Character Info");
				System.out.println("[3] Set My Character");
				System.out.println("[4] Create Custom Character");
				System.out.println("[5] Back to Main Menu");
				
				switch (characterOption) {
				case 1:
					characterService.getAllCharacters();
					break;
				case 2:
					//ask for character name
					
					//get character info
					
					break;
				case 3:
					//ask for character name
					
					//set character
					
					break;
				case 4:
					characterService.createNewCharacter();
					break;
				case 5:
					break;
				default:
					System.out.println("Invalid option...Redirecting to Main Menu");
				}
				
			} else if (optionNumber2 == 3) {
				int itemOption = input.nextInt();
				input.nextLine();
				
				System.out.println("---ITEM MENU---");
				System.out.println("[1] List All Items");
				System.out.println("[2] Get Item Info");
				System.out.println("[3] Set My Item");
				System.out.println("[4] Create Custom Item");
				System.out.println("[5] Back to Main Menu");
				
				switch (itemOption) {
				case 1:
					itemService.getAllItems();
					break;
				case 2:
					//ask for item name
					
					//get item info
					
					break;
				case 3:
					//ask for item name
					
					//set item
					
					break;
				case 4:
					itemService.createNewItem();
					break;
				case 5:
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
