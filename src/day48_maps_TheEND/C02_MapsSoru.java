package day48_maps_TheEND;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C02_MapsSoru {
/*
 Soru 3 ) Verilen map’te istenen programlama dilini bilen kisileri list olarak donduren bir method yaziniz.
 mapè { 101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#}
 Istenen dil è java
 Sonuc è [Ali, Veli]
 */
	public static void main(String[] args) {
		Map<Integer,String>kisiler=new HashMap<>();
		
		kisiler.put(101, "Ali, Can, java");
		kisiler.put(102, "Veli, Yan, java");
		kisiler.put(103, "Ali, Yan, C#");
		kisiler.put(104, "Ayse, Tan, java");
		
		String istenenDil="java";
		System.out.println(dilBilenListesiOlustur(kisiler, istenenDil));
		

	}

private static List<String> dilBilenListesiOlustur(Map<Integer, String> kisiler, String istenenDil) {
//	List<String>valueList=new ArrayList<>(kisiler.values());
	List<String>dilBilenler=new ArrayList<>();
	for (String each : kisiler.values()) {
		if(each.contains(istenenDil)) {
			dilBilenler.add(each.substring(0, each.indexOf(",")));
		}
	}
	
//	String isimler[]=new String[3];
//	for (String each : valueList) {
//		isimler=each.split(", ");
//		if(isimler[2].equalsIgnoreCase(istenenDil)) {
//			dilBilenler.add(isimler[0]);
//		}
//	}
	return dilBilenler;
	
}

}
