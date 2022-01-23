package day32_varargs_stringBuilder;

public class C03_Varargs {

	public static void main(String[] args) {

		kafanaGoreTopla(5,10,15,0);
		
	}

	public static void kafanaGoreTopla(int sayi1, int... sayilar) {
		int toplam=0;
		for (int i : sayilar) {
			toplam+=i;
		}
		System.out.println("ilk sayi ile digerlerinin toplaminin carpim sonucu : "+sayi1*toplam);
	}

}
