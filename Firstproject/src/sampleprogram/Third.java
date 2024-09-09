package sampleprogram;

public class Third {
	
	public void studentDetails(String Name) {
		System.out.println(Name);
	}
	
	public void studentDetails(int Age) {
		System.out.println(Age);
	}
	
	public void studentDetails(char Initial) {
		System.out.println(Initial);
	}
	
	public static void main(String[]args) {
		Third obj = new Third();
		obj.studentDetails("santhosh");
		obj.studentDetails(21);
		obj.studentDetails('S');
	}
	
}
