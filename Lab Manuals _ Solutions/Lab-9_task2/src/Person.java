
public class Person {
	
	private String name;
	private int age;
	private String address;
	
	Person(){
		
	}

	public Person(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	

	public void setPerson(String name,int age,String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}


	public String getAddress() {
		return address;
	}

	
}
