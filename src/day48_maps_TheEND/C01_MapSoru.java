package day48_maps_TheEND;

import java.util.HashMap;
import java.util.Map;

public class C01_MapSoru {

	public static void main(String[] args) {
		
		String input="Hellooo";
		System.out.println(harfSay(input));
		
		
	}

	private static Map<String, Integer> harfSay(String input) {
		Map<String,Integer>harfSayilari=new HashMap<>();
		String harfler[]=input.split("");
		for (String each : harfler) {
			if(!harfSayilari.containsKey(each)) {
				harfSayilari.put(each, 1);
			}else {harfSayilari.put(each, harfSayilari.get(each)+1);}
		}
		
		return harfSayilari;
	}

}
