package salaryCount;

public class PayrollOffice {
	public void paySalary(Employee e) {
		double salary=e.salaryCalculate();
		System.out.println("Paying a salary of "+ salary+" to "+e.getName());
		
	}

}
