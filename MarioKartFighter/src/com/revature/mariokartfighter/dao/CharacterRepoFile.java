package com.revature.mariokartfighter.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class CharacterRepoFile implements ICharacterRepo {
	private String filepath= "src/resources/Character.txt";

	@Override
	public Character addCharacter(Character character) {
		List<Character> currentCharacters = this.getAllCharacters();
		try {
			ObjectOutputStream objectOutputStream = 
					new ObjectOutputStream(new FileOutputStream(filepath));
			currentCharacters.add(character);
			objectOutputStream.writeObject(currentCharacters);
			objectOutputStream.close();
			return character;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Character> getAllCharacters() {
		try {
			ObjectInputStream inputStream = 
					new ObjectInputStream(new FileInputStream(filepath));
			List<Character> retrievedCharacters = (ArrayList<Character>) inputStream.readObject();
			inputStream.close();
			return retrievedCharacters;
		} catch (IOException e) {
			
		} catch (ClassNotFoundException e) {
			//Just in case Character class is not found
			e.printStackTrace();
		} 
		
		return new ArrayList<Character>();
	}

}
