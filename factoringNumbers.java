import java.util.ArrayList;
import java.util.Scanner;

public class factoringNumbers {
	/**
	 * @Scanner reads input from console
	 * @counter starts at 2 and increments until it reaches the number specified by user
	 * @number is the number the user inputs
	 * @getList stores all prime numbers 
	 */
	
	//class variables 
	private Scanner input;
	private int counter;
	private int number;
	ArrayList<Integer> getList = new ArrayList<Integer>();
	
	/**
	 * Constructor reads input and checks if it is greater than 1
	 * Input is stored as number 
	 */

	//constructor
	public factoringNumbers() {
		input = new Scanner(System.in);
		System.out.print("Enter a positive integer greater than 1: ");
		number = input.nextInt();
		
		if(number < 0) {
			return;
		}
	}
	
	/**
	 * @pNum checks if number is prime 
	 * If pNum is prime then it is added to the list and printed out in console
	 * The for loop prints every prime number in the list in the same line 
	 * @counter starts at 2 and increments by 1 in for loop 
	 * If @counter is a prime number then it is added to getList 
	 * @number is number divided by counter 
	 * @number is checked if it is prime through recursion 
	 */
	
	//Factors number and prints out prime numbers to console 
	public void checkForPrime() {
		detectPrimeNumber pNum = new detectPrimeNumber(number);
		if(pNum.checkNumber() == true) {
			getList.add(number);
			//System.out.println(number);
			for(int i = 0; i < getList.size(); i++) {
				System.out.print(getList.get(i) + " ");
				}
			return;
		} else {
			for(counter = 2; counter <= number/2; counter++) {
				if(number % counter == 0) {
					getList.add(counter);
					number = number/counter;
					checkForPrime();
				}
			}
		}
		
		
	}

}
