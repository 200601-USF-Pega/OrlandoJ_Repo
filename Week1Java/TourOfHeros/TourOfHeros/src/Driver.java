
public class Driver {
//Class scope
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new keyword allocates space
		String[] specialMoves = {"heat vision", "light", "invulnerability"};
		String[] specialMoves2 = {"flying"};
		
		Hero newHero = new Hero("Superman", specialMoves);
		Hero newHero2 = new Hero("Falcon", specialMoves2);
		
		System.out.println(newHero);
		System.out.println(newHero2);
	}

}
