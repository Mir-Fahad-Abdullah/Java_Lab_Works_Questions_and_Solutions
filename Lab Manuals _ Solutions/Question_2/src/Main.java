import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter User name:");
		String name=scan.next();
		System.out.println("Enter Password:");
		String password=scan.next();
		
		Registration newId=new Registration();
		
		newId.user(name, password);
	}

}
