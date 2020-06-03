package com.revature.tourofheroes.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import com.revature.tourofheroes.models.Hero;

public class HeroRepoFile implements IHeroRepo {
	private String filepath= "src/resources/Hero.txt";
	@Override
	public Hero addHero(Hero hero) {
		// TODO Auto-generated method stub
		try {
			ObjectOutputStream objectOutputStream = 
					new ObjectOutputStream(new FileOutputStream(filepath));
			objectOutputStream.writeObject(hero);
			objectOutputStream.close();
			return hero;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	//finish this method
	@Override
	public List<Hero> getAllHeros() {
		// TODO Auto-generated method stub
		try {
			ObjectInputStream inputStream = 
					new ObjectInputStream(new FileInputStream(filepath));
			Hero hero;
			hero = (Hero) inputStream.readObject();
			inputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			//Just in class Hero class is not found
			e.printStackTrace();
		}
		return null;
	}

}
