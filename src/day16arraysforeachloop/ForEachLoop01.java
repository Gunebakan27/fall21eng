package day16arraysforeachloop;

public class ForEachLoop01 {

	public static void main(String[] args) {

		//for-each-loop is the best to use
		//for-each-loop can be used with the containers which have multiple elements
		//so for-each-loop can be used with arrays
		
		//Get the total number of characters in the elements
		String s[]= {"Ali Can", "Veli Han", "Mary Star"};
		
		int sum=0;
		for(int i=0;i<s.length;i++) {
			sum=sum+s[i].length();
		}
		System.out.println(sum);
		
//		//Do it by using for-loop
//		int sum=0;
//		for(int i=0;i<s.length;i++) {
//			sum=sum+s[i].length();
//			
//		}
//		System.out.println(sum);
//		//Do it by using for-each-loop
		int sum2=0;
		for(String w:s) {
			sum2=sum2+w.length();
		}
			System.out.println(sum2);
		
//		int sum2=0;
//		for(String w : s) {
//			sum2=sum2+w.length();
//		}
//	System.out.println(sum2);
//	
//	//Print all elements in the given array. If the elements has more than 6 characters
	String t[]= {"Miami", "United States", "Jacksinwille", "Samsun"};
			
	for(String w:t) {
		if(w.length()>6) {
			System.out.println(w);
		}
	}
			
//	for(String w:t) {
//		if(w.length()>6) {
//			System.out.println(w);
//		}
		//Print the common elements for 2 arrays
		
		int arr1[]= {11,21,33};
		int arr2[]= {33,34,11,22,25};
		
		for(int w:arr1) {
			for(int x:arr2) {
				if(w==x) {
					System.out.print(w+" ");
				}
			}
		}
		
//		
//		for(int wx:arr1) {
//			for(int wy:arr2) {
//				if(wx==wy) {
//					System.out.print(wx+" ");
//				}
//			}
//		}
		
	}
	
	}


