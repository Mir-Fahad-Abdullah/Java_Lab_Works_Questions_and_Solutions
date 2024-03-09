
public class Task2 {

	public static void main(String[] args) {
		int i,j;
		int product;
		for(i=1 ; i<=10 ; i++) {
			System.out.println("The multiplication table of "+i+":");
			for(j=1 ; j<=10 ; j++) {
				product=i*j;
				System.out.println(i+"*"+j+"="+product);
			}
		}
	}

}
