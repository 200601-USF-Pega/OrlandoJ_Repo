package com.revature.mariokartfighter.models;

public class Item {
	private String itemID;
	private String name;
	private String typeThatCanUse;
	private int unlockAtLevel;
	private int bonusToHealth;
	private double bonusToAttack;
	private double bonusToDefense;
	
	public Item(String name, String typeThatCanUse, int unlockAtLevel, int bonusToHealth, double bonusToAttack, double bonusToDefense) {
		this.itemID = "";
		this.name = name;
		this.typeThatCanUse = typeThatCanUse;
		this.unlockAtLevel = unlockAtLevel;
		this.bonusToHealth = bonusToHealth;
		this.bonusToAttack = bonusToAttack;
		this.bonusToDefense = bonusToDefense;
	}
}
