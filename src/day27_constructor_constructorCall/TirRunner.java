package day27_constructor_constructorCall;

public class TirRunner {

	public static void main(String[] args) {

		Tir tir1=new Tir(5000, "axor", "beyaz",2020, false);
		
		System.out.println(tir1.km+" "+tir1.model+" "+tir1.renk+" "+tir1.yil+" "+tir1.satilikMi);
		
		Tir tir2=new Tir(12000,"kar", "Kirmizi");
		System.out.println(tir2.km+" "+tir2.model+" "+tir2.renk+" "+tir2.yil+" "+tir2.satilikMi);
	}

}
