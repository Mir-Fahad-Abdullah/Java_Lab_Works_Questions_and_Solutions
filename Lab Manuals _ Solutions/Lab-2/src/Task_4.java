import java.util.Scanner;

public class Task_4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter  amount:");
		int  amount=scan.nextInt();
		boolean success=false;
		
		if(amount>=500) {
			if(amount%500==0) {
				if(amount<=20000) {
					success=true;
					if(success)
						System.out.println("TRANSACTION SUCCESSFUL");
					else
						System.out.println("Error Occurred");
				}
				else
					System.out.println("EXCEEDED AMOUNT");
			}
			else
				System.out.println("INVALID VALUE");
		}
		else
			System.out.println("INVALID AMOUNT");
		
	}

}
