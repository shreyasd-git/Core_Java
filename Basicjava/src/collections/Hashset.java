package collections;

import java.util.HashSet;
import java.util.Set;

public class Hashset {
	public static void main(String args[]) {
		Set<String> hashset = new HashSet<String>();
		
		hashset.add("A");
		hashset.add("B");
		hashset.add("C");
		hashset.add("C");
		
		System.out.println(hashset);
		
		//to check if an element is present
		System.out.println("Element C present or not? --> Is " + hashset.contains("B"));
		
		for (String i : hashset) {
			System.out.print(i +" ");
		}
		
	}

}
