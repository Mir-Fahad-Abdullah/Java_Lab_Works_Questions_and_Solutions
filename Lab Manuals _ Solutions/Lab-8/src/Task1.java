import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		Fraction frac1=new Fraction();
		Fraction frac2=new Fraction();
		
		System.out.println("Enter the numerator of fraction number 1:");
		frac1.numerator=scan.nextInt();
		System.out.println("Enter the denominator of fraction number 1:");
		frac1.denominator=scan.nextInt();
		
		System.out.println("Enter the numerator of fraction number 2:");
		frac2.numerator=scan.nextInt();
		System.out.println("Enter the denominator of fraction number 2:");
		frac2.denominator=scan.nextInt();
		
		System.out.println("The 1st fraction number:"+frac1.toString());
		System.out.println("The 2nd fraction number:"+frac2.toString());
		
		frac1.add(frac2);
		frac1.sub(frac2);
		frac1.multiplication(frac2);
		frac2.division(frac2);
	}

}
