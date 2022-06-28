package git.shreyas.streams;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.print.DocFlavor.STRING;

import collections.Hashset;

public class Streamsdemo {
	
	public static void main(String[]  args) {
		
		List<Integer> numberlist = new ArrayList<Integer>();
		
		numberlist.add(10);
		numberlist.add(30);
		numberlist.add(40);
		numberlist.add(20);
		
		//List Collection without stream() api
//		List<Integer> squarelist = new ArrayList<Integer>();
//		for(Integer i : numberlist) {
//			squarelist.add(i*i);
//		}
		
		//using stream()  
		//convert list to stream (one element at a time)>>map() - to apply function 
		//on each element of stream >> then using collect() to repackage the stream elements, 
		//eg:- tolist() in this case
		List<Integer> squarelist = numberlist.stream().map(x -> x*x).collect(Collectors.toList());
		System.out.println("List of Squared numbers is: " + squarelist);
		
		
		
		//Set Collection without stream()
//		Set<Integer> squareset = new HashSet<Integer>();
//		for(Integer i : numberlist) {
//			squareset.add(i);
//		}
		
		//using stream()
		Set<Integer> squareset = numberlist.stream().map(x -> x*x).collect(Collectors.toSet());
		System.out.println("Set of Square numbers is: " + squareset);
		
		
		
		//filter >> for string with "s"
		List<String> languagelist = new ArrayList<String>();
		languagelist.add("shell");
		languagelist.add("java");
		languagelist.add("python");
		
//		List<String> filteredlist = new ArrayList<String>();
//		for(String x : languagelist) {
//			if(x.startsWith("j")) {
//				filteredlist.add(x);
//			}
//		}
		
		List<String> filteredlist = languagelist.stream().filter(x -> x.startsWith("s")).
				collect(Collectors.toList());
		System.out.println("Filtered list is starting with 's': " + filteredlist);
		
		//sort() in stream
		List<String> sortedlist = languagelist.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted list is: " + sortedlist);
		
		
		//foreach()
		System.out.println("Printing list using foreach >>");
		languagelist.stream().forEach(a -> System.out.println(a + " Programming"));
		
		
		//reduce() in stream
		int sum = numberlist.stream().reduce(0, (result,i) -> result+i);
		//String sum = languagelist.stream().reduce("", (result,i) -> result+i);
		System.out.println("Sum of all elements is: " + sum);
		
		
	}

}
