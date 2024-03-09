import java.util.Scanner;

public class TotalMarks {
	public void myTotalMark(int[][] marks, String[] subject) {
		int i,j;
		int[] totalMarks=new int[5];
		
		for(j=0 ; j<5 ; j++) {
			totalMarks[j]=0;
			for(i=0 ; i<7 ; i++) {
				totalMarks[j]+=marks[i][j];
			}
		}
		
		System.out.println("The total marks of each subject:");
		for(i=0 ; i<5 ; i++) {
			System.out.println(subject[i]+" : "+totalMarks[i]);
		}
	}
	
	public String[] specificSubject(int[][] marks , String[] subject) {
		int i,j;
		int[] spcMarks=new int[3];
		String[] spcSub=new String[3];
		
		Scanner scan=new Scanner(System.in);
		
		for(i=0 ; i<spcSub.length ; i++) {
			System.out.println("Enter subject "+(i+1)+":");
			spcSub[i]=scan.next();
		}
		
		for(j=0 ; j<5 ; j++) {
			if(spcSub[j].equalsIgnoreCase(subject[j])) {
				spcMarks[j]=0;
				for(i=0 ; i<7 ; i++) {
					spcMarks[j]+=marks[i][j];
				}
			}
		}
		
		String[] result=new String[6];
		
		result[0]=spcSub[0];
		result[1]=String.valueOf(spcMarks[0]);
		result[2]=spcSub[1];
		result[3]=String.valueOf(spcMarks[1]);
		result[4]=spcSub[2];
		result[5]=String.valueOf(spcMarks[2]);
		
		return result;
	}
}
