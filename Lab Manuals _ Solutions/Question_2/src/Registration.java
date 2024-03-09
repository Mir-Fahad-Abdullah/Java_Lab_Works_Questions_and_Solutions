
public class Registration {
	public void user(String name, String password) {
		
		if(name.length()>=6 && password.length()>=6) {
			if(name.length()<16 && password.length()<16) {
				if(name.startsWith("N") && name.endsWith("U")){
					if(password.contains("@") && password.contains("@")) 
						System.out.println("Account is successfully created.");
					else
						System.out.println("Invalid input");
				}
				else
					System.out.println("Invalid input");
			}
			else
				System.out.println("Invalid input");
		}
		else
			System.out.println("Invalid input");
	}
}
