package sampleprogram;

public class Tenth {
	
	
	public static int addition(int a , int b) {
		return a + b ;
	}
	
	public static int subtraction(int a , int b) {
		return a - b ;
	}
	
	public static int multiple(int a , int b) {
		return a * b ;
	}
	
	public static int divide(int a , int b) {
		return a / b ;
	}
	
	public static void main(String[]args) {
		
		int ad = addition(2,2);
		int sub = subtraction(6,3);
		int mul = multiple(2,4);
		int div = divide(10,2);
		
		System.out.println(ad);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);

	}

}
