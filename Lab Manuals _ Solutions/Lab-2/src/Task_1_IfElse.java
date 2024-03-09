import java.util.Scanner;

public class Task_1_IfElse {

	public static void main(String[] args) {
		
		String name;
		int id;
		byte section;
		int totalMarks,i;

		Scanner scan=new Scanner(System.in);
		
		for(i=1 ; i<=3 ; i++) {

			System.out.print("Enter full name of student "+i+" :");
			name=scan.nextLine();
			System.out.print("Enter ID of student "+i+" :");
			id=scan.nextInt();
			System.out.print("Enter section of student "+i+" :");
			section=scan.nextByte();
			System.out.print("Enter total marks of student "+i+" :");
			totalMarks=scan.nextInt();
			scan.nextLine();
			
			if(totalMarks>=93 && totalMarks<=100) {
				System.out.println("Name:"+name+"\nID:"+id+"\nSection:"+section+"\nTotal marks:"+totalMarks);
				System.out.println("Grade: A"+"\tGrade Points:4.0");
			}
			else if(totalMarks>=90 && totalMarks<=92) {
				System.out.println("Name:"+name+"\nID:"+id+"\nSection:"+section+"\nTotal marks:"+totalMarks);
				System.out.println("Grade: A-"+"\tGrade Points:3.7");
			}
			else if(totalMarks>=87 && totalMarks<=89) {
				System.out.println("Name:"+name+"\nID:"+id+"\nSection:"+section+"\nTotal marks:"+totalMarks);
				System.out.println("Grade: B+"+"\tGrade Points:3.3");
			}
			else if(totalMarks>=83 && totalMarks<=86) {
				System.out.println("Name:"+name+"\nID:"+id+"\nSection:"+section+"\nTotal marks:"+totalMarks);
				System.out.println("Grade: B"+"\tGrade Points:3.0");
			}
			else if(totalMarks>=80 && totalMarks<=82) {
				System.out.println("Name:"+name+"\nID:"+id+"\nSection:"+section+"\nTotal marks:"+totalMarks);
				System.out.println("Grade: B-"+"\tGrade Points:2.7");
			}
			else if(totalMarks>=77 && totalMarks<=79) {
				System.out.println("Name:"+name+"\nID:"+id+"\nSection:"+section+"\nTotal marks:"+totalMarks);
				System.out.println("Grade: c+"+"\tGrade Points:2.3");
			}
			else if(totalMarks>=73 && totalMarks<=76) {
				System.out.println("Name:"+name+"\nID:"+id+"\nSection:"+section+"\nTotal marks:"+totalMarks);
				System.out.println("Grade: C"+"\tGrade Points:2.0");
			}
			else if(totalMarks>=70 && totalMarks<=72) {
				System.out.println("Name:"+name+"\nID:"+id+"\nSection:"+section+"\nTotal marks:"+totalMarks);
				System.out.println("Grade: C-"+"\tGrade Points:1.7");
			}
			else if(totalMarks>=67 && totalMarks<=69) {
				System.out.println("Name:"+name+"\nID:"+id+"\nSection:"+section+"\nTotal marks:"+totalMarks);
				System.out.println("Grade: D+"+"\tGrade Points:1.3");
			}
			else if(totalMarks>=60 && totalMarks<=66) {
				System.out.println("Name:"+name+"\nID:"+id+"\nSection:"+section+"\nTotal marks:"+totalMarks);
				System.out.println("Grade: D"+"\tGrade Points:1.0");
			}
			else if(totalMarks>=0 && totalMarks<60) {
				System.out.println("Name:"+name+"\nID:"+id+"\nSection:"+section+"\nTotal marks:"+totalMarks);
				System.out.println("Grade: F"+"\tGrade Points:0.0");
			}
		}
		
		
	}

}
