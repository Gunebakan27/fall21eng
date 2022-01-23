package day40_exceptions;

public class C01_Exceptions {

	public static void main(String[] args) {
		int a=20;
		int b=0;
		
		try {
			System.out.println("Bölüm : "+a/b);

		} catch (ArithmeticException e) {
			System.out.println("Sifira bölme yapilamaz");	
			System.out.println(e.getMessage());
			e.printStackTrace();}
	
		System.out.println("Görev tamam");
	}

}
