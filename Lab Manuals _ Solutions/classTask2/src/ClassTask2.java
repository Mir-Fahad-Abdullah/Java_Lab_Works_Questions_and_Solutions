import java.text.DecimalFormat;
import java.util.Scanner;

public class ClassTask2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter Height:");
		double height=scan.nextDouble();
		System.out.print("Enter Width:");
		double width=scan.nextDouble();
		double result;
		
		result=(6*Math.PI)+((height/2)*(width)/2)+(Math.pow(height, 5)/(9*Math.PI*Math.pow(width, 5)));
		
		DecimalFormat df=new DecimalFormat(".##");
		
		System.out.println("The result is: "+df.format(result));
	}

}
