package day42_abstractClasses;

public class Ustabasi extends Isci {
	
	public void statu() {
		System.out.println("Ustabasi statüsü");
	}
	
	public void maas() {
		System.out.println("Ustabasi maasi");
	}
	
	public void mesai() {
		System.out.println("ustabasi mesaisi..");
	}
		public static void main(String[] args) {
		Ustabasi usta=new Ustabasi();
		usta.statu();
		usta.maas();
		usta.mesai();
	}

}
