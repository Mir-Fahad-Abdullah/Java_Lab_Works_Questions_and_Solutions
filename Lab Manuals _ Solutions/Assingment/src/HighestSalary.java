import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class HighestSalary {
	
	public void hSalary(ArrayList<String> name,ArrayList<Integer> id,ArrayList<Integer> salary,int[] phone,String[] address,String[] designation) throws IOException {
		
		int highest=salary.get(0);
		int i;
		
		for(i=0 ; i<salary.size() ; i++) {
			if(salary.get(i)>highest)
				highest=salary.get(i);
		}
		
		int highest2=salary.get(0);
		int track=0;
		
		for(i=0 ; i<salary.size() ; i++) {
			if(salary.get(i)>highest2 && salary.get(i)!=highest) {
				highest2=salary.get(i);
				track=i;
			}
		}
		
		File file=new File("highest.txt");
		file.createNewFile();
		FileWriter fw=new FileWriter(file);
		
		fw.write(name.get(track)+"\t"+String.valueOf(id.get(track))+"\t"+String.valueOf(salary.get(track))+"\t"+String.valueOf(phone[track])+"\t"+address[track]+"\t"+designation[track]);
		fw.close();
		
		System.out.println("Highest Salary information stored successfully");
	}
	
	
}
