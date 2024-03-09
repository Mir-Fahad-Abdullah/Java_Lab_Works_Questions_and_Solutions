import java.util.Scanner;
public class Taks3 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enetr an integer number:");
		int num=scan.nextInt();
		System.out.println("Enter a character:");
		String str=scan.next();
		
		char ch=str.charAt(0);
		
		MethodOverloading metOver=new MethodOverloading();
		
		metOver.printMethod(ch, num);
		metOver.printMethod(num, ch);
	}

}
