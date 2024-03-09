
import java.util.Scanner;

public class Task_3 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter a short number:");
		short shortNumber=scan.nextShort();
		
		System.out.print("Enter a byte number:");
		byte byteNumber=scan.nextByte();
		
		System.out.print("Enter a long number:");
		long longNumber=scan.nextLong();
		
		System.out.print("Enter a integer number");
		int intNumber=scan.nextInt();
		
		System.out.print("Enter a float number:");
		float floatNumber=scan.nextFloat();
		
		System.out.print("Enter a double number:");
		double doubleNumber=scan.nextDouble();
		
		System.out.print("Enter a character:");
		String character=scan.next();
		
		System.out.print("Enter short name:");
		String shortName=scan.next();
		
		scan.nextLine();
		
		System.out.print("Enter full name:");
		String fullName=scan.nextLine();
		
		System.out.print("Enter a boolean:");
		boolean bool=scan.nextBoolean();
		
		System.out.println("Short number:"+shortNumber+"\nByte number:"+byteNumber+"\nLong number:"+longNumber+"\nInteger number:"+intNumber);
		System.out.println("Float number:"+floatNumber+"\nDouble number:"+doubleNumber);
		System.out.println("Character:"+character);
		System.out.println("Short name:"+shortName+"\nFull name:"+fullName+"\nBoolean:"+bool);
	}
}
	