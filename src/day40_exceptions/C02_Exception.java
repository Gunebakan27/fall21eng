package day40_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_Exception {

	public static void main(String[] args) {
//Kullanicidan sayilar alip toplayin..
		int sayi=0;
		int toplam=0;
		int count=0;
		Scanner scan= new Scanner(System.in);
		//InputMismatchException
		try {
			while(count<10000) {
				System.out.println("Lütfen toplamak icin bir sayi giriniz..\nBitirmek icin Q'ya basiniz");
				sayi=scan.nextInt();
				toplam+=sayi;
				count++;
			}
			
			
		} catch (InputMismatchException e) 	{}
		System.out.println("Sayilarin toplami : "+toplam);
		}

}
