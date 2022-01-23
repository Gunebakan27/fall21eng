package day40_exceptions;

import java.util.Scanner;

public class C06_IllegalArgumentException {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Yasiniz?");
		int yas=scan.nextInt();
		
		try {
			if(yas<0) {
				throw new IllegalArgumentException();
			}
		} catch (IllegalArgumentException e) {
System.out.println(e);
System.out.println("yas 0 dan kücük olamaz");
		}
	}

}
