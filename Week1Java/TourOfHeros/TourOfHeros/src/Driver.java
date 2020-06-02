import com.revature.tourofheroes.models.Hero;

public class Driver {
//Class scope
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new keyword allocates space
		String[] specialMoves = {"heat vision", "light", "invulnerability"};
		String[] specialMoves2 = {"flying"};
		
		Hero newHero;
		//order matters in catch blocks
		try {
			newHero = new Hero("Superman", specialMoves, -2, false);
			String[] specialMove3 = newHero.getSpecialMove();
			System.out.println(specialMove3[3]);
			System.out.println(newHero);
		} catch (ArrayIndexOutOfBoundsException ex) {
			//logic here
			ex.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//usually where clean up goes
			System.out.println("Tried to make a hero could've failed");
		}
		// try with resources - to read on 
		Hero newHero2 = new Hero("Falcon", specialMoves2);
		
		
		System.out.println(newHero2);
	}

}
