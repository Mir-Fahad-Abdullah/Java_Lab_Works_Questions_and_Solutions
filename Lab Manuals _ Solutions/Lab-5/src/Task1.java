import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		String name;
		int id,section,i;
		double cgpa;
		String gender;
		
		for(i=0 ; i<5 ; i++) {
			System.out.print("Enter the name of the studen "+(i+1)+":");
			name=scan.nextLine();
			System.out.print("Enter the ID of the studen "+(i+1)+":");
			id=scan.nextInt();
			System.out.print("Enter the gender of the studen "+(i+1)+":");
			gender=scan.next();
			System.out.print("Enter the section of the studen "+(i+1)+":");
			section=scan.nextInt();
			System.out.print("Enter the CGPA of the studen "+(i+1)+":");
			cgpa=scan.nextDouble();
			scan.nextLine();
			
			if(gender.equals("female") && name.length()==4) {
				System.out.println("ID"+id);
				System.out.println("Section:"+section);
			}
			else if(gender.equals("male") && name.startsWith("S")) {
				System.out.println("Name"+name);
				System.out.println("Cgpa:"+cgpa);
				System.out.println("Gender:"+gender);
			}
			
		}
	}

}
