package sampleprogram;
import java.util.ArrayList;

public class Arraylist {

	public static void main(String[]args) {
		
		ArrayList <String> color = new ArrayList <String>();
		
		color.add("black");
		color.add("blue");
		color.add("white");
		color.addFirst("yellow");
		color.addLast("grey");
		color.removeFirst();
		color.removeLast();
		System.out.println(color);
		System.out.println(color.getFirst());
		System.out.println(color.getLast());

	
		
//		color. add("black");
//		color. add("blue");
//		color. add("green");
//		color. add("yellow");
//		color. add("white");
//		color.set(2,"grey");
//		color.remove(0);
//		System.out.println(color);
//		System.out.println(color.get(1));
		

		}
	}