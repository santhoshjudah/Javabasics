package sampleprogram;

public class Son extends Father{
	
	public void stutdentName() {
		System.out.println("santhosh");
	}
	
	public void stutdentAge() {
		System.out.println("21");
	}
	
	public static void main(String[]args) {
		Son obj = new Son (); //creating object
		obj.stutdentName();
		obj.stutdentAge();
		obj.studentsubject();
		obj.stutdentSection();
		obj.GrandfatherName();
		obj.Grandfatherage();
	}

}
