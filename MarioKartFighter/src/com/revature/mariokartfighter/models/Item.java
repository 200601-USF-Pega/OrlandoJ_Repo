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

	public String getItemID() {
		return itemID;
	}

	public void setItemID(String itemID) {
		this.itemID = itemID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTypeThatCanUse() {
		return typeThatCanUse;
	}

	public void setTypeThatCanUse(String typeThatCanUse) {
		this.typeThatCanUse = typeThatCanUse;
	}

	public int getUnlockAtLevel() {
		return unlockAtLevel;
	}

	public void setUnlockAtLevel(int unlockAtLevel) {
		this.unlockAtLevel = unlockAtLevel;
	}

	public int getBonusToHealth() {
		return bonusToHealth;
	}

	public void setBonusToHealth(int bonusToHealth) {
		this.bonusToHealth = bonusToHealth;
	}

	public double getBonusToAttack() {
		return bonusToAttack;
	}

	public void setBonusToAttack(double bonusToAttack) {
		this.bonusToAttack = bonusToAttack;
	}

	public double getBonusToDefense() {
		return bonusToDefense;
	}

	public void setBonusToDefense(double bonusToDefense) {
		this.bonusToDefense = bonusToDefense;
	}
}
