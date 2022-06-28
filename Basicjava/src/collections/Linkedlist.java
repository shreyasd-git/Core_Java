package collections;

import java.util.LinkedList;;

public class Linkedlist {
	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();

		// adding elements in linked list
		list.add("44");
		System.out.println(list);

		list.add("A");
		System.out.println(list);

		list.addLast("D");
		System.out.println(list);

		list.addFirst("B");
		System.out.println(list);

		list.add(2, "22");
		System.out.println(list);

		
		 //remove elements in linked list list.remove("44"); System.out.println(list);
		 list.remove("A"); System.out.println(list);
		  
		 list.removeLast(); System.out.println(list);
		  
		 list.removeFirst(); System.out.println(list);
		  
		 list.remove(0); System.out.println(list);
		 
	}

}
