package com.revature.mariokartfighter.dao;

import java.util.List;

public interface ICharacterRepo {
	public Character addCharacter(Character character);
	public List<Character> getAllCharacters();
}
