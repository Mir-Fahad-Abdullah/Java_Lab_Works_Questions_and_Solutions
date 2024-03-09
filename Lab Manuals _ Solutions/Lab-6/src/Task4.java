import java.util.Scanner;
public class Task4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enetr a number:");
		int n=scan.nextInt();
		
		int[] num=new int[n];
		int i;
		
		for(i=0 ; i<n ; i++) {
			System.out.print("Enter element "+(i+1)+":");
			num[i]=scan.nextInt();
		}
		
		System.out.print("Output:");
		
		for(i=1 ; i<n-1 ; i++) {
			if(num[i]==3) {
				if(num[i-1]==2)
					System.out.print(num[i-1]+"  ");
				else if(num[i+1]==2)
					System.out.print(num[i+1]+"  ");
				else if(num[i+1]==4)
					System.out.print(num[i+1]+"  ");
				else if(num[i-1]==4)
					System.out.print(num[i-1]+"  ");
			}
		}

	}

}
