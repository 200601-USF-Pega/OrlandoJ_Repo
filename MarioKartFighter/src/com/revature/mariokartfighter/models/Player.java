package com.revature.mariokartfighter.models;

public class Player {
	private String playerID;
	private int level;
	private int xpEarned;
	private int numberOfWins;
	private int numberOfMatches;
	private Character selectedCharacter;
	private Item selectedItem;
	
	public Player() {
		this.playerID = "";
		this.level = 1;
		this.xpEarned = 0;
		this.numberOfWins = 0;
		this.numberOfMatches = 0;
	}
}
