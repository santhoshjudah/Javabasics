package sampleprogram;

public class Sum1 {
	
	//sum of odd numbers(1 to 100)
	
	public static void main(String[]args) {
		
		int value = 0;
		
		for(int i =1; i<=100;i++) {
			if(i % 2 == 1) {
			value = value + i;
			}	
		}
		System.out.println(value);
	}

}

