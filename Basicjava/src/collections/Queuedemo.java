package collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queuedemo {
	public static void main(String[] args){
		
		Queue<String> queue = new PriorityQueue<String>();
		
		//add remove peek poll
		queue.add("Dale");
		queue.add("Jason");
		queue.add("Johnny");	
		System.out.println("Original Queue" + queue);
		
		queue.remove();  //removes the first inserted element
		System.out.println("Queue after remove(): " + queue);
		
		String head = queue.peek();  //returns head, first element in queue
		System.out.println("Peek at first element: " + head);
		
		head = queue.poll();  //returns and deletes the first element that is deleted
		System.out.println("poll method returms deleted element: " + head);
		
	}

}
