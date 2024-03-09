import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int[] numbers=new int[6];
		int i,calc=0;
		int count=0;
		
		for(i=0 ; i<6 ; i++) {
			System.out.print("Enter number:"+(i+1)+":");
			numbers[i]=scan.nextInt();
			
			calc+=numbers[i];
		}
		
		double average=(double)calc/6;
		
		for(i=0 ; i<6 ; i++) {
			if(numbers[i]>average) {
				count++;
			}
		}
		
		double percentage=(double)(count*100)/6;
		
		System.out.println("The average of all the elements:"+average);
		System.out.println("The percentage is "+percentage+"%");
		
	}

}
