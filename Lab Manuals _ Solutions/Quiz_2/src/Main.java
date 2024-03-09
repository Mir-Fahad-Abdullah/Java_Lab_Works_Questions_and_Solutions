import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception{

		Students[] arr=new Students[10];

		ArrayList<Integer> marks=new ArrayList<Integer>();

		Scanner scan=new Scanner(System.in);
		
		String name;
		double cgpa;
		int mark;
		
		for(int i=0 ; i<10 ; i++) {
			System.out.println("Enter name student "+(i+1)+":");
			name=scan.next();
			System.out.println("Enter cgpa student "+(i+1)+":");
			cgpa=scan.nextDouble();
			System.out.println("Enter marks student "+(i+1)+":");
			marks.add(scan.nextInt());
			
			arr[i]=new Students(cgpa, name);
		}
		
		Students std=new Students();
		
		std.fCreate();
		std.fWrite(arr, marks);
		std.fRead();
		
	}

}
