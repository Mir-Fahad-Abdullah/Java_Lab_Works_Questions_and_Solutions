
public class FullTimeEmployee extends Employee{
	
	private double basic;
	private double allowance;
	
	FullTimeEmployee(){
		
	}

	public FullTimeEmployee(String name,int age,String address,String department,String designation,double basic,double allowance) {
		super(name, age, address, department, designation);
		this.basic=basic;
		this.allowance=allowance;
	}


	public void setBasic(double basic,double allowance) {
		this.basic = basic;
		this.allowance = allowance;
	}
	
	public double getBasic() {
		return basic;
	}
	
	public double getAllowance() {
		return allowance;
	}

	public double salary() {
		double slry=basic+(allowance/100)*basic;
		
		return slry;
	}

	@Override
	public String toString() {
		return "FullTimeEmployee [basic=" + basic + ", allowance=" + allowance + ", getBasic()=" + getBasic()
				+ ", getAllowance()=" + getAllowance() + ", salary()=" + salary() + ", getDepartment()="
				+ getDepartment() + ", getDesignation()=" + getDesignation() + ", getName()=" + getName()
				+ ", getAge()=" + getAge() + ", getAddress()=" + getAddress() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
