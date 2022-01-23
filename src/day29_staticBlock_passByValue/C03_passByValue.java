package day29_staticBlock_passByValue;

public class C03_passByValue {
	static int fiyat=100;
	
	public static void main(String[] args) {
	
		
		System.out.println(indirimYap25(fiyat));
		System.out.println("Method'dan sonraki main method icindeki fiyat : "+fiyat);
		
		fiyat=indirimYap10(fiyat);
		System.out.println("Method'dan sonraki main method icindeki fiyat : "+fiyat);
		

	}

	private static int indirimYap10(int fiyat) {

		fiyat*=0.90;
//		System.out.println("%10 indirimli fiyat : "+fiyat);
		return fiyat;

	}

	private static int indirimYap25(int fiyat) {

		fiyat*=0.75;
//		System.out.println("%25 indirimli fiyat : "+fiyat);
		return fiyat;
	}

}
