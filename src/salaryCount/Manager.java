package salaryCount;

public class Manager extends Employee{

	private String managingDepartment;
	
	public static final int MANAGEMENT_PAYMENT=3000;
	
	
	public Manager(int no, String name, int year, String department, String managingDepartment) {
		super(no, name, year, department);
		this.managingDepartment=managingDepartment;
	}


	@Override
	public void work() {
System.out.println(getName()+" is working in "+ getDepartment());
}


	@Override
	public double salaryCalculate() {
		return super.salaryCalculate() + MANAGEMENT_PAYMENT;
	}

	public void manage() {
		System.out.println(getName()+ " manages department "+ managingDepartment);
		
	}
	public void manageProject(String projectName) {
		System.out.println("Manager manages the project "+projectName);
		
	}


	@Override
	public String toString() {
		return "Manager [managingDepartment=" + managingDepartment + ", getNo()=" + getNo() + ", getName()=" + getName()
				+ ", getYear()=" + getYear() + ", getDepartment()=" + getDepartment() + "]";
	}



}
