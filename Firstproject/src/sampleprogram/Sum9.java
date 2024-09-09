package sampleprogram;

public class Sum9 {

	//Reverse the number
	
	public static void main(String[]args) {
		
		int a = 12345, i = 0,j = 0;
		
		while(a>0) {
			i = a % 10;
			j = (j * 10) + i;
			a = a/10;
		}
		System.out.println(j);
		
	}

}
