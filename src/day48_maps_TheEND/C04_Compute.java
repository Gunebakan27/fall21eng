package day48_maps_TheEND;

import java.util.HashMap;
import java.util.Map;

public class C04_Compute {

	public static void main(String[] args) {
	
		Map<String,Integer>kisiler=new HashMap<>();
		
		kisiler.put("A",2);
		kisiler.put("B",5);
		kisiler.put("C",1);
		kisiler.put("Z",3);
		kisiler.put("K",10);
		System.out.println(kisiler);
		kisiler.replace("A", 15);
		System.out.println(kisiler);
		
		kisiler.compute("A", (k,v)->10);
		System.out.println(kisiler);
		
		kisiler.computeIfAbsent("D", v->20);
		System.out.println(kisiler);
		kisiler.computeIfPresent("D",(k,v)->10);
		System.out.println(kisiler);
	}

}
