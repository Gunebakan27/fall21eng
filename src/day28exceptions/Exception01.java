package day28exceptions;

public class Exception01 {

	public static void main(String[] args) {
		Object obj=5;
		convert(obj);
		
		String s1="1234";
		converintegertStringToInteger(s1);
		
		String s2="12a3b4c";
		converintegertStringToInteger(s2);//NumberFormatException:If a string has some non-digit characters, then Java throws this exception.
		
		String s3="";
		converintegertStringToInteger(s3);//Empty string cannot be converted to integer
		
	}
//Create a method to convert an Object class object to String.
	public static void convert(Object obj) {
		try {
		String convertedString=(String) obj;
		System.out.println(convertedString);//ClassCastException:If a data type cannot be converted to another data type,
											//then Java throws this exception.
	}catch(ClassCastException e) {
		System.out.println("Can not be converted: "+e.getMessage());
	}
}
	//Create a method to convert String variable to integer variable
	
	public static void converintegertStringToInteger(String str) {
		try {
		int convertedInteger=Integer.parseInt(str);//parseInt() converts Strings to integer. If a string can be converted
			System.out.println(convertedInteger);
		}catch (NumberFormatException e) {			//integer. We call it parsable.
			System.out.println("not parsabel: "+e.getMessage());		
}												
		
		
	}
}
