package day29exceptions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {

	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
        li.add("Hai");
        li.add("Hello");
        
        ListIterator i = li.listIterator();
        
        while (i.hasNext()) {
            i.add("Hi"); // Line 1
                }
        System.out.println(li);
    
		
		
		
		List<String>list=new ArrayList<>();//I created an "ArrayList" object in "List" data type
		list.add("Ali");
		list.add("Can");
		list.add("Ali Can");
		
		System.out.println("1."+list);
		
		//By using loops we cannot update lists(collections)
		for(String w:list) {
			w=w+"!!!!";
			
		}System.out.println("2."+list);
		
		
		//loops cannot update collections because of that java created a new structure which "iterator", by using
		//iterator we can do update on collections
		ListIterator<String> listItr= list.listIterator();
		
		while(listItr.hasNext()) {
			String el=listItr.next();
			
			listItr.set(el+"!!!!");
			
		}
		System.out.println("3."+list);
		
		//How to remove all elements from list by using list iterator.
		ListIterator list2Itr= list.listIterator();
		while(list2Itr.hasNext()) {
			list2Itr.next();
			list2Itr.remove();
			
		}
		System.out.println("==>"+list);
		
		
		List<String>list3=new ArrayList<>();
		list3.add("A");
		list3.add("C");
		list3.add("B");
		
		System.out.println(list3);
		//How to print elements one by one in reverse order by using list iterator
		ListIterator<String> itr1=list3.listIterator();
		
		
		System.out.println(list3);
		
		//To move pointer at the end, type the following code.
		while(itr1.hasNext()) {
			itr1.next();
			
		}
		//Get the element from the end
		while(itr1.hasPrevious()) {
//			String el=itr1.previous();
			
			System.out.println(itr1.previous());
		}
		System.out.println();
		//Add X, Y, Z to the end of the list2
		while(itr1.hasNext()) {
			itr1.next();
		}
		itr1.add("X");
		itr1.add("Y");
		itr1.add("Z");
//		list3.add("Y");
//		list3.add("Z");
		System.out.println(list3);
			
		//We have just "Iterator" as well
		/*
		 * 1)When you use "Iterator" you will not have
		 * i)hasPrevious()
		 * ii)previous()
		 * iii9set() methods
		 * 2)ListIterator can be used just with "List"s but "Iterator" can be use with all collections.
		 */
		Iterator itr2=list3.iterator();
		while(itr2.hasNext()) {
			Object el=itr2.next();
			itr2.remove();
		}
		System.out.println("==>"+list3);
	}

}
