import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the information for the part time employee:");
		System.out.println("Name:");
		String name1=scan.nextLine();
		System.out.println("Age:");
		int age1=scan.nextInt();
		System.out.println("Address:");
		String address1=scan.nextLine();
		scan.nextLine();
		System.out.println("Department:");
		String department1=scan.next();
		System.out.println("Designation:");
		String designation1=scan.next();
		System.out.println("Hours:");
		double hours=scan.nextDouble();
		System.out.println("Rate(per hours):");
		double rate=scan.nextDouble();
		
		PartTimeEmployee partTime=new PartTimeEmployee(name1, age1, address1, department1, designation1, hours, rate);
		
		System.out.println("Enter the information for the full time employee:");
		scan.nextLine();
		System.out.println("Name:");
		String name2=scan.nextLine();
		System.out.println("Age:");
		int age2=scan.nextInt();
		System.out.println("Address:");
		String address2=scan.nextLine();
		scan.nextLine();
		System.out.println("Department:");
		String department2=scan.next();
		System.out.println("Designation:");
		String designation2=scan.next();
		System.out.println("Basic:");
		double basic=scan.nextDouble();
		System.out.println("Allowance(in %):");
		double allowance=scan.nextDouble();
		
		
		FullTimeEmployee fullTime=new FullTimeEmployee(name2, age2, address2, department2, designation2, basic, allowance);
		
		
		System.out.println("Salary of full time employee:"+fullTime.salary());
		System.out.println("Salary of part time employee:"+partTime.salary());
		

	}

}
