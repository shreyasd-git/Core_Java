package collections;

import java.util.TreeMap;

public class Treemap {
	public static void main(String[] args) {
		
		TreeMap<String, Integer> treemap = new TreeMap<String, Integer>();
		
		treemap.put("B", 4);
		treemap.put("A", 2);
		treemap.put("B", 1);
		treemap.put("C", 3);
		
		System.out.println(treemap);  // o/p is sequenced based on type of key, 
									  // only unique keys allowed.
		
	}

}
