import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Student obj=new Student();		
		Scanner scan =new Scanner(System.in);
		
		int[] marks=new int[5];
		double[] cgpa=new double[5];
		String[] name=new String[5];
		
		for(int i=0 ; i<name.length ; i++) {
			    System.out.println("Enter Student "+(i+1)+" Info: ");
			    System.out.println("Enter name:");
			    name[i]=scan.next();
			    System.out.println("Enter marks:");
			    marks[i]=scan.nextInt();
			    System.out.println("Enter cgpa:");
			    cgpa[i]=scan.nextDouble();
				}
		
		
		obj.fCreate();
		obj.fWrite(name, marks, cgpa);
		obj.fRead();
	}

}
