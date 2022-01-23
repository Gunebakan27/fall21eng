package day33maps;

import java.util.HashMap;

public class HashMap03 {
	
	public static void main(String[] args) {
		//How HashMaps work in Java
		HashMap<String, Integer>hm1=new HashMap<>();
		
		hm1.put("abc", 5);//produce HashCode for the key(ex. 11121113) HashCode are large numbers. Beacuse of that
							// Java does not use HashCodes as indexes. Java will divide HashCode value by 16 and will use the remainder as index.
							//If the remainder is 7 for example. Java will use the bucket at index 7. Inside the buckets we have LinkedList.
							//inside the LinkedList we have nodes, inside the nodes we have 4 things.  i)HashCode ii)Key iii)Value iv)Pointer
							//In a bucket you can have multiple "nodes" If you have a single node, pointer will point "null". Otherwise it will point the next node.
		System.out.println(hm1.hashCode());
		System.out.println("abc".hashCode());
		
		
		hm1.put(null, 12); //If the key is "null", then Java will put the entry into the first bucket whose index is zero.
//If the full buckets are more than %75, Java doubles the capacity. Deafult capacity is 16. When you complete 13 buckets it is being more than %75
//So when you use 13 buckets, it means Java will create 16 more buckets..

//Normally Java creates unique HashCodes but sometimes hascodes can be same. This is called HashMap Collusion.
		//Java create HashCode for every objects.
		System.out.println("FB".hashCode());
		System.out.println("Ea".hashCode());
		
		
	}

}
