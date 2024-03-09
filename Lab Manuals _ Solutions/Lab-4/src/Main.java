import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String name1,name2,name3,name4,name5,name6,name7,name8;
		int marks1,marks2,marks3,marks4,marks5,marks6,marks7,marks8;
		double cgpa1,cgpa2,cgpa3,cgpa4,cgpa5,cgpa6,cgpa7,cgpa8;
		
			System.out.print("Enter the name of student 1:");
			name1=scan.nextLine();
			System.out.print("Enter the marks of student 1:");
			marks1=scan.nextInt();
			System.out.print("Enter the CGPA of student 1:");
			cgpa1=scan.nextDouble();
			scan.nextLine();
			
			System.out.print("Enter the name of student 2:");
			name2=scan.nextLine();
			System.out.print("Enter the marks of student 2:");
			marks2=scan.nextInt();
			System.out.print("Enter the CGPA of student 2:");
			cgpa2=scan.nextDouble();
			scan.nextLine();
			
			System.out.print("Enter the name of student 3:");
			name3=scan.nextLine();
			System.out.print("Enter the marks of student 3:");
			marks3=scan.nextInt();
			System.out.print("Enter the CGPA of student 3:");
			cgpa3=scan.nextDouble();
			scan.nextLine();
			
			System.out.print("Enter the name of student 4:");
			name4=scan.nextLine();
			System.out.print("Enter the marks of student 4:");
			marks4=scan.nextInt();
			System.out.print("Enter the CGPA of student 4:");
			cgpa4=scan.nextDouble();
			scan.nextLine();
			
			System.out.print("Enter the name of student 5:");
			name5=scan.nextLine();
			System.out.print("Enter the marks of student 5:");
			marks5=scan.nextInt();
			System.out.print("Enter the CGPA of student 5:");
			cgpa5=scan.nextDouble();
			scan.nextLine();
			
			System.out.print("Enter the name of student 6:");
			name6=scan.nextLine();
			System.out.print("Enter the marks of student 6:");
			marks6=scan.nextInt();
			System.out.print("Enter the CGPA of student 6:");
			cgpa6=scan.nextDouble();
			scan.nextLine();
			
			System.out.print("Enter the name of student 7:");
			name7=scan.nextLine();
			System.out.print("Enter the marks of student 7:");
			marks7=scan.nextInt();
			System.out.print("Enter the CGPA of student 7:");
			cgpa7=scan.nextDouble();
			scan.nextLine();
			
			System.out.print("Enter the name of student 8:");
			name8=scan.nextLine();
			System.out.print("Enter the marks of student 8:");
			marks8=scan.nextInt();
			System.out.print("Enter the CGPA of student 8:");
			cgpa8=scan.nextDouble();
			scan.nextLine();
			
			Calculation calc=new Calculation();
			
			calc.allSum(name1, name2, name3, name4, name5, name6, name7, name8, marks1, marks2, marks3, marks4, marks5, marks6, marks7, marks8, cgpa1, cgpa2, cgpa3, cgpa4, cgpa5, cgpa6, cgpa7, cgpa8);
			
			int sumEven=calc.evenSum(name1, name2, name3, name4, name5, name6, name7, name8, marks1, marks2, marks3, marks4, marks5, marks6, marks7, marks8, cgpa1, cgpa2, cgpa3, cgpa4, cgpa5, cgpa6, cgpa7, cgpa8);
			System.out.println("The sum of all even marks:"+sumEven);
			
			double avgOdd=calc.oddSum(name1, name2, name3, name4, name5, name6, name7, name8, marks1, marks2, marks3, marks4, marks5, marks6, marks7, marks8, cgpa2, cgpa3, cgpa4, cgpa5, cgpa6, cgpa7, cgpa8, sumEven);
			System.out.println("The average of all odd marks:"+avgOdd);
	}

}
