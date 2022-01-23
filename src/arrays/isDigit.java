package arrays;

public class isDigit {

	public static void main(String[] args) {
        /*
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */
		String str="ade1r4d3";
		String arr[]=str.split("");
		
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			if(Character.isDigit(arr[i].charAt(0))) {
				sum+=Integer.valueOf(arr[i]);
			}
		
//			char ch=arr[i].charAt(0);
//			if(Character.isDigit(ch)) {
//				sum+=Integer.valueOf(arr[i]);
//			}
			
		}
		System.out.println(sum);
	}

}
