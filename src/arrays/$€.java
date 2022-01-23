package arrays;

public class $€ {

	public static void main(String[] args) {
		/*   $ ve  �  isareti olanlarin toplamlarini ayri ayri bulun
        String str = "$1 $23 $134 $2 $7 $24 �32 �40 �2 �65 �4 ";
        */
		 String str = "$1 $23 $134 $2 $7 $24 �32 �40 �2 �65 �4 ";
		 String arr[]=str.split(" ");
		 
		 int sum$=0;
		 int sum€=0;
		 
		 for (int i = 0; i < arr.length; i++) {
			 
			 if(arr[i].contains("$")) {
			 sum$+=Integer.valueOf(arr[i].substring(1, arr[i].length()));
			 }
			 
			 if(arr[i].contains("€")) {
			 sum€+=Integer.valueOf(arr[i].substring(1, arr[i].length()));
			 }

//			 if(arr[i].contains("$")) {
//				 sum$+=Integer.parseInt(arr[i].replace("$", ""));
//			 }else {
//				 sum€+=Integer.parseInt(arr[i].replace("€", ""));
//			}
		}
		 
		System.out.println("$ toplami: "+sum$+"\n€ toplami: "+sum€);
	}

}
