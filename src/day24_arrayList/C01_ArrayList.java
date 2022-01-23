package day24_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayList {
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		List<String>isimList=new ArrayList<>();
		
		//bazen esitligin sag tarafindaki elmas icine data t�r� yazilmazsa sorun cikabiliyor.
		List<String>isimList2=new ArrayList<String>();
		
		
		List<Integer>sayilar=new ArrayList<>();
		sayilar.add(null);
		System.out.println(sayilar);
		// Verilen bir array'den istenen degere sahip elementleri silip
				// kalani yeni bir array olarak kaydedin
				// ve sonra yeni array'i yazdirin
				
				int arr[]= {3,4,5,6,3,5};
				int silinecekEleman=6;	
				
				List<Integer>list=new ArrayList<>();
				for (int i = 0; i < arr.length; i++) {
					if(arr[i]!=silinecekEleman) {
						list.add(arr[i]);
					}
				}
		System.out.println("Liste: "+list);
		int brr[]= new int[list.size()];
		for (int i = 0; i < brr.length; i++) {
			brr[i]=list.get(i);
		}
		System.out.println("brr : "+Arrays.toString(brr));
	}

}
