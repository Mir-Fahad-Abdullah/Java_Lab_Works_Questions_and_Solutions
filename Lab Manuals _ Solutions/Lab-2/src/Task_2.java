import java.text.DecimalFormat;
import java.util.Scanner;

public class Task_2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter the height:");
		double height=scan.nextDouble();
		System.out.print("Enter the  width:");
		double  width=scan.nextDouble();
		
		double result=3*Math.PI+(height*width)+Math.pow(height, 2)/(2*Math.PI*Math.pow(width, 2));
		
		DecimalFormat dform=new DecimalFormat(".##");
		
		System.out.println("The result is: "+ dform.format(result));
	}

}
