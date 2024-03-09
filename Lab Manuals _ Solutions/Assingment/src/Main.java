import java.io.IOException;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Employee emp=new Employee();
		
		try {
			emp.information();
		} catch (InvalidSalaryException | InvalidNameException | IOException e) {
			e.printStackTrace();
		}
		
		LowestSalary lowest=new LowestSalary();
		lowest.Data();
		lowest.lSalary();
		
		Display display=new Display();
		display.lowest();
		display.highest();
		display.average();
		display.allData();
	}

}
