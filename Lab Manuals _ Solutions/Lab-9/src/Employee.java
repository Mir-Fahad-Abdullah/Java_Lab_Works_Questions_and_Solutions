
public class Employee {
	String name;
	int salary;
	
	Employee(){
		
	}
	
	Employee(String name , int salary){
		this.name=name;
		this.salary=salary;
	}
	
	Employee highest(Employee[] arr) {
		int highSalary_1=arr[0].salary;
		int highSalary_2=0;
		int i;
		
		for(i=0 ; i<arr.length ; i++) {
			if(arr[i].salary>highSalary_1) {
				highSalary_2=highSalary_1;
				highSalary_1=arr[i].salary;
				
			}
			else if(arr[i].salary>highSalary_2 && arr[i].salary<highSalary_1) {
				highSalary_2=arr[i].salary;
			}
		}
		
		Employee empHighSalary_2=new Employee();
		
		for(i=0 ; i<arr.length ; i++) {
			if(arr[i].salary==highSalary_2) {
				empHighSalary_2.name=arr[i].name;
				empHighSalary_2.salary=arr[i].salary;
			}
		}
		
		return empHighSalary_2;
	}
}
