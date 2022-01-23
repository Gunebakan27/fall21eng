package day29_staticBlock_passByValue;

import java.util.Arrays;

public class C05_passByValueArray {

	public static void main(String[] args) {
			int arr[]= {3,4,5,6};

			elemanDegistir(arr);
			System.out.println("mmain ethod'da: \n"+Arrays.toString(arr));
			
			arrayiDegistir(arr);
			System.out.println("main method'da yeni array'den sonra:\n"+Arrays.toString(arr));
			
	}

	private static void arrayiDegistir(int[] arr) {

		arr=new int[6];
		System.out.println("yeni array'den sonra:\n"+Arrays.toString(arr));
		
	}

	private static void elemanDegistir(int[] arr) {

		arr[0]=10;
		System.out.println("method'da: \n"+Arrays.toString(arr));
	}

}
