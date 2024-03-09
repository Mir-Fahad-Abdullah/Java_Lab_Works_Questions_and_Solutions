import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Students extends University implements User{
	private String name;
	
	public Students(){
		
	}
	
	public Students(double cgpa , String name) {
		super(cgpa);
		this.name=name;
	}
	
	
	@Override
	public void fCreate() throws Exception{
		File file=new File("StudentInfo.txt");
		file.createNewFile();
	}
	
	
	@Override
	public void fWrite(Students[] arr, ArrayList<Integer> marks) throws Exception {
		FileWriter fw=new FileWriter("StudentInfo.txt");
		int i;
		
		for(i=0 ; i<arr.length ; i++) {
			fw.write(arr[i].name+" "+String.valueOf(arr[i].getCgpa())+" "+String.valueOf(marks.get(i))+"\n");
		}
		fw.close();
	}
	
	
	@Override
	public void fRead() throws Exception{
		FileReader fr=new FileReader("StudentInfo.txt");
		Scanner scan=new Scanner(fr);
		
		Students[] arr=new Students[10];
		ArrayList<Integer> marks=new ArrayList<Integer>();
		
		String name;
		double cgpa;
		
		int i=0;
		while(scan.hasNext()) {
			name=scan.next();
			cgpa=scan.nextDouble();
			marks.add(scan.nextInt());
			
			arr[i]=new Students(cgpa, name);
			i++;
		}
		
		for(i=0 ; i<marks.size() ; i++) {
			System.out.println("Name:"+arr[i].name+"\tCgpa:"+arr[i].getCgpa()+"\tMarks:"+marks.get(i));
		}
		
		int highest=marks.get(0);
	
		for(i=0 ; i<marks.size() ; i++) {
			if(marks.get(i)>highest)
				highest=marks.get(i);
		}
		
		int high2nd=marks.get(0);
		int track=0;
		
		for(i=0 ; i<marks.size() ; i++) {
			if(marks.get(i)>high2nd && marks.get(i)!=highest) {
				high2nd=marks.get(i);
				track=i;
			}
		}
		
		double sumCg=0;
		
		for(i=0 ; i<arr.length ; i++) {
			sumCg+=arr[i].getCgpa();
		}
		
		double avg=sumCg/arr.length;
		
		FileWriter fw=new FileWriter("Highest.txt");
		
		fw.write("The info of 2nd highest student:\n"+"Name:"+arr[track].name+"\nCgpa:"+arr[track].getCgpa()+"\nMarks:"+marks.get(track));
		
		fw.close();
		
		FileWriter fh=new FileWriter("avg.txt");
		
		fh.write("Average of cgpa:"+avg);
		
		fh.close();
	}

	

	
	
	
}
