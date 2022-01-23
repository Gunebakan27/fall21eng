package schoolproject;

public class Student implements ITDepartment, LanguageDepartment{
	private String name;
	private String lastName;
	private int id;
	private Instructor instructor;
	private String labName;
	private String departmentName;
	
	
	


	@Override
	public String departmentName() {
		return this.departmentName;
	}


	@Override
	public Instructor instructor() {
		return this.instructor;
	}

	@Override
	public Student student() {
		return this;
	}




	@Override
	public String labName() {
		return this.labName;
	}




	@Override
	public boolean isAvailable() {
		return false;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", lastName=" + lastName + ", id=" + id + ", instructor=" + instructor
				+ ", labName=" + labName + ", departmentName=" + departmentName + "]";
	}




	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	public void setLabName(String labName) {
		this.labName = labName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	

}
