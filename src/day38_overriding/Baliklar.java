package day38_overriding;

public class Baliklar extends Animals{

	public static void main(String[] args) {
		Baliklar balik1=new Baliklar();
		balik1.beslenme();//Tüm hayvanlar beslenir
		balik1.hareket();//Baliklar yüzerek hareket eder..
		balik1.solunum();

		
	}
	@Override
	public void hareket() {
		System.out.println("Baliklar yüzerek hareket eder..");
	}

	public void solunum() {
		System.out.println("Baliklar solungacla nefes alir");
	}
}
