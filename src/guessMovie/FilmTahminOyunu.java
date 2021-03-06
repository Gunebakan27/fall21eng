package guessMovie;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilmTahminOyunu {
	/*
	 * 1. Bir tane film isim listesi olusturun
	 * 2. Kullanicadan liste uzunlugunda bir sayi isteyip, o siradaki filmi cagirin..
	 * 3. filmin ismindeki harfleri "-" olacak sekilde ceviririp kullaniciya gösterin.
	 * 4. Kullanicidan bir harf tahmin etmesini isteyin
	 * 5. Bu harfin isimde olup olmadigini kontrol edin.
	 * 6. Girilen harf dogruysa ismin tamaminda bu harfi gösterin.
	 * 7. Toplam kac yanlis harf tahmin edildigini gösterin ve sinir asildiysa kaybettin yazdirin.
	 * 8. Eger hepsi dogru tahmin edildiyse kazandin yazdirin.
	 */
	public static void main(String[] args) {
	
		List<String>filmListesi=new ArrayList<>();
		BufferedReader br=null;
		try {
			String line;
			br=new BufferedReader(new FileReader("src/guessMovie/movies.txt"));
			line=br.readLine();
			while(line!=null) {
				filmListesi.add(line);
				line=br.readLine();
			}
			
		}catch(FileNotFoundException e) {
			System.out.println("yol yanlis..");
		}catch(IOException e) {
			System.out.println("dosaya okunumadi..");
		}
		int sira=(int)(Math.random()*filmListesi.size());
		System.out.println(filmListesi);
		Scanner scan=new Scanner(System.in);
//		System.out.println("Lütfen 1'den "+filmListesi.size()+"'a kadar bir sayi girin..");
//		int sira=scan.nextInt()-1;
		String filmAdi=filmListesi.get(sira).toLowerCase();
		System.out.println(filmAdi);
		String gizliIsim=filmAdi.replaceAll("\\S", "-");
		System.out.println(gizliIsim);
		
		List<Integer>indexList=new ArrayList<>();
		int count=0;
		do {	
		System.out.println("Lütfen bir harf tahmin ediniz..");
		char harf=scan.next().toLowerCase().charAt(0);
		String hrf=Character.toString(harf);
		
		if(!filmAdi.contains(hrf)) {
			count++;
		}
	
		if(count==3) {
			System.out.println("Kaybettin!!");
			break;
		}
		System.out.println(count+" kadar hatali girdiniz..\nKalan hakkiniz : "+(3-count));
		
		for (int i = 0; i < filmAdi.length(); i++) {
			if(filmAdi.charAt(i)==harf) {
				indexList.add(i);				
			}
		}
		for (int i = 0; i < indexList.size(); i++) {
			gizliIsim=gizliIsim.substring(0, indexList.get(i))+filmAdi.substring(indexList.get(i),indexList.get(i)+1)
			+gizliIsim.substring(indexList.get(i)+1);
		}System.out.println(gizliIsim);
		if(filmAdi.equalsIgnoreCase(gizliIsim)) {
		System.out.println("Tebrikler... Kazandiniz!!");}
		} while (!filmAdi.equalsIgnoreCase(gizliIsim));
	}

}
