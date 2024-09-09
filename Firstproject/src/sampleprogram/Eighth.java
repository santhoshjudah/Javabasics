package sampleprogram;

//import java.util.HashMap;
import java.util.HashSet;

public class Eighth {
	
	public static void main(String[]args) {
		
//		HashMap<String,String> country = new HashMap<String,String>();
//		country.put("1","india");
//		country.put("2","london");
//		country.put("3","tokyo");
//		country.remove("3");
//		country.replace("2","london","paris");
//		System.out.println(country);
//		System.out.println(country.get("2"));
		
		
		HashSet<String> country = new HashSet<String>();
		country.add("uk");
		country.add("canada");
		country.add("india");
		country.add("san");
		System.out.println(country.contains("india"));
		System.out.println(country.contains("sann"));
	}
	
}
