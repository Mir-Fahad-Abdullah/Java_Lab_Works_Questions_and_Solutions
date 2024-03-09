import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Display implements Salary{

	@Override
	public void allData() throws Exception {
		FileReader fr=new FileReader("EmployeeInformation.txt");
		Scanner scan=new Scanner(fr);
		
		String name;
		int id ,salary ,phone;
		String address , designation;
		
		System.out.println("\nAll Employee:");
		System.out.println("Name\tId\tSalary\tPhone\t\tAddress\t\tDesignation");
		while(scan.hasNext()) {
			name=scan.next();
			id=scan.nextInt();
			salary=scan.nextInt();
			phone=scan.nextInt();
			address=scan.next();
			designation=scan.next();
			
			System.out.println(name+"\t"+id+"\t"+salary+"\t"+phone+"\t"+address+"\t\t"+designation);
		}
	}

	@Override
	public void lowest() throws Exception {
		FileReader fr=new FileReader("lowest.txt");
		Scanner scan=new Scanner(fr);
		
		String name;
		int id ,salary ,phone;
		String address , designation;
		
		while(scan.hasNext()) {
			name=scan.next();
			id=scan.nextInt();
			salary=scan.nextInt();
			phone=scan.nextInt();
			address=scan.next();
			designation=scan.next();
			
			System.out.println("\nLowest Salary:");
			System.out.println("Name\tId\tSalary\tPhone\t\tAddress\t\tDesignation");
			System.out.println(name+"\t"+id+"\t"+salary+"\t"+phone+"\t"+address+"\t\t"+designation);
		}
		
	}

	@Override
	public void highest() throws Exception {
		FileReader fr=new FileReader("highest.txt");
		Scanner scan=new Scanner(fr);
		
		String name;
		int id ,salary ,phone;
		String address , designation;
		
		while(scan.hasNext()) {
			name=scan.next();
			id=scan.nextInt();
			salary=scan.nextInt();
			phone=scan.nextInt();
			address=scan.next();
			designation=scan.next();
			
			System.out.println("\n2nd Highest Salary:");
			System.out.println("Name\tId\tSalary\tPhone\t\tAddress\t\tDesignation");
			System.out.println(name+"\t"+id+"\t"+salary+"\t"+phone+"\t"+address+"\t\t"+designation);
		}
	}

	@Override
	public void average() throws Exception {
		String hName;
		int hId ,hSalary = 0 ,hPhone;
		String hAddress , hDesignation;
		
		File obj1=new File("highest.txt");
		
		if(obj1.exists()) {
			try {
				FileReader fr=new FileReader(obj1);
				Scanner scan=new Scanner(fr);
				
				while(scan.hasNext()) {
					hName=scan.next();
					hId=scan.nextInt();
					hSalary=scan.nextInt();
					hPhone=scan.nextInt();
					hAddress=scan.next();
					hDesignation=scan.next();
				}
				
				fr.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		String lName;
		int lId ,lSalary = 0 ,lPhone;
		String lAddress , lDesignation;
		
		
		
		File obj2=new File("lowest.txt");
		
		if(obj2.exists()) {
			try {
				FileReader fr=new FileReader(obj2);
				Scanner scan=new Scanner(fr);
				
				while(scan.hasNext()) {
					lName=scan.next();
					lId=scan.nextInt();
					lSalary=scan.nextInt();
					lPhone=scan.nextInt();
					lAddress=scan.next();
					lDesignation=scan.next();
				}
				
				fr.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		int sum=hSalary+lSalary;
		double avg=(double)sum/2;
		System.out.println("\nAverage:"+avg);
		
	}

}
