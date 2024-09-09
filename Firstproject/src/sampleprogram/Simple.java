package sampleprogram;

public class Simple {

	public static void main(String[]args) {
		
		StringBuffer con = new StringBuffer("santhosh");
		StringBuffer sub = new StringBuffer("sathosh");
		StringBuffer name = new StringBuffer("sdfthosh");
		StringBuffer del = new StringBuffer("santhoshhhhh");
		StringBuffer rev = new StringBuffer("hsohtnas");
				
		        con.append(" judah");
		
		        sub.insert(2,"n");
		
	            name.replace(1, 3, "an");
		
		        del.delete(8,12);
		        
		        rev.reverse();
		        
		        System.out.println(con);
				System.out.println(sub);
				System.out.println(name);
				System.out.println(del);
				System.out.println(rev);
}
	
}
