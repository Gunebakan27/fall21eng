package salaryCount;



public class Test {

	public static void main(String[] args) {
		PayrollOffice po=new PayrollOffice();
		po.paySalary(new Employee(0001, "Mehmet", 2, "Marketing"));
		
		po.paySalary(new Manager(0002, "Islam", 10, "Software", "IT"));
		
		
//		Employee e1=new Employee(0001, "Mehmet", 2, "Marketing");
//		System.out.println(e1.toString());
//		System.out.println(e1.salaryCalculate());
//		e1.work();
//		
//		Manager m1=new Manager(0002, "Islam", 10, "Software", "IT");
//		System.out.println(m1.toString());
//		System.out.println(m1.salaryCalculate());
//		m1.setName("Ömer");
//		System.out.println(m1.toString());
//		
//		Director d1=new Director(003, "Fatih", 5, "Marketing", "HR", 10_000);
//		System.out.println(d1.toString());
//		System.out.println(d1.salaryCalculate());
//		d1.work();
//		d1.makeStrategy();
		
//		Employee e1=new Employee(1, "Mehmet", 2, "Marketing");
//		Employee e2=new Manager(0002, "Islam", 10, "Software", "IT");
//		System.out.println(e2.toString());
//		System.out.println(e2.getYear());
//		
		
		
		
		
		
	}
}
