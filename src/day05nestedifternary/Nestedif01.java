package day05nestedifternary;

import java.util.Scanner;

public class Nestedif01 {
/*
 		Ask user to enter a password
    	
    	If the initial of the password is uppercase then check if it is ‘A’ or not. 
        If it is ‘A’ the output will be “Valid Password” 
        otherwise the output will be “Invalid Password”
        For example; Ali ==> Valid password    -     ali ==> Invalid    -    Mark ==> Invalid
        
        If the initial of the password is lowercase then check if it is ‘z’ or not. 
        If it is ‘z’ the output will be “Valid Password” 
        otherwise the output will be “Invalid Password”
        For example; zoe ==> Valid password    -     Zoe ==> Invalid    -    john ==> Invalid
        
        Note: Every character in a String has index, indexes start from "0", 
        	  so the index of first character is "0"
        	  Index of last character in aString equals "the number of characters -1"
 */
	public static void main(String[] args) {		
		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter the password");
//		String pwd=scan.next();
//		char firstChar=pwd.charAt(0);
//		if(firstChar>='A' && firstChar<='Z') {
//			if(firstChar =='A') {
//				System.out.println(pwd+" is a valid password");
//			}
//			else {
//				System.out.println(pwd+" is not a valid password");
//			}
//			}
//		else if(firstChar>='a' && firstChar<='z'){
//			if(firstChar=='z') {
//				System.out.println(pwd+"is a valid password");
//			}	else {
//				System.out.println(pwd+" is not valid password");
//			}}	else {			
//			System.out.println("First character should be letter...");
//		}
	
//		Type java code by using nested if statement,
//		If a number is even then check if it is divisible by 3 or not. If it is divisible by 3 the output will be
//		“Perfect even number” otherwise, the output will be “Good even number.”
//		If the number is odd then check if it is divisible by 3 or not. If it is divisible by 3 the output will be
//		“Perfect odd number” otherwise, the output will be “Good odd number.”
		System.out.println("Enter an integer number..");
		int num=scan.nextInt();
		System.out.println(num%2==0&&num%3==0?"Perfect even number":num%2==0?"Good number":
				num%2!=0&&num%3==0?"Perfect odd number":"Goog odd number");
		
		
		scan.close();
		
		
		
	}

}
