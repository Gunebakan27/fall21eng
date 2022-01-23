package day48_maps_TheEND;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class C03_MapMethods {

	public static void main(String[] args) {
	Map<Integer,String>kisiler=new HashMap<>();
		
		kisiler.put(101, "Ali, Can, java");
		kisiler.put(102, "Veli, Yan, java");
		kisiler.put(103, "Ali, Yan, C#");
		kisiler.put(104, "Ayse, Tan, java");
		
		System.out.println(kisiler.containsKey(110));//false
		System.out.println(kisiler.containsValue("java"));//false
		System.out.println(kisiler.containsValue("Veli, Yan, java"));//true
		
		Set<Entry<Integer,String>>entrySet=kisiler.entrySet();
		System.out.println(entrySet);
		
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
		}
		System.out.println(kisiler.getOrDefault(101, "Yok"));
		
		kisiler.putIfAbsent(101, "ekledi mi?");
		System.out.println(kisiler.toString());

	}

}
