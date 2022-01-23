package day29exceptions;

public class CustomRuntimeException {

	public static void main(String[] args) {
//		divide(5,2);
//		divide(5,1);
//
//	}
//	public static void divide(int a, int b) {
//		try {
//		
//		if(b==1) {
//			throw new DivideByOneException("No need to divide by 1");
//		}else {
//			System.out.println("Result is: "+a/b);
//		}
//	}catch(DivideByOneException e) {
//		System.err.println(e.getMessage());
//	}
	
			division(5,2);
			division(5,1);
			division(5,3);
			
			
	
		
		}
public static void division(int a, int b) {
	try{
		if(b==1) {
	
		throw new DivideByOne("No need to divide one..");
		
	}else {
		System.out.println("Result is: "+(a/b));
	}
	}catch (DivideByOne e) {
System.err.println(e.getMessage());	}
	
}
}
//Create Custom Runtime Exception
/*
 * 1) To create a Runtime Exception follow the same steps in Compile Time Exception creation.
 * Just change the extended class name from "Exception" to "Runtime Exception"
 * 2)When you call a method which throws Compile Time Exception, you will get red underline but
 * when you call a method which throws Runtime Exception, you will not.
 */
class DivideByOne extends RuntimeException{
	public DivideByOne(String message) {
		super(message);
	}
}



//class DivideByOneException extends RuntimeException{
//	public DivideByOneException (String message) {
//		super(message);
//		
//	}
//}