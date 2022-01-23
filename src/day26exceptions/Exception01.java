package day26exceptions;
/*
 * 1)Exception: unexpected issues
 * 2)When there is an exception
 * 	i)Java throws exception
 * ii)Java stops the executing the rest of the codes
 * 3)We can handle exceptions using try-catch blocks
 * 4)try block cannot be used alone, there must be catch or some other structure.
 * 5)There can be multiple catch blocks after try block
 * 6)i)If there is no parent child relation between exception classes, the the order of catch blocks is not important
 * 	ii)If there is a parent child relation between exception classes, the the child class exception must be first.
 */
public class Exception01 {

	public static void main(String[] args) {
		System.out.println(division(12,3));
		
		System.out.println(division(10,10));
		
		System.out.println(division(0,10));
		
		System.out.println(division(10,0));
		
		System.out.println(division(20,5));
		System.out.println("=========================");
		
		int arr[]= {4,2,5,6,7};
		System.out.println(arraySumOfTwoConsecutiveElements(arr,0));
		System.out.println(arraySumOfTwoConsecutiveElements(arr,1));
		System.out.println(arraySumOfTwoConsecutiveElements(arr,2));
		System.out.println(arraySumOfTwoConsecutiveElements(arr,3));
		System.out.println(arraySumOfTwoConsecutiveElements(arr,4));
		System.out.println("================================");

		int brr[]= {12,4,2,0,5};
		System.out.println(arrayDivisionOfTwoConsecutiveElements(brr,0));
		System.out.println(arrayDivisionOfTwoConsecutiveElements(brr,1));
		System.out.println(arrayDivisionOfTwoConsecutiveElements(brr,2));//ArithmeticException
		System.out.println(arrayDivisionOfTwoConsecutiveElements(brr,3));
		System.out.println(arrayDivisionOfTwoConsecutiveElements(brr,4));
	}
		
public static double division(int x, int y) {
	double result=0;
	try {
		result= x/y;
		
	} catch (ArithmeticException e) {
System.out.println("can not divided by Zero: "+e.getMessage());	
}
	
	return result;
}

//	public static double division(int a, int b) {
//		double result=0;
//		try {
//			result= a/b;
//		}catch(ArithmeticException e ) {
//			System.out.println("do not divide by zero"+e.getMessage());
//		}
//		return result;
//	}
	
public static int arraySumOfTwoConsecutiveElements(int arr[], int y) {
	int sum=0;
try {
	sum=arr[y]+arr[y+1];
}catch (ArrayIndexOutOfBoundsException e) {
System.out.println("more element is typed: "+ e.getMessage());
}
	
	return sum;
}

//	public static int arraySumOfTwoConsecutiveElements(int arr[], int index){
//		int result=0;
//		try {
//			result=arr[index]+arr[index+1];
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Do not use non-existing index: "+ e.getMessage());
//		}
//		return result;
//	}
	
	public static double arrayDivisionOfTwoConsecutiveElements(int brr[], int i) {
		double result=0;
		try{
			result=brr[i]/brr[i+1];
		}catch (ArithmeticException e) {
			System.out.println("not be divided zero: "+ e.getMessage());		
}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("typed more element: "+e.getMessage());		}
		
		return result;
	}
}
	
	
//	public static double arrayDivisionOfTwoConsecutiveElements(int arr[], int index){
//		double result=0;
//		try {
//		result= arr[index]/arr[index+1];
//		}
//		catch(ArithmeticException e) {
//			System.out.println("do not divide by zero: "+e.getMessage());
//			
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Do not use non-existing index: "+ e.getMessage());
//			}
//		
//		return result;
//	}
//}
