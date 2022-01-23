package day25_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C03_Sort {

	public static void main(String[] args) {
		List<String>isimList=new ArrayList<>();
		isimList.add("Kutlu");
		isimList.add("Emrah");
		isimList.add("Ferhat");
		isimList.add("filiz");
		
//		isimList.sort(null);
		System.out.println(isimList);
		
		Collections.sort(isimList);
		
		System.out.println(isimList);
	}

}
