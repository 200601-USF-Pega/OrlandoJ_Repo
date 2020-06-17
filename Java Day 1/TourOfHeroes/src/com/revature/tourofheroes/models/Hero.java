package com.revature.tourofheroes.models;
import java.util.Arrays;
import com.revature.tourofheroes.exceptions.InvalidHealthLevelException;


//POJO- Plain Old Java Object
public class Hero {
	// attributes or fields
	private String name;
	private String[] specialMove;
	private int healthLevel;
	private boolean isAlive;

	// constructor
	//no args constructor
	public Hero() {

	}
	//parameterized constructor
	public Hero(String name, String[] specialMove) {
		super();
		this.name = name;
		this.specialMove = specialMove;
	}
	//sets healthLevel and isAlive and calls constructor above to set other 2
	public Hero(String name, String[] specialMove, int healthLevel, boolean isAlive) {
		this(name, specialMove);	//calls constructor of this class
		try {
			this.setHealthLevel(healthLevel);
		} catch (IllegalArgumentException e) {
			System.out.println(e);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//clean up stuff
			System.out.println("Tried to make a hero could have failed");
		}
		this.isAlive = isAlive;
	}
	
	public String getName() {
		// add logic on data that will be returned to user
		return name;
	}
	public void setName(String name) {
		// add some validation/login in processing data per instance
		if (name.isEmpty()) {
			throw new IllegalArgumentException("String should not be empty");
		}
		this.name = name;
	}
	public String[] getSpecialMove() {
		return specialMove;
	}
	public void setSpecialMove(String[] specialMove) {
		this.specialMove = specialMove;
	}
	public int getHealthLevel() {
		return healthLevel;
	}
	public void setHealthLevel(int healthLevel) throws InvalidHealthLevelException {
		if (healthLevel < 0) {
			throw new InvalidHealthLevelException("Health level should not be negative");
		} else {
			this.healthLevel = healthLevel;
		}
	}
	public boolean isAlive() {
		return isAlive;
	}
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + healthLevel;
		result = prime * result + (isAlive ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Arrays.hashCode(specialMove);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hero other = (Hero) obj;
		if (isAlive != other.isAlive)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Hero [name=" + name + ", specialMove=" + Arrays.toString(specialMove) 
			+ ", healthLevel=" + healthLevel + ", isAlive=" + isAlive + "]";
	}
}
	
	