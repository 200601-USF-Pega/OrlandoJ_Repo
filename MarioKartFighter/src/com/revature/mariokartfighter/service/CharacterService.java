package com.revature.mariokartfighter.service;

import java.util.List;
import java.util.Scanner;

import com.revature.mariokartfighter.dao.ICharacterRepo;

public class CharacterService {
	Scanner input = new Scanner(System.in);
	ICharacterRepo repo;
	
	public CharacterService (ICharacterRepo repo) {
		this.repo = repo;
	}
	
	public void createNewCharacter() {
		//get input
		String type;
		String name;
		int maxHealth;
		double attackStat;
		double defenseStat;
		int unlockAtLevel;
		
		System.out.println("Name:");
		System.out.println("Type:");
		System.out.println("Max Health:");
		System.out.println("Attack Stat:");
		System.out.println("Defense Stat:");
		
		
		//choose unlock level based on stats
		
		
		Character newCharacter = new Character(type, name, maxHealth, attackStat, defenseStat, unlockAtLevel);
	}
	
	public void getAllCharacters() {
		List<Character> retrievedCharacters = repo.getAllCharacters();
		for(Character c : retrievedCharacters) {
			System.out.println(c);
		}
	}
}
