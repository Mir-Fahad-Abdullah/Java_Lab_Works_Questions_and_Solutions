import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		boolean primeNumber=true;
		
		System.out.print("Enter a number:");
		int number=scan.nextInt();
		int i;
		for(i=2 ; i<=number/2 ; i++) {
			if(number%i==0) {
				primeNumber=false;
				break;
			}
		}
		if(primeNumber)
			System.out.println("The number "+number+" is a prime number");
		else
			System.out.println("The number "+number+" is not a prime number");

	}

}
