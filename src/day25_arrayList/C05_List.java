package day25_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_List {

	public static void main(String[] args) {
//Verilen bir listede icinde belirli bir harf olan elemanlari silen bir method olusturunuz
		List<String>list=new ArrayList<>();
		list.add("Jayhun");
		list.add("Yildiz");
		list.add("Mustafa");
		list.add("Tugba");
		list.add("Turgut");
		list.add("Asim");
		list.add("Aslan");
		list.add("Islam");
		
		String silinecekHarf="a";
		
		System.out.println(silEleman(list, silinecekHarf));
	
	}

	public static List<String> silEleman(List<String> list, String silinecekHarf) {
		for (int i = 0; i <list.size() ; i++) {
			if(list.get(i).contains(silinecekHarf)) {
				list.remove(i);
				i--;
			}
		}

		return list;
	}

}
