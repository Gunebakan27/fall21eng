package day32_varargs_stringBuilder;

public class C05_Varargs {

	public static void main(String[] args) {

		topla("Ali Can", 5,8,10,13,15,0);
		
	}
//	*The variable argument type int of the method topla must be the last parameter
	public static void topla(String isim, int... sayilar) {//
		int toplam=0;
		for (int i : sayilar) {
			toplam+=i;
		}
		System.out.println("toplam : "+toplam);
	}

}
