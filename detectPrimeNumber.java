
public class detectPrimeNumber {
	/**
	 * @num is the number being checked if it is prime 
	 */
	//class variable 
	private int num;
	
	/**
	 * @param number is initiated in constructor
	 */
	//constructor
	public detectPrimeNumber(int number) {
		num = number; 
		//this.number = number; //instantiates variable 
	}
	/**
	 * Check if num is less than or equal to 1 - not prime numbers 
	 * @return false if num is not prime 
	 * @return true if num is prime 
	 */
	//checks if num is prime and prints to console 
	public boolean checkNumber() {
		int i;
		if(num <=1) {
			//System.out.println(num + " is not prime.");
			return false;
		} for(i = 2; i <= num/2; i++) {
			if(num%i == 0) {
				//System.out.println(num + " is not prime.");
				return false; 
			}
		} //System.out.println(num +" is prime."); 
		return true;
		
	}
	




}
