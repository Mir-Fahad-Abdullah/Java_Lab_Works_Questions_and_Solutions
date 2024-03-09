import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
Student[] arr=new Student[3];
		
		
		String name;
		int marks;
		double cgpa;
		Scanner in=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			
			System.out.println("Enter student "+(i+1)+" info: ");
			System.out.println("Name: ");
			name=in.next();
			System.out.println("marks: ");
			marks=in.nextInt();
			System.out.println("Cgpa: ");
			cgpa=in.nextDouble();
			
			arr[i]=new Student(name,marks,cgpa);
			
		}
		
	for(int i=0;i<arr.length;i++) {		
			System.out.println(arr[i].toString());

		}
		
	
	Student obj=new Student();

	obj.min(arr);
	obj.sumAverage(arr);
	

	}

}
