package sampleprogram;

public class Sum10 {
	
	// check palindrome number
	
	public static void main(String[]args) {
		
		int a,n = 141, b = 0, c = 0;
		a=n;
		while(a>0) {
			b = a % 10;
			c = (c*10) + b;
			a = a / 10;
		}
		System.out.println(c);
		
		if (c==n) {
			System.out.println("its a palindrome");
		} else {
			System.out.println("its not a palindrome");
		}
		
	}

}
