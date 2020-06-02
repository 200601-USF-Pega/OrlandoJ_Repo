package com.revature.tourofheroes.service;

import com.revature.tourofheroes.exceptions.InvalidHealthException;
import com.revature.tourofheroes.models.Hero;

public class HeroService {
	public boolean createNewHero() {
		//get user input 
		String[] specialMoves = {"heat vision", "light", "invulnerability"};
		Hero newHero;
		//order matters in catch blocks
		try {
			newHero = new Hero("Superman", specialMoves, -2, false);
			
		} catch (InvalidHealthException e) {
			// TODO Auto-generated catch block
			System.out.println("Creation failed try again");
			return false;
		} finally {
			//usually where clean up goes
			System.out.println("Tried to make a hero could've failed");
		}
		// try with resources - to read on 
		return true;
	}
}
