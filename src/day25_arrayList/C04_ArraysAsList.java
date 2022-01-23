package day25_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_ArraysAsList {

	public static void main(String[] args) {

		String arr[]= {"a","b","c"};
		List<String>list=Arrays.asList(arr);
		
		System.out.println(list);
//		list.add("d");
//		System.out.println(list);
		
		arr[1]="Z";
		System.out.println(Arrays.toString(arr));
		System.out.println(list);
		
		list.set(2, "Y");
		System.out.println(Arrays.toString(arr));
		System.out.println(list);
		
	}

}
