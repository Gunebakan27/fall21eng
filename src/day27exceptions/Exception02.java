package day27exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception02 {
	//Create a method to get student's age and print it on the console
	//IllegalArgumentException
	
public static void main(String[] args) {
	try{
		printAge();
	}catch (InputMismatchException e) {
		System.out.println("not be negative: "+e);
	}
}
	
	
	
	public static void printAge() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the age of a Student: ");
		int age=scan.nextInt();
		
		if(age>=0) {
			System.out.println(age);
		}else {
			throw new InputMismatchException();
		}
		
	}

//	public static void main(String[] args) {
//		try {
//		getPrintAge();
//		} catch(IllegalArgumentException e) {
//			System.out.println("Age can't be negative");
//		}
//
//	}
//	
//	public static void getPrintAge() {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Write the age of student...");
//		int age = scan.nextInt();
//		
//		if(age>=0) {
//			System.out.println(age);
//		} else {
//			throw new IllegalArgumentException();
//		}
//	}

}
