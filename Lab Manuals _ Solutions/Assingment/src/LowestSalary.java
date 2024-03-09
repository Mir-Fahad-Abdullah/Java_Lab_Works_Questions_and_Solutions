import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class LowestSalary extends EmployeeData{

	@Override
	public void lSalary() throws Exception{
		
		ArrayList<String> name=new ArrayList<String>();
		ArrayList<Integer> id=new ArrayList<Integer>();
		ArrayList<Integer> salary=new ArrayList<Integer>();
		ArrayList<Integer> phone=new ArrayList<Integer>();
		ArrayList<String> address=new ArrayList<String>();
		ArrayList<String> designation=new ArrayList<String>();
		
		FileReader fr=new FileReader("EmployeeInformation.txt");
		Scanner scan=new Scanner(fr);
		
		while(scan.hasNext()) {
			name.add(scan.next());
			id.add(scan.nextInt());
			salary.add(scan.nextInt());
			phone.add(scan.nextInt());
			address.add(scan.next());
			designation.add(scan.next());
		}
		
		int i,track=0;
		int lowest=salary.get(0);
		
		for(i=0 ; i<name.size() ; i++) {
			if(salary.get(i)<lowest) {
				lowest=salary.get(i);
				track=i;
			}
		}
		
		File file=new File("lowest.txt");
		file.createNewFile();
		FileWriter fw=new FileWriter(file);
		
		fw.write(name.get(track)+"\t"+String.valueOf(id.get(track))+"\t"+String.valueOf(salary.get(track))+"\t"+String.valueOf(phone.get(track))+"\t"+address.get(track)+"\t"+designation.get(track));
		fw.close();
		
		System.out.println("Lowest Salary information stored successfully");
	}
	
}
