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
}
