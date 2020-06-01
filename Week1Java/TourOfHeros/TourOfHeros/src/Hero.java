//POJO
public class Hero {
	// Instance scope
	//attributes or fields
	//private access modifier, encapsulates my data
	//uses camelCase
	private String name;
	private String specialMove;
	private int healthLevel;
	private boolean isAlive;
	//static variable, then this variable would be class scope
	static {
		System.out.println("Hello World!");
	}
	//constructor
	//no args constructor, no arguments
	public Hero() {
		
	}
	//parameterized with paramters
	public Hero(String name, String specialMove) {
		//calls the parent constructor
		super();
		this.name = name;
		this.specialMove = specialMove;
	}
	
	//method overloading, polymorphism, compile time 
	public Hero(String name, String specialMove, int healthLevel, boolean isAlive) {
		//used in constructor chaining
		this(name, specialMove);
		this.setHealthLevel(healthLevel);
		this.isAlive = isAlive;
	}
	
	public String getName() {
		//add logic on the data that's gonna be returned 
		return name;
	}
	public void setName(String name) {
		// add some validation/ logic in processing data per instance
		this.name = name;
	}
	public String getSpecialMove() {
		return specialMove;
	}
	public void setSpecialMove(String specialMove) {
		this.specialMove = specialMove;
	}
	public int getHealthLevel() {
		return healthLevel;
	}
	public void setHealthLevel(int healthLevel) {
		if (healthLevel < 0) {
			// throw error
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
	//annotation
	// this method overrides another method
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Hero: "+this.name+" Special Move: "
				+ this.specialMove + " Health Level: "
		+this.healthLevel+ " Alive? "+this.isAlive ;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isAlive ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((specialMove == null) ? 0 : specialMove.hashCode());
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
		if (specialMove == null) {
			if (other.specialMove != null)
				return false;
		} else if (!specialMove.equals(other.specialMove))
			return false;
		return true;
	}
	
	

	
}
