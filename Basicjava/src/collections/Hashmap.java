package collections;

import java.util.HashMap;

public class Hashmap {
	public static void main(String[] args) {
		
		HashMap<String, String> hashmap = new HashMap<String, String>();
		
		hashmap.put("Shreyas", "Devops");
		hashmap.put("Alex", "CI/CD");
		hashmap.put("Jason", "Manager");
		
		System.out.println(hashmap);
		
		if (hashmap.containsKey("Alex")){
			String s = hashmap.get("Alex");
			System.out.println("value for key" + " \"Alex\" is: " +s);
		}

		System.out.println("");
		
		for(String i : hashmap.keySet()) {
			System.out.println("key: " +i+ ", value: " + hashmap.get(i));
		}
		
		//HashMaps are faster than Treemap, allows only one null 'key', returns non-ordered-elements,
		//only unique keys allowed.
		
	}

}
