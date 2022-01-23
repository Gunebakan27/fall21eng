package day40_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exception {

	public static void main(String[] args) {
//Verilen bir integer array icin kullanicidan sayi isteyip girilen sayiyi index olarak kapul edip o indexteki elementi yazdirin..
		int arr[]= {2,35,6,7,8,2,10,1};
		Scanner scan=new Scanner(System.in);
		try {
			System.out.println("Lütfen index no giriniz..");
			int index=scan.nextInt();
			
			System.out.println("Girdiginiz indexteki element : "+arr[index]);
		
		} catch (ArrayIndexOutOfBoundsException e) {
System.out.println("girdiginiz index arrayde yok");		}
		catch(InputMismatchException e) {
	System.out.println("Tam sayi girmelisiniz..");	}	
		}

}
