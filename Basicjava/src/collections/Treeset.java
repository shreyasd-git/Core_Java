package collections;

import java.util.Set;
import java.util.TreeSet;

public class Treeset {
	public static void main(String[] args) {
		
		Set<String> treeset = new TreeSet<String>();
		
		treeset.add("D");
		treeset.add("B");
		treeset.add("A");
		treeset.add("C");
		treeset.add("D");
		
		System.out.println(treeset);  //TreeSet will always give elements in ordered sequence,
									  //as above is String-type A-B-C-D order will be followed
		
		
	}

}
