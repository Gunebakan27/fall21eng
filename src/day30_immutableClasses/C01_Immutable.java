package day30_immutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C01_Immutable {

	public static void main(String[] args) {

		String str="Ali";
		
		str.toUpperCase();
		
		System.out.println(str);
		
		str=str.toUpperCase();
		
		System.out.println(str);
		
		List<String>list=new ArrayList<>();
		
		System.out.println(list);
		
		list.add("Ali");
		
		System.out.println(list);

		
	}

}
