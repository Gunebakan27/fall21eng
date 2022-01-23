package day25_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_Contains {

	public static void main(String[] args) {
		
	//Bir arraydeki tekrar eden elemanlari unique sekline dönüstüren array yapin..
		int arr[]= {2,4,5,3,6,2,5,3,7,4,8,5,9,1,0,3,5};
		List<Integer>list=new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			
				if(!list.contains(arr[i])) {
					list.add(arr[i]);
				
			}
		}
		System.out.println(list);
		
		int arrUnique[]=new int[list.size()];
		for (int i = 0; i < arrUnique.length; i++) {
			arrUnique[i]=list.get(i);
		}
		System.out.println(Arrays.toString(arrUnique));
		

	}

}
