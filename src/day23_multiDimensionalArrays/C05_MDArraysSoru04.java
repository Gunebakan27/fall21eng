package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C05_MDArraysSoru04 {

	public static void main(String[] args) {
// Verilen iki arrayi birlestiren ve sonucu birlesikArray isminde bir arraye kaydeden bir method olusturunuz.
//		int arr1[]= {2,35,54};
//		int arr2[]= {3,5,7,10};
//		int birlesikArray[]=new int [arr1.length+arr2.length];
//		
//		int i=0;
//		while (i<arr1.length) {
//			birlesikArray[i]=arr1[i];
//			
//			i++;			
//		}
//		int j=0;
//		while (j<arr2.length) {
//			birlesikArray[arr1.length+j]=arr2[j];
//			
//			j++;			
//		}
//		System.out.println(Arrays.toString(birlesikArray));
		int arr1[]= {2,35,54,7,10};
		int arr2[]= {3,5,7,10};
		
		int birlesikArray[]=birlestir(arr1,arr2);
		
		Arrays.sort(birlesikArray);
		System.out.println(Arrays.toString(birlesikArray));
	}

	public static int[] birlestir(int[] arr1, int[] arr2) {
		int birlesikArray[]=new int [arr1.length+arr2.length];
		
		for (int i = 0; i < arr1.length; i++) {
			birlesikArray[i]=arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			birlesikArray[arr1.length+i]=arr2[i];
		}
		
		return birlesikArray;
	}

}
