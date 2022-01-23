package day27_constructor_constructorCall;

import day26_forEachLoop_constructor.Car;

public class C01_CarRunner {

	public static void main(String[] args) {
		Car car = new Car();
		System.out.println(car.yil);

		
		Car1 car1=new Car1();
		
		System.out.println(car1.km+" "+car1.model+" "+car1.renk+" "+car1.yil+" "+car1.satilikMi);
		
		car1.km=75000;
		car1.model="Corolla";
		car1.renk="Kirmizi";
	
		System.out.println(car1.km+" "+car1.model+" "+car1.renk+" "+car1.yil+" "+car1.satilikMi);
		
		Car1 car2=new Car1();
		System.out.println(car2.km+" "+car2.model+" "+car2.renk+" "+car2.yil+" "+car2.satilikMi);
		
		Car1 car3=new Car1();
		car3.km=40000;
		car3.satilikMi=true;
		System.out.println(car3.km+" "+car3.model+" "+car3.renk+" "+car3.yil+" "+car3.satilikMi);
	}

}
