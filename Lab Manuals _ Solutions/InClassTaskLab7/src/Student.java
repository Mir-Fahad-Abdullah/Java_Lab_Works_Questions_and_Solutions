
public class Student {
	String[] info(String []name,int[] marks,double[]cgpa) {
		
		int highest=marks[0];
		int i;
		int index;
		
		for(i=0 ; i<marks.length ; i++) {
			if(marks[i]>highest) {
				highest=marks[i];
				index=i;
			}
		}
		
		String str[]= {String.valueOf(name[i]) , String.valueOf(marks[i]) , String.valueOf(cgpa[i])};
		
		return str;	
	}
	
	void info(String []name,int[] marks) {
		
		int i,sum=0,count=0;
		
		for(i=0 ; i<marks.length ; i++) {
			if(name[i].length()==6 && name[i].startsWith("S")) {
				sum+=marks[i];
				count++;
			}
		}
		
		double avg=(double)sum/count;
		
		System.out.println("The sum:"+sum);
		System.out.println("The average:"+avg);
		
	}
}
