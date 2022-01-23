package day33maps;



/*
 * 		Get a String and a character from user
	 	Count the number of characters between the first occurence and the last occurence of the given character in the String
	 	Do not count the space characters
	 	If the character which user selected is displayed just once in the String return -1
	 	If the character which user selected does not exist in the String return -1
	 	For example; “Java is easy” - ‘a’ ==> 5
	 	             “Java is easy” - ‘w’ ==> -1
	 	             “Java is easy” - ‘e’ ==> -1
 */
public class HashMapInterviewQ1 {

	public static void main(String[] args) {
		String s="Java is easy";
		s=s.replaceAll("\\s", "");
		System.out.println(s);
		
		char c='s';
		if (s.indexOf(c)==s.lastIndexOf(c)) {
		
			System.out.println(-1);
		}else {
			System.out.println(c+" ==> "+(s.lastIndexOf(c)-s.indexOf(c)-1));
		}
		

	}

}
