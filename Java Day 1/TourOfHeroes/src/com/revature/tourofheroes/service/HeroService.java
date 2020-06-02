package com.revature.tourofheroes.service;

import com.revature.tourofheroes.models.Hero;

public class HeroService {
	public boolean createHero() {
		Hero newHero = new Hero("Flash", new String[]{"Fast boy", "Spinny arms", "time travel"}, 100, true);
		System.out.println(newHero);
		
		//test healthLevel exception
		Hero newHero4 = new Hero("Flash", new String[]{"Fast boy", "Spinny arms"}, -50, false);
		System.out.println(newHero4);
		return true;
	}
}
