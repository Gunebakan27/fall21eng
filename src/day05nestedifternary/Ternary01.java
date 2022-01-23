package day05nestedifternary;

public class Ternary01 {
/*
 If an integer is positive, print "The integer is positive" otherwise print "The integer is not positive"
 */
	
	public static void main(String[] args) {
		int num=12;

//Solve by using if-else
		if(num>0) {
			System.out.println("The integer is positive");
		}else {
			System.out.println("The integer is not positive");
		}
		
//Solve by using ternary
		String result=num>0 ? "The integer is positive":"The integer is not positive";
		System.out.println(result);
		
// Write a program to print  of 2 integers the minimum one on the console.
		int n1=12;
		int n2=23;
		
		int min = n1<n2 ? n1 : n2;
		System.out.println(min+" is the minimum");
		
//		Write a program to print absolute value of an integer entered by user.
		
		int n3=5;
		int abs = n3 >= 0 ? n3 : -1*n3;
		
		System.out.println(abs+" is the absolute value");
		
	}

}
