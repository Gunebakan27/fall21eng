package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C01_Array {

	public static void main(String[] args) {
// Verilen bir Arrayden istenen degere sahip elementleri silip, kalani yeni bir array olarak kaydedin
// ve sonra yeni arrayi yazdirin.
		int arr[]= {3,4,5,6,3,5,8,3,4,9};
		int silinecekEleman=3;
		
		int sayac=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==silinecekEleman) {
				sayac++;
			}
		}
		int yeniArrayUzunluk=arr.length-sayac;
		
		int yeniArr[]=new int [yeniArrayUzunluk];
		
		int index=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=silinecekEleman) {
				
				yeniArr[index]=arr[i];
				index++;
			}
		}
			System.out.println(Arrays.toString(yeniArr));
		
	}

}
