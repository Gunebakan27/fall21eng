package schoolproject;

public class Instructor implements ITDepartment, LanguageDepartment{
	private String name;
	private String lastName;
	private String title;
	private String departmentName;
	private String labName;
	private int id;
	
	
	
	@Override
	public String departmentName() {
		return this.departmentName;
	}
	@Override
	public Instructor instructor() {
		return this;
	}
	@Override
	public Student student() {
		return null;
	}
	@Override
	public String labName() {
		return this.labName;
	}
	@Override
	public boolean isAvailable() {
		return false;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public void setLabName(String labName) {
		this.labName = labName;
	}
	
	
	@Override
	public String toString() {
		return "Instructor [name=" + name + ", lastName=" + lastName + ", title=" + title + ", departmentName="
				+ departmentName + ", labName=" + labName + "]";
	}
	
	
	
	
	
}
