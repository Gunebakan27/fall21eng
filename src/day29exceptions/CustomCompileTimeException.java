package day29exceptions;

public class CustomCompileTimeException {

	public static void main(String[] args) throws IllegalGradeException  {
		
//try {
//	checkGrade(200);
//} catch (IllegalGradeException e) {
//	System.err.println(e.getMessage());
//
//}
//
//	}
//	public static void checkGrade(int grade) throws IllegalGradeException {
//		if(grade<0||grade>100) {
//			throw new IllegalGradeException("please give the grade between 0 and 100");
//		}else {
//			System.out.println("Your grade is: "+grade);
//		}
		
			
				checkGrade(0);
				checkGrade(150);
				checkGrade(100);
		
			
		
	}
public static void checkGrade(int grade) throws IllegalGradeException {
	try{
		if(grade<0||grade>100) {
		throw new IllegalGradeException("please give the grade between 0 and 100");
}else {
	System.out.println("Your Grade is: "+grade);
}
		}catch (IllegalGradeException e) {
System.err.println(e.getMessage());}
}


//Create Custom Compile Time Exception
/*
 * 1)You have to extend to "Exception Class" like "extends Exception"
 * 2)To be able to put "Exception Message" on the console, you should create constructor with String parameter like 
 * "public IllegalGradeException(String message)"
 * 3)Inside the constructor call parent constructor with message argument like "super(message);"
 * 4)After creating your own exception class, you can use it in any method body whenever you need by typing like
 * "throw new "IllegalGradeException("please give the grade between 0 and 100");"
 * 
 */

}
class IllegalGradeException extends Exception{
	public IllegalGradeException(String message) {
		super(message);

	} 
		
	}
//class IllegalGradeException extends Exception{
//	public IllegalGradeException(String message) {
//		super(message);
//	}
//}