import java.util.Scanner;

public class Task_1_Switch {

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
			
			switch(totalMarks) {
			case 93: case 94: case 95: case 96: case 97: case 98: case 99: case 100:{
				System.out.println("Name:"+name+"\nID:"+id+"\nSection:"+section+"\nTotal marks:"+totalMarks);
				System.out.println("Grade: A"+"\tGrade Points:4.0");
				break;
			}
			case 90: case 91: case 92:{
				System.out.println("Name:"+name+"\nID:"+id+"\nSection:"+section+"\nTotal marks:"+totalMarks);
				System.out.println("Grade: A-"+"\tGrade Points:3.7");
				break;
			}
			case 87: case 88: case 89:{
				System.out.println("Name:"+name+"\nID:"+id+"\nSection:"+section+"\nTotal marks:"+totalMarks);
				System.out.println("Grade: B+"+"\tGrade Points:3.3");
				break;
			}
			case 83: case 84: case 85: case 86:{
				System.out.println("Name:"+name+"\nID:"+id+"\nSection:"+section+"\nTotal marks:"+totalMarks);
				System.out.println("Grade: B"+"\tGrade Points:3.0");
				break;
			}
			case 80: case 81: case 82:{
				System.out.println("Name:"+name+"\nID:"+id+"\nSection:"+section+"\nTotal marks:"+totalMarks);
				System.out.println("Grade: B-"+"\tGrade Points:2.7");
				break;
			}
			case 77: case 78: case 79:{
				System.out.println("Name:"+name+"\nID:"+id+"\nSection:"+section+"\nTotal marks:"+totalMarks);
				System.out.println("Grade: c+"+"\tGrade Points:2.3");
				break;
			}
			case 73: case 74: case 75: case 76:{
				System.out.println("Name:"+name+"\nID:"+id+"\nSection:"+section+"\nTotal marks:"+totalMarks);
				System.out.println("Grade: C"+"\tGrade Points:2.0");
				break;
			}
			case 70: case 71: case 72:{
				System.out.println("Name:"+name+"\nID:"+id+"\nSection:"+section+"\nTotal marks:"+totalMarks);
				System.out.println("Grade: C-"+"\tGrade Points:1.7");
				break;
			}
			case 67: case 68: case 69:{
				System.out.println("Name:"+name+"\nID:"+id+"\nSection:"+section+"\nTotal marks:"+totalMarks);
				System.out.println("Grade: D+"+"\tGrade Points:1.3");
				break;
			}
			case 60: case 61: case 62: case 63: case 64: case 65: case 66:{
				System.out.println("Name:"+name+"\nID:"+id+"\nSection:"+section+"\nTotal marks:"+totalMarks);
				System.out.println("Grade: D"+"\tGrade Points:1.0");
				break;
			}
			default:{
				System.out.println("Name:"+name+"\nID:"+id+"\nSection:"+section+"\nTotal marks:"+totalMarks);
				System.out.println("Grade: F"+"\tGrade Points:0.0");
				break;
			}
				
			}
		}

	}

}
