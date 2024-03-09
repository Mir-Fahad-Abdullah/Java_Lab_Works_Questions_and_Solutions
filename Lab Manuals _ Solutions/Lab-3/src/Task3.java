import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter a number:");
		int number=scan.nextInt();
		int i;
		
		System.out.print("Divisors of "+number+" are:");
		for(i=1 ; i<=number/2 ; i++) {
			if(number%i==0)
				System.out.print(i+" ,");
		}
	}

}
