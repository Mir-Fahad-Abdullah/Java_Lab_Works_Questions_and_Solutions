import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter all the informations of the faculty:");
		System.out.println("Name:");
		String name=scan.nextLine();
		System.out.println("Gender:");
		String gender=scan.next();
		System.out.println("Age:");
		int age=scan.nextInt();
		System.out.println("Id:");
		String id=scan.next();
		System.out.println("Department:");
		String department=scan.next();
		System.out.println("Salary:");
		int salary=scan.nextInt();
		System.out.println("Initial:");
		String initial=scan.next();
		System.out.println("Rank:");
		String rank=scan.next();
		
		Faculty faculty=new Faculty(name, gender, age, id, department, salary, initial, rank);
		
		
		System.out.println("Name: "+faculty.getName()+"\nAge :"+faculty.getAge()+"\nSalary :"+faculty.getSalary()+"\nInitial :"+faculty.getInitial());
		
		
		System.out.println("All the informations of the faculty:");
		System.out.println(faculty.toString());
		
	}
	
	

}
