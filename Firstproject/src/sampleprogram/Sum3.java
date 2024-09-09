package sampleprogram;

public class Sum3 {
	
	//count of odd numbers(1 to 100)
	
	public static void main(String[]args) {
		
		int num = 0;
		for(int i = 1;i<= 100;i++) {
			if(i % 2 == 1) {
				num = num +1;
			}
		}
		System.out.println(num);
	}

}
