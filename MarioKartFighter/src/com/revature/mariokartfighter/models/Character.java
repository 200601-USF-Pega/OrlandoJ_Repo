package com.revature.mariokartfighter.models;

public class Character {
	private String characterID;
	private String type;
	private String name;
	private int maxHealth;
	private double attackStat;
	private double defenseStat;
	private int unlockAtLevel;
	
	public Character(String type, String name, int maxHealth, double attackStat, double defenseStat, int unlockAtLevel) {
		this.characterID = "";
		this.type = type;
		this.name = name;
		this.maxHealth = maxHealth;
		this.attackStat = attackStat;
		this.defenseStat = defenseStat;
		this.unlockAtLevel = unlockAtLevel;
	}

	public String getCharacterID() {
		return characterID;
	}

	public void setCharacterID(String characterID) {
		this.characterID = characterID;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaxHealth() {
		return maxHealth;
	}

	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}

	public double getAttackStat() {
		return attackStat;
	}

	public void setAttackStat(double attackStat) {
		this.attackStat = attackStat;
	}

	public double getDefenseStat() {
		return defenseStat;
	}

	public void setDefenseStat(double defenseStat) {
		this.defenseStat = defenseStat;
	}

	public int getUnlockAtLevel() {
		return unlockAtLevel;
	}

	public void setUnlockAtLevel(int unlockAtLevel) {
		this.unlockAtLevel = unlockAtLevel;
	}
}
