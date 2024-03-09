import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Employee {
	
	public void information() throws InvalidSalaryException, InvalidNameException, IOException {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter How many Employee Information?");
		int n=scan.nextInt();
		
		String[] name=new String[n]; 
		int[] id=new int[n]; 
		int[] salary=new int[n]; 
		int[] phone=new int[n]; 
		String[] address=new String[n];
		String[] designation=new String[n];
		
		int i;
		
		for(i=0 ; i<n ; i++) {
			System.out.println("Enter employee "+(i+1)+" details?");
			System.out.println("Name:");
			name[i]=scan.next();
			System.out.println("ID:");
			id[i]=scan.nextInt();
			System.out.println("Salary:");
			salary[i]=scan.nextInt();
			System.out.println("Phone:");
			phone[i]=scan.nextInt();
			System.out.println("Address:");
			address[i]=scan.next();
			System.out.println("Designation:");
			designation[i]=scan.next();
		}
		
		File file=new File("EmployeeInformation.txt");
		file.createNewFile();
		
		FileWriter fw=new FileWriter(file);
		
		for(i=0 ; i<n ; i++) {
			if(salary[i]<0 && name[i].length()>3) {
				throw new InvalidSalaryException("The salary can't be negative");
			}
			else if(salary[i]>0 && name[i].length()<3) {
				throw new InvalidNameException("The name length must be greater then 3");
			}
			else {
				fw.write(name[i]+"\t"+String.valueOf(id[i])+"\t"+String.valueOf(salary[i])+"\t"+String.valueOf(phone[i])+"\t"+address[i]+"\t"+designation[i]+"\n");
			}
		}
		
		fw.close();
	}
}
