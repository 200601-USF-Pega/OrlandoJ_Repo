
public class Driver {
	//public is an access modifier, this method could be accessed by anyone anywhere in your program
	//static means that this method belongs to the class, you don't need an object to call this method
	//void no return statement required, return type, doesn't return anything
	//main is the method name
	//Takes in string array of arguments
	public static void main (String[] args) {
		String welcomeMessage = "Hello world!";
		System.out.println(welcomeMessage);
		int i = 0;
		//System.out.println(++i);
		i = 0;
		//System.out.println(i++);
		//System.out.println(i);
		
		//System.out.println(welcomeMessage.charAt(i));
		int x = (i == 0) ? 1:2; 
		//System.out.println(x);
		// If blocks, switch statements
		// use this to test conditions
		// if else if - order matters, 
		//menu example
		String input = "1";
		switch(input) {
		case "0":
			//do something
			break;
		case "1":
			//do something else
			break;
		default:
				//this is your catch all
				//runs when no cases match
			break;
		}
		//while (boolean condition){}
		//do{} while(boolean condition)
		//for (int i = 0; i < someValue; i++)
		String[] array = {"a", "b", "c"};
		for(String j : array) {
			System.out.println(j);
		}
	}
}

