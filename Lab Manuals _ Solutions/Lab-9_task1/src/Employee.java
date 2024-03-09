
public class Employee extends Person{
	
	private String id;
	private String department;
	private int salary;
	
	Employee(){
		
	}

	public Employee(String name,String gender,int age,String id,String department,int salary) {
		super(name, gender, age);
		this.id=id;
		this.department=department;
		this.salary=salary;
	}

	public void setEmployee(String id,String department,int salary) {
		this.id=id;
		this.department=department;
		this.salary=salary;
	}
	
	public String getId() {
		return id;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public int getSalary() {
		return salary;
	}	
	
}
