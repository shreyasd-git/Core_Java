package collections;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
	public static void main(String[] args) {
		//Declaring ArrayList
		List<Integer> arraylist = new ArrayList<Integer>(5);
		
		for(int i = 0; i<5; i++)
		{
			arraylist.add(i); //adding items to arrayList
		}
		
		//Print the ArrayList
		System.out.println(arraylist);
		
		//Remove element at any index
		arraylist.remove(4);
		
		//Print ArrayList after deletion
		System.out.println(arraylist);
		
		/*
		 * //iterate over array elements and print one by one for(int i=0;
		 * i<arraylist.size(); i++) { System.out.print(i +" "); }
		 */
		
		//using enhanced for loop
		for(int i : arraylist)
		{
			System.out.print(i +" ");
		}
		
	}

}
