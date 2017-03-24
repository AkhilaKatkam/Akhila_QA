package Collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<String>();
		a.add("JAVA");
		a.add("C#");
		a.add("Linux");
		System.out.println(a);
		
		System.out.println(a.get(1));
		a.remove(1);
		System.out.println(a);
		
		System.out.println(a.size());
		
		a.add(1,"sai");
		
		System.out.println(a);
		System.out.println(a.contains("sai"));
		
		
	}

}