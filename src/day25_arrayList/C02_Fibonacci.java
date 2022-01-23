package day25_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_Fibonacci {

	public static void main(String[] args) {

		//1000'den kücük Fibonacci sayilarini bir list olarak kaydedin..
//		1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987
		
		int sayiSiniri=100;
		
		List<Integer>fibonacci=new ArrayList<>();
		fibonacci.add(1);
		fibonacci.add(1);
	int sayi=0;	
	while (sayi<sayiSiniri) {
		
		sayi=fibonacci.get(fibonacci.size()-1)+fibonacci.get(fibonacci.size()-2);
		if(sayi<sayiSiniri) {
		fibonacci.add(sayi);
		}
		

	}
		
	System.out.println(fibonacci);
	
	}

}
