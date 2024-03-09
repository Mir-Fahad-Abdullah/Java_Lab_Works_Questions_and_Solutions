import java.util.Scanner;

public class InClassTaskLab4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String name;
		int sum=0, evenSum=0,sumCgpa=0;
		int marks, even=0;
		double average,cgpa;
		boolean primeNumber=true;
		
		int i=0;
		while(i<10) {
			System.out.print("Enter name of student "+(i+1)+":");
			name=scan.nextLine();
			System.out.print("Enter marks of student "+(i+1)+":");
			marks=scan.nextInt();
			System.out.print("Enter CGPA of student "+(i+1)+":");
			cgpa=scan.nextDouble();
			scan.nextLine();
			int j=0;
			while(j<marks/2) {
				if(marks%j==0 && marks%2==0) {
					primeNumber=false;
					break;
				}
				j++;
			}
			if(primeNumber) {
				evenSum+=marks;
				even++;
			}
			
			sumCgpa+=cgpa;
			sum+=marks;
			
			System.out.println("Name:"+name);
			System.out.println("Sum of all even number:"+evenSum);
			System.out.println("Sum of all marks :"+sum);
			System.out.println("Sum of all cgpa:"+sumCgpa);
			i++;
		}
		average=(double)sumCgpa/10;
		System.out.println("The avarage of cgpa:"+average);
		double avg2=(double)sumCgpa+sum/2;
		System.out.println("Avarage of total sum and avarage cgpa:"+avg2);
	}

}
