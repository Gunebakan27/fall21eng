package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxDiff {
	// kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
	// ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
	// java programi yazin
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Array eleman sayisini girin..");
				
		int arr[]=new int[scan.nextInt()];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Array'in "+(i+1)+". elemanini girin");
			arr[i]=scan.nextInt();
		}
		Arrays.sort(arr);
		
		int fark=arr[arr.length-1]-arr[0];
	
		System.out.println(Arrays.toString(arr));
		
		System.out.println("En büyük ve en kücük iki eleman arasindaki fark: "+fark);

	scan.close();
	}

}
