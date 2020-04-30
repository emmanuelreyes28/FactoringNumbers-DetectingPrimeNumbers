import java.util.ArrayList;
import java.util.Scanner;

public class listPrimeNumbers {
	/**
	 * @Scanner reads input from console 
	 */
	//class variable 
	private Scanner input;
	
	/**
	 * Prompts user to enter a positive integer 
	 * Checks if number is less than 0 
	 * primeNums stores all prime numbers in a list of integers 
	 * variable int i acts as a counter 
	 * Starting from 0, variable i is incremented while it is less than or equal 
	 * to number (user input) and checked if it is prime 
	 * If it is prime then it is added to the list of primeNums
	 * List of primeNums is then printed in console  
	 */
	
	//checks if number is prime then adds it to list of prime numbers 
	//list of prime numbers is printed in console 
	public listPrimeNumbers() {
		input = new Scanner(System.in);
		System.out.print("Enter a postive integer: ");
		int number = input.nextInt();
		
		if(number < 0) {
			return;
		}
		
		int i = 0;
		ArrayList<Integer> primeNums = new ArrayList<Integer>();
		while(i <= number) {
			detectPrimeNumber temp = new detectPrimeNumber(i);
			if(temp.checkNumber() == true) {
				primeNums.add(i);
				i++;
			}else {
				i++;
			}
		} System.out.println(primeNums);
	}
	
}
