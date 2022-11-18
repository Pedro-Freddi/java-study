package com.java.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues {

	public static void main(String[] args) {
		
		Queue<String> pqueue = new PriorityQueue<String>();
			
		// Add elements to the queue
		// A queue is a First-In-First-Out data structure
		pqueue.add("First");
		pqueue.add("Second");
		pqueue.add("Third");
		pqueue.add("Fourth");
		
		System.out.println(pqueue.poll());
		
		pqueue.remove("Third");
		
		System.out.println(pqueue);
		
	}

}
