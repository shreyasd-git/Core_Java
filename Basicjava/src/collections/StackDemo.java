package collections;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();
		
		stack.push("Plate_1");
		stack.push("Plate_2");
		stack.push("Plate_3");
		System.out.println("Original Stack is: " + stack);
		
		
		//pop() elements from stack - always last inserted element is popped out 
		String i = stack.pop();
		System.out.println("Popped element is: " + i);
		System.out.println("Now stack looks like: " + stack);
		
		//peek() - to view the top most(last inserted) element in stack
		String topelement = stack.peek();
		System.out.println("Top Element is: " + topelement);
		
		
	}

}
