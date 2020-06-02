
public class Driver {
	public static void main (String[] args) {
		String welcomeMessage = "Hello World";
		System.out.println(welcomeMessage);
		
		int i=0; 
		System.out.println(++i);
		i=0;
		System.out.println(i++);
		
		int x = (i == 0) ? 1:2;
		System.out.println(x);
		
		if (i == 1) {
			System.out.println("i = 1");
		} else if (x == 2) {
			System.out.println("x = 2");
		} else {
			System.out.println("neither");
		}
		
		//menu example
		String input = "1";
		switch(input) {
		case "0":
			System.out.println("case 0");
			break;
		case "1": 
			System.out.println("case 1");
			break;
		default:
			System.out.println("default case");
			//runs when no cases match
		}
		
		//LOOPING OPERATORS
		int count = 0;
		while (count < 3) {
			System.out.println("count is " + count);
			count += 1;
		}
//		do {} while(boolean condition)
//		for (int i=0; i<someValue; i++) {
		
		//for each loop
		int[] array = {1,2,3};
		for(int j : array) {
			System.out.println(j);
		}
	}
}
