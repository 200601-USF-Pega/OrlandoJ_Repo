package com.revature.mariokartfighter.models;

public class Bot {
	private Character selectedCharacter;
	private Item selectedItem;
	private int level;
	
	public Bot(int level) {
		//choose random character and item for bot
//		Character selectedCharacter;
//		Item selectedItem;
		this.level = level;
	}

	public Character getSelectedCharacter() {
		return selectedCharacter;
	}

	public void setSelectedCharacter(Character selectedCharacter) {
		this.selectedCharacter = selectedCharacter;
	}

	public Item getSelectedItem() {
		return selectedItem;
	}

	public void setSelectedItem(Item selectedItem) {
		this.selectedItem = selectedItem;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}
