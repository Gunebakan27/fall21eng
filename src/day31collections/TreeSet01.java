package day31collections;

import java.util.HashSet;
import java.util.TreeSet;

/*
 * 1)"TreeSet" is to store unique elements in natural order(ascending or alphabetic order)
 * 2)"TreeSet" does not accept "null" element.
 * 3)In terms of speed: TreeSet(slow) < LinkedHash < HashSet(fast)
 * 
 */
public class TreeSet01 {

	public static void main(String[] args) {
		
		TreeSet<Integer>ts1=new TreeSet<>();
		ts1.add(12);
		ts1.add(3);
		ts1.add(7);
		ts1.add(5);
		ts1.add(2);
		
		
		long t1=System.nanoTime();	
		System.out.println(ts1);
//		ts1.add(null);//it throws NullPointerException
		
//		How to store unique elements in natural order?  (TreeSet)
//		TreeSet is too slow, how can you ake the code run faster?(first add HashSet than convert in TreeSet)
		
		HashSet<String>hs1=new HashSet<>();
		hs1.add("A");
		hs1.add("K");
		hs1.add("D");
		hs1.add("Z");
		hs1.add("O");
		long t2=System.nanoTime();
		System.out.println(hs1);
		
		TreeSet<String>ts2=new TreeSet<>(hs1);
		
//		ts2.addAll(hs1);
		long t3=System.nanoTime();
		System.out.println(ts2);
		
		System.out.println(t2-t1);
		System.out.println(t3-t2);
		
	

	}

}
