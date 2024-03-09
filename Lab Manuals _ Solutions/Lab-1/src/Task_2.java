
import java.util.Scanner;

public class Task_2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter your full name:");
		String fullName=scan.nextLine();
		System.out.print("Enter ID:");
		int ID=scan.nextInt();
		System.out.print("Enter section:");
		byte section=scan.nextByte();
		System.out.print("Enter course code:");
		String courseCode=scan.next();
		System.out.print("Enter CGPA:");
		float cgpa=scan.nextFloat();
		
		System.out.println("Name:"+fullName);
		System.out.println("ID:"+ID);
		System.out.println("Section:"+section);
		System.out.println("Course Code:"+courseCode);
		System.out.println("CGPA:"+cgpa);
		
	}

}
