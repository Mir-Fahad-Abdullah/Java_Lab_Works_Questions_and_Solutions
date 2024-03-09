
public class MethodOverloading {
	
	public void printMethod(int num , char ch) {
		System.out.println("The integer number is:"+num+"\nThe character is:"+ch);
	}
	
	public void printMethod(char ch , int num) {
		System.out.println("The character is:"+ch+"\nThe integer number is:"+num);
	}
}
