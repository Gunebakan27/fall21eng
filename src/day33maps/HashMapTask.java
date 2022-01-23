package day33maps;

import java.util.Arrays;
import java.util.HashMap;

/*
 * 			How to count the number of occurences of the words in a sentence
		    For example; “Java is easy. Type codes to learn Java. To earn money learn Java.”
		    Java=3, is=1, easy=1, Type=1, ... , learn=2, ...
 */
public class HashMapTask {

	public static void main(String[] args) {
		String str="Java is easy. Type codes to learn Java. To earn money learn Java.";
		
		//According to Java "Java" and "Java." are different words but in our task they should be same.
		//Because of that I need to remove all punctuation marks.
		
		//"to" and To" are different for java but in my task they should be same.
		str=str.replaceAll("\\p{Punct}", "").toLowerCase() ;
		System.out.println(str);

		String words[]=str.split(" ");
		System.out.println(Arrays.toString(words));
		
		HashMap<String, Integer> result=new HashMap<>();
		for (String w : words) {
			Integer numOfOccurence=result.get(w);
			
			//If the word does not exist in the map "if-body" will be executed.
			if(numOfOccurence==null) {
				result.put(w, 1);
				
			//If the word exist in the "else-body" will be executed.	
			}
			else {
				result.put(w, numOfOccurence+1);
				
			}
		}
		System.out.println(result);
	}

}
