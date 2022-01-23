package day47_maps;

import java.util.HashMap;
import java.util.Map;

public class C02_NestedMap {

	public static void main(String[] args) {
		Map<String, String>ogr1=new HashMap<>();
		
		ogr1.put("isim","Ali");
		ogr1.put("soyisim","Can");
		ogr1.put("brans","Dev");	
		
	Map<Integer, String>ogr2=new HashMap<>();
		
		ogr2.put(1,"Veli");
		ogr2.put(2,"Yan");
		ogr2.put(3,"QA");	
		
	Map<String, Map<Integer, String>>ogr3=new HashMap<>();
		
		ogr3.put("isim",ogr2);
//		ogr3.put("soyisim","Can");
//		ogr3.put("brans","QA");	
		
		Map<Integer, Map<String, Map<Integer, String>>>nested=new HashMap<>();
		
		nested.put(101,ogr3);
//		nested.put(102,ogr2);
//		nested.put(103,ogr3);
//		nested.putAll(nested);
		
		System.out.println(nested);
		
//		System.out.println(nested.values());
	}

}
