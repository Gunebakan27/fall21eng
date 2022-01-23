package day47_maps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01_Maps {

	public static void main(String[] args) {
		
		Map<Integer, String>hm=new HashMap<>();
		hm.put(101, "Ali, Can, Dev");
		hm.put(102, "Veli, Yan, QA");
		hm.put(103, "Ali, Tan, C#");
		
		System.out.println(hm);
		
		int no=104;
		String isim="Ayse";
		String soyisim="Can";
		String brans="QA";
		
		hm.put(no, isim+", "+soyisim+", "+brans);
		
		System.out.println(hm);
		
		System.out.println(hm.get(no));
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		List<String> valueList=new ArrayList<>((hm.values()));
		System.out.println(valueList);
		System.out.println(valueList.size());
		
		List<String>isimList=new ArrayList<>();
//		for (String string : valueList) {
//			isimList.add(string.substring(0, string.indexOf(",")));//[Ali, Veli, Ali, Ayse]
//		}
		String bilgiler[]=new String[3];
		
		for (String string : valueList) {
			bilgiler=string.split(", ");
			isimList.add(bilgiler[0]);//[Ali, Veli, Ali, Ayse]
		}
		
		System.out.println(isimList);


	}

}
