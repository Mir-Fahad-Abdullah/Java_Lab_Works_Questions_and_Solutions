
public class Employee extends Person{
	
	private String department;
	private String designation;
	
	Employee(){
		
	}

	public Employee(String name,int age,String address,String department,String designation) {
		super(name, age, address);
		this.department=department;
		this.designation=designation;
	}

	public void setEmployee(String department,String designation) {
		this.department = department;
		this.designation = designation;
	}
	
	public String getDepartment() {
		return department;
	}


	public String getDesignation() {
		return designation;
	}

	
}
