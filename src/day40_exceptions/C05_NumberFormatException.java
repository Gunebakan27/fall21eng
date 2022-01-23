package day40_exceptions;

public class C05_NumberFormatException {

	public static void main(String[] args) {

		String str="123a";
		try {
			int sayi=Integer.parseInt(str)+4;
			System.out.println(sayi);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		System.out.println("Görev tamam");
	}

}
