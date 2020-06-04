package com.revature.mariokartfighter.service;

import java.util.List;
import java.util.Scanner;

import com.revature.mariokartfighter.dao.IItemRepo;
import com.revature.mariokartfighter.models.Item;

public class ItemService {
	Scanner input = new Scanner(System.in);
	IItemRepo repo;
	
	public ItemService (IItemRepo repo) {
		this.repo = repo;
	}
	
	public void createNewItem() {
		//get input
		String name;
		String typeThatCanUse;
		int unlockAtLevel;
		int bonusToHealth; 
		double bonusToAttack;
		double bonusToDefense;
		
		System.out.println("");
		
		Character newItem = new Item(name, typeThatCanUse, unlockAtLevel, bonusToHealth, bonusToAttack, bonusToDefense);
	}
	
	public void getAllItems() {
		List<Item> retrievedItems = repo.getAllItems();
		for(Item i : retrievedItems) {
			System.out.println(i);
		}
	}
}
