
public class Driver {
//Class scope
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new keyword allocates space
		Hero newHero = new Hero("Flash", "fast Boy", 100, true);
		System.out.println(newHero);
		Hero newHero2 = new Hero("Flash", "fast Boy", 100, true);
		System.out.println(newHero.equals(newHero2));
		System.out.println(newHero.hashCode() == newHero2.hashCode());
	}

}
