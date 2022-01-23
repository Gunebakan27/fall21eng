package day28_constructorCall_staticKeyword;

public class C03 {

	public static void main(String[] args) {
		C02 obj1=new C02();
		System.out.println( obj1.x + " "+ C02.y);

		obj1.x++;
		C02.y++;

		C02 obj2=new C02();
		System.out.println( obj2.x + " "+ C02.y);
				
		obj2.x++;
		obj2.y++;

		System.out.println( obj2.x + " "+ C02.y);

		System.out.println( obj1.x + " "+ C02.y);

	}

}
