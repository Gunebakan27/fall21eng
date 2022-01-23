package day05nestedifternary;

import java.util.Scanner;

public class Day05Homework {

	public static void main(String[] args) {
//		Ask user ta enter a 4 digits integer, then print the sum of the first
//		and the last digit of the number on console.
//		For example; if user enters 1234 you will add 1 and 4,
//		then print on the console 5
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a 4 digit number...");
		int num4=scan.nextInt();
		int numF=num4/1000;
		int numL=num4%10;
		if(num4<10000) {
			System.out.println("the sum of the first and the last digit of the number is "+ (numF+numL));
			}else {
				System.out.println("Please enter a 4 digit number");
			}
//		1) Type java code by using ternary and if-else, ask user to enter an integer, if the integer is even,
//		the output will be “The integer is even”. If the integer is odd, the output will be “The integer is odd”.
		System.out.println("Enter an integer number..");
		int num=scan.nextInt();
		System.out.println((num%2==0) ? "Tehe number is Even" : "Teh number is Odd");
//		
//		3) Type java code by using ternary.
//		Write a program to print absolute value of an integer entered by user.
		System.out.println("Enter an integer number..");
		int abs=scan.nextInt();
		System.out.println(abs>=0 ? abs : abs*-1);
		
//		4) Type java code by using using ternary.
//		Take values of length and width of a rectangle from user and check if it is square or not.
		System.out.println("Enter the length of a rectangle..");
		double l=scan.nextDouble();
		System.out.println("Enter the width of a rectangle..");
		double w=scan.nextDouble();
		System.out.println(l==w ? "It is a square" : "It is not a square");
		
//		5)Ternary Operator Questions
//		Ask user to enter an integer. If the number has 3 digits, output will be
//		“This number has 3 digits.” Otherwise, output will be “This number has no 3 digits.”
		System.out.println("Enter a number..");
		int d = scan.nextInt();
		System.out.println((d>99&&d<1000) ?  "This number has 3 digits" : "This number has no 3 digits");
		
//		6)How can you decide the number of digits of an integer?
//		Type java code by using ternary and if-else. Ask user to enter two integers
//		Write a program to print the minimum one on the console.
		System.out.println("Enter first number..");
		int f=scan.nextInt();
		System.out.println("Enter the second number...");
		int s=scan.nextInt();
		System.out.println(f<s?f:s);
//		7) Ask user to enter a String. If the String has 2 characters, output will be
//		“It is valid for state abbreviations” Otherwise, output will be “It is not valid for state abbreviations”
		System.out.println("Enter a String..");
		String abb=scan.next();
		System.out.println(abb.length()==2? "It is valid for state abbreviations":"It is not valid for state abbreviations");
//		8) Ask user to enter a number. If the number is less than 10 and greater
//		than or equal to 0, calculate its cube. Otherwise, calculate its square.
//		Cube of a = a*a*a Square of a = a*a
		System.out.println("Enter a number...");
		double a=scan.nextDouble();
		System.out.println(a>=0&&a<10?a*a*a:a*a);
	
		
		
		
		scan.close();
		
		
		
		
		
		}
			
	}


