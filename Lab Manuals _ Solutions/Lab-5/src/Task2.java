import java.util.Scanner;
public class Task2 {
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.print("Enter a string to count vowels:");
		String name=scan.next();
		
		Count vowels=new Count();
		int totalVowels=vowels.countVowels(name);
		
		System.out.println("Total amount of Vowels:"+totalVowels);
	}
}
