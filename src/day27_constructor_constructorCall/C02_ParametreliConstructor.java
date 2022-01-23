package day27_constructor_constructorCall;


public class C02_ParametreliConstructor {

	public static void main(String[] args) {

		Car1 car1=new Car1(50000, "Vectra", "Beyaz", 2015, true);
//							(int km, String model, String renk, int yil, boolean satilikMi)
		
		Car1 car2=new Car1(35000);
		
		System.out.println(car2.km);
		
		Car1 car3=new Car1();
		System.out.println(car3.km);
		
		
		Car1 car4= new Car1(1000);
		System.out.println(car4.km);
		
		Car1 car5=new Car1(2020,5000);
		System.out.println(car5.yil+" "+car5.km+" "+car5.model);
	}
		
}
