import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Student {
	
	public void fCreate() throws Exception {
		File obj=new File("info.txt");
		obj.createNewFile();
		
	}
	
	
	public void fWrite(String[] name , int[] marks , double[] cgpa) throws Exception {
		FileWriter fw=new FileWriter("info.txt");
		
		for(int i=0 ; i<name.length ;i++) {
			fw.write(name[i]+" "+String.valueOf(marks[i])+" "+String.valueOf(cgpa[i])+"\n");
		}
		
		fw.close();
	}


	public void fRead() throws Exception {
	FileReader fr=new FileReader("info.txt");
	Scanner scan=new Scanner(fr);
	
	int[] marks=new int[5];
	double[] cgpa=new double[5];
	String[] name=new String[5];
	
	int i=0;
	while(scan.hasNext()) {
		name[i]=scan.next();
		marks[i]=scan.nextInt();
		cgpa[i]=scan.nextDouble();
		
		i++;
	}
	
	
	for(i=0 ; i<name.length ; i++) {
	
	System.out.println(name[i]+" "+marks[i]+" "+cgpa[i]);
	}
	
	
	double sum=0;
	int max=marks[0];
	int track=0;
	
	for(i=0 ; i<name.length ; i++) {
		sum+=cgpa[i];
		if(max<marks[i]) {
			max=marks[i];
			track=i;
		}
	}
	
	File obj=new File("cgsum.txt");
	obj.createNewFile();
	
	FileWriter fw=new FileWriter("cgsum.txt");
	
	fw.write("Cg sum: "+String.valueOf(sum));
	fw.close();
	
	File obj2=new File("maxinfo.txt");
	obj2.createNewFile();
	
	FileWriter fw2=new FileWriter("maxinfo.txt");
	fw2.write(name[track]+" "+String.valueOf(marks[track])+" "+String.valueOf(cgpa[track]));
	
	fw2.close();
	
	System.out.println("cg sum: "+sum+"Max marks: "+max);
	System.out.println("Max info: "+name[track]+" "+marks[track]+" "+cgpa[track]);
	
	}
}
