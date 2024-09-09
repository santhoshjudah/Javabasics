package sampleprogram;

public class Sum8 {

	//Swapping numbers without using third variable
	
	public static void main(String[]args) {
		int a,b;
		
		a=2;
		b=3;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a);
		System.out.println(b);
	}
}
