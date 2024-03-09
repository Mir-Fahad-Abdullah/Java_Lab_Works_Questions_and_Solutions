
public class PartTimeEmployee extends Employee{
	
	private double hours;
	private double rate;
	
	PartTimeEmployee(){
		
	}

	public PartTimeEmployee(String name,int age,String address,String department,String designation,double hours,double rate) {
		super(name, age, address, department, designation);
		this.hours=hours;
		this.rate=rate;
	}


	public void setPartTimeEmployee(double hours,double rate) {
		this.hours = hours;
		this.rate = rate;
	}
	
	public double getHours() {
		return hours;
	}

	public double getRate() {
		return rate;
	}

	public double salary() {
		double slry=hours*rate*4;
		
		return slry;
	}

	@Override
	public String toString() {
		return "PartTimeEmployee [hours=" + hours + ", rate=" + rate + ", getHours()=" + getHours() + ", getRate()="
				+ getRate() + ", salary()=" + salary() + ", getDepartment()=" + getDepartment() + ", getDesignation()="
				+ getDesignation() + ", getName()=" + getName() + ", getAge()=" + getAge() + ", getAddress()="
				+ getAddress() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	
}
