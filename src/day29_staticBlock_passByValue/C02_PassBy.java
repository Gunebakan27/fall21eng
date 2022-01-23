package day29_staticBlock_passByValue;

public class C02_PassBy {
	
	static int fiyat=100;
	
	public static void main(String[] args) {

		int fiyat=100;
		
		indirimYap25(fiyat);
		System.out.println("Method'dan sonraki main method icindeki fiyat : "+fiyat);
		
		indirimYap10(fiyat);
		System.out.println("Method'dan sonraki main method icindeki fiyat : "+fiyat);
		

	}

	private static void indirimYap10(int fiyat) {

fiyat*=0.90;
System.out.println("%10 indirimli fiyat : "+fiyat);

	}

	private static void indirimYap25(int fiyat) {

		fiyat*=0.75;
		System.out.println("%25 indirimli fiyat : "+fiyat);
	}

}
