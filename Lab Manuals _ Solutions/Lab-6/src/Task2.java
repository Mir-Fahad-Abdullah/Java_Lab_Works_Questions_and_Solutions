import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter a number:");
		int n=scan.nextInt();
		int[] num=new int[n];
		
		int i;
		
		num[0]=0;
		num[1]=1;
		
		for(i=2 ; i<n ; i++) {
			num[i]=num[i-1]+num[i-2];
		}
		
		
		System.out.print("First "+n+" Fibonacci numbers:");
		for(i=0 ; i<n ; i++) {
			System.out.print(num[i]+"\t");
		}
	}

}
