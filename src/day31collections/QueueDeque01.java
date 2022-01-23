package day31collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDeque01 {

	public static void main(String[] args) {

		//FIFO
		//has insertion order
		Queue<String>q1=new LinkedList<>();
		System.out.println(q1.offer("a"));
		System.out.println(q1);
		
		
		
		//has natural order or Java creates the order.
		Queue<String>q2=new PriorityQueue<>();
	
		//FIFO+LIFO
		Deque<String>d1=new LinkedList<>();
		d1.addFirst("A");
		d1.addFirst("B");
		d1.addFirst("C");
		d1.addLast("D");
		System.out.println(d1);
		
		
	}

}
