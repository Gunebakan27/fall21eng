package day30collections;

import java.util.LinkedList;

public class LinkedList01 {

	public static void main(String[] args) {

		LinkedList<String>ll1=new LinkedList<>();
		ll1.add("Ali");
		ll1.add("Can");
		ll1.add("Mark");
		ll1.add("Tom");
		
		//How to print LinkedList
		System.out.println(ll1);
		
		//How to get first element
		String firstElement=ll1.element(); //returns the first element without removing
		System.out.println(firstElement);
		System.out.println(ll1);
		
		String firstElementRemoved=ll1.poll();//returns the first element after removing
		System.out.println(firstElementRemoved);
		System.out.println(ll1);
		
		String firstElement1=ll1.getFirst();
		System.out.println(firstElement1);//Can
		System.out.println(ll1);
		
		String firstElement2=ll1.peek();//returns the first element without removing
		System.out.println(firstElement2);
		
		
		//How to get first element from an empty Linked List
		LinkedList<String>ll2=new LinkedList<>();
//		String firstElFromEmptyLinkedList=ll2.element();//throws NoSuchElementException for the empty linked list
//		System.out.println(firstElFromEmptyLinkedList);
		
		String firstElFromEmptyLinkedList1=ll2.peek();//returns null for empty linked list
		System.out.println(firstElFromEmptyLinkedList1);
		
		String firstElFromEmptyLinkedList2=ll2.poll();//returns null for empty linked list
		System.out.println(firstElFromEmptyLinkedList2);
		
//		String firstElFromEmptyLinkedList3=ll2.getFirst();//throws NoSuchElementException for the empty linked list
//		System.out.println(firstElFromEmptyLinkedList3);
		
		//How to remove elements form a LinkedList
		
		LinkedList<Integer>ll3=new LinkedList<>();
		ll3.add(0, 12);//When you use add(index, element) method make the indexes in ascending order
		ll3.add(1, 13);
		ll3.add(2, 10);
		ll3.add(3, 11);
	
		System.out.println(ll3);
		
		Integer first1=ll3.remove();//removes first element
		System.out.println(first1);
		System.out.println(ll3);
		
		int first2=ll3.remove(2);
		System.out.println(first2);
		System.out.println(ll3);
		
		ll3.add(13);
		ll3.add(10);
		ll3.add(13);
		System.out.println(ll3);
		
		ll3.removeFirstOccurrence(13);
		System.out.println(ll3);
		
		ll3.removeLastOccurrence(10);
		System.out.println(ll3);
		
		ll3.add(12);
		ll3.add(9);
		ll3.add(8);
		ll3.add(3);
		
		System.out.println(ll3);
		
		LinkedList<Integer> ll4=new LinkedList<>();
		ll4.add(3);
		ll4.add(12);
		ll4.add(13);
		System.out.println(ll4);
		
		ll3.removeAll(ll4);
		System.out.println(ll3);
		
		//How to insert elements into a LinkedList
		
		ll4.addAll(ll4);
		System.out.println(ll4);
		
		ll4.addAll(1, ll3);
		System.out.println(ll4);
		
		ll4.addFirst(100);
		System.out.println(ll4);
		
		ll4.addLast(900);//same as add()
		System.out.println(ll4);
		
		//How to update a specific node
		ll4.set(6, 200);
		System.out.println(ll4);
		
		System.out.println(ll4.subList(3, 6));
		System.out.println(ll4);
		
		
		 
	}
	

}
