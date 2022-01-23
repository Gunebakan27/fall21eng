package day33maps;

import java.util.Arrays;
import java.util.HashMap;

/*
 * How to count the number of occurences of the letters(alphabetical characters) in a sentence
		  For example; “Java is easy. Type codes to learn Java. To earn money learn Java.”
		         a=3, i=1, y=1, e=1, ... , n=2, ...
 */
public class HashMap02 {

	public static void main(String[] args) {
		String str="Java is easy. Type codes to learn Java. To earn money learn Java.";

		str=str.replaceAll("[^a-zA-Z]", "").toLowerCase() ;
		
		System.out.println(str);

		String letters[]=str.split("");
		System.out.println(Arrays.toString(letters));
		
		HashMap<String, Integer> result=new HashMap<>();
		for (String w : letters) {
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
