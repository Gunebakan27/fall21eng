package day23_multiDimensionalArrays;

import java.util.Scanner;

public class C04_MDArraysSoru03 {

	public static void main(String[] args) {
//		Soru 5) Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir cümle yazin..");
		String cumle=scan.nextLine();
		
		String kelime[]=cumle.split(" ");
		
		System.out.println("Girilen cümledeki kelime sayisi: "+kelime.length);
	}

}
