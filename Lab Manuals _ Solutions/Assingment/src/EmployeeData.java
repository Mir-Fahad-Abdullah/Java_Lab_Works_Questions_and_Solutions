import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class EmployeeData {
	
	public void Data() throws IOException{	
		ArrayList<String> name=new ArrayList<String>();
		ArrayList<Integer> id=new ArrayList<Integer>();
		ArrayList<Integer> salary=new ArrayList<Integer>();
		ArrayList<Integer> phn=new ArrayList<Integer>();
		ArrayList<String> add=new ArrayList<String>();
		ArrayList<String> desig=new ArrayList<String>();
		
		FileReader fr=new FileReader("EmployeeInformation.txt");
		Scanner scan=new Scanner(fr);
		
		while(scan.hasNext()) {
			name.add(scan.next());
			id.add(scan.nextInt());
			salary.add(scan.nextInt());
			phn.add(scan.nextInt());
			add.add(scan.next());
			desig.add(scan.next());
		}
		
		int size=name.size();
		
		int[] phone=new int[size];
		String[] address=new String[size];
		String[] designation=new String[size];
		
		for(int i=0 ; i<size ; i++) {
			phone[i]=phn.get(i);
			address[i]=add.get(i);
			designation[i]=desig.get(i);
		}
		
		System.out.println("All Employee Information stored successfully");

		HighestSalary obj=new HighestSalary();
		obj.hSalary(name, id, salary, phone, address, designation);
	}
	
	public abstract void lSalary() throws Exception;
}
