
public class Faculty extends Employee{
	private String initial;
	private String rank;
	
	Faculty(){
		
	}

	public Faculty(String name,String gender,int age,String id,String department,int salary,String initial,String rank) {
		super(name, gender, age, id, department, salary);
		this.initial=initial;
		this.rank=rank;
	}
	
	public void setFaculty(String initial,String rank) {
		this.initial=initial;
		this.rank=rank;
	}

	
	public String getInitial() {
		return initial;
	}
	
	public String getRank() {
		return rank;
	}

	@Override
	public String toString() {
		return "Faculty [initial=" + initial + ", rank=" + rank + ", getInitial()=" + getInitial() + ", getRank()="
				+ getRank() + ", getId()=" + getId() + ", getDepartment()=" + getDepartment() + ", getSalary()="
				+ getSalary() + ", getName()=" + getName() + ", getGender()=" + getGender() + ", getAge()=" + getAge()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
}
