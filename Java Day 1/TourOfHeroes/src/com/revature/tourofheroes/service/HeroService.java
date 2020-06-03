package com.revature.tourofheroes.service;

import com.revature.tourofheroes.models.Hero;

public class HeroService {
	public boolean createHero(String heroName, String[] specialMoves, int healthLevel, boolean isAlive) {
		//add validation
		
		Hero newHero = new Hero(heroName, specialMoves, healthLevel, isAlive);
		System.out.println(newHero);		
		return true;
	}
}
