import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String[] gender=new String[10];
		String[] names=new String[10];
		int marks[]=new int[10];
		int i;
		
		for(i=0 ; i<marks.length ; i++) {
			System.out.print("Enter the name of student "+(i+1)+":");
			names[i]=scan.nextLine();
			System.out.print("Enter the gender of student "+(i+1)+":");
			gender[i]=scan.next();
			System.out.print("Enter the marks of student "+(i+1)+":");
			marks[i]=scan.nextInt();
			scan.nextLine();
		}
		
		NSU nsuObj=new NSU();
		
		String[] fNames=nsuObj.ECE(gender, names, marks);
	}

}
