import java.util.Random;

public class randomColors {
	/** 
	 * class variables 
	 * max is the number of colors that are printed out to the console
	 * characters is a list of characters that make up the hexadecimal notation 
	 */
	
	//class variables 
	private int max;
	private char[] characters = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	
	/**
	 * no variables initiated in constructor 
	 */
	//constructor
	public randomColors() {
		
	}
	/**
	 * Random is called in order make up hexadecimal notation 
	 * The first for loop makes sure it creates a hundred hexadecimal notations 
	 * The second for loop randomizes the hexadecimal notation which is made up of 6 characters
	 * from the characters list  
	 * Each color is then printed in console 
	 */
	
	//prints 100 hexadecimal notations in console
	public void printColors() {
		max = 100;
		Random r = new Random();
		for(int i = 0; i < max; i++) {
			int counter;
			String color = new String();
			for(counter = 0; counter < 6; counter++) {
				char chars = characters[r.nextInt(16)];
				color += chars ;
			}System.out.println(color);
			
		}
	}
	
	public static void main(String[] args) {
		randomColors test = new randomColors();
		test.printColors();
	}

}

