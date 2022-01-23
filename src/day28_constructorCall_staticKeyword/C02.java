package day28_constructorCall_staticKeyword;

public class C02 {
	
	int x=5;
	static int y=10;
	
	public static void main(String[] args) {

C02 obj1=new C02();
System.out.println( obj1.x + " "+ y);

obj1.x++;
y++;

C02 obj2=new C02();
System.out.println( obj2.x + " "+ y);
		
obj2.x++;
obj2.y++;

System.out.println( obj2.x + " "+ obj2.y);

System.out.println( obj1.x + " "+ obj1.y);



	}

}
