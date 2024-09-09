package sampleprogram;

public class Daughter extends Father {

public void DaughterName(){
	System.out.println("joys");
}

  public void DaughterAge() {
	System.out.println("17");
}

  public static void main(String[]args) {
	Daughter obj = new Daughter();	
	obj.DaughterAge();
	obj.DaughterName();
	obj.studentsubject();
	obj.stutdentSection();
	
}

}

