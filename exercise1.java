
public class exercise1 {
	public static void main (String[] args) {
		int i = 0;
		while (i<21) {
			System.out.println(++i);
			i += 2;
		}
		
		System.out.println(" ");
		
		for (int b = 0; b<21; b+=2) {
			System.out.println(b++);
		}
		
		System.out.println(" ");
		
		int k = 30;
		for(int a = 0; a < k; a += 2) {
			k++;
			System.out.println(a);
			System.out.println(++a > k);
		}
		
		System.out.println(" ");
		
		int c = 1;
		while(c <= 101) {
			int j = c+++2;
			System.out.println(c+=++c*2+j);
		}
	}

}
