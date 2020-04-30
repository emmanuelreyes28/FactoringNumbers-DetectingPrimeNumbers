//Tester Class

public class detectPrimeNumberTesterClass {
	public static void main (String[] args) {
		detectPrimeNumber test = new detectPrimeNumber(0);
		System.out.println("0 is a prime number.");
		System.out.println(test.checkNumber());
		
		detectPrimeNumber test2 = new detectPrimeNumber(1);
		System.out.println("1 is a prime number.");
		System.out.println(test2.checkNumber());
		
		detectPrimeNumber test3 = new detectPrimeNumber(-4);
		System.out.println("-4 is a prime number.");
		System.out.println(test3.checkNumber());
		
		detectPrimeNumber test4 = new detectPrimeNumber(4);
		System.out.println("4 is a prime number.");
		System.out.println(test4.checkNumber());
		
		detectPrimeNumber test5 = new detectPrimeNumber(3);
		System.out.println("3 is a prime number.");
		System.out.println(test5.checkNumber());
		
		detectPrimeNumber test6 = new detectPrimeNumber(5);
		System.out.println("5 is a prime number.");
		System.out.println(test6.checkNumber());
		
		detectPrimeNumber test7 = new detectPrimeNumber(11);
		System.out.println("11 is a prime number.");
		System.out.println(test7.checkNumber());
		
		detectPrimeNumber test8 = new detectPrimeNumber(2);
		System.out.println("2 is a prime number.");
		System.out.println(test8.checkNumber());

	}

}
