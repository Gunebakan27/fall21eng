package day39_overridingKurallari_polymorphism;

public class C02 extends C01 {

	public static void main(String[] args) {
		C02 obj1=new C02();
		obj1.staticMethod();
		obj1.privateMethod();
		
		C01 obj2=new C02();
		obj2.staticMethod();
//		obj2.privateMethod();
	}
//	@Override
	public static void staticMethod() {
		System.out.println("Child class static method calisti");
	}
//	@Override
	private void privateMethod() {
		System.out.println("Child class private method calisti");
	}
//	public final void finalMethod() {
//		System.out.println("Child class final method calisti");
//	}
}
