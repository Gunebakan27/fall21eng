package day29_staticBlock_passByValue;

import java.util.ArrayList;
import java.util.List;

public class C04_passByValueList {

	public static void main(String[] args) {
		
		List<String>list=new ArrayList<>(List.of("A","B","C","E","D"));
		
		listElemanlarDegistir(list);
		System.out.println("Main method'da\n"+list);
		
		listDegistir(list);
		System.out.println("Yeni list atadiktan sonra maon method'da\n"+list);


	}

	private static void listDegistir(List<String> list) {

		list=new ArrayList<>();
		list.add("F");
		list.add("H");
		
		System.out.println("method'da yeni list olusturduktan sonra \n"+list);
	}

	private static void listElemanlarDegistir(List<String> liste) {
		liste.add("Y");
		
		liste.set(0, "G");
		System.out.println("Yeni eleman ekleyince Method'da: \n"+liste);
	}

}
