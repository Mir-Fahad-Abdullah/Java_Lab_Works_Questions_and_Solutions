import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int number;
		int sum=0, evenSum=0, oddSum=0;
		double average, evenAverage, oddAverage;
		int even=0,odd=0;
		
		int i=0;
		while(i<10) {
			System.out.print("Enter the number "+(i+1)+":");
			number=scan.nextInt();
			sum+=number;
			
			if(number%2==0) {
				evenSum+=number;
				even++;
			}
			else {
				oddSum+=number;
				odd++;
			}
			
			i++;
		}
		
		evenAverage=(double)evenSum/even;
		oddAverage=(double)oddSum/odd;
		average=(double)sum/10;
		
		System.out.println("Sum of all the elements:"+sum+"\nAverage of all the elements:"+average);
		System.out.println("Sum of all the even elements:"+evenSum+"\nAverage of all the even elements:"+evenAverage);
		System.out.println("Sum of all the odd elements:"+oddSum+"\nAverage of all the odd elements:"+oddAverage);
	}

}
