package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C02_MDArrays {

	public static void main(String[] args) {
// MultiDimensional Array'ler ic ice konulmus array'ler demektir.
//		Array olusturmak icin iki yontemimiz vard.
		//1. yöntem önce declare edip sonra deger atama
		
		int arr[][]=new int [3][2];//outer array'#i 3 elemanli
									// her bir inner array ise 2 elemanli olan MDArray olusturur.
		//Bu yontemle olusturdugumuzda inner array'lerin hepsi ayni boyutta olmalidir.
		System.out.println(Arrays.toString(arr));//dire outer arrayi yazdirmak istedigimizde, icindeki elemanlar non-primitve oldugundan
//		referanslari yazdirilir. [[I@1c4af82c, [I@379619aa, [I@cac736f]
		
		System.out.println(Arrays.deepToString(arr));
		
		arr[0][1]=5;
		arr[1][0]=2;
		arr[2][1]=3;
		
		System.out.println(Arrays.deepToString(arr));
		
		//Array olusturmak icin ik yöntemimiz vardi.
		//2. yontem hem declare edip hem de deger atama
		
		int arr2[][]= {{0},{1,23},{6,7,8,9}};
		System.out.println(Arrays.deepToString(arr2));
		
		System.out.println(Arrays.toString(arr2[1]));
		
		System.out.println(arr2[2][1]);
		
	}

}
