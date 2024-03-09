
public class Data {
	public static void main(String[] args) {
		
		int[][] marks= {{90,80,80,87,94},
						{62,73,62,41,92},
						{70,20,90,87,64},
						{10,70,100,97,64},
						{30,90,50,57,64},
						{50,76,65,57,14},
						{74,77,17,67,34}};
		
		String[] subject= {"EEE141","EEE111","EEE315","EEE311","EEE223"};
		
		TotalMarks object=new TotalMarks();
		
		object.myTotalMark(marks, subject);
		String [] result=new String[6];
		result=object.specificSubject(marks, subject);
		
		System.out.println("Total marks of specific subject:");
		for(int i=0 ; i<6 ; i++) {
			System.out.println(result[i]);
		}
	}
}
