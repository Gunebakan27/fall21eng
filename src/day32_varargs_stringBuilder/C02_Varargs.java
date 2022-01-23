package day32_varargs_stringBuilder;

public class C02_Varargs {

	public static void main(String[] args) {
		topla(5,8,10,13,15,0);
		
	}

	public static void topla(int... sayilar) {
		int toplam=0;
		for (int i : sayilar) {
			toplam+=i;
		}
		System.out.println("toplam : "+toplam);
	}

}
