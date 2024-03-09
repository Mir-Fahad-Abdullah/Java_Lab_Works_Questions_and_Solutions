import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String name[]=new String[10];
		int [] marks=new int[10];
		double[] cgpa=new double[10];
		
		int i;
		
		for(i=1 ; i<=10 ; i++) {
			System.out.println("Enter name of studen "+i+":");
			name[i]=scan.next();
			System.out.println("Enter marks of studen "+i+":");
			marks[i]=scan.nextInt();
			System.out.println("Enter cgpa of studen "+i+":");
			cgpa[i]=scan.nextDouble();
		}
		
		Student std=new Student();
		
		String info[]=std.info(name, marks, cgpa);
		System.out.println("The highest info:"+info);
		std.info(name, marks);
	}

}
