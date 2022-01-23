package salaryCount;

public class Director extends Manager {

	private double bonus;
	
	
	public Director(int no, String name, int year, String department, String managingDepartment, double bonus) {
		super(no, name, year, department, managingDepartment);
		this.bonus=bonus;
	}


	@Override
	public void work() {
		System.out.println(getName()+" is working in "+ getDepartment());
	}


	@Override
	public double salaryCalculate() {
		return super.salaryCalculate() + bonus;
	}


	@Override
	public void manage() {
		System.out.println(getName()+ " manages whole company");
		makeStrategy();
	}
	
	public void makeStrategy() {
		System.out.println(getName()+" makes strategy");
	}


	@Override
	public String toString() {
		return "Director [bonus=" + bonus + ", getNo()=" + getNo() + ", getName()=" + getName() + ", getYear()="
				+ getYear() + ", getDepartment()=" + getDepartment() + "]";
	}

	
	
}
