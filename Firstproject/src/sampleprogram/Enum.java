package sampleprogram;

public class Enum {
	
	
	enum level{
		easy,
		medium,
		hard
	}
	
	public static void main(String[]args) {
		
	level easiest = level.easy;
	level medium = level.medium;
	level harder = level.hard;
	
	System.out.println(easiest);
	System.out.println(medium);
	System.out.println(harder);
	}
	

}
