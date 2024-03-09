import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		Employee[] emp=new Employee[5];
		String name;
		int salary;
		int i;
		
		System.out.println("Enter the informations of employee:");
		for(i=0 ; i<emp.length ; i++) {
			System.out.print("Enter the name of employee "+(i+1)+":");
			name=scan.nextLine();
			
			System.out.print("Enter the salary of employee "+(i+1)+":");
			salary=scan.nextInt();
			scan.nextLine();
			
			emp[i]=new Employee(name,salary);
		}
		
		Employee empHighSalary_2=new Employee();
		
		empHighSalary_2=empHighSalary_2.highest(emp);
		
		System.out.println("The information of 2nd highest salary employee:");
		System.out.println("Name :"+empHighSalary_2.name+"\nsalary: "+empHighSalary_2.salary);

	}

}
