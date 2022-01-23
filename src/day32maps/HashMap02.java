package day32maps;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap02 {
	//Print all entries of the hashmap hm1 = { Ali=3, Veli=5, Can=7 } on the console in different lines

	public static void main(String[] args) {
		
		HashMap<String,Integer> hm1 = new HashMap<>();
		hm1.put("Ali", 3);
		hm1.put("Veli", 5);
		hm1.put("Can", 7);
		System.out.println(hm1);//{Can=7, Veli=5, Ali=3}
		
		Set<Entry<String,Integer>  > setOfEntries=  hm1.entrySet(); 
		System.out.println(setOfEntries);//[Can=7, Veli=5, Ali=3]
		
		for(Entry<String,Integer> w : setOfEntries) {
			System.out.println(w);
		}
	}

}