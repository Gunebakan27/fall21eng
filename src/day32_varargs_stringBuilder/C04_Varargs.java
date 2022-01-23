package day32_varargs_stringBuilder;

public class C04_Varargs {

	public static void main(String[] args) {
		kafanaGoreIslem(5,10,13,1);
		
	}

	private static void kafanaGoreIslem(int sayi1, int sayi2, int sayi3, int sayi4, int... sayilar) {
		int toplam=0;
		for (int i : sayilar) {
			toplam+=i;
		}
		System.out.println("ilk sayi ile digerlerinin toplaminin carpim sonucu : "+sayi1*toplam);
		
	}

}
