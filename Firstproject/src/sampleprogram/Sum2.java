package sampleprogram;

public class Sum2 {
	
	//sum of even numbers(1 to 100)
	
	public static void main(String[]args) {
		
		int count = 0;
		for(int a = 1; a<=100;a++) {
			if(a % 2 ==0) {
				count = count + a;
				System.out.println(a);
			}
		}
		System.out.println(count);
	}

}
