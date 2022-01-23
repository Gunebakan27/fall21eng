package day37_inheritance;

public class Corolla extends Toyota {
	
	String renk;
	int fiyat;
	boolean elektrikliMi;
	int tekerSayisi=4;
	String uretimYeri="TR";
	
	public static void main(String[] args) {

	Corolla arb1=new Corolla();
	
	Toyota arb2=new Corolla();
	
	Araba arb3=new Corolla();
	
	System.out.println(arb1.tekerSayisi);
	}

}
