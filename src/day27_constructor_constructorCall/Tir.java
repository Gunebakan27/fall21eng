package day27_constructor_constructorCall;

public class Tir {


		int yil=2000;
		String renk;
		String model;
		int km;
		boolean satilikMi;
		
		public Tir(int i, String string, String renk, int j, boolean b) {
			this.km=i;
			this.model=string;
			renk=renk;
			yil=j;
			satilikMi=b;
			
	}

		public Tir(int km, String model, String renk) {
			this.km=km;
			model=model;
			this.renk=renk;
			

		}
		
	}


