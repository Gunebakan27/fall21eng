package day33maps;

import java.util.Hashtable;

/*
 * 1)HashTable is a Map
 * 2)HashTable is thread-safe and synchronized
 * 3)HashTable does not accept "null" in key and in value.
 * 4)HashTable does not put the element in any order.
 * 5)HashTable is slower than HashMap
 * 
 * 
 * 1)There are 16 buckets as default when you create a HashMap
    2)Buckets use indexes from 0 to 15
    3)Every bucket has LinkedList
    4)When we use put() method, Java creates a HashCode(integer) of the key to access the entry faster
    5)But the HashCode will be greater than 15 what can Java do?
    	i)Can increase the index
    	ii)Can convert the HashCode value to the base 16
    	Java will do the second because the first uses memory too much.
    6)LinkedList in every bucket stores 4 data
    	i)HashCode (Inside the first part)
    	ii)Key (Inside the second part)
    	iii)Value (Inside the third part)
    	iv)Pointer(Next) (Inside the fourth part) (If there is no any node pointer will point null)
    7)What if same HashCode created from different keys
    	In a HashMap, if two or more Keys have the same hash code then
    	the situation is referred to as Hash Collision.
    	Hash Collisions are a common phenomena of hashing functions.
    	A good design of the hashing function may reduce the occurences of same hash code
    	for different Keys but it cannot be avoided alltogether.  	
    8)If the key is null it will use index 0
 * 
 */
public class HashTable01 {

	public static void main(String[] args) {

		Hashtable<String, Integer>ht1=new Hashtable<>();
		ht1.put("Ali", 3000);
		ht1.put("Tom", 500);
		ht1.put("Alexandra", 12000);
		ht1.put("Angelina", 5000);
		ht1.put("Mark", 23000);
		
//		ht1.put(null, 5000);//If you use "null" as key in HashTable, it throws NullPointerException
//		ht1.put("Veli", null);//If you use "null" as value in HashTable, it throws NullPointerException
		System.out.println(ht1);
		
		System.out.println(ht1.containsKey("Ali"));//true
		System.out.println(ht1.containsKey("Aliye"));//False
		
		System.out.println(ht1.containsValue(3000));//true
		System.out.println(ht1.containsValue(3333));//false
		
		System.out.println(ht1.contains(3000));//contains() is same with the containsValue() but prefer to use containsValue() 
		
		Hashtable<String, Integer>ht2=new Hashtable<>();
		ht2.put("Ali", 3000);
		ht2.put("Tom", 500);
		ht2.put("Alexandra", 12000);
		ht2.put("Angelina", 5000);
		ht2.put("Mark", 23000);
		
		System.out.println(ht1);
		System.out.println(ht2);
		
		System.out.println(ht1.equals(ht2));//It doesnot check the order of the elements. It checks only the number of entries and the entries
		
		//isEmpty better to use
		System.out.println(ht1.size()==0);//false
		System.out.println(ht1.isEmpty());//false
		
		
		
		

	}

}
