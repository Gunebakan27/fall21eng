package schoolproject;

public class SchoolRunner {

	public static void main(String[] args) {

		Student s1=new Student();
		
		s1.setName("Omar");
		s1.setLastName("Sensei");
		s1.setDepartmentName(ITDepartment.NAME);
		s1.setId(101);
			
		Instructor i1= new Instructor();
		
		i1.setName("Süleyman");
		i1.setLastName("Alptekin");
		i1.setId(202);
		i1.setDepartmentName(ITDepartment.NAME);
		
		s1.setInstructor(i1);
		
		ITDepartment it=s1;
		
		School sch=it;
		
		System.out.println("Student name: "+sch.student().getName());
		System.out.println("Student lastname: "+sch.student().getLastName());
		System.out.println("Student id: "+sch.student().getId());
		System.out.println("Student Instructor: "+sch.student().instructor().getName());
		
		System.out.println("Department Name: "+sch.departmentName());
		
		
		
		
	}

}
