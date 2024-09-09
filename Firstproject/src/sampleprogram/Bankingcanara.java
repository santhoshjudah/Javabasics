package sampleprogram;

public class Bankingcanara implements Banking {

	public void saving() {
		System.out.println("saving");
		}
	public void current() {
		System.out.println("current");
	}
	public void salary() {
		System.out.println("salary");
	}


 public static void main (String[]args) {
	 Bankingcanara obj = new Bankingcanara();
	 obj.saving();
	 obj.current();
	 obj.salary();
 
 }
}
