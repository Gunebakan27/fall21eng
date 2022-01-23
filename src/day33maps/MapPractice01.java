package day33maps;

import java.util.HashMap;
import java.util.Map.Entry;


/*
 * Type code to print non-repeated elements from an Array
 * String s[]={"A", "Z","A","K","T","K"};
 * 
 */
public class MapPractice01 {

	public static void main(String[] args) {
		String s[]={"A", "Z","A","K","T","K"};
		
		HashMap<String, Integer>hm1=new HashMap<>();
		
		for (String w : s) {
			Integer numOfOccurences=hm1.get(w);
			
			if (numOfOccurences==null) {
				hm1.put(w,1);
			}else {
				hm1.put(w, numOfOccurences+1);
			}
		}
		System.out.println(hm1);
		
		for (Entry<String, Integer> w:hm1.entrySet()) {
			if(w.getValue()==1) {
				System.out.println(w.getKey());
			}
		}
	}

}
